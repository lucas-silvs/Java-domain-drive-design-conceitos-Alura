package br.com.alura.escola.acaedemico.infra.indicacao;

import br.com.alura.escola.acaedemico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.acaedemico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
