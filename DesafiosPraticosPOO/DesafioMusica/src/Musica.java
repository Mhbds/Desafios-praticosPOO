public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano: " + anoLancamento);
    }

    void avaliar(double nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double calcularMedia() {
        if (numAvaliacoes == 0) return 0;
        return somaAvaliacoes / numAvaliacoes;
    }
}
