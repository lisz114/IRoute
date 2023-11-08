package modelo;
import java.util.ArrayList;


public interface IUsuarioDAO {

	public boolean criar(Usuario p);

	
	public boolean alterar(Usuario p, long cpf);

	
	public boolean excluir(Usuario p, long cpf);

	
	public ArrayList<Usuario>exibirlinhas();
	
}
