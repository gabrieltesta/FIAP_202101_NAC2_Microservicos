package br.com.fiap.nac2.service;

import java.util.List;

import br.com.fiap.nac2.dto.Intencao;

public interface IntencaoService {
    List<Intencao>listaIntencoes();
    Intencao salvarIntencao(Intencao intencao);
    Intencao editarIntencao(Long id);
}
