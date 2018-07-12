package br.com.alura;

public class GerenciadorDeDividas {

	public void efetuaPagamento(Divida divida, Double valor, String nomePagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		
		pagamento.setPagador(nomePagador);
		pagamento.setDocumentoPagador(new CNPJ(cnpjPagador));
		pagamento.setValor(valor);
		
		divida.registra(pagamento);
	}
	
}
