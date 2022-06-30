package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {
    int CAPACITY;
    int front, rear;
    String[] items;
    int SIZE;
    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        items = new String[5];
        CAPACITY = 5;
        front = -1;
        rear = -1;
        SIZE = 0;
    }

    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        items = new String[capacity];
        CAPACITY = capacity;
        front = -1;
        rear = -1;
        SIZE = 0;
    }

    @Override
    public int size() {
        return SIZE;
    }

    @Override
    public boolean isEmpty() {
        return (SIZE == 0);
    }

    @Override
    public boolean isFull() {
        return (SIZE == CAPACITY);
    }

    @Override
    public boolean enqueue(String obj) {
        if (isFull()) {
            //System.out.println("Queue is full");
            return false;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % CAPACITY;
            items[rear] = obj;
            SIZE++;
            return true;
        }
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
            //System.out.println("Queue is empty");
            return null;
        } else {
            String tmp = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % CAPACITY;
            }
            SIZE--;
            return tmp;
        }
    }

    @Override
    public void printAllElements() {
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%s%n", items[(front + i) % CAPACITY]);
        }
    }
}
