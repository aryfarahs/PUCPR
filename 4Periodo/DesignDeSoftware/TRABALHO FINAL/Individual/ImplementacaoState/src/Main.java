public class Main {
    public static void main(String[] args) {

        User user = new User();

        user.mudarEstado(1);
        System.out.println("Estado inicial: " + user.getEstado());

        user.setEstado(new Banido());
        user.mudarEstado(2);

        System.out.println("Estado atual: " + user.getEstado());

    }
}