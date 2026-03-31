class Process {
    int pid, burst;
    Process next;

    Process(int p, int b) {
        pid = p; burst = b;
    }
}

public class RoundRobin {
    Process head;

    void add(Process p) {
        if (head == null) {
            head = p;
            p.next = head;
            return;
        }
        Process t = head;
        while (t.next != head)
            t = t.next;
        t.next = p;
        p.next = head;
    }

    void execute(int quantum) {
        Process t = head;
        do {
            if (t.burst > 0) {
                t.burst -= quantum;
                if (t.burst < 0) t.burst = 0;
                System.out.println("Process " + t.pid + " remaining " + t.burst);
            }
            t = t.next;
        } while (t != head);
    }

    public static void main(String[] args) {
        RoundRobin r = new RoundRobin();
        r.add(new Process(1, 10));
        r.add(new Process(2, 5));
        r.execute(3);
    }
}
