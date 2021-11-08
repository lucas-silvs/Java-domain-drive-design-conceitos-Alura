package br.com.alura.escola.acaedemico.dominio.aluno;

import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.evento.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    @Override
    public void reageAo(Evento evento){

        String momentoformatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(
                String.format("aluno com CPF = %s matriculado em: %s",((ALunoMatriculado) evento).getCpfDoAluno().getNumero(),momentoformatado));
    }



    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof ALunoMatriculado;
    }
}
