public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações" + meuFilme.getTotalAvalicoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaAvalicoes = 10;
        //meuFilme.TotalAvalicoes = 1;
        //System.out.println(meuFilme.pegaMedia());
    }
}
