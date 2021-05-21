package br.com.fiap.nac2.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Intencao implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String tipo;
    @NotNull
    private Double valor;
    @NotNull
    private Double salario;
    @NotNull
    private int qtdParcelas;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String numeroLogradouro;
    @NotBlank
    private String cidadeLogradouro;
    @NotBlank
    private String ufLogradouro;
    @NotBlank
    private String cepLogradouro;
    @NotBlank
    private String telResidencial;
    @NotBlank
    private String telCelular;
    @NotBlank private String email;
    @NotBlank private String cpf;
    @NotBlank private String rg;
    @NotBlank private String dtNasc;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(String numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getCidadeLogradouro() {
        return cidadeLogradouro;
    }

    public void setCidadeLogradouro(String cidadeLogradouro) {
        this.cidadeLogradouro = cidadeLogradouro;
    }

    public String getUfLogradouro() {
        return ufLogradouro;
    }

    public void setUfLogradouro(String ufLogradouro) {
        this.ufLogradouro = ufLogradouro;
    }

    public String getCepLogradouro() {
        return cepLogradouro;
    }

    public void setCepLogradouro(String cepLogradouro) {
        this.cepLogradouro = cepLogradouro;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }
}
