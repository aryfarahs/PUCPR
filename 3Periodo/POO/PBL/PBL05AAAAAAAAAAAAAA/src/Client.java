public class Client extends Person {
    private int favoriteRestaurants;

    public Client() {
        super("", "", "");
    }
    public Client(int favoriteRestaurants, String cpf, String name, String number) {
        super(cpf, name, number);
        this.favoriteRestaurants = favoriteRestaurants;
    }

    public int getFavoriteRestaurants() {
        return this.favoriteRestaurants;
    }
    public void setFavoriteRestaurants(int favoriteRestaurants) { this.favoriteRestaurants = favoriteRestaurants; }

}
