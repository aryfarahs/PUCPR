public class Aluguel {

	private Pagamento pagamento;
	private Item item;

	public Aluguel(Pagamento pagamento, Item item) {
		this.pagamento = pagamento;
		this.item = item;
	}

	public void alugar() {
	System.out.println("Aluguel realizado com sucesso!");
	}

	public Pagamento getPagamento() {
		return pagamento;
	}
}
