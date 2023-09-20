package iroute;
import java.util.ArrayList;
import java.util.Scanner;

public class IRoute {

	
	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		ArrayList<NovoUsuario> NovoUsuarios = new ArrayList<>();

		while (opcaoSelecionada != 0) {
			System.out.println("- MENU -");
			System.out.println("1 CADASTRAR");
			System.out.println("2 LOGIN");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 1: {
				System.out.println("Digite o número do seu Cartão: ");
				Float cartao = Float.valueOf(leitura.nextLine());
				
				//ACABAMOS AQUI

				NovoUsuario p = new NovoUsuario();
				p.setNome(nome);
				p.setCpf(Long.valueOf(cpf));

				NovoUsuarios.add(p);

			}
			case 2: {
				System.out.println("Digite o cpf da NovoUsuario que deseja alterar:");
				// finalizar codigo
			}
			case 3: {
				System.out.println("Digite o cpf da NovoUsuario que deseja excluir:");
				// finalizar codigo
			}
			case 4: {
				// Saida de dados (output)
				System.out.println("Listagem de NovoUsuarios cadastradas: ");
				for (NovoUsuario NovoUsuario : NovoUsuarios) {
					System.out.println("Cpf: " + NovoUsuario.getCpf());
					System.out.println("Nome: " + NovoUsuario.getNome());
				}
			}

			}

		}

		leitura.close();
	}
}

}