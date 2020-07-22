package com.springbatch.processadorclassifier.processor;

import org.springframework.batch.item.ItemProcessor;

import com.springbatch.processadorclassifier.dominio.Transacao;

public class TrancacaoProcessor implements ItemProcessor<Transacao, Transacao> {

	@Override
	public Transacao process(Transacao transacao) throws Exception {
		System.out.println(String.format("\n Aplicando regras de negócio do negocio %s", transacao.getId()));
		return transacao;
	}
}
