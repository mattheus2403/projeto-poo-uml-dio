package projeto.aparelhos.telefonicos;

public class Nokia implements AparelhoTelefonico{

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando pelo telefone");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo ligação pelo telefone");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz pelo telefone");
	}

}
