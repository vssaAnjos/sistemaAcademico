package fatecmc.eletivaJava.sisAcad.app;

import fatecmc.eletivaJava.sisAcad.dominio.*;
/**
* Implementacao do sistema academico utilizando somenete Array simples
* Disciplina: Eletiva Java 
* @author  Vanessa Pereira dos Anjos
* @version 1.0
* @since   2019-10-08
* completos: cadastrar,excluir,alterar
* falta: pesquisar (aluno e professor), alterar(professor)
*/
public class Principal {
	
	static SistemaAcademico sa = new SistemaAcademico();
	
	public void exibir () {
		
		for (Aluno aux : sa.alunos) {
			if (aux != null) {
				System.out.println("Aluno: " + aux.getNome() + "\nRA: "
						+ aux.getRA() + "\nEndereco: " + aux.getEndereco()
						+ "\nTelefone: " + aux.getTelefone() + "\nSexo: "
						+ aux.getSexo() + "\n-----");
			}
		}
		for (Professor aux : sa.professores) {
			if (aux != null) {
				System.out.println("Professor: " + aux.getNome()
						+ "\nRegistro: " + aux.getRegistro() + "\nMateria: "
						+ aux.getMateria() + "\nEndereco: " + aux.getEndereco()
						+ "\nTelefone: " + aux.getTelefone() + "\nSexo: "
						+ aux.getSexo() + "\n-----");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		
		 Aluno aluno = new Aluno(123, "Fulano", "ADS", "rua das flores,1",
				"912345678", "M");
		Aluno fulana = new Aluno(321, "Fulana", "SI", "rua das arvores,2",
				"912345679", "F");
		Aluno ciclano = new Aluno(4321, "Ciclano", "SI", "rua das arvores,2",
				"912345679", "M");
		
		Professor ana = new Professor(1, "Ms. Ana", "LP", "rua dos trovoes,2",
				"912345678", "F");
		Professor joao = new Professor(1, "Ms. Joao", "PL", "rua dos trovoes,1",
				"912345678", "M");
		Professor jose = new Professor(1, "Ms. Jose", "ADM", "rua dos trovoes,3",
				"912345678", "M");
		
		sa.cadastrarAluno(fulana);
		sa.cadastrarAluno(ciclano);
		sa.cadastrarAluno(aluno);
		
	/*	System.out.println("Aluno: " + sa.alunos[0].getNome()
				+ sa.alunos[0].getRA() + "\nEndereco: " + sa.alunos[0].getEndereco()
				+ "\nTelefone: " +  sa.alunos[0].getTelefone() + "\nSexo: "
				+  sa.alunos[0].getSexo() + "\n-----");
		
		sa.alterarAluno(aluno, new Aluno(123, "Fulano", "ADS", "rua das rosas,1", "912345678", "M"));
		
		System.out.println("Aluno: " + sa.alunos[0].getNome()
				+ sa.alunos[0].getRA() + "\nEndereco: " + sa.alunos[0].getEndereco()
				+ "\nTelefone: " +  sa.alunos[0].getTelefone() + "\nSexo: "
				+  sa.alunos[0].getSexo() + "\n-----");
	
	 	*/
		 principal.exibir(); 
		 
		 /* sa2.alterarAluno(ciclano, 
				new Aluno(4321, "Ciclano da silva", "ADS", "rua das rosas,1", "912345678", "M"));
		
		 Aluno aux = sa2.pesquisarAluno(4321);
		 //
		 aux.exibirAluno(); */
		 
	

		
	}

}
