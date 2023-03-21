package Exercicio2;

public class AppTeste {
    
    public static void main(String[] args) {

        Conta conta = new Conta.Builder()
                        .numero((long) 83945793)
                        .nomeCorrentista("Pedro")
                        .saldoLivreInicial(1999)
                        .salAplicacaoInicial(2500)
                        .taxaRemuneracao(15)
                        .taxaSaldoNegativo(12)
                        .categoriaInicial(Categoria.NORMAL)
                        .build();


        System.out.println("Numero conta: " + conta.getNumero());
        System.out.println("Nome do correntista: " + conta.getNomeCorrentista());
        System.out.println("Saldo livre inicial: " + conta.getSaldoLivreInicial());
        System.out.println("Saldo para aplicação inicial: " + conta.getSaldoLivreInicial());
        System.out.println("Taxa de remuneração: " + conta.getTaxaRemuneracao());
        System.out.println("Taxa de saldo negativo: " + conta.getTaxaSaldoNegativo());
        System.out.println("Categoria inicial: " + conta.getCategoriaInicial());
    }
}
