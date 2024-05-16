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

		System.out.println("Opções Iphone:");
		//cria variaveis que são associadas a cada método do iphone, dependendo da interface
		ReprodutorMusical appMusica = new Iphone();
		AparelhoTelefonico appTelefone = new Iphone();
		Navegador appNavegador = new Iphone();
		
		System.out.println("\nOpções do IPod:");
		appMusica.tocar();
		appMusica.pausar();
		appMusica.trocarMusica();
		
		System.out.println("\nOpções do Telefone:");
		appTelefone.ligar();
		appTelefone.atender();
		appTelefone.iniciarCorreioVoz();
		
		System.out.println("\nOpções do Navegador:");
		appNavegador.adicionarNovaAba();
		appNavegador.atualizarPagina();
		appNavegador.exibirPagina();
		
		//cria variaveis que são associadas a cada método do IPod, dependendo da interface
		System.out.println("\nOpções do IPod:");
		ReprodutorMusical ipod = new Ipod();
		ipod.tocar();
		ipod.pausar();
		ipod.trocarMusica();
		
		//cria variaveis que são associadas a cada método do Nokia, dependendo da interface
		System.out.println("\nOpções do Nokia:");
		AparelhoTelefonico nokia = new Nokia();
		nokia.atender();
		nokia.ligar();
		nokia.iniciarCorreioVoz();
		
		//cria variaveis que são associadas a cada método do Safari, dependendo da interface
		System.out.println("\nOpções do Navegador Safari:");
		Navegador safari = new Safari();
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		safari.exibirPagina();
	}
}
