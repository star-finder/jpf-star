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
      for (Node node : myTouchedNodes) {
        node.revertData();
      }
      isRunning = false;
    }
}
