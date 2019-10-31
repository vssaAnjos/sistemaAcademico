package fatecmc.eletivaJava.sisAcad.dominio;

import java.util.LinkedList;

/**
 * @author Vanessa Pereira dos Anjos
 * @version 1.0
 * @since 2019-10-08 completos: cadastrar,excluir,alterar
 * features novas:
 * adicionar classe pessoa e extender em aluno e professor
 * adicionar cadastro de disciplina no professor
 * usar iterator para alterar e excluir
 */
public class SistemaAcademico2 {

	public LinkedList<Aluno> alunos;
	public LinkedList<Professor> professores;
	
	
	public SistemaAcademico2() {
		alunos = new LinkedList();
		professores = new LinkedList();
	}

	public LinkedList getAlunos() {
		return alunos;
	}


	public void setAlunos(LinkedList alunos) {
		this.alunos = alunos;
	}


	public LinkedList getProfessores() {
		return professores;
	}


	public void setProfessores(LinkedList professores) {
		this.professores = professores;
	}

	
	public boolean cadastrarAluno(Aluno aluno) {
		return alunos.add(aluno);
	
	}

	public boolean cadastrarProfessor(Professor professor) {
		return professores.add(professor);
	}
	
	public boolean excluirAluno(Aluno aluno) {
		for(int i = 0; i < alunos.size(); i ++ ) {
			if(alunos.get(i).getRA() == aluno.getRA()) {
				return alunos.remove(aluno);
				
			}
		}
		return false;
	}
	
	public boolean excluirProfessor(Professor professor) {
		for(int i = 0; i < professores.size(); i ++ ) {
			if(professores.get(i).getRegistro() == professor.getRegistro() ) {
				return professores.remove(professor);
			}
		}
		return false;
	}

	public void alterarAluno(Aluno aluno, Aluno novoAluno) {
		for(int i = 0; i < alunos.size(); i ++ ) {
			if(alunos.get(i).getRA() == aluno.getRA()) {
				alunos.remove(aluno);
				alunos.add(novoAluno);
			}
		}
	}

	public void alterarProfessor(Professor professor, Professor novoProfessor) {
		for(int i = 0; i < professores.size(); i ++ ) {
			if(professores.get(i).getRegistro() == professor.getRegistro()) {
				professores.remove(professor);
				professores.add(novoProfessor);
			}
		}
	}

	public Aluno pesquisarAluno(long ra) {
		for (Aluno aux : alunos) {
			if(aux.getRA() == ra) {
				return aux;
			} 
		}
		System.out.println("Aluno nao encontrado");
		return null;
	}

	public Professor pesquisarProfessor(long registro) {
		for (Professor aux : professores) {
			if(aux.getRegistro() == registro) {
				return aux;
			} 
		}
		System.out.println("Professor nao encontrado");
		return null;
	}

	public boolean cadastrarAlunoLista(Aluno aluno) {
		alunos.add(aluno);
		return true;
	}
}
