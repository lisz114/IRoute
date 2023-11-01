package iroute;

import java.util.ArrayList;
import java.util.Scanner;

public class IRoute {

	private static ArrayList<Usuario> usuarioCad = new ArrayList<>();
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
				} else {
					System.out.println("Login não encontrado, realize o cadastro ou revise seus dados.");
				}
				break;
			}
			case 2: {
				cadastro();
				break;
			}
			default: {
				System.out.println("Erro! Escolha uma das alternativas.");
				break;
			}
			}
		}
	}

	public ArrayList<Usuario> exibirlinhas(String[] blumenau, String[] gaspar, String[] ilhota) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("- EXIBIR AS LINHAS PARA: -");
		System.out.println("1 - Blumenau ");
		System.out.println("2 - Gaspar ");
		System.out.println("3 - Ilhota ");
		System.out.println("4 - Voltar para o menu principal ");
		Integer leituralinha = Integer.valueOf(leitura.nextLine());

		if (leituralinha == 1) {

			blumenau[0] = "1- 07:15\n";
			blumenau[1] = "2- 08:45\n";
			blumenau[2] = "3- 10:30\n";
			blumenau[3] = "4- 12:30\n";
			blumenau[4] = "5- 14:15\n";

			System.out.println("\nIlhota - Blumenau\n ");
			System.out.println(blumenau[0] + blumenau[1] + blumenau[2] + blumenau[3] + blumenau[4]);
			System.out.println("O valor fixo da passagem é: R$ 5,50\n");
			System.out.println("Horário escolhido para compra:");
			Integer horarioescolhido = Integer.valueOf(leitura.nextLine());

		}
		if (leituralinha == 2) {
			gaspar[0] = "1- 07:15\n";
			gaspar[1] = "2- 08:45\n";
			gaspar[2] = "3- 10:30\n";
			gaspar[3] = "4- 12:30\n";
			gaspar[4] = "5- 14:15\n";
			
			System.out.println("\nBlumenau - Gaspar:\n ");
			System.out.println(blumenau[0] + blumenau[1] + blumenau[2] + blumenau[3] + blumenau[4]);
			System.out.println("O valor fixo da passagem é: R$ 5,50\n");
			System.out.println("Horário escolhido para compra:");
			Integer horarioescolhido = Integer.valueOf(leitura.nextLine());
		}
		if (leituralinha == 3) {
			ilhota[0] = "1- 07:15\n";
			ilhota[1] = "2- 08:45\n";
			ilhota[2] = "3- 10:30\n";
			ilhota[3] = "4- 12:30\n";
			ilhota[4] = "5- 14:15\n";
			
			System.out.println("\nBlumenau - Ilhota:\n ");
			System.out.println(blumenau[0] + blumenau[1] + blumenau[2] + blumenau[3] + blumenau[4]);
			System.out.println("O valor fixo da passagem é: R$ 5,50\n");
			System.out.println("Horário escolhido para compra:");
			Integer horarioescolhido = Integer.valueOf(leitura.nextLine());
		}
		if (leituralinha == 4) {
			menu2();
		}

		else if (leituralinha > 4) {
			System.out.println("Erro! Escolha uma das opções");

		}
		return exibirlinhas(blumenau, gaspar, ilhota);
	}



	private static void dadosDoComprador(String horariocomprado) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("---//--------//------//----");
		System.out.println("Cadastro do Comprador\n");

		System.out.println("Digite seu nome completo:");
		String nome = leitura.nextLine();

		System.out.println("Digite seu cpf:");
		String cpf = leitura.nextLine();

		System.out.println("Digite seu email: ");
		String email = leitura.nextLine();

		System.out.println("Digite seu número de celular: ");
		String numCel = leitura.nextLine();

		Comprador c = new Comprador();
		c.setName(nome);
		c.setCpf(cpf);
		c.setEmail(email);
		c.setNumCl(numCel);
		c.setHoraSelec(horariocomprado);

		System.out.println("\nVerifique se os dados estão corretos:\n");

		System.out.println("nome: " + c.getName() + "\ncpf: " + c.getCpf() + "\nEmail: " + c.getEmail());

		System.out.println("Número de telefone:" + c.getNumCl() + "\nHorário Selecionado: " + c.getHoraSelec());

		System.out.println("\nDeseja alterar dados? (Responda com Sim ou Nao)");
		String opcaoSelec = leitura.nextLine();

		if (opcaoSelec.equalsIgnoreCase("Sim")) {
			dadosDoComprador(horariocomprado);
			System.out.println("\n");
		} else if (opcaoSelec.equalsIgnoreCase("Nao")) {

			System.out.println("\nDeseja:\n 1- Voltar ao menu secundário\n 2- Gerar pix copia e cola.");
			Integer opcSel = Integer.valueOf(leitura.nextLine());

			if (opcSel == 1) {
				menu2();
			}
			if (opcSel == 2) {

				System.out.println(
						"\nApós gerar o pix você será redirecionado para o menu novamente. Deseja continuar? (S ou N)-----\n");

				String confirm = leitura.nextLine();

				if (confirm.equalsIgnoreCase("s")) {

					System.out.println("\nPix: 4017954759306906\n");

					menu2();

				} else if (confirm.equalsIgnoreCase("n")) {

					menu2();

				}

			} else if (opcSel > 2) {

				System.out.println(" Erro! Selecione uma das opções ");

				dadosDoComprador(horariocomprado);
			}
		}

	}

	private static void excluirConta() {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Tem certeza que deseja excluir sua conta? (Sim ou Nao): ");
		String confirm = leitura.nextLine();

		if (confirm.equalsIgnoreCase("Sim")) {

			usuarioCad.remove(usuarioLogado);

			System.out.println("Conta excluida com sucesso! ");
			main(null);
		}

		else if (confirm.equalsIgnoreCase("Nao")) {
			menu2();
		}

	}

	public static void menu2() {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Deseja:\n 1- Alterar sua senha\n 2- Excluir sua conta\n 3- Ver as linhas de ônibus\n ");
		Integer opcaoSelecionada = Integer.valueOf(leitura.nextLine());

		if (opcaoSelecionada == 1) {
			alterarSenha();
		} else if (opcaoSelecionada == 2) {
			excluirConta();
		} else if (opcaoSelecionada == 3) {
			exibirlinhas();
		} else if (opcaoSelecionada < 1 && opcaoSelecionada > 3) {

			System.out.println("Erro! Escolha uma das opções.");
			menu2();
		}

	}

	private static void alterarSenha() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Deseja alterar sua senha? (Sim ou Nao): ");
		String confirm = leitura.nextLine();

		if (confirm.equalsIgnoreCase("Sim")) {

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

		} else if (confirm.equalsIgnoreCase("Nao")) {
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
			}

		}
		return null;
	}
}
