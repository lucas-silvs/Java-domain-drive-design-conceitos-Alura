package br.com.alura.escola.acaedemico.dominio.aluno;

import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.evento.TipoDeEventos;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class ALunoMatriculado implements Evento {
    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public ALunoMatriculado(CPF cpfDoAluno ) {
        this.cpfDoAluno = cpfDoAluno;
        momento = LocalDateTime.now();

    }

    @Override
    public LocalDateTime momento() {
       return  momento;
    }

    @Override
    public TipoDeEventos tipo() {
        return TipoDeEventos.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {

        return Map.of("CPF",cpfDoAluno);
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}
