class TaskNode {
    int id;
    String name, dueDate;
    int priority;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    TaskNode head = null;

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
}
