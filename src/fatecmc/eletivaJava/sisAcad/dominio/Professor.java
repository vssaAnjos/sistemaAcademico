package fatecmc.eletivaJava.sisAcad.dominio;

import java.util.List;

/*
 * @author  Vanessa Pereira dos Anjos
 * @version 1.0
 * @since   2019-10-08
 * completos: cadastrar,excluir,alterar
 */
public class Professor {
	
	private long registro;
	private String nome;
	private String materia;
	private String endereco;
	private String telefone;
	private String sexo;
	private List<String> disciplinas;

	public Professor(long registro, String nome, String materia,
			String endereco, String telefone, String sexo) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.materia = materia;
		this.endereco = endereco;
		this.telefone = telefone;
		this.sexo = sexo;
	}

	public long getRegistro() {
		return registro;
	}

	public void setRegistro(long registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
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

}
