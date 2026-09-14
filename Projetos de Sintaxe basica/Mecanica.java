public class Mecanica {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Mecânica!");

        String nomeCliente = "João Silva";
        String servico = " Troca de óleo";
        String Carro = "Fiat Uno";

        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Serviço: " + servico);
        System.out.println("Carro: " + Carro);

        double[] custos = {150.0, 200.0, 250.0, 300.0};
        double total = 0;
        for (double custo : custos) {
            total += custo;
        }
        System.out.println("Total: R$ " + total);

    }
}