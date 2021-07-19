package command;

public class Teste {
	public static void main(String[] args) {
		Loja loja1 = new Loja();
		loja1.executarCompra(999.00, new PagamentoCartaoCredito());
		loja1.executarCompra(299.00, new PagamentoCartaoDebito());

		Loja loja2 = new Loja();
		loja2.executarCompra(99.00, new PagamentoCartaoCredito());
		loja2.executarCompra(99.00, new PagamentoCartaoDebito());

	}
}
