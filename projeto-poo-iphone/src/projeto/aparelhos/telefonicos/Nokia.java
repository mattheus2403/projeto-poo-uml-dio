package projeto.aparelhos.telefonicos;

public class Nokia implements AparelhoTelefonico{

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando pelo Nokia");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo ligação pelo Nokia");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz pelo Nokia");
	}

}
