package desing_pattern_factory;


public class Encapsula_Objetos_Factory {
	
	public Servi�os_Montagem Acabamento(String modelo){ 
		
		Servi�os_Montagem carro  = null;

		if (modelo.equals("kombi")) { 
		carro = new Monta_Kombi(); 
		}
		
		else if (modelo.equals("fusca")){ 
		carro = new Monta_Fusca(); 
		}
	return carro; 
	}
	
	public Montagem_Completa Acabamento_Padr�o (String acabamento){ 
		
		Montagem_Completa carro_standard = null; 
		
		if (acabamento.equals("acessorio")){ 
			carro_standard = new Instala_Acess�rio();
			}
		
		else if (acabamento.equals("pintura")) { 
			carro_standard = new Faz_Pintura(); 
			}
		
		return carro_standard; 
	}
}
