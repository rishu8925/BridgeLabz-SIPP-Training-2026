import java.util.*;

public class PrintQueue {
    private Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public int printNextJob() {
        return printQueue.removeFirst();
    }

    public static void main(String[] args) {
        PrintQueue queue = new PrintQueue();
        queue.submitJob(101);
        queue.submitJob(102);
        queue.submitUrgentJob(999);
        System.out.println(queue.printNextJob());
        System.out.println(queue.printNextJob());
    }
}