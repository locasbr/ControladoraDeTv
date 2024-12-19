package ParteDeControle;

public class ControleRemoto implements Controlador {
private int volume;
private boolean ligado;
private boolean tocando;




public ControleRemoto(int volume, boolean ligado, boolean tocando) {
	this.volume = 50;
	this.ligado = false;
	this.tocando = false;
}

public ControleRemoto() {
	
}

@Override
public void ligar() {
	// TODO Auto-generated method stub
	setLigado(true);
}




@Override
public void desligar() {
	// TODO Auto-generated method stub
	setLigado(false);
}




@Override
public void abrirMenu() {
	// TODO Auto-generated method stub
	if(getLigado() == true ) {
	System.out.println("Menu aberto");
	
	for(int i = 0; i< getVolume(); i+=10) {
		System.out.print("|");
		
	}
	System.out.println();
	System.out.println("seu volume está em " + getVolume());
	System.out.println("o filme está tocando? " + getTocando());
	}
}




@Override
public void maisVolume() {
	// TODO Auto-generated method stub
	setVolume(getVolume() +10 );
}




@Override
public void menosVolume() {
	// TODO Auto-generated method stub
	setVolume(getVolume() -10 );
}




@Override
public void ligarMudo() {
	// TODO Auto-generated method stub
	if(getLigado() == true && getVolume() == 0) {
		
		setVolume(0);
		
	}
}




@Override
public void desligarMudo() {
	// TODO Auto-generated method stub
if(getLigado() == true && getVolume() > 0) {
		
		setVolume(50);
		
	}
}




@Override
public void play() {
	// TODO Auto-generated method stub
	if(getLigado() == true && getTocando() == false) {
		System.out.println("Filme tocando");
		
	}
}



 
@Override
public void pause() {
	// TODO Auto-generated method stub
	if(getLigado() == true && getTocando() == true) {
		System.out.println("Filme pausado");
		
	}
}



public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}
public boolean getLigado() {
	return ligado;
}
public void setLigado(boolean ligado) {
	this.ligado = ligado;
}
public boolean getTocando() {
	return tocando;
}
public void setTocando(boolean tocando) {
	this.tocando = tocando;
}
	
	
	
	
}
