package controle;

import java.util.ArrayList;

import iroute.IUsuarioDAO;
import iroute.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Usuario> usuarioCad = new ArrayList<>();

	@Override
	public boolean criar(Usuario p) {
		if (p != null) {
			usuarioCad.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Usuario p, long cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Usuario p, long cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Usuario> exibirlinhas() {
		return usuarioCad;
	}

}
