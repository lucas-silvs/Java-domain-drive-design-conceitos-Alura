package br.com.alura.escola.acaedemico.aplicacao.indicacao;

import br.com.alura.escola.acaedemico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
