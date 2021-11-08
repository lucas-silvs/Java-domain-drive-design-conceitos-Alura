package br.com.alura.escola.acaedemico.matricular;


import br.com.alura.escola.acaedemico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.acaedemico.dominio.aluno.Aluno;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void realizaMAtricula(MatricularAlunoDTO alunoDTO){
        Aluno novo = alunoDTO.criarAluno();
        repositorio.matricular(novo);


    }
}
