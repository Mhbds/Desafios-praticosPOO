public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Incluído no plano: " + (incluidoNoPlano ? "Sim" : "Não"));
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
