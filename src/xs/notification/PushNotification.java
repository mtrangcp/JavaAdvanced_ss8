package xs.notification;

public class PushNotification implements NotificationService{
    @Override
    public void notifyUser(String message) {
        System.out.println("Push notification: " + message);
    }
}
