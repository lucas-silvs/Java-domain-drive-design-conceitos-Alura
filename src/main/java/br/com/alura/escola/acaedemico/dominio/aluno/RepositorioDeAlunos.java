package br.com.alura.escola.acaedemico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
	//...

}
