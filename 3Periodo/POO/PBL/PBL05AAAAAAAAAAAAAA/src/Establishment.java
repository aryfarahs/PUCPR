public class Establishment {
    private String name;
    private String kind;
    private String productCategory;
    private String location;
    private boolean promotion;

    public Establishment() {
        this("Estabelecimento Z", "", "", "", false);
    }
    public Establishment(String name, String kind, String productCategory, String location, boolean promotion) {
        this.name = name;
        this.kind = kind;
        this.productCategory = productCategory;
        this.location = location;
        this.promotion = promotion;
    }

    public String getName() {
        return this.name;
    }
    public String getKind() {
        return this.kind;
    }
    public String getProductCategory() {
        return this.productCategory;
    }
    public String getLocation() {
        return this.location;
    }
    public boolean isPromotion() {
        return this.promotion;
    }

    public void setName(String name) { this.name = name; }
    public void setKind(String kind) { this.kind = kind; }
    public void setProductCategory(String productCategory) { this.productCategory = productCategory; }
    public void setLocation(String location) { this.location = location; }
    public void setPromotion(boolean promotion) { this.promotion = promotion; }
}
