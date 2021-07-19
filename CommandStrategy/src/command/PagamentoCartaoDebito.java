package command;

public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("Compra aprovada cartao debito!\n" + compra.getInfoNota());
	}

}
