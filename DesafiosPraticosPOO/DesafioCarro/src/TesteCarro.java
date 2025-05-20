public class TesteCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.modelo = "Civic";
        c.ano = 2015;
        c.cor = "Prata";

        c.exibirFichaTecnica();
        System.out.println("Idade do carro: " + c.calcularIdade(2025) + " anos");
    }
}
