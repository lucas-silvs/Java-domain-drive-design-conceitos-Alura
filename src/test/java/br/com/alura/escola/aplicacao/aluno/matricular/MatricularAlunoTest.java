package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.matricular.MatricularAluno;
import br.com.alura.escola.matricular.MatricularAlunoDTO;
import infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO("Fulano","fulano@gmail.com","123.456.789-00");

        useCase.realizaMAtricula(dados);

        Aluno encontrado = repositorio.BuscaPorCPF(new CPF("123.456.789-00"));
        Assertions.assertEquals("Fulano",encontrado.getNome());
        Assertions.assertEquals("fulano@gmail.com",encontrado.getEmail());
        Assertions.assertEquals("123.456.789-00",encontrado.getCpf());

    }

}
