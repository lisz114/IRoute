package modelo;

public class Comprador {
	
	private String name;
	private String email;
	private String cpf;
	private String numCl;
	private Integer horaSelec;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumCl() {
		return numCl;
	}
	public void setNumCl(String numCl) {
		this.numCl = numCl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHoraSelec() {
		return horaSelec;
	}
	public void setHoraSelec(Integer horaSelec) {
		this.horaSelec = horaSelec;
	}
	
}
