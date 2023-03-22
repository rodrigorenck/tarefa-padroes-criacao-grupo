package Exercicio2;

enum Categoria { NORMAL, ADVANCED, PREMIUM };

public class Conta{
    private Long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoriaInicial;
    
    private Conta(Builder builder){
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.salAplicacaoInicial = builder.salAplicacaoInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoriaInicial = builder.categoriaInicial;
    }

    public static class Builder{
        private Long numero;
        private String nomeCorrentista;
        private int saldoLivreInicial;
        private int salAplicacaoInicial;
        private double taxaRemuneracao;
        private double taxaSaldoNegativo;
        private Categoria categoriaInicial = Categoria.NORMAL;

        public Builder(){  
        }

        public Builder numero(Long numero){this.numero = numero; return this;}
        public Builder nomeCorrentista(String nomeCorrentista){this.nomeCorrentista = nomeCorrentista; return this;}
        public Builder saldoLivreInicial(int saldoLivreInicial){this.saldoLivreInicial = saldoLivreInicial; return this;}
        public Builder salAplicacaoInicial(int salAplicacaoInicial){this.salAplicacaoInicial = salAplicacaoInicial; return this;}
        public Builder taxaRemuneracao(int taxaRemuneracao){this.taxaRemuneracao = taxaRemuneracao; return this;}
        public Builder taxaSaldoNegativo(int taxaSaldoNegativo){this.taxaSaldoNegativo = taxaSaldoNegativo; return this;}
        public Builder categoriaInicial(Categoria categoriaInicial){this.categoriaInicial = categoriaInicial; return this;}
        public Conta build(){return new Conta(this);}
    }

    public Long getNumero() {
        return numero;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public int getSaldoLivreInicial() {
        return saldoLivreInicial;
    }

    public int getSalAplicacaoInicial() {
        return salAplicacaoInicial;
    }

    public double getTaxaRemuneracao() {
        return taxaRemuneracao;
    }

    public double getTaxaSaldoNegativo() {
        return taxaSaldoNegativo;
    }

    public Categoria getCategoriaInicial() {
        return categoriaInicial;
    }

    
}