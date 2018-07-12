package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDividas {

	private Map<Documento, Divida> dividasNoBanco = new HashMap<>();

	public BancoDeDados(String endereco, String usuario, String senha) {
		System.out.println("conectado");
	}

	public void desconecta() {
		System.out.println("desconectado");
	}

	public void salva(Divida divida) {
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}

	public Divida carrega(Documento documentoCredor) {
		return dividasNoBanco.get(documentoCredor);
	}
}
