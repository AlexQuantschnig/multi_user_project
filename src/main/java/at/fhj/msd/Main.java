package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        StringQueue queue = new StringQueue(5);
        for (int i = 0; i < 5; i++) {
            queue.offer("String " + i);
            System.out.println("Size of the queue: " + queue.getElements().toString());
        }
        System.out.println(queue.element());
    }
}