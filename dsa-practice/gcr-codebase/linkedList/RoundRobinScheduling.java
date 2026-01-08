class ProcessNode {
    int pid, burst;
    ProcessNode next;
}

class RoundRobin {
    ProcessNode head;

    void execute(int quantum) {
        ProcessNode temp = head;
        while (head != null) {
            if (temp.burst > quantum) {
                temp.burst -= quantum;
            } else {
                System.out.println("Process " + temp.pid + " completed");
                temp.burst = 0;
            }
            temp = temp.next;
        }
    }
}
