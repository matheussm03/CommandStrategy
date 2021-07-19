package strategy;

public class CalculaDescontoVinte implements CalculaDesconto {
	@Override
	public double calculaDescontoCompra(Cliente umCliente) {
		if (umCliente.getValorCompra() > 199) {
			return umCliente.getValorCompra() * 0.8;
		}
		return umCliente.getValorCompra() * 0.9;
	}
}
