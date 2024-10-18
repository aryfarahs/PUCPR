public class Main {
    public static void main(String[] args) {

        AdManager adManager = new AdManager();
        User email = new ShowEmail();
        User popUp = new ShowPopUp();

        adManager.addUser(email);
        adManager.addUser(popUp);

        adManager.createAd();
        adManager.removeAd();

    }
}