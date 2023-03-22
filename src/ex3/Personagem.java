package ex3;

public class Personagem {
    private int visibilidade;
    private int poder;
    private int vidas;

    private Personagem(int visibilidade, int poder, int vidas) {
        this.visibilidade = visibilidade;
        this.poder = poder;
        this.vidas = vidas;
    }

    public static Personagem criarNormal() {
        return new Personagem(10, 50, 3);
    }

    public static Personagem criarPoderoso(int poder) {
        return new Personagem(10, poder, 3);
    }

    public static Personagem criarSoturno(int visibilidade) {
        return new Personagem(visibilidade, 50, 3);
    }

    public static Personagem criar(int visibilidade, int poder, int vidas) {
        return new Personagem(visibilidade, poder, vidas);
    }
}