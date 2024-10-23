
class Node {
    public Node next = null;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.print("Node Data: " + data);
    }
}