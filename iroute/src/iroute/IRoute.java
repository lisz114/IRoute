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
		Integer cartao = Integer.valueOf(leitura.nextLine());
		System.out.println("Digite seu nome inteiro: ");
		String nome = leitura.nextLine();
		System.out.println("Crie uma senha: ");
		String senha = leitura.nextLine();

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
