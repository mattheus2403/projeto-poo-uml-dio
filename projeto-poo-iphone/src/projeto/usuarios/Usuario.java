package projeto.usuarios;

import projeto.aparelhos.multitarefa.Iphone;
import projeto.aparelhos.musicais.Ipod;
import projeto.aparelhos.musicais.ReprodutorMusical;
import projeto.aparelhos.telefonicos.AparelhoTelefonico;
import projeto.aparelhos.telefonicos.Nokia;
import projeto.navegadores.Navegador;
import projeto.navegadores.Safari;

public class Usuario {

	public static void main(String[] args) {

		System.out.println("Op��es Iphone:");
		//cria variaveis que s�o associadas a cada m�todo do iphone, dependendo da interface
		ReprodutorMusical appMusica = new Iphone();
		AparelhoTelefonico appTelefone = new Iphone();
		Navegador appNavegador = new Iphone();
		
		System.out.println("\nOp��es do IPod:");
		appMusica.tocar();
		appMusica.pausar();
		appMusica.trocarMusica();
		
		System.out.println("\nOp��es do Telefone:");
		appTelefone.ligar();
		appTelefone.atender();
		appTelefone.iniciarCorreioVoz();
		
		System.out.println("\nOp��es do Navegador:");
		appNavegador.adicionarNovaAba();
		appNavegador.atualizarPagina();
		appNavegador.exibirPagina();
		
		//cria variaveis que s�o associadas a cada m�todo do IPod, dependendo da interface
		System.out.println("\nOp��es do IPod:");
		ReprodutorMusical ipod = new Ipod();
		ipod.tocar();
		ipod.pausar();
		ipod.trocarMusica();
		
		//cria variaveis que s�o associadas a cada m�todo do Nokia, dependendo da interface
		System.out.println("\nOp��es do Nokia:");
		AparelhoTelefonico nokia = new Nokia();
		nokia.atender();
		nokia.ligar();
		nokia.iniciarCorreioVoz();
		
		//cria variaveis que s�o associadas a cada m�todo do Safari, dependendo da interface
		System.out.println("\nOp��es do Navegador Safari:");
		Navegador safari = new Safari();
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		safari.exibirPagina();
	}
}
