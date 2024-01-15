package dio.digitalinnovation.gof.facade;

import subsistema.crm.CrmService;
import subsistemacep.cep.CepApi;

/**
 * PADRAO ESTRUTURAL
 * Prover uma interface que reduza a complexidade nas integracoes com subsistemas
 * 
 * 
 * 
 * */

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep); 
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
