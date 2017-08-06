package ganttproject;

import java.util.Collections;
import java.util.List;

//import jbse.meta.Analysis;

public class NodeData {
    int myLevel = 0;
    LinkedList<DependencyEdge> myIncoming;
    LinkedList<DependencyEdge> myOutgoing;
    Node myNode;
    Transaction myTxn;
    NodeData myBackup;

    private static void _got_myBackup(NodeData d) {
//    	Analysis.assume(d.myTxn.isRunning());
    }
    
    NodeData(Node node, Transaction txn) {
      myNode = node;
      myTxn = txn;
      myIncoming = new LinkedList<>();//new ArrayList<>();
      myOutgoing = new LinkedList<>();//new ArrayList<>();
      myBackup = null;
    }

    private NodeData(NodeData backup) {
      myNode = backup.myNode;
      myTxn = backup.myTxn;
      myLevel = backup.myLevel;
      myIncoming = /*new ArrayList<>*/new LinkedList<>(backup.myIncoming);
      myOutgoing = /*new ArrayList<>*/new LinkedList<>(backup.myOutgoing);
      myBackup = backup;
      myTxn.touch(myNode);
    }

    public NodeData() {
		// TODO Auto-generated constructor stub
	}

	NodeData revert() {
      return (myBackup == null) ? this : myBackup;
    }

    List<DependencyEdge> getIncoming() {
      return Collections.unmodifiableList(myIncoming);
    }

    List<DependencyEdge> getOutgoing() {
//      return Collections.unmodifiableList(myOutgoing);
      return myOutgoing;
    }

    int getLevel() {
      return myLevel;
    }

    NodeData setLevel(int level) {
      if (!myTxn.isRunning() || myBackup != null) {
        myLevel = level;
        return this;
      }
      return new NodeData(this).setLevel(level);
    }

    NodeData addOutgoing(DependencyEdge dep) {
      if (!myTxn.isRunning() || myBackup != null) {
        myOutgoing.add(dep);
        return this;
      }
      return new NodeData(this).addOutgoing(dep);
    }

    NodeData addIncoming(DependencyEdge dep) {
      if (!myTxn.isRunning() || myBackup != null) {
        myIncoming.add(dep);
        return this;
      }
      return new NodeData(this).addIncoming(dep);
    }

    NodeData removeOutgoing(DependencyEdge edge) {
      if (!myTxn.isRunning() || myBackup != null) {
        myOutgoing.remove(edge);
        return this;
      }
      return new NodeData(this).removeOutgoing(edge);
    }

    NodeData removeIncoming(DependencyEdge edge) {
      if (!myTxn.isRunning() || myBackup != null) {
        myIncoming.remove(edge);
        return this;
      }
      return new NodeData(this).removeIncoming(edge);
    }
  }

