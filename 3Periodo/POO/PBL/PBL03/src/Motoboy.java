public class Motoboy {
    private String name;
    private String cpf;
    private String number;

    public Motoboy() {
        this("José Pereira", "222.333.444-55", "43912345678");
    }
    public Motoboy(String name, String cpf, String number) {
        this.name = name;
        this.cpf = cpf;
        this.number = number;
    }

    public String getName() {return this.name;}
    public String getCpf() {return this.cpf;}
    public String getNumber() {return this.number;}

    public void setName(String name) { this.name = name; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setNumber(String number) { this.number = number; }
}
