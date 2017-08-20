package tsafe;

/**
 * Drivers for TS_R_* properties.
 * 
 * @author Pietro Braione
 *
 */
public class Driver_TS_R {	
	
	public boolean repOK(TrajectorySynthesizer trajSynth, RouteTrack track, Route route) {
		return repOK(trajSynth) && repOK(track) && repOK(route);
	}
	
	public boolean repOK(TrajectorySynthesizer trajSynth) {
		if (trajSynth == null)
			return false;
		else if (trajSynth.calc == null)
			return false;
		else if (trajSynth.params == null)
			return false;
//		else if (trajSynth.params.cmLateralWeightOn != false)
//			return false;
//		else if (trajSynth.params.cmVerticalWeightOn != false)
//			return false;
//		else if (trajSynth.params.cmAngularWeightOn != false)
//			return false;
//		else if (trajSynth.params.cmSpeedWeightOn != false)
//			return false;
//		else if (trajSynth.params.cmLateralThreshold != 18520.0)
//			return false;
//		else if (trajSynth.params.cmVerticalThreshold != 609.7561)
//			return false;
//		else if (trajSynth.params.cmAngularThreshold != 0.5)
//			return false;
//		else if (trajSynth.params.cmSpeedThreshold != 100)
//			return false;
//		else if (trajSynth.params.cmResidualThreshold != 1.0)
//			return false;
//		else if (trajSynth.params.tsTimeHorizon != 180000)
//			return false;
		
		return true;
	}
	
	public boolean repOK(RouteTrack track) {
		if (track == null)
			return false;
		else if (track.prevFix == null)
			return false;
		else if (track.nextFix == null)
			return false;
		
		return true;
	}
	
	public boolean repOK(Route route) {
		if (route == null)
			return false;
		else if (route.fixes == null)
			return false;
		else if (!route.fixes.repOK())
			return false;
		
		return true;
	}
	
	//Methods to test
	
	public void TS_R_3(TrajectorySynthesizer trajSynth, RouteTrack track, Route route) throws Exception {
		Trajectory traj = invoke_TS_R(trajSynth, track, route);
		if (!assertion_3(traj, trajSynth, route)) {
//			fail();
		}
	}

	//private methods
	
	private Trajectory invoke_TS_R(TrajectorySynthesizer trajSynth, RouteTrack track, Route route) throws Exception {
		//assumes preconditions
		assume_TS_R_preconditions(trajSynth, track, route);
		
		//target invocation
		return trajSynth.getRouteTrajectory(track, route);
	}
	
	private void assume_TS_R_preconditions(TrajectorySynthesizer trajSynth, RouteTrack track, Route route) {
		assume(trajSynth.params.tsTimeHorizon > 0);
		assume(track.getSpeed() > 0);
		assume(collinear(trajSynth, track.getPrevFix(), track.getNextFix(), new Point2D(track.getLatitude(), track.getLongitude())));
		assume(inRectangle(trajSynth, track.getPrevFix(), track.getNextFix(), new Point2D(track.getLatitude(), track.getLongitude())));
	}
	
	private void assume(boolean b) {
		if (!b) {
			throw new RuntimeException("Assumption violated");
		}
	}

	private boolean assertion_3(Trajectory traj, TrajectorySynthesizer trajSynth, Route route) {
		Point4D lastPoint = traj.lastPoint();
		final boolean _TRAJ_TRAVELS_MAX_TIME = lastPoint.getTime() == traj.firstPoint().getTime() + trajSynth.params.tsTimeHorizon;
		final boolean _TRAJ_ENDS_AT_ROUTE_END;
		if (_TRAJ_TRAVELS_MAX_TIME) {
			_TRAJ_ENDS_AT_ROUTE_END = false;
		} else if (route.isEmpty()) {
			_TRAJ_ENDS_AT_ROUTE_END = false;
		} else {
			Fix lastFix = route.lastFix();
			_TRAJ_ENDS_AT_ROUTE_END = lastFix.getLatitude() == lastPoint.getLatitude() && lastFix.getLongitude() == lastPoint.getLongitude();
		}
		return (_TRAJ_TRAVELS_MAX_TIME || _TRAJ_ENDS_AT_ROUTE_END); 
	}
	
	/**
	 * Checks whether three {@link Point2D}s are collinear according 
	 * to {@link #trajSynth}'s linear approximation, within an error. 
	 * 
	 * @param first a {@link Point2D}.
	 * @param second a {@link Point2D}.
	 * @param third a {@link Point2D}.
	 * @return {@code true} iff its parameters are on a same straight line.
	 */
	private static final double EPSILON_COLLINEAR = 1E4; //100 x 100
	private boolean collinear(TrajectorySynthesizer trajSynth, Point2D first, Point2D second, Point2D third) {
		PointXY firstXY = trajSynth.calc.toXY(first);
		PointXY secondXY = trajSynth.calc.toXY(second);
		PointXY thirdXY = trajSynth.calc.toXY(third);
		double diff = firstXY.getX() * (secondXY.getY() - thirdXY.getY())
		           +  secondXY.getX() * (thirdXY.getY() - firstXY.getY())
		           +  thirdXY.getX() * (firstXY.getY() - secondXY.getY());
		return (-EPSILON_COLLINEAR <= diff && diff <= EPSILON_COLLINEAR);
	}
	
	/**
	 * Checks that a point is in a rectangle according 
	 * to {@link #trajSynth}'s linear approximation, within an error.
	 * 
	 * @param firstCorner a {@link Point2D}, a corner of the rectangle.
	 * @param secondCorner a {@link Point2D}, the corner of the rectangle
	 *        opposite to {@code firstCorner}.
	 * @param toCheck another {@link Point2D}.
	 * @return {@code true} iff {@code toCheck} is in the rectangle
	 *         (according to {@link #trajSynth}'s linear approximation)
	 *         with opposite vertices {@code firstCorner} and {@code secondCorner}.
	 */
	private boolean inRectangle(TrajectorySynthesizer trajSynth, Point2D firstCorner, Point2D secondCorner, Point2D toCheck) {
		final PointXY firstCornerXY = trajSynth.calc.toXY(firstCorner);
		final PointXY secondCornerXY = trajSynth.calc.toXY(secondCorner);
		final PointXY toCheckXY = trajSynth.calc.toXY(toCheck);
		return inInterval(firstCornerXY.getX(), secondCornerXY.getX(), toCheckXY.getX()) &&
				inInterval(firstCornerXY.getY(), secondCornerXY.getY(), toCheckXY.getY());
	}

	/**
	 * Checks that a value is in an interval.
	 * 
	 * @param first One of the bounds of the interval.
	 * @param second The other bound of the interval. It is NOT required that {@code first <= second}.
	 * @param toCheck The value to be checked.
	 * @return {@code true} iff {@code toCheck} belongs to the interval {@code first..second}
	 *         or {@code second..first}, depending on which is the greater.
	 */
	private boolean inInterval(double first, double second, double toCheck) {
		if (first <= toCheck) {
			return (toCheck <= second);
		} else { // toCheck < first
			return (second <= toCheck);
		}
	}	
}
