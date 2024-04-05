import java.lang.String;

public class Person {
    protected String name;
    protected String cpf;
    protected String number;

    public Person(String name, String cpf, String number) {
        this.name = name;
        this.cpf = cpf;
        this.number = number;
    }

    public String getName() {return this.name;}
    public String getCpf() {return this.cpf;}
    public String getNumber() {return this.number;}
    public void setName(String name) {this.name = name;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setNumber(String number) {this.number = number;}
}
