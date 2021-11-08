package br.com.alura.escola.gamificacao.infra.selo;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gamificacao.dominio.selo.RepositorioSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioSelos {

    private List<Selo> selos = new ArrayList<>();
    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);

    }

    @Override
    public List<Selo> selosDoAlunoDeCpf(CPF cpf) {
        return selos
                .stream()
                .filter(s -> s.getCpf().equals(cpf))
                .collect(Collectors.toList());
    }
}
