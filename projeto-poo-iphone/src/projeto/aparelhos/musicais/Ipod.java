package projeto.aparelhos.musicais;
//implementa a interface ReprodutorMusical
public class Ipod implements ReprodutorMusical{

	@Override
	public void tocar() {
		// TODO define como o método implementado tocar
		// irá funcionar
		System.out.println("Tocando música no Ipod");
	}

	@Override
	public void pausar() {
		// TODO define como o método implementado pausar
		// irá funcionar
		System.out.println("Pausando música no Ipod");
	}

	@Override
	public void trocarMusica() {
		// TODO define como o método implementado trocarMusica
		// irá funcionar
		System.out.println("Trocando de música no Ipod");
	}
	
}
