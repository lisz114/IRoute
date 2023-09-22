package iroute;

import java.util.ArrayList;
import java.util.Scanner;

public class IRoute {

	public static void main(String[] args) {
		ArrayList<NovoUsuario> novoUsuarios = new ArrayList<>();
		Scanner leitura = new Scanner(System.in);
		
		Integer opcaoSelecionada = Integer.MAX_VALUE;
		
		while(opcaoSelecionada != 0) {
		opcaoSelecionada = menu();
		switch (opcaoSelecionada) {
		case 1: {
			novoUsuarios.add(cadastro());	
		}
			break;
		case 2: {
			login(novoUsuarios);
		}
			break;
		default: {
			System.out.println("Erro! Escolha uma das alternativas.");
			main(args);
		}
		}
		//Integer opcaoSelecionada2 = menu2();
		//switch(opcaoSelecionada) {
		//case 1:{
		//	alterarSenha();}
		//}
		}
	}

	private static Integer menu2() {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Deseja:\n 1- Alterar sua senha\n 2- Excluir sua conta\n 3- Ver as linhas de ônibus.");
		Integer opcaoSelecionada2 = Integer.valueOf(leitura.nextLine());
		
		return opcaoSelecionada2;
		
	}
	
	private static Integer menu() {
		Scanner leitura = new Scanner(System.in);

		System.out.println("- MENU -");
		System.out.println("1 CADASTRAR");
		System.out.println("2 LOGIN");

		Integer opcaoSelecionada = Integer.valueOf(leitura.nextLine());

		return opcaoSelecionada;

	}

	private static NovoUsuario cadastro() {
		Scanner leitura = new Scanner(System.in);
	
		System.out.println("Digite o número do seu Cartão: ");
		Float cartao = Float.valueOf(leitura.nextLine());
		System.out.println("Crie um nome de Usuário: ");
		String nome = leitura.nextLine();
		System.out.println("Crie uma senha: ");
		String senha = leitura.nextLine();
		System.out.println("Cadastrado com sucesso!");
		NovoUsuario p = new NovoUsuario();
		p.setNumeroCartao(cartao);
		p.setNome(nome);
		p.setSenha(senha);
		
		return p;
	}

	private static void login(ArrayList<NovoUsuario> usuarios) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o seu nome de usuário");
		String nome = leitura.nextLine();
		System.out.println("Digite a senha: ");
		String senha = leitura.nextLine();

		for (NovoUsuario usuario : usuarios) {
			
			if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
				menu2();
					break;
	}	
			System.out.println("Nome de usuário ou senha incorreta!\n Tente novamente.");
			
		}

	}
}
