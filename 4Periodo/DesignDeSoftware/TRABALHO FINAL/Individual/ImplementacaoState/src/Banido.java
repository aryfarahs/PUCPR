public class Banido implements EstadoUser {

    @Override
    public void estado(User user, int estado) {
        gerarBan();
        System.out.println("Usuário banido");
        user.setEstado("Banido");
    }

    public void gerarBan() {
        System.out.println("Você foi banido");
    }

}
