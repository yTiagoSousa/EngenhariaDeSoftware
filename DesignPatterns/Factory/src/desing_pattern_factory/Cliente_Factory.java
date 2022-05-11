package desing_pattern_factory;

public class Cliente_Factory {

	public static void main(String[] args) {
		Servi�os_Montagem sm = null;
		Montagem_Completa mc = null;
		Encapsula_Objetos_Factory kf = new Encapsula_Objetos_Factory();
		
		sm = kf.Acabamento("kombi");
		sm.Instala();
		sm.Pintura();
		
		sm = kf.Acabamento("fusca");
		sm.Instala();
		sm.Pintura();
		
		mc = kf.Acabamento_Padr�o("acess�rio");
		mc.Instala();

		mc = kf.Acabamento_Padr�o("pintura");
		mc.Pintura();
	}

}
