class Node {
    String car;
    Node next;
}

public class TrafficManager {
    public static void main(String[] args) {
        Node a = new Node();
        a.car = "CAR1";
        a.next = a; // circular
        System.out.println(a.car);
    }
}
