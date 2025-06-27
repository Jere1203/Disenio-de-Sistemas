package API;

public abstract class NotificationService {
  abstract void notify(String text);

  abstract void send(String email, String text);
}
