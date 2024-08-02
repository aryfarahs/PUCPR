public abstract class Pessoa {
    private String name;
    private String email;
    private int anoNasc;
    private String cpf;

    public Pessoa(String name, String email, int anoNasc, String cpf) {
        this.name = name;
        this.email = email;
        this.anoNasc = anoNasc;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public String getCpf() {
        return cpf;
    }


}
