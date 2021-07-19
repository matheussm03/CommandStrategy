package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {
	
    @Test
    void deverRetornar90ParaClientePrata() {
        Cliente cliente1 = new Cliente(1, 100);
        cliente1.calculaDescontoCompra();
        assertEquals(90.0f, cliente1.calculaDescontoCompra());
    }

    @Test
    void deverRetornar90ParaClienteOuro() {
        Cliente cliente2 = new Cliente(2, 100);
        cliente2.calculaDescontoCompra();
        assertEquals(90.0f, cliente2.calculaDescontoCompra());
    }
	
    @Test
    void deverRetornar80ParaClienteDiamante() {
        Cliente cliente3 = new Cliente(3, 100);
        cliente3.calculaDescontoCompra();
        assertEquals(80.0f, cliente3.calculaDescontoCompra());
    }
    
    @Test
    void deverRetornar180ParaClientePrata() {
        Cliente cliente1 = new Cliente(1, 200);
        cliente1.calculaDescontoCompra();
        assertEquals(180.0f, cliente1.calculaDescontoCompra());
    }

    @Test
    void deverRetornar160ParaClienteOuro() {
        Cliente cliente2 = new Cliente(2, 200);
        cliente2.calculaDescontoCompra();
        assertEquals(160.0f, cliente2.calculaDescontoCompra());
    }
	
    @Test
    void deverRetornar160ParaClienteDiamante() {
        Cliente cliente3 = new Cliente(3, 200);
        cliente3.calculaDescontoCompra();
        assertEquals(160.0f, cliente3.calculaDescontoCompra());
    }
    
    
    @Test
    void deverRetornar270ParaClientePrata() {
        Cliente cliente1 = new Cliente(1, 300);
        cliente1.calculaDescontoCompra();
        assertEquals(270.0f, cliente1.calculaDescontoCompra());
    }

    @Test
    void deverRetornar240ParaClienteOuro() {
        Cliente cliente2 = new Cliente(2, 300);
        cliente2.calculaDescontoCompra();
        assertEquals(240.0f, cliente2.calculaDescontoCompra());
    }
	
    @Test
    void deverRetornar210ParaClienteDiamante() {
        Cliente cliente3 = new Cliente(3, 300);
        cliente3.calculaDescontoCompra();
        assertEquals(210.0f, cliente3.calculaDescontoCompra());
    }
	
}
