public class Online implements EstadoUser {

    @Override
    public void estado(User user, int estado) {
        System.out.println("Usuário online");
        user.setEstado("Online");
    }

    public void isOnline() {
        System.out.println("Usuário online");
    }

}
