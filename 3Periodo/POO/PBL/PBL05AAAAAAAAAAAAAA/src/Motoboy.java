public class Motoboy extends Person {
    private String placaMoto;

    public Motoboy() {
        super("Motoboy Y", "", "");
        this.placaMoto = "blablabla";
    }
    public Motoboy(String name, String cpf, String number, String placaMoto) {
        super(name, cpf, number);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return this.placaMoto;
    }
    public void setPlacaMoto(String placaMoto) { this.placaMoto = placaMoto; }
}
