public class TesteMusica {
    public static void main(String[] args) {
        Musica m = new Musica();
        m.titulo = "Imagine";
        m.artista = "John Lennon";
        m.anoLancamento = 1971;

        m.avaliar(9);
        m.avaliar(10);
        m.avaliar(8);

        m.exibirFichaTecnica();
        System.out.println("Média de avaliações: " + m.calcularMedia());
    }
}
