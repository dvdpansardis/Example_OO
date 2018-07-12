package br.com.alura;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {

	private final Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat numberFormat) {
		System.out.println("CNPJ credor: " + divida.getDocumentoCredor());
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Valod da divida: " + numberFormat.format(divida.getTotal()));
		System.out.println("Valor pago: " + numberFormat.format(divida.getValorPago()));
	}
	
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("ASUS");
		divida.setTotal(1000.0);	
		divida.setDocumentoCredor(new CNPJ("00.000.001/0001-01"));
		
		Pagamento pagamento = new Pagamento();
		pagamento.setDocumentoPagador(new CNPJ("00.000.001/0001-01"));
		pagamento.setPagador("David");
		pagamento.setValor(10.0);
		
		divida.registra(pagamento);
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		
		relatorioDeDivida.geraRelatorio(numberFormat);
		
		
	}
}
