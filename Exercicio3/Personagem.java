package Exercicio3;

public class Personagem{
    private int visibilidade;
    private int vida;
    private int poder;
    private String tipo;

    private Personagem(String tipo, int visibilidade, int vida, int poder) {
        this.visibilidade = visibilidade;
        this.vida = vida;
        this.poder = poder;
        this.tipo = tipo;
    }

    public static Personagem normal(){
        return new Personagem("normal", 10, 3, 50);
    }
    public static Personagem poderoso(int poder){
        return new Personagem("poderosos", 10, 3, poder);
    }
    public static Personagem soturnos(int visibilidade){
        return new Personagem("soturnos", visibilidade,3 ,50);
    }
    public static Personagem ajustavel(int visibilidade, int vida, int poder){
        return new Personagem("ajustavel", visibilidade, vida, poder);
    }

    @Override
    public String toString() {
        return "Personagem [visibilidade=" + visibilidade + ", vida=" + vida + ", poder=" + poder + ", tipo=" + tipo
                + "]";
    }
}