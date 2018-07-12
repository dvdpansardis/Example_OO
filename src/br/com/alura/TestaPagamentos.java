package br.com.alura;

public class TestaPagamentos {

	public static void main(String[] args) {
		Pagamentos pagamentos = new Pagamentos();
		
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		
		pagamento1.setValor(20.0);
		pagamento2.setValor(100.0);
		
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		
		System.out.println(pagamentos.getValorPago());
	}
	
}
