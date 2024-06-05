package gr.aueb.excercises.OOP.ch14;

public class QueueManager {
    private static QueueManager INSTANCE = null;
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int MAX_SIZE = 10;

    private QueueManager () {
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.queue = new int[MAX_SIZE];
    }

    public static QueueManager getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new QueueManager();
        }
        return INSTANCE;
    }

    public void enqueue(int num) {
        if(isFull(this)){
            System.out.println("Η ουρά είναι γεμάτη. Δεν μπορεί να προστεθεί το στοιχείο.");
            return;
        }
        rear = (rear+1) % MAX_SIZE;
        queue[rear] = num;
        size++;
    }

    public int dequeue() {
        if(isEmpty(this)){
            System.out.println("Η ουρά είναι άδεια. Δεν μπορεί να επιστραφεί το στοιχείο.");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return value;
    }



    private static boolean isFull(QueueManager sm) {
        return sm.size == MAX_SIZE;
    }

    private static boolean isEmpty(QueueManager sm) {
        return sm.size == 0;
    }
}
