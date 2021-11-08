package br.com.alura.escola.acaedemico;

import br.com.alura.escola.acaedemico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.acaedemico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.shared.evento.PublicadorDeEventos;
import br.com.alura.escola.acaedemico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.acaedemico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);

		matricular.executa(
				new MatricularAlunoDto(nome,
						cpf,
						email));
	}

}
