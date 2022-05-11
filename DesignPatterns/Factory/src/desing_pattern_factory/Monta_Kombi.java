package desing_pattern_factory;

public class Monta_Kombi implements Serviços_Montagem{
	
	public Instala_Acessório Instala(){ 
		System.out.println("Kombi acessório: rádio AM/FM"); 
		return null;
	}
	
	public Faz_Pintura Pintura(){ 
		System.out.println("Kombi pintura: cor verde e branco"); 
		return null; 
	}
}
