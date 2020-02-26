package fatecmc.eletivaJava.sisAcad.dominio;

import java.util.ArrayList;
import java.util.List;

/*
 * @author  Vanessa Pereira dos Anjos
 * @version 1.2
 * @since   2019-10-08
 * completos: cadastrar,excluir,alterar
 */
public class Professor extends Pessoa{
	
	private long registro;
	private String materia; // trocar por varias disciplinas
	private List<String> disciplinas = new ArrayList(); // trocar pelo hashMap
	

	public Professor(long registro, String nome, String materia,
			String endereco, String telefone, String sexo) {
		super();
		this.registro = registro;
		this.materia = materia;
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setSexo(sexo);
	}
	public Professor(long registro, String nome, String materia,
			String endereco, String telefone, String sexo,ArrayList disciplinas) {
		super();
		this.registro = registro;
		this.materia = materia;
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setSexo(sexo);
		this.disciplinas = disciplinas;
	}

	public Professor(long registro, String materia, ArrayList<String> disciplinas) {
		super();
		this.registro = registro;
		this.materia = materia;
		this.disciplinas = disciplinas;
	}

	public long getRegistro() {
		return registro;
	}

	public void setRegistro(long registro) {
		this.registro = registro;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public List<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		
	}
}
