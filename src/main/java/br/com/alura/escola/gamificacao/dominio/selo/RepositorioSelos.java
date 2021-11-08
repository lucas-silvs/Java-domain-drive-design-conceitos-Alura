package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.evento.Ouvinte;

import java.util.List;

public interface RepositorioSelos
{
  void adicionar(Selo selo);
  List<Selo> selosDoAlunoDeCpf(CPF cpf);
}