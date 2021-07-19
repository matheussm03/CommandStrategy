package strategy;

public class CalculaDescontoDez implements CalculaDesconto {
	@Override
	public double calculaDescontoCompra(Cliente umCliente) {
		if (umCliente.getValorCompra() > 99) {
			return umCliente.getValorCompra() * 0.9;
		}
		return umCliente.getValorCompra();
	}
}
