package ParteDeControle;

public class TestandoTudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleRemoto controle = new ControleRemoto();
		
		controle.ligar();
		controle.maisVolume();
		controle.maisVolume();
		controle.maisVolume();
		controle.maisVolume();

		
		controle.ligarMudo();
		controle.abrirMenu();
		controle.play();
		
	}

}
