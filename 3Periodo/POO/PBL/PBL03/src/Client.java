public class Client {
    private int favoriteRestaurants;
    private String cpf;
    private String name;
    private String number;

    public Client() {
        this(0, "", "Cliente X", "");
    }
    public Client(int favoriteRestaurants, String cpf, String name, String number) {
            this.favoriteRestaurants = favoriteRestaurants;
            this.cpf = cpf;
            this.name = name;
            this.number = number;
    }

    public int getFavoriteRestaurants() {
        return this.favoriteRestaurants;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getName() {
        return this.name;
    }
    public String getNumber() {
        return this.number;
    }

    public void setFavoriteRestaurants(int favoriteRestaurants) { this.favoriteRestaurants = favoriteRestaurants; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setName(String name) { this.name = name; }
    public void setNumber(String number) { this.number = number; }
}
