package projeto.aparelhos.navegadores;

public class Safari implements Navegador { //implementa a interface Navegador

	@Override
	public void exibirPagina() {
		// TODO define como o método implementado exibirPagina
		// irá funcionar
		System.out.println("Exibindo página no navegador Safari");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO define como o método implementado adicionarNovaAba
		// irá funcionar
		System.out.println("Adicionando nova aba no navegador Safari");
	}

	@Override
	public void atualizarPagina() {
		// TODO define como o método implementado atualizarPagina
		// irá funcionar
		System.out.println("Atualizando página no navegador Safari");
	}

}
