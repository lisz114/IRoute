package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Usuario> usuarioCad = new ArrayList<>();

	public Usuario login(String senha, String usuario) {
		
		for (Usuario usuario : usuarioCad) {
			if (usuario.getNome().equals(login)) {
				
			}
		}
		
		
		return usuario;
		
		
		
	}
	
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
