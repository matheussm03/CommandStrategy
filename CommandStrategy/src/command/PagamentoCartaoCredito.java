package command;

public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("Compra aprovada cartao credito!\n" + compra.getInfoNota());
	}

}
