package fatecmc.eletivaJava.sisAcad.dominio;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Vanessa Pereira dos Anjos
 * @version 1.2
 * @since 2019-10-08 completos: cadastrar,excluir,alterar
 * feature com Cursos
 */
enum Cursos {ADS,RH}

public class SistemaAcademico {

	public Aluno alunos[];
	public Professor professores[];
	
	
	public SistemaAcademico() {
		alunos = new Aluno[5];
		professores = new Professor[5];
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}

	/**
	 * 
	 * @param aluno
	 *            A ser cadastrado
	 * @return true para cadastrado com sucesso
	 */
	public boolean cadastrarAluno(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param professor A ser cadastrado
	 * @return true para cadastro com sucesso
	 */

	public boolean cadastrarProfessor(Professor professor) {
		for (int i = 0; i < professores.length; i++) {
			if (professores[i] == null) {
				professores[i] = professor;
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param aluno A ser excluido 
	 * @return	true para exclussao com sucesso
	 */
	public boolean excluirAluno(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == aluno) {
				alunos[i] = null;
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @param professor A ser excluido
	 * @return	true pra exclussao com sucesso
	 */
	public boolean excluirProfessor(Professor professor) {
		for (int i = 0; i < professores.length; i++) {
			if (professores[i] == professor) {
				professores[i] = null;
				return true;
			}
		}
		return false;
	}

	public void alterarAluno(Aluno aluno, Aluno novoAluno) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == aluno) {
				alunos[i] = novoAluno;
			}
		}
	}

	public void alterarProfessor(Professor professor) {

	}

	public Aluno pesquisarAluno(long ra) {
		return null;
	}

	public Professor pesquisarProfessor(long registro) {
		return null;
	}

}