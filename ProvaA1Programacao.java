import java.util.Scanner;

public class ProvaA1Programacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Questão Um, Prova A1.");

        String placaVeiculo;
        double valorCombustivel, sessentaPorHora, oitentaPorHora, cemPorHora, centoEVintePorHora, centoEQuarentaPorHora;
        double consumo60PorHora, consumo80PorHora, consumo100PorHora, consumo120PorHora, consumo140PorHora;
        double quantidadeTotalCombustivel, velocidadeMediaPonderada, custoTotalViagem;

        System.out.println("\nInforme a placa do veículo:");
        placaVeiculo = scanner.nextLine();

        System.out.println("\nInforme o valor do litro do combustível:");
        valorCombustivel = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 60 KM/H:");
        sessentaPorHora = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 80 KM/H:");
        oitentaPorHora = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 100 KM/H:");
        cemPorHora = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 120 KM/H:");
        centoEVintePorHora = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de quilômetros rodados a 140 KM/H:");
        centoEQuarentaPorHora = scanner.nextDouble();

        consumo60PorHora = (sessentaPorHora / 30.7);
        consumo80PorHora = (oitentaPorHora / 26.8);
        consumo100PorHora = (cemPorHora / 22.4);
        consumo120PorHora = (centoEVintePorHora / 18.1);
        consumo140PorHora = (centoEQuarentaPorHora / 14.5);

        quantidadeTotalCombustivel = (consumo60PorHora + consumo80PorHora + consumo100PorHora + consumo120PorHora + consumo140PorHora);

        velocidadeMediaPonderada = (((sessentaPorHora * 60) + (oitentaPorHora * 80) + (cemPorHora * 100) + (centoEVintePorHora * 120) + (centoEQuarentaPorHora * 140)) / (sessentaPorHora + oitentaPorHora + cemPorHora + centoEVintePorHora + centoEQuarentaPorHora));

        custoTotalViagem = (quantidadeTotalCombustivel * valorCombustivel);

        System.out.printf("\nPlaca do veículo: %s" , placaVeiculo);
        System.out.printf("\nConsumo total: %.4f litros", quantidadeTotalCombustivel);
        System.out.printf("\nValor total: R$ %.2f", custoTotalViagem);
        System.out.printf("\nVelocidade média ponderada: %.4f Km/h", velocidadeMediaPonderada);
        
     scanner.close();
    }
}
