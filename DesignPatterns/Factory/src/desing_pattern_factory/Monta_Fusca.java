	package desing_pattern_factory;

public class Monta_Fusca implements Servi�os_Montagem {
		public Instala_Acess�rio Instala(){ 
			System.out.println("Fusca Acess�rio: antena e alto falante"); 
			return null;
		}
		public Faz_Pintura Pintura() { 
			System.out.println("Fusca pintura: cor amarelo"); 
			return null;
		}
}
