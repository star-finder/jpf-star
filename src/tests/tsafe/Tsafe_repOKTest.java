package tsafe;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class Tsafe_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data1 = "data TrajectorySynthesizer {SimpleCalculator calc; EngineParameters params}";
		String data2 = "data SimpleCalculator {double minLat; double minLon}";
		String data3 = "data EngineParameters {boolean cmLateralWeightOn; boolean cmVerticalWeightOn; boolean cmAngularWeightOn; boolean cmSpeedWeightOn;" +
			"double cmLateralThreshold; double cmVerticalThreshold; double cmAngularThreshold; double cmSpeedThreshold; double cmResidualThreshold; double tsTimeHorizon}";
		String data4 = "data RouteTrack{double lat; double lon; double alt; double speed; double heading; double mTime; Fix prevFix; Fix nextFix}";
		String data5 = "data Fix {double lat; double lon; void id}";
		String data6 = "data LinkedList {int modCount; Entry header; int size}";
		String data7 = "data Entry {void element; Entry next; Entry previous}";
		String data8 = "data Route {LinkedList fixes}";
		
		String data = data1 + ";" + data2 + ";" + data3 + ";" + data4 + ";" + data5 + ";" + data6 + ";" + data7 + ";" + data8;;
		Initializer.initDataNode(data);
	}

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=1",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/tsafe",
				"+star.test_package=tsafe",
				"+star.test_imports=tsafe.LinkedList.Entry;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=tsafe.Driver_TS_R.repOK(sym#sym#sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Driver_TS_R driver = new Driver_TS_R();
			LatLonBounds bounds = new LatLonBounds(0,0,0,0);
			SimpleCalculator calc = new SimpleCalculator(bounds);
			EngineParameters params = new EngineParameters();
			TrajectorySynthesizer trajSynth = new TrajectorySynthesizer(calc, params);
			RouteTrack track = new RouteTrack(new Fix("", 0, 0), new Fix("", 0, 0), 0, 0, 0, 0, 0, 0);
			Route route = new Route();
			driver.repOK(trajSynth, track, route);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
