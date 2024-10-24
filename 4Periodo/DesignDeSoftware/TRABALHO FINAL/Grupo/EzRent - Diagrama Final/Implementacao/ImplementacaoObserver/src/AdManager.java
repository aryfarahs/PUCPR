import java.util.List;
import java.util.ArrayList;

public class AdManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void createAd() {
        System.out.println("Anúncio criado");
        notifyUsers();
    }

    public void removeAd() {
        System.out.println("Anúncio removido");
        notifyUsers();
    }

    private void notifyUsers() {
        for (User user : users) {
            user.update();
        }
    }

}
