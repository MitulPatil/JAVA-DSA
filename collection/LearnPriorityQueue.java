import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(); //it work on min heap concept
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        Queue<Integer> reversepq = new PriorityQueue<>(Comparator.reverseOrder()); //it work on max hea p concept

        reversepq.offer(40);
        reversepq.offer(12);
        reversepq.offer(24);
        reversepq.offer(36);

        System.out.println(reversepq);
        reversepq.poll();
        System.out.println(reversepq);
        System.out.println(reversepq.peek());

    }
}
