package tsafe;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.data.DataNode;
import gov.nasa.jpf.star.data.DataNodeLexer;
import gov.nasa.jpf.star.data.DataNodeMap;
import gov.nasa.jpf.star.data.DataNodeParser;
import gov.nasa.jpf.star.precondition.Precondition;
import gov.nasa.jpf.star.precondition.PreconditionLexer;
import gov.nasa.jpf.star.precondition.PreconditionMap;
import gov.nasa.jpf.star.precondition.PreconditionParser;
import gov.nasa.jpf.star.predicate.InductivePred;
import gov.nasa.jpf.star.predicate.InductivePredLexer;
import gov.nasa.jpf.star.predicate.InductivePredMap;
import gov.nasa.jpf.star.predicate.InductivePredParser;
import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("deprecation")
public class Tsafe_tsr3Test extends TestJPF {
	
	private void initDataNode() {
		String data1 = "data TrajectorySynthesizer {SimpleCalculator calc; EngineParameters params}";
		String data2 = "data SimpleCalculator {double minLat; double minLon}";
		String data3 = "data EngineParameters {boolean cmLateralWeightOn; boolean cmVerticalWeightOn; boolean cmAngularWeightOn; boolean cmSpeedWeightOn;" +
			"double cmLateralThreshold; double cmVerticalThreshold; double cmAngularThreshold; double cmSpeedThreshold; double cmResidualThreshold; double tsTimeHorizon}";
		String data4 = "data RouteTrack{double lat; double lon; double alt; double speed; double heading; double mTime; Fix prevFix; Fix nextFix}";
		String data5 = "data Fix {double lat; double lon; String id}";
		String data6 = "data LinkedList {int modCount; Entry header; int size}";
		String data7 = "data Entry {Fix element; Entry next; Entry previous}";
		String data8 = "data String {}";
		String data9 = "data Route {LinkedList fixes}";
		
		String data = data1 + ";" + data2 + ";" + data3 + ";" + data4 + ";" + data5 + ";" + data6 + ";" + data7 + ";" + data8 + ";" + data9;
		
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DataNodeParser parser = new DataNodeParser(tokens);
		
        DataNode[] dns = parser.datas().dns;
        DataNodeMap.put(dns);
	}
	
	private void initPredicate() {
		String pred1 = "pred cond(trajSynth,track,route) == trajSynth::TrajectorySynthesizer<calc,params> * calc::SimpleCalculator<minLat,minLon> *" +
				"params::EngineParameters<latWtOn,verWtOn,angWtOn,speWtOn,latThres,verThres,angThres,speThres,resThres,tsTime> * " + 
				"track::RouteTrack<lat,lon,alt,speed,heading,mTime,prevFix,nextFix> * prevFix::Fix<lat1,lon1,id1> * nextFix::Fix<lat2,lon2,id2> * id1::String<> * id2::String<> * " +
				"route::Route<fixes> * fixes::LinkedList<_,header,size> * dll(header,size) & " +
				"latWtOn=0 & verWtOn=0 & angWtOn=0 & speWtOn=0 & latThres=18520.0 & verThres=609.7561 & angThres=0.5 & speThres=100 & resThres=1.0 & tsTime=180000";
		String pred2 = "pred dll(header,size) == header::Entry<ele,header,header> & size=0 || header::Entry<ele,next,prev> * ele::Fix<lat,lon,id> * nndll(next,header,header,prev,size)";
		String pred3 = "pred nndll(curr,prev,header,prevH,size) == curr::Entry<ele,header,prev> * ele::Fix<lat,lon,id> & prevH=curr & size=1 || curr::Entry<ele,next,prev> * nndll(next,curr,header,prevH,size1) * ele::Fix<lat,lon,id> & size=size1+1";
				
		String pred = pred1 + ";" + pred2 + ";" + pred3;
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre TS_R_3 == cond(trajSynth,track,route)";
		
		ANTLRInputStream in = new ANTLRInputStream(pre);
		PreconditionLexer lexer = new PreconditionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PreconditionParser parser = new PreconditionParser(tokens);
        
        Precondition[] ps = parser.pres().ps;
        PreconditionMap.put(ps);
	}
	
	@Before
	public void init() {
		initDataNode();
		initPredicate();
		initPrecondition();
	}
	
	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=.star.StarListener",
				"+star.max_depth=10",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=/Users/HongLongPham/Workspace/JPF_HOME/jpf-star/src/examples/tsafe",
				"+star.test_package=tsafe",
				"+star.test_imports=tsafe.LinkedList.Entry;gov.nasa.jpf.star.examples.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=tsafe.Driver_TS_R.TS_R_3(sym#sym#sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Driver_TS_R driver = new Driver_TS_R();
			LatLonBounds bounds = new LatLonBounds(0,0,0,0);
			EngineCalculator calc = new SimpleCalculator(bounds);
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
