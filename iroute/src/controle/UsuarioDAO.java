package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Usuario> usuarioCad = new ArrayList<>();

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
	public ArrayList<Usuario> usuariolog() {
		return usuarioCad;
	}

}
