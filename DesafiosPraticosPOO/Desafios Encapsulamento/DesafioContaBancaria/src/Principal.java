public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(12345);
        conta.setSaldo(1500.50);
        conta.titular = "João Silva";

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
