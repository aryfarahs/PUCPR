public class Promotion {
    private String establishmentName;
    private String product;
    private float value;

    public Promotion() {
        this("Estabelecimento Z", "", 0F);
    }
    public Promotion(String establishmentName, String product, float value) {
        this.establishmentName = establishmentName;
        this.product = product;
        this.value = value;
    }

    public String getEstablishmentName() {
        return this.establishmentName;
    }
    public String getProduct() { return this.product; }
    public float getValue() { return this.value; }

    public void setEstablishmentName(String establishmentName) { this.establishmentName = establishmentName; }
    public void setProduct(String product) {
        this.product = product;
    }
    public void setValue(float value) {
        this.value = value;
    }
}
