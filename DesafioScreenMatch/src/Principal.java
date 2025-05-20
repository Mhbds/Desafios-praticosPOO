public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O Homem de Aço";
        meuFilme.anoDeLancamento = 2013;
        meuFilme.duracaoEmMinutos = 143;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        meuFilme.avalia(7.5);

        System.out.println("Média de avaliações: " + meuFilme.pegaMedia());
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
    }
}
