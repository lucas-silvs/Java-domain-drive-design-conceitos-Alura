package infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno>  matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
            this.matriculados.add(aluno);
    }

    @Override
    public Aluno BuscaPorCPF(CPF cpf) {
        return this.matriculados.stream().filter(a ->a.getCpf().equals(cpf.getCpf()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> ListaTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
