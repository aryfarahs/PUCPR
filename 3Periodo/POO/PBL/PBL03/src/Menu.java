public class Menu {
    private String establishmentName;
    private String product;
    private float price;

    public Menu() {
        this("Estabelecimento Z", "", 0F);
    }
    public Menu(String establishmentName, String product, float price) {
        this.establishmentName = establishmentName;
        this.product = product;
        this.price = price;
    }

    public String getEstablishmentName() {
        return this.establishmentName;
    }
    public String getProduct() { return this.product; }
    public float getPice() { return this.price; }

    public void setEstablishmentName(String establishmentName) { this.establishmentName = establishmentName; }
    public void setProduct(String product) {
        this.product = product;
    }
    private void setPrice(float price) {
        this.price = price;
    }
}
