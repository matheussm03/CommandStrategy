package command;

public class Compra {
	private static int contadorId;
	protected int idNotaFiscal;
	protected String nomeEmpresa;
	protected double valorTotal;

	public Compra(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
		idNotaFiscal = ++contadorId;
	}

	public void setValor(double valor) {
		this.valorTotal = valor;
	}

	public String getInfoNota() {
		return new String("Nota fiscal numero: " + idNotaFiscal +
				 "\nValor: " + valorTotal+"\n");
	}
}
