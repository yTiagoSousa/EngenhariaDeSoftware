package desing_pattern_factory;

public class Monta_Kombi implements Servi�os_Montagem{
	
	public Instala_Acess�rio Instala(){ 
		System.out.println("Kombi acess�rio: r�dio AM/FM"); 
		return null;
	}
	
	public Faz_Pintura Pintura(){ 
		System.out.println("Kombi pintura: cor verde e branco"); 
		return null; 
	}
}
