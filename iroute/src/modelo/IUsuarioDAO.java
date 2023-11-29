package modelo;

import java.util.ArrayList;

public interface IUsuarioDAO {

	public boolean criar(Usuario p);

	public boolean alterar(Usuario p, String novSenha);

	public boolean excluir(Usuario p, int numeroCartao);

	public ArrayList<Usuario> listar();

}
