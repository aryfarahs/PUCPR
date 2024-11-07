public class Item {
	private String nome;
	private boolean disponivel;
	private double preco;

	public Item(String nome, boolean disponivel, double preco) {
		this.nome = nome;
		this.disponivel = disponivel;
		this.preco = preco;
	}

	public void search_item() {
		System.out.println("Informações do Item:");
		System.out.println("Nome: " + nome);
		System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
		System.out.println("Preço: " + preco);
	}

	public void update_item(boolean novaDisponibilidade) {
		this.disponivel = novaDisponibilidade;
	}



	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
