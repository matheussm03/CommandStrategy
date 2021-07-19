package command;

public class Loja {
	protected String nomeEmpresa;

	public Loja() {
		
	}

	public void executarCompra(double valor, PagamentoCommand formaDePagamento) {
		Compra compra = new Compra(nomeEmpresa);
		compra.setValor(valor);
		formaDePagamento.processarCompra(compra);
	}
}
