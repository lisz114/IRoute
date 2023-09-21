package iroute;

import java.util.ArrayList;
import java.util.Scanner;

public class IRoute {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		Integer opcaoSelecionada = menu();
		switch (opcaoSelecionada) {
		case 1: {
			cadastro();
		}
			break;
		case 2: {
			login();
		}
			break;
		default: {
			System.out.println("Erro! Escolha uma das alternativas.");
			main(args);
		}
		}
		Integer opcaoSelecionada2 = menu2();
		switch(opcaoSelecionada) {
		case 1:{
			alterarSenha();
		}
		}
	}
	
	private static void alterarSenha() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite sua senha atual:\n ");
		Float senhaAlterar = Float.valueOf(leitura.nextLine());
		if (senhaAlterar = senha)
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

	private static void cadastro() {
		Scanner leitura = new Scanner(System.in);
		ArrayList<NovoUsuario> NovoUsuarios = new ArrayList<>();

		System.out.println("Digite o número do seu Cartão: ");
		Float cartao = Float.valueOf(leitura.nextLine());
		System.out.println("Digite seu nome inteiro: ");
		String nome = leitura.nextLine();
		System.out.println("Crie uma senha: ");
		String senha = leitura.nextLine();
		System.out.println("Cadastrado com sucesso!");
		NovoUsuario p = new NovoUsuario();
		p.setNumeroCartao(cartao);
		p.setNome(nome);
		p.setSenha(senha);
		NovoUsuarios.add(p);

		leitura.close();

	}

	private static void login() {

		Scanner leitura = new Scanner(System.in);
		ArrayList<NovoUsuario> NovoUsuarios = new ArrayList<>();
		System.out.println("Digite o seu nome de usuário");
		String nome = leitura.nextLine();
		System.out.println("Digite a senha: ");
		String senha = leitura.nextLine();

		NovoUsuario p = new NovoUsuario();
		p.setNome(nome);
		p.setSenha(senha);
		NovoUsuarios.add(p);

		leitura.close();
	}
}
