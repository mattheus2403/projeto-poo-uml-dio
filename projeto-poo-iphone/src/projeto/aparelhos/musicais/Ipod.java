package projeto.aparelhos.musicais;
//implementa a interface ReprodutorMusical
public class Ipod implements ReprodutorMusical{

	@Override
	public void tocar() {
		// TODO define como o m�todo implementado tocar
		// ir� funcionar
		System.out.println("Tocando m�sica no Ipod");
	}

	@Override
	public void pausar() {
		// TODO define como o m�todo implementado pausar
		// ir� funcionar
		System.out.println("Pausando m�sica no Ipod");
	}

	@Override
	public void trocarMusica() {
		// TODO define como o m�todo implementado trocarMusica
		// ir� funcionar
		System.out.println("Trocando de m�sica no Ipod");
	}
	
}
