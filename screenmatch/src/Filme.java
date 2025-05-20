public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlanp;
    private double somaAvaliacoes;
    private int totalAvalicoes;
    int duracaoMinutos;

    int getTotalAvalicoes() {
        return totalAvalicoes;
    }

    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvalicoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalAvalicoes;
    }
}