public class PagIbigOfficeApp {
    public static void main(String[] args) {
        QueuingSystem queueSystem = QueuingSystem.getInstance();

        System.out.println("--- Day Operations Started ---");

        System.out.println("[Visitor Area] Dispensing tickets...");
        queueSystem.getNextQueueNumber();
        queueSystem.getNextQueueNumber();
        queueSystem.getNextQueueNumber();

        System.out.println("\n[Online Monitor] Live Current Queue: #" + queueSystem.getCurrentQueueNumber());

        System.out.println("\n[Help Desk Station 1] Issuing next number...");
        queueSystem.getNextQueueNumber();

        System.out.println("\n[Help Desk Station 2] Technical issue encountered. Resetting queue counter to 100...");
        queueSystem.resetQueueNumber(100);

        System.out.println("\n[Visitor Area] Dispensing ticket after system reset...");
        queueSystem.getNextQueueNumber();

        System.out.println("\n[Online Monitor] Live Current Queue: #" + queueSystem.getCurrentQueueNumber());
    }
}