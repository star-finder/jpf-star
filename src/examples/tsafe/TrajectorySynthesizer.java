/*
 TSAFE Prototype: A decision support tool for air traffic controllers
 Copyright (C) 2003  Gregory D. Dennis

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package tsafe;

import java.util.Iterator;

/**
 * Computes nominal and dead reckoning trajectories of flights
 */
//MODI BEGIN
public
//MODI END
class TrajectorySynthesizer {

    /**
     * Calculator for distances and lat/long to x,y conversion
     */
//MODI BEGIN
    //private 
//MODI END
	SimpleCalculator calc;

    /**
     * Holds synthesis parameters
     */
//MODI BEGIN
    //private 
//MODI END
    EngineParameters params;

    /** Sole constructor */
    public TrajectorySynthesizer(SimpleCalculator calc, EngineParameters params) {
        this.calc = calc;
        this.params = params;
    }

    public TrajectorySynthesizer() {
		// TODO Auto-generated constructor stub
	}

	/**
     * @return Dead reckoning trajectory of flight:<br>
     *         Assume flight stays "on course" with its current heading and speed
     */
    public Trajectory getDeadReckoningTrajectory(FlightTrack ft) {
        Point4D start = ft.asPoint4D();
        Point4D end = deadReckon(ft, params.tsTimeHorizon);

        Trajectory drTraj = new Trajectory();
        drTraj.addPoint(start);
        drTraj.addPoint(end);
        return drTraj;
    }

    /**
     * Dead reckons from the flight track for a given amount of time
     * Returns the end point of this dead reckoning.
     */
    private Point4D deadReckon(FlightTrack ft, /*long*/ double time) {
        double distance = ft.getSpeed() * time;
        double xChange = Math.cos(ft.getHeading()) * distance;
        double yChange = Math.sin(ft.getHeading()) * distance;
        
        PointXY startXY = calc.toXY(ft.getLatitude(), ft.getLongitude());
        Point2D end = calc.toLL(startXY.getX() + xChange, startXY.getY() + yChange);
        return new Point4D(end.getLatitude(), end.getLongitude(), ft.getAltitude(), ft.getTime() + time);      
    }
    
    /**
     * @return Route trajectory of flight:<br>
     *         Assumes flight adheres strictly to its route
     */
    public Trajectory getRouteTrajectory(RouteTrack rt, Route r) {
        // Start trajectory at route track point
        Trajectory routeTraj = new Trajectory();
        Point4D currPoint = rt.asPoint4D();
        routeTraj.addPoint(currPoint);

        // Move cursor to the next fix in the route
//        Iterator fixIter = r.fixIterator();
        int i = 0;
//        if (!fixIter.hasNext()) {
        if (i >= r.fixes.size) {
//        if (r.fixes.header == r.fixes.header.next) {
//MODI BEGIN
            //System.out.println("Trajectory Synthesizer: ROUTE HAS NO POINTS.");
//MODI END
            return getDeadReckoningTrajectory(rt);
        }
        Fix nextFix = rt.getNextFix();
//        Fix f = (Fix)fixIter.next();
        Fix f = (Fix)r.fixes.get(i); i++;
//MODI BEGIN
        Fix f_prev = null;
//MODI END
        while(!f.equals(nextFix)) {
//        while (f != nextFix) {
//MODI BEGIN
        	//discards the case where rt.next is not a fix in r
//        	if (fixIter.hasNext()) {
        	if (i < r.fixes.size) {
        		f_prev = f;
        	} else {
//        		ignore();
        	}
//MODI END
//        	                       f = (Fix)fixIter.next();}
        	f = (Fix)r.fixes.get(i); i++;}
//MODI BEGIN
    	//TODO quite unclear what to do when f_prev == null reaches this point (i.e., when rt.next is the first point of the route)
//        final boolean _ROUTE_TRACK_SEGMENT_NOT_IN_ROUTE = force(!rt.getPrevFix().equals(f_prev));
//        assume(!_ROUTE_TRACK_SEGMENT_NOT_IN_ROUTE);
//MODI END

        // Find the distance and time to the next fix
        /*MODI bug fix long*/ double timeElapsed = 0;
        double dist = calc.distanceLL(rt.getLatitude(), rt.getLongitude(), nextFix);
        /*MODI bug fix long*/ double timeToNextFix = /*MODI bug fix (long)*/ (dist / rt.getSpeed());

        // If the time to the next fix is within the time horizon,
        // add this next fix location and expected time to the trajectory
//MODI BEGIN
        //bug fix
//        boolean completeTrajectoryToTimeHorizon;
//MODI END
        if (timeToNextFix < params.tsTimeHorizon) {
            currPoint = new Point4D(nextFix.getLatitude(), nextFix.getLongitude(),
                                    rt.getAltitude(), rt.getTime() + timeToNextFix);
            routeTraj.addPoint(currPoint);
            timeElapsed = timeToNextFix;

            // While there are more fixes on the route,
            // try to add them to the trajectory as well.
//MODI BEGIN
            //bug fix
//            completeTrajectoryToTimeHorizon = false;
//MODI END
//            while(fixIter.hasNext()) {
            while (i < r.fixes.size) {
//                nextFix = (Fix)fixIter.next();
            	nextFix = (Fix)r.fixes.get(i); i++;
                dist = calc.distanceLL(currPoint.getLatitude(), currPoint.getLongitude(), nextFix);
                timeToNextFix = /*MODI bug fix (long)*/ (dist / rt.getSpeed());

                // If there is not enough time to reach the next fix,
                // break out of the loop
                if (timeToNextFix > params.tsTimeHorizon - timeElapsed) 
//MODI BEGIN
                //bug fix
//                {  completeTrajectoryToTimeHorizon = true; //we early-break but nextFix must be elaborated
//MODI END
                                                                        break;
//MODI BEGIN
                //bug fix
//                }
//MODI END
                currPoint = new Point4D(nextFix.getLatitude(), nextFix.getLongitude(),
                                        rt.getAltitude(), rt.getTime() + timeElapsed + timeToNextFix);
                routeTraj.addPoint(currPoint);
                timeElapsed += timeToNextFix;
            }
        }
//MODI BEGIN
        //bug fix
//        else {
//        	completeTrajectoryToTimeHorizon = true;
//        }
//MODI END

        // If the loop was exited because there was not enough time to reach the next fix,
        // and not because the route had actually ended, then dead reckon for the remaining time.
//MODI BEGIN
        //bug fix
        //Wrong detection of dead reckoning when the next check is reached
        //and the current fix is the last one in the route happens because
        //the check is on fixIter's next point, but really the point to be elaborated
        //has been already taken from the iterator into nextFix (indeed, the body of 
        //the next if statement does not invoke fixIter.next(), and uses directly
        //nextFix).
//        if (fixIter.hasNext()) {
        if (i < r.fixes.size) {
//        if (completeTrajectoryToTimeHorizon) {
//MODI END
            double heading = calc.angleLL(currPoint.getLatitude(), currPoint.getLongitude(), nextFix);
            FlightTrack lastTrack =
                new FlightTrack(currPoint.getLatitude(), currPoint.getLongitude(),
                                rt.getAltitude(), currPoint.getTime(), rt.getSpeed(), heading);
            Point4D end = deadReckon(lastTrack, params.tsTimeHorizon - timeElapsed);
            routeTraj.addPoint(end);
        }

        return routeTraj;
    }
}