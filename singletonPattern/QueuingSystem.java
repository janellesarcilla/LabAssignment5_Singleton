package singletonPattern;

public class QueuingSystem {
    private static QueuingSystem instance;
    private int currentQueueNumber;

    private QueuingSystem() {
        this.currentQueueNumber = 0;
    }

    public static synchronized QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        currentQueueNumber++;
        System.out.println("New ticket issued: Queue #" + currentQueueNumber);
        return currentQueueNumber;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    
    public synchronized void resetQueueNumber(int newNumber) {
        if (newNumber >= 0) {
            this.currentQueueNumber = newNumber;
            System.out.println("System Alert: Queue number has been reset to " + newNumber);
        } else {
            System.out.println("Error: Queue number cannot be negative. Queue reset rejected.");
        }
    }
}