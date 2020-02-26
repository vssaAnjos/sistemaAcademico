package fatecmc.eletivaJava.sisAcad.dominio;
/*
 * @author  Vanessa Pereira dos Anjos
 * @version 1.2
 * @since   2019-10-08
 */

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String sexo;
	
	public Pessoa(){
		
	}
	public Pessoa(String nome, String endereco, String telefone, String sexo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public abstract void exibir();
	
}
