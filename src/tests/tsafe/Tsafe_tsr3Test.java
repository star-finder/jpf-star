package tsafe;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class Tsafe_tsr3Test extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data1 = "data TrajectorySynthesizer {SimpleCalculator calc; EngineParameters params}";
		String data2 = "data SimpleCalculator {double minLat; double minLon}";
		String data3 = "data EngineParameters {boolean cmLateralWeightOn; boolean cmVerticalWeightOn; boolean cmAngularWeightOn; boolean cmSpeedWeightOn;" +
			"double cmLateralThreshold; double cmVerticalThreshold; double cmAngularThreshold; double cmSpeedThreshold; double cmResidualThreshold; double tsTimeHorizon}";
		String data4 = "data RouteTrack{double lat; double lon; double alt; double speed; double heading; double mTime; Fix prevFix; Fix nextFix}";
		String data5 = "data Fix {double lat; double lon; void id}";
		String data6 = "data LinkedList {int modCount; Entry header; int size}";
		String data7 = "data Entry {Fix element; Entry next; Entry previous}";
		String data8 = "data Route {LinkedList fixes}";
		
		String data = data1 + ";" + data2 + ";" + data3 + ";" + data4 + ";" + data5 + ";" + data6 + ";" + data7 + ";" + data8;;
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred1 = "pred cond(trajSynth,track,route) == trajSynth::TrajectorySynthesizer<calc,params> * calc::SimpleCalculator<minLat,minLon> *" +
				"params::EngineParameters<latWtOn,verWtOn,angWtOn,speWtOn,latThres,verThres,angThres,speThres,resThres,tsTime> * " + 
				"track::RouteTrack<lat,lon,alt,speed,heading,mTime,prevFix,nextFix> * prevFix::Fix<lat1,lon1,_> * nextFix::Fix<lat2,lon2,_> * " +
				"route::Route<fixes> * fixes::LinkedList<_,header,size> * dll(header,size)";// & " +
//				"latWtOn=0 & verWtOn=0 & angWtOn=0 & speWtOn=0 & latThres=18520.0 & verThres=609.7561 & angThres=0.5 & speThres=100 & resThres=1.0 & tsTime=180000";
		String pred2 = "pred dll(header,size) == header::Entry<element,header,header> * element::Fix<lat,lon,_> & size=0 || header::Entry<element,next,prev> * element::Fix<lat,lon,_> * nndll(next,header,header,prev,size)";
		String pred3 = "pred nndll(curr,prev,header,prevH,size) == curr::Entry<element,header,prev> * element::Fix<lat,lon,_> & prevH=curr & size=1 || curr::Entry<element,next,prev> * element::Fix<lat,lon,_> * nndll(next,curr,header,prevH,size1) & size=size1+1";
				
		String pred = pred1 + ";" + pred2 + ";" + pred3;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre TS_R_3 == cond(trajSynth,track,route)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=1",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/tsafe",
				"+star.test_package=tsafe",
				"+star.test_imports=tsafe.LinkedList.Entry;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=tsafe.Driver_TS_R.TS_R_3(sym#sym#sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Driver_TS_R driver = new Driver_TS_R();
			LatLonBounds bounds = new LatLonBounds(0,0,0,0);
			SimpleCalculator calc = new SimpleCalculator(bounds);
			EngineParameters params = new EngineParameters();
			TrajectorySynthesizer trajSynth = new TrajectorySynthesizer(calc, params);
			RouteTrack track = new RouteTrack(new Fix("", 0, 0), new Fix("", 0, 0), 0, 0, 0, 0, 0, 0);
			Route route = new Route();
			try {
				driver.TS_R_3(trajSynth, track, route);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
