import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> printQueue;

    public PrintQueue() {
        printQueue = new ArrayDeque<>();
    }

    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public int printNextJob() {

        if (printQueue.isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }

        return printQueue.removeFirst();
    }

    public void display() {

        if (printQueue.isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        for (int job : printQueue) {
            System.out.print(job + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PrintQueue pq = new PrintQueue();

        pq.submitJob(1);
        pq.submitJob(2);
        pq.submitJob(3);

        pq.submitUrgentJob(99);

        pq.display();

        System.out.println("Printed : " + pq.printNextJob());

        pq.display();
    }
}