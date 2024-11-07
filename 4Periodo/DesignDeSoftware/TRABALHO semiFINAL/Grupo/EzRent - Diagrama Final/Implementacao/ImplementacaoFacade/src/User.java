public class User {

	private String username;
	private int idUsuario;
	private Aluguel aluguel;

	public User(String username, int idUsuario) {
		this.username = username;
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Aluguel getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}

}
