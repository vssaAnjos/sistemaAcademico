package fatecmc.eletivaJava.sisAcad.dominio;
/*
 * @author  Vanessa Pereira dos Anjos
 * @version 1.2
 * @since   2019-10-08
 * completos: cadastrar,excluir,alterar
 */
public class Aluno extends Pessoa{
	private long RA;
	private String curso;

	public Aluno(long rA, String nome, String curso, String endereco,
			String telefone, String sexo) {
		super();
		RA = rA;
		this.curso = curso;
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setSexo(sexo);
	}
	
	public Aluno(long rA, String curso) {
		super();
		RA = rA;
		this.curso = curso;
	}

	public long getRA() {
		return RA;
	}

	public void setRA(long rA) {
		RA = rA;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void exibir() {
		
		System.out.println("\n" + "Aluno: " + getNome() 
				+ " RA " + getRA()
				+ " Endereco " + getEndereco()
				+ " Telefone " + getTelefone()
				+ " Sexo " + getSexo() + "\n"
				
				);
	}

}
