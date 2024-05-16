package projeto.aparelhos.multitarefa;

import projeto.aparelhos.musicais.ReprodutorMusical;
import projeto.aparelhos.navegadores.Navegador;
import projeto.aparelhos.telefonicos.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico{ //implementa todas as interfaces

	@Override
	public void ligar() {
		// TODO Liga pelo iPhone
		System.out.println("Fazendo ligação pelo app do iPhone");
	}

	@Override
	public void atender() {
		// TODO Atender pelo Iphone
		System.out.println("Atendendo ligação pelo app do IPhone");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Inicia correio de voz
		System.out.println("Inicia correio de voz pelo app do IPhone");
	}

	@Override
	public void exibirPagina() {
		// TODO Exibe página no navegador do iphone
		System.out.println("Exibindo página no navegador Safari do IPhone");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Adiciona nova aba no navegador do iPhone
		System.out.println("Adicionando nova aba no navegador Safari do iPhone");
	}

	@Override
	public void atualizarPagina() {
		// TODO Atualiza página no navegador safari do iPhone
		System.out.println("Atualiza página no navegador Safari do iPhone");
	}

	@Override
	public void tocar() {
		// TODO Toca música no app Ipod do Iphone
		System.out.println("Tocando música no app Ipod do Iphone");
	}

	@Override
	public void pausar() {
		// TODO pausa música no app Ipod do Iphone
		System.out.println("pausando música no app Ipod do Iphone");
	}

	@Override
	public void trocarMusica() {
		// TODO troca de música no app Ipod do Iphone
		System.out.println("trocando de música no app Ipod do Iphone");
	}

}
