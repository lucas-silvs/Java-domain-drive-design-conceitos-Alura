package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.matricular.MatricularAluno;
import br.com.alura.escola.matricular.MatricularAlunoDTO;
import infra.aluno.RepositorioDeAlunosEmMemoria;
import infra.aluno.RepositorioDeAlunosJDBC;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {

        String nome = "Fulano da Silva";

        String cpf = "123.456.789-00";
        String email ="fulano@gmail.com";


        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.realizaMAtricula(new MatricularAlunoDTO(nome,cpf,email));
    }
}
