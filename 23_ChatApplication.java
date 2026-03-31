public class ChatApplication {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Sending message...")).start();
        new Thread(() -> System.out.println("Receiving message...")).start();
    }
}