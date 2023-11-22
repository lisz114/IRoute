package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Usuario;

/*
 * DATA ACCESS OBJECT = objeto de acesso a dados
 */
public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Usuario> usuarioCad = new ArrayList<>();
	private static UsuarioDAO instancia;

	private UsuarioDAO() {
	}

	public static UsuarioDAO criaInstancia() {

		if (instancia == null) {
			instancia = new UsuarioDAO();
			usuarioCad = new ArrayList<>();
		}

		return instancia;
	}

	public boolean criar(Usuario p) {
		if (p != null) {
			usuarioCad.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Usuario p, int numeroCartao) {
		for (Usuario usuario : usuarioCad) {
			if (usuario.getNumeroCartao() == numeroCartao) {
				usuario.setSenha(p.getSenha());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Usuario p, int numeroCartao) {
		for (Usuario usuario : usuarioCad) {
			if (usuario.getNumeroCartao() == numeroCartao) {
				usuarioCad.remove(usuario);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Usuario> listar() {
		return usuarioCad;
	}

}
