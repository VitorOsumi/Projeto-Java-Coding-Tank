import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner conversor = new Scanner(System.in);

        try {

        System.out.println("Quantas temperaturas deseja converter? (Insira um número inteiro)");
        int numeroTemperaturas = conversor.nextInt();

        System.out.println("Digite qual temperatura de origem (1. Celsius 2. Kelvin 3. Fahrenheit)");
        int origem = conversor.nextInt();

        System.out.println("Digite qual temperatura a ser transformada (1. Celsius 2. Kelvin 3. Fahrenheit)");
        int destino = conversor.nextInt();

        while (origem == destino){
            System.out.println("Escala de origem precisa ser diferente da a ser transformada, favor selecionar opções distintas.");

            System.out.println("Digite qual temperatura de origem (1. Celsius 2. Kelvin 3. Fahrenheit)");
            origem = conversor.nextInt();

            System.out.println("Digite qual temperatura a ser transformada (1. Celsius 2. Kelvin 3. Fahrenheit)");
            destino = conversor.nextInt();
        }

        Double[] temperaturasInput = new Double[100];
        System.out.println("Quais as temperaturas que deseja converter? (Utilize vírgula para casas decimais)");
        for (int i = 0; i < numeroTemperaturas; i++) {
            temperaturasInput[i] = conversor.nextDouble();
        }

        Double[] temperaturasOutput = new Double[100];

        // Fórmulas utilizadas do Google //

        if (origem == 1 && destino == 2) {
            for (int j = 0; j < numeroTemperaturas; j++) {
                temperaturasOutput[j] = temperaturasInput[j] + 273.15;
            }
        } else if (origem == 2 && destino == 1) {
            for (int j = 0; j < numeroTemperaturas; j++) {
                temperaturasOutput[j] = temperaturasInput[j] - 273.15;
            }
        } else if (origem == 1 && destino == 3) {
            for (int j = 0; j < numeroTemperaturas; j++) {
                temperaturasOutput[j] = (temperaturasInput[j] * (9 / 5)) + 32;
            }
        } else if (origem == 3 && destino == 1) {
            for (int j = 0; j < numeroTemperaturas; j++) {
                temperaturasOutput[j] = (temperaturasInput[j] - 32) * 5 / 9;
            }
        } else if (origem == 2 && destino == 3) {
            for (int j = 0; j < numeroTemperaturas; j++) {
                temperaturasOutput[j] = (temperaturasInput[j] - 273.15) * 9 / 5 + 32;
            }
        } else if (origem == 3 && destino == 2) {
            for (int j = 0; j < numeroTemperaturas; j++) {
                temperaturasOutput[j] = (temperaturasInput[j] - 32) * 5 / 9 + 273.15;
            }

        }

        String origemNome = "Temperatura inicial";
        if (origem == 1) {
            origemNome = "Celsius";
        } else if (origem == 2) {
            origemNome = "Kelvin";
        } else if (origem == 3) {
            origemNome = "Fahrenheit";
        }

        String destinoNome = "Temperatura final";
        if (destino == 1) {
            destinoNome = "Celsius";
        } else if (destino == 2) {
            destinoNome = "Kelvin";
        } else if (destino == 3) {
            destinoNome = "Fahrenheit";
        }

        System.out.println("Temperatura na escala " + origemNome + ", transformada em escala " + destinoNome + ". Eis os resultados de valor inserido e valor convertido:");
        for (int i = 0; i < numeroTemperaturas; i++) {
            System.out.println("Temperatura inicial: " + temperaturasInput[i] + " - Temperatura final: " + temperaturasOutput[i] + " --- Média das temperaturas iniciais e transformadas: " + (temperaturasInput[i]+temperaturasOutput[i])/2);
        }

        } catch (Exception e){
            System.out.println("Algo de errado não está certo! Tentar novamente!");
        }
        finally {
            System.out.println("Finalizando o programa...");
        }

    }
}