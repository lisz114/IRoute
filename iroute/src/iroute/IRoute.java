package iroute;

import java.util.ArrayList;
import java.util.Scanner;

public class IRoute {

	private static ArrayList<Usuario> usuarioCad = new ArrayList<>();
	@SuppressWarnings("unused")
	private static Usuario usuarioLogado;

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Integer opcaoSelecionada2 = Integer.MAX_VALUE;

		while (opcaoSelecionada != 0) {
			opcaoSelecionada = menu();
			switch (opcaoSelecionada) {
			case 1: {
				usuarioLogado = login();
				if (usuarioLogado != null) {
					menu2();
				}
				break;
			}
			case 2: {
				cadastro();
				break;
			}
			default: {
				System.out.println("Erro! Escolha uma das alternativas.");
				menu();
				break;
			}
			}

		}
	}

	private static Integer exibirlinhas() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("- EXIBIR AS LINHAS PARA: -");
		System.out.println("1 - Blumenau ");
		System.out.println("2 - Gaspar ");
		System.out.println("3 - Ilhota ");

		Integer leituralinha = Integer.valueOf(leitura.nextLine());

		if (leituralinha == 1) {
			blumenau();
		}
		if (leituralinha == 2) {
			gaspar();
		}
		if (leituralinha == 3) {
			ilhota();
		}

		else if (leituralinha > 3) {
			System.out.println("Erro! Escolha uma das opções");
			exibirlinhas();
		}
		return leituralinha;
	}

	private static void ilhota() {

	}

	private static void gaspar() {

	}

	private static void blumenau() {

	}

	private static void excluirConta() {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Tem certeza que deseja excluir sua conta? (Sim ou Não): ");
		String confirm = leitura.nextLine();

		if (confirm.equals("Sim")) {

			usuarioCad.remove(usuarioLogado);

			System.out.println("Conta excluida com sucesso! ");
			main(null);
		}

		else if (confirm.equals("Não"))
			;
		menu2();

	}

	public static void menu2() {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Deseja:\n 1- Alterar sua senha\n 2- Excluir sua conta\n 3- Ver as linhas de ônibus.");
		Integer opcaoSelecionada = Integer.valueOf(leitura.nextLine());

		if (opcaoSelecionada == 1) {
			alterarSenha();
		} else if (opcaoSelecionada == 2) {
			excluirConta();
		} else if (opcaoSelecionada == 3) {
			exibirlinhas();
		} else if (opcaoSelecionada < 1 && opcaoSelecionada > 3) {

			System.out.println("Erro! Escolha uma das opções.");
		}
		menu2();
	}

	private static void alterarSenha() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Deseja alterar sua senha? (Sim ou Não): ");
		String confirm = leitura.nextLine();

		if (confirm.equals("Sim")) {

			System.out.println("Digite sua senha atual: ");
			String senhaAtual = leitura.nextLine();

			for (Usuario usuario : usuarioCad) {

				if (usuario.getSenha().equals(senhaAtual)) {

					System.out.println("Digite a nova senha: ");
					String novaSenha = leitura.nextLine();

					usuario.setSenha(novaSenha);

					System.out.println("Senha alterada com sucesso!");

				} else {
					System.out.println("Senha incorreta, tente novamente.");
					alterarSenha();
				}
			}

		} else if (confirm.equals("Não")) {
			menu2();
		}

	}

	private static Integer menu() {
		Scanner leitura = new Scanner(System.in);

		System.out.println("- MENU -");
		System.out.println("1 LOGIN");
		System.out.println("2 CADASTRAR");

		Integer opcaoSelecionada = Integer.valueOf(leitura.nextLine());

		return opcaoSelecionada;

	}

	private static void cadastro() {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o número do seu Cartão: ");
		Float cartao = Float.valueOf(leitura.nextLine());
		System.out.println("Crie um nome de Usuário: ");
		String nome = leitura.nextLine();
		System.out.println("Crie uma senha: ");
		String senha = leitura.nextLine();
		System.out.println("Cadastrado com sucesso!");
		Usuario p = new Usuario();
		p.setNumeroCartao(cartao);
		p.setNome(nome);
		p.setSenha(senha);
		usuarioCad.add(p);

	}

	private static Usuario login() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o seu nome de usuário");
		String nome = leitura.nextLine();
		System.out.println("Digite a senha: ");
		String senha = leitura.nextLine();

		for (Usuario usuario : usuarioCad) {

			if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
				return usuario;
			} else {
				System.out.println("Login não encontrado, realize o cadastro ou revise seus dados.");
			}

		}
		return null;
	}
}
