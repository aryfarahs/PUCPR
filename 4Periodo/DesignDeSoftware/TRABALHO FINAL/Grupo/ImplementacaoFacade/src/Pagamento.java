public class Pagamento {
	private int valor;

	public boolean pagar() {
		if (valor > 0) {
			System.out.println("Pagamento de " + valor + " realizado com sucesso");
			return true;
		} else {
			System.out.println("Falha no pagamento. Valor inválido.");
			return false;
		}

	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
