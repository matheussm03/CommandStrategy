package strategy;

public class CalculaDescontoTrinta implements CalculaDesconto {
	@Override
	public double calculaDescontoCompra(Cliente umCliente) {
		if (umCliente.getValorCompra() > 299) {
			return umCliente.getValorCompra() * 0.7;
		}
		return umCliente.getValorCompra() * 0.8;
	}
}
