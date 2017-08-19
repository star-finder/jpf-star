package tsafe;

import tsafe.LinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Driver_TS_R_TS_R_31 extends TestJPF {

	@Test
	public void test_TS_R_31() throws Exception {
		Driver_TS_R obj = new Driver_TS_R();
		TrajectorySynthesizer trajSynth = new TrajectorySynthesizer();
		SimpleCalculator calc_1 = new SimpleCalculator();
		EngineParameters params_2 = new EngineParameters();
		RouteTrack track = new RouteTrack();
		Fix prevFix_21 = new Fix();
		Fix nextFix_22 = new Fix();
		String id1_25 = new String();
		String id2_28 = new String();
		Route route = new Route();
		LinkedList fixes_29 = new LinkedList();
		Entry header_30 = new Entry();
		double resThres_13 = 10000;
		double tsTime_14 = 1800000000;
		int size_31 = 0;
		double speed_18 = -10000;
		double speThres_12 = 1000000;
		boolean verWtOn_6 = false;
		boolean latWtOn_5 = false;
		boolean speWtOn_8 = false;
		double latThres_9 = 185200000;
		double angThres_11 = 5000;
		double verThres_10 = 6097561;
		boolean angWtOn_7 = false;
		double minLat_3 = 0;
		double minLon_4 = 0;
		double lat_15 = 0;
		double lon_16 = 0;
		double alt_17 = 0;
		double heading_19 = 0;
		double mTime_20 = 0;
		double lat1_23 = 0;
		double lon1_24 = 0;
		double lat2_26 = 0;
		double lon2_27 = 0;
		Fix ele_316 = null;
		double FLOAT = 0;
		trajSynth.calc = calc_1;
		trajSynth.params = params_2;
		calc_1.minLat = minLat_3;
		calc_1.minLon = minLon_4;
		params_2.cmLateralWeightOn = latWtOn_5;
		params_2.cmVerticalWeightOn = verWtOn_6;
		params_2.cmAngularWeightOn = angWtOn_7;
		params_2.cmSpeedWeightOn = speWtOn_8;
		params_2.cmLateralThreshold = latThres_9;
		params_2.cmVerticalThreshold = verThres_10;
		params_2.cmAngularThreshold = angThres_11;
		params_2.cmSpeedThreshold = speThres_12;
		params_2.cmResidualThreshold = resThres_13;
		params_2.tsTimeHorizon = tsTime_14;
		track.lat = lat_15;
		track.lon = lon_16;
		track.alt = alt_17;
		track.speed = speed_18;
		track.heading = heading_19;
		track.mTime = mTime_20;
		track.prevFix = prevFix_21;
		track.nextFix = nextFix_22;
		prevFix_21.lat = lat1_23;
		prevFix_21.lon = lon1_24;
		prevFix_21.id = id1_25;
		nextFix_22.lat = lat2_26;
		nextFix_22.lon = lon2_27;
		nextFix_22.id = id2_28;
		route.fixes = fixes_29;
		fixes_29.header = header_30;
		fixes_29.size = size_31;
		header_30.element = ele_316;
		header_30.next = header_30;
		header_30.previous = header_30;
		System.out.println(Utilities.repOK(obj));
		obj.TS_R_3(trajSynth,track,route);
	}

	@Test
	public void test_TS_R_32() throws Exception {
		Driver_TS_R obj = new Driver_TS_R();
		TrajectorySynthesizer trajSynth = new TrajectorySynthesizer();
		SimpleCalculator calc_1 = new SimpleCalculator();
		EngineParameters params_2 = new EngineParameters();
		RouteTrack track = new RouteTrack();
		Fix prevFix_21 = new Fix();
		Fix nextFix_22 = new Fix();
		String id1_25 = new String();
		String id2_28 = new String();
		Route route = new Route();
		LinkedList fixes_29 = new LinkedList();
		Entry header_30 = new Entry();
		double resThres_13 = 10000;
		double tsTime_14 = 1800000000;
		int size_31 = 0;
		double speed_18 = 0;
		double speThres_12 = 1000000;
		boolean verWtOn_6 = false;
		boolean latWtOn_5 = false;
		boolean speWtOn_8 = false;
		double latThres_9 = 185200000;
		double angThres_11 = 5000;
		double verThres_10 = 6097561;
		boolean angWtOn_7 = false;
		double minLat_3 = 0;
		double minLon_4 = 0;
		double lat_15 = 0;
		double lon_16 = 0;
		double alt_17 = 0;
		double heading_19 = 0;
		double mTime_20 = 0;
		double lat1_23 = 0;
		double lon1_24 = 0;
		double lat2_26 = 0;
		double lon2_27 = 0;
		Fix ele_317 = null;
		double FLOAT = 0;
		trajSynth.calc = calc_1;
		trajSynth.params = params_2;
		calc_1.minLat = minLat_3;
		calc_1.minLon = minLon_4;
		params_2.cmLateralWeightOn = latWtOn_5;
		params_2.cmVerticalWeightOn = verWtOn_6;
		params_2.cmAngularWeightOn = angWtOn_7;
		params_2.cmSpeedWeightOn = speWtOn_8;
		params_2.cmLateralThreshold = latThres_9;
		params_2.cmVerticalThreshold = verThres_10;
		params_2.cmAngularThreshold = angThres_11;
		params_2.cmSpeedThreshold = speThres_12;
		params_2.cmResidualThreshold = resThres_13;
		params_2.tsTimeHorizon = tsTime_14;
		track.lat = lat_15;
		track.lon = lon_16;
		track.alt = alt_17;
		track.speed = speed_18;
		track.heading = heading_19;
		track.mTime = mTime_20;
		track.prevFix = prevFix_21;
		track.nextFix = nextFix_22;
		prevFix_21.lat = lat1_23;
		prevFix_21.lon = lon1_24;
		prevFix_21.id = id1_25;
		nextFix_22.lat = lat2_26;
		nextFix_22.lon = lon2_27;
		nextFix_22.id = id2_28;
		route.fixes = fixes_29;
		fixes_29.header = header_30;
		fixes_29.size = size_31;
		header_30.element = ele_317;
		header_30.next = header_30;
		header_30.previous = header_30;
		System.out.println(Utilities.repOK(obj));
		obj.TS_R_3(trajSynth,track,route);
	}

	@Test
	public void test_TS_R_33() throws Exception {
		Driver_TS_R obj = new Driver_TS_R();
		TrajectorySynthesizer trajSynth = new TrajectorySynthesizer();
		SimpleCalculator calc_1 = new SimpleCalculator();
		EngineParameters params_2 = new EngineParameters();
		RouteTrack track = new RouteTrack();
		Fix prevFix_21 = new Fix();
		Fix nextFix_22 = new Fix();
		String id1_25 = new String();
		String id2_28 = new String();
		Route route = new Route();
		LinkedList fixes_29 = new LinkedList();
		Entry header_30 = new Entry();
		double resThres_13 = 10000;
		double tsTime_14 = 1800000000;
		int size_31 = 0;
		double speed_18 = 10000;
		double speThres_12 = 1000000;
		boolean verWtOn_6 = false;
		boolean latWtOn_5 = false;
		boolean speWtOn_8 = false;
		double latThres_9 = 185200000;
		double angThres_11 = 5000;
		double verThres_10 = 6097561;
		boolean angWtOn_7 = false;
		double minLat_3 = 0;
		double minLon_4 = 0;
		double lat_15 = 0;
		double lon_16 = 0;
		double alt_17 = 0;
		double heading_19 = 0;
		double mTime_20 = 0;
		double lat1_23 = 0;
		double lon1_24 = 0;
		double lat2_26 = 0;
		double lon2_27 = 0;
		Fix ele_316 = null;
		double FLOAT = 0;
		trajSynth.calc = calc_1;
		trajSynth.params = params_2;
		calc_1.minLat = minLat_3;
		calc_1.minLon = minLon_4;
		params_2.cmLateralWeightOn = latWtOn_5;
		params_2.cmVerticalWeightOn = verWtOn_6;
		params_2.cmAngularWeightOn = angWtOn_7;
		params_2.cmSpeedWeightOn = speWtOn_8;
		params_2.cmLateralThreshold = latThres_9;
		params_2.cmVerticalThreshold = verThres_10;
		params_2.cmAngularThreshold = angThres_11;
		params_2.cmSpeedThreshold = speThres_12;
		params_2.cmResidualThreshold = resThres_13;
		params_2.tsTimeHorizon = tsTime_14;
		track.lat = lat_15;
		track.lon = lon_16;
		track.alt = alt_17;
		track.speed = speed_18;
		track.heading = heading_19;
		track.mTime = mTime_20;
		track.prevFix = prevFix_21;
		track.nextFix = nextFix_22;
		prevFix_21.lat = lat1_23;
		prevFix_21.lon = lon1_24;
		prevFix_21.id = id1_25;
		nextFix_22.lat = lat2_26;
		nextFix_22.lon = lon2_27;
		nextFix_22.id = id2_28;
		route.fixes = fixes_29;
		fixes_29.header = header_30;
		fixes_29.size = size_31;
		header_30.element = ele_316;
		header_30.next = header_30;
		header_30.previous = header_30;
		System.out.println(Utilities.repOK(obj));
		obj.TS_R_3(trajSynth,track,route);
	}

}
