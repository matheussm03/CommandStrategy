package strategy;

public class Cliente {
	public static final int PRATA = 1;
	public static final int OURO = 2;
	public static final int DIAMANTE = 3;
	protected double valorCompra;
	protected int segmento;
	protected CalculaDesconto estrategiaDeCalculo;

	public Cliente(int segmento, double valorCompra) {
		this.valorCompra = valorCompra;
		switch (segmento) {
		case PRATA:
			estrategiaDeCalculo = new CalculaDescontoDez();
			segmento = PRATA;
			break;
		case OURO:
			estrategiaDeCalculo = new CalculaDescontoVinte();
			segmento = OURO;
			break;
		case DIAMANTE:
			estrategiaDeCalculo = new CalculaDescontoTrinta();
			segmento = DIAMANTE;
			break;
		default:
			throw new RuntimeException("Segmento não encontrado :/");
		}
	}


	public double calculaDescontoCompra() {
		return estrategiaDeCalculo.calculaDescontoCompra(this);
	}

	public double getValorCompra() {
		return valorCompra;
	}
}
