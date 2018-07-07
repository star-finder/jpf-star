package ganttproject;

public class Transaction {
    public boolean isRunning;
    public LinkedListNode myTouchedNodes = /*INSTRUMENTATION: new HashSet<>()*/new LinkedListNode();

    public boolean isRunning() {
      return isRunning;
    }

    public void touch(Node node) {
      myTouchedNodes.add(node);
    }

    public void start() {
      isRunning = true;
    }

    public void rollback() {
//      for (int i = 0; i < myTouchedNodes.size; i++) {
//    	  Node node = myTouchedNodes.get(i);
//    	  node.revertData();
//      }
      for (Node node : myTouchedNodes) {
        node.revertData();
      }
      isRunning = false;
    }
}
