package fatecmc.eletivaJava.sisAcad.dominio;
/*
 * @author  Vanessa Pereira dos Anjos
 * @version 1.0
 * @since   2019-10-08
 * completos: cadastrar,excluir,alterar
 */
public class Aluno {
	private long RA;
	private String nome;
	private String curso;
	private String endereco;
	private String telefone;
	private String Sexo;

	public Aluno(long rA, String nome, String curso, String endereco,
			String telefone, String sexo) {
		super();
		RA = rA;
		this.nome = nome;
		this.curso = curso;
		this.endereco = endereco;
		this.telefone = telefone;
		Sexo = sexo;
	}

	public long getRA() {
		return RA;
	}

	public void setRA(long rA) {
		RA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
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
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	public void exibirAluno() {
		
		System.out.println("\n" + "Aluno: " + getNome() 
				+ " RA " + getRA()
				+ " Endereco " + getEndereco()
				+ " Telefone " + getTelefone()
				+ " Sexo " + getSexo() + "\n"
				);
	}

}
