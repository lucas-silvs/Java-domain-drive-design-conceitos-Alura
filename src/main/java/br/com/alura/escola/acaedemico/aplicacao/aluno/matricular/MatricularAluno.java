package br.com.alura.escola.acaedemico.aplicacao.aluno.matricular;

import br.com.alura.escola.shared.evento.PublicadorDeEventos;
import br.com.alura.escola.acaedemico.dominio.aluno.ALunoMatriculado;
import br.com.alura.escola.acaedemico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.acaedemico.dominio.aluno.Aluno;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	private final PublicadorDeEventos publicador;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		ALunoMatriculado evento = new ALunoMatriculado(novo.getCpf());
		publicador.publicarEvento(evento);

	}

}
