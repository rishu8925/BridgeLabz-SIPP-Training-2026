class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    EmailNotification(String name, String msg) {
        super(name, msg);
    }

    void sendNotification() {
        System.out.println("Email sent to " + recipientName + ": " + message);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String name, String msg) {
        super(name, msg);
    }

    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + ": " + message);
    }
}

class PushNotification extends Notification {
    PushNotification(String name, String msg) {
        super(name, msg);
    }

    void sendNotification() {
        System.out.println("Push sent to " + recipientName + ": " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification[] arr = {
            new EmailNotification("Rishu", "Welcome"),
            new SMSNotification("Aman", "OTP"),
            new PushNotification("Neha", "Offer")
        };

        for (Notification n : arr) {
            n.sendNotification();
        }
    }
}