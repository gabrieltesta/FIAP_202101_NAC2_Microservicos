package br.com.fiap.nac2.service.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.nac2.dto.Intencao;
import br.com.fiap.nac2.entity.IntencaoEntity;
import br.com.fiap.nac2.repository.IntencaoRepository;
import br.com.fiap.nac2.service.IntencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntencaoServiceImpl implements IntencaoService {

    @Autowired
    private IntencaoRepository repository;

    @Override
    public List<Intencao> listaIntencoes() {
        List<IntencaoEntity> lista = repository.findAll();
        List<Intencao> intencoes = fromTo(lista);
        return intencoes;
    }

    @Override
    public Intencao salvarIntencao(Intencao intencao) {
        IntencaoEntity entity = fromTo(intencao);
        entity = repository.save(entity);
        Intencao intencaoRetorno = fromTo(entity);
        return intencaoRetorno;
    }

    @Override
    public Intencao editarIntencao(Long id) {
        IntencaoEntity entity = repository.findById(id).get();
        return fromTo(entity);
    }

    private List<Intencao> fromTo(List<IntencaoEntity> lista){
        List<Intencao> listaDto = new ArrayList<>();
        for (IntencaoEntity produtoEntity : lista) {
            Intencao dto = new Intencao();
            dto.setId(produtoEntity.getId());
            dto.setNome(produtoEntity.getNome());
            dto.setLogradouro(produtoEntity.getLogradouro());
            dto.setNumeroLogradouro(produtoEntity.getNumeroLogradouro());
            dto.setCidadeLogradouro(produtoEntity.getCidadeLogradouro());
            dto.setUfLogradouro(produtoEntity.getUfLogradouro());
            dto.setCepLogradouro(produtoEntity.getCepLogradouro());
            dto.setCpf(produtoEntity.getCpf());
            dto.setRg(produtoEntity.getRg());
            dto.setDtNasc(produtoEntity.getDtNasc());
            dto.setEmail(produtoEntity.getEmail());
            dto.setTelResidencial(produtoEntity.getTelResidencial());
            dto.setTelCelular(produtoEntity.getTelCelular());
            dto.setTipo(produtoEntity.getTipo());
            dto.setQtdParcelas(produtoEntity.getQtdParcelas());
            dto.setValor(produtoEntity.getValor());
            dto.setSalario(produtoEntity.getSalario());
            listaDto.add(dto);
        }
        return listaDto;
    }

    private IntencaoEntity fromTo(Intencao intencao){
        IntencaoEntity entity =  new IntencaoEntity();
        entity.setId(intencao.getId());
        entity.setNome(intencao.getNome());
        entity.setLogradouro(intencao.getLogradouro());
        entity.setNumeroLogradouro(intencao.getNumeroLogradouro());
        entity.setCidadeLogradouro(intencao.getCidadeLogradouro());
        entity.setUfLogradouro(intencao.getUfLogradouro());
        entity.setCepLogradouro(intencao.getCepLogradouro());
        entity.setCpf(intencao.getCpf());
        entity.setRg(intencao.getRg());
        entity.setDtNasc(intencao.getDtNasc());
        entity.setEmail(intencao.getEmail());
        entity.setTelResidencial(intencao.getTelResidencial());
        entity.setTelCelular(intencao.getTelCelular());
        entity.setTipo(intencao.getTipo());
        entity.setQtdParcelas(intencao.getQtdParcelas());
        entity.setValor(intencao.getValor());
        entity.setSalario(intencao.getSalario());
        return entity;
    }

    private Intencao fromTo(IntencaoEntity entity) {
        Intencao intencao = new Intencao();
        intencao.setId(entity.getId());
        intencao.setNome(entity.getNome());
        intencao.setLogradouro(entity.getLogradouro());
        intencao.setNumeroLogradouro(entity.getNumeroLogradouro());
        intencao.setCidadeLogradouro(entity.getCidadeLogradouro());
        intencao.setUfLogradouro(entity.getUfLogradouro());
        intencao.setCepLogradouro(entity.getCepLogradouro());
        intencao.setCpf(entity.getCpf());
        intencao.setRg(entity.getRg());
        intencao.setDtNasc(entity.getDtNasc());
        intencao.setEmail(entity.getEmail());
        intencao.setTelResidencial(entity.getTelResidencial());
        intencao.setTelCelular(entity.getTelCelular());
        intencao.setTipo(entity.getTipo());
        intencao.setQtdParcelas(entity.getQtdParcelas());
        intencao.setValor(entity.getValor());
        intencao.setSalario(entity.getSalario());
        return intencao;
    }

}
