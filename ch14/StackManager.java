package gr.aueb.excercises.OOP.ch14;

public class StackManager {
    private static StackManager INSTANCE = null;
    private String[] stack;
    private int top;
    private static final int MAX_SIZE = 10;

    private StackManager(){
        this.top =-1;
        this.stack = new String[MAX_SIZE];
    }

    public static StackManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StackManager();
        }
        return INSTANCE;
    }

    public void push(String value) {
        if (isFull(this)) {
            System.out.println("Η στοίβα είναι γεμάτη. Δεν μπορεί να προστεθεί το στοιχείο.");
            return;
        }
        top++;
        stack[top] = value;
    }

    public String pop() {
        if (isEmpty(this)) {
            System.out.println("Η στοίβα είναι άδεια. Δεν υπάρχει στοιχείο για εξαγωγή.");
            return null;
        }
        return stack[top--];
    }

    private static boolean isFull(StackManager sm) {
        return sm.top == MAX_SIZE - 1;
    }

    private static boolean isEmpty(StackManager sm) {
        return sm.top == -1;
    }

}
