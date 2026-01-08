class TaskNode {
    int id, priority;
    String name;
    TaskNode next;

    TaskNode(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}

public class TaskScheduler {
    TaskNode head;

    void addTask(TaskNode node) {
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void display() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler t = new TaskScheduler();
        t.addTask(new TaskNode(1, "Coding", 1));
        t.addTask(new TaskNode(2, "Testing", 2));
        t.display();
    }
}
