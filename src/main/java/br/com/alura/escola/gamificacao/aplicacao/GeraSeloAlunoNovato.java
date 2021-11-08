package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.evento.Ouvinte;
import br.com.alura.escola.shared.evento.TipoDeEventos;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioSelos repositorioSelos;

    public GeraSeloAlunoNovato(RepositorioSelos repositorioSelos) {
        this.repositorioSelos = repositorioSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfAluno = (CPF) evento.informacoes().get("CPF");
        Selo novato = new Selo(cpfAluno, "Novato");
        repositorioSelos.adicionar(novato);

    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEventos.ALUNO_MATRICULADO;
    }
}
