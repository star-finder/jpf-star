package tsafe;

import tsafe.LinkedList.Entry;
import common.Utilities;
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
		Route route = new Route();
		LinkedList fixes_27 = new LinkedList();
		Entry header_28 = new Entry();
		double tsTime_14 = -1;
		int size_29 = 0;
		int size_230 = 0;
		double verThres_10 = 0;
		double minLat_3 = 0;
		boolean angWtOn_7 = false;
		double lon_16 = 0;
		double mTime_20 = 0;
		double heading_19 = 0;
		boolean speWtOn_8 = false;
		double speThres_12 = 0;
		double lon2_26 = 0;
		double lat1_23 = 0;
		boolean latWtOn_5 = false;
		double resThres_13 = 0;
		double alt_17 = 0;
		double lat_15 = 0;
		double speed_18 = 0;
		double minLon_4 = 0;
		double lon1_24 = 0;
		double latThres_9 = 0;
		double lat2_25 = 0;
		boolean verWtOn_6 = false;
		double angThres_11 = 0;
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
		nextFix_22.lat = lat2_25;
		nextFix_22.lon = lon2_26;
		route.fixes = fixes_27;
		fixes_27.header = header_28;
		fixes_27.size = size_29;
		header_28.next = header_28;
		header_28.previous = header_28;
		//System.out.println(obj.repOK(trajSynth,track,route));
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
		Route route = new Route();
		LinkedList fixes_27 = new LinkedList();
		Entry header_28 = new Entry();
		double tsTime_14 = 1;
		double speed_18 = 1;
		int size_230 = 0;
		int size_29 = 0;
		double verThres_10 = 0;
		double minLat_3 = 0;
		boolean angWtOn_7 = false;
		double lon_16 = 0;
		double mTime_20 = 0;
		double heading_19 = 0;
		boolean speWtOn_8 = false;
		double speThres_12 = 0;
		double lon2_26 = 0;
		double lat1_23 = 0;
		boolean latWtOn_5 = false;
		double resThres_13 = 0;
		double alt_17 = 0;
		double lat_15 = 0;
		double minLon_4 = 0;
		double lon1_24 = 0;
		double latThres_9 = 0;
		double lat2_25 = 0;
		boolean verWtOn_6 = false;
		double angThres_11 = 0;
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
		nextFix_22.lat = lat2_25;
		nextFix_22.lon = lon2_26;
		route.fixes = fixes_27;
		fixes_27.header = header_28;
		fixes_27.size = size_29;
		header_28.next = header_28;
		header_28.previous = header_28;
		//System.out.println(obj.repOK(trajSynth,track,route));
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
		Route route = new Route();
		LinkedList fixes_27 = new LinkedList();
		Entry header_28 = new Entry();
		double tsTime_14 = 1;
		double speed_18 = -1;
		int size_230 = 0;
		int size_29 = 0;
		double verThres_10 = 0;
		double minLat_3 = 0;
		boolean angWtOn_7 = false;
		double lon_16 = 0;
		double mTime_20 = 0;
		double heading_19 = 0;
		boolean speWtOn_8 = false;
		double speThres_12 = 0;
		double lon2_26 = 0;
		double lat1_23 = 0;
		boolean latWtOn_5 = false;
		double resThres_13 = 0;
		double alt_17 = 0;
		double lat_15 = 0;
		double minLon_4 = 0;
		double lon1_24 = 0;
		double latThres_9 = 0;
		double lat2_25 = 0;
		boolean verWtOn_6 = false;
		double angThres_11 = 0;
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
		nextFix_22.lat = lat2_25;
		nextFix_22.lon = lon2_26;
		route.fixes = fixes_27;
		fixes_27.header = header_28;
		fixes_27.size = size_29;
		header_28.next = header_28;
		header_28.previous = header_28;
		//System.out.println(obj.repOK(trajSynth,track,route));
		obj.TS_R_3(trajSynth,track,route);
	}

	@Test
	public void test_TS_R_34() throws Exception {
		Driver_TS_R obj = new Driver_TS_R();
		TrajectorySynthesizer trajSynth = new TrajectorySynthesizer();
		SimpleCalculator calc_1 = new SimpleCalculator();
		EngineParameters params_2 = new EngineParameters();
		RouteTrack track = new RouteTrack();
		Fix prevFix_21 = new Fix();
		Fix nextFix_22 = new Fix();
		Route route = new Route();
		LinkedList fixes_27 = new LinkedList();
		Entry header_28 = new Entry();
		double tsTime_14 = 0;
		int size_29 = 0;
		int size_230 = 0;
		double verThres_10 = 0;
		double minLat_3 = 0;
		boolean angWtOn_7 = false;
		double lon_16 = 0;
		double mTime_20 = 0;
		double heading_19 = 0;
		boolean speWtOn_8 = false;
		double speThres_12 = 0;
		double lon2_26 = 0;
		double lat1_23 = 0;
		boolean latWtOn_5 = false;
		double resThres_13 = 0;
		double alt_17 = 0;
		double lat_15 = 0;
		double speed_18 = 0;
		double minLon_4 = 0;
		double lon1_24 = 0;
		double latThres_9 = 0;
		double lat2_25 = 0;
		boolean verWtOn_6 = false;
		double angThres_11 = 0;
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
		nextFix_22.lat = lat2_25;
		nextFix_22.lon = lon2_26;
		route.fixes = fixes_27;
		fixes_27.header = header_28;
		fixes_27.size = size_29;
		header_28.next = header_28;
		header_28.previous = header_28;
		//System.out.println(obj.repOK(trajSynth,track,route));
		obj.TS_R_3(trajSynth,track,route);
	}

	@Test
	public void test_TS_R_35() throws Exception {
		Driver_TS_R obj = new Driver_TS_R();
		TrajectorySynthesizer trajSynth = new TrajectorySynthesizer();
		SimpleCalculator calc_1 = new SimpleCalculator();
		EngineParameters params_2 = new EngineParameters();
		RouteTrack track = new RouteTrack();
		Fix prevFix_21 = new Fix();
		Fix nextFix_22 = new Fix();
		Route route = new Route();
		LinkedList fixes_27 = new LinkedList();
		Entry header_28 = new Entry();
		double tsTime_14 = 1;
		double speed_18 = 0;
		int size_230 = 0;
		int size_29 = 0;
		double verThres_10 = 0;
		double minLat_3 = 0;
		boolean angWtOn_7 = false;
		double lon_16 = 0;
		double mTime_20 = 0;
		double heading_19 = 0;
		boolean speWtOn_8 = false;
		double speThres_12 = 0;
		double lon2_26 = 0;
		double lat1_23 = 0;
		boolean latWtOn_5 = false;
		double resThres_13 = 0;
		double alt_17 = 0;
		double lat_15 = 0;
		double minLon_4 = 0;
		double lon1_24 = 0;
		double latThres_9 = 0;
		double lat2_25 = 0;
		boolean verWtOn_6 = false;
		double angThres_11 = 0;
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
		nextFix_22.lat = lat2_25;
		nextFix_22.lon = lon2_26;
		route.fixes = fixes_27;
		fixes_27.header = header_28;
		fixes_27.size = size_29;
		header_28.next = header_28;
		header_28.previous = header_28;
		//System.out.println(obj.repOK(trajSynth,track,route));
		obj.TS_R_3(trajSynth,track,route);
	}

}

