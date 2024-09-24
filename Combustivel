import java.util.Scanner;
class Combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tipo de combustível? E ou e para etanol e G ou g para gasolina");
        String combustivel = scanner.nextLine().toUpperCase();

        System.out.println("Quantos litros foram colocados?");
        double litros = scanner.nextDouble();

        double precoGasolina = 5.80;
        double precoEtanol = 4.90;

        double totalPagar;

        if (combustivel.equals("G")) {
            totalPagar = precoGasolina * litros;
        } else if (combustivel.equals("E")) {
            totalPagar = precoEtanol * litros;
        } else {
            System.out.println("Combustível inválido.");
            return;
        }

        System.out.printf("O total a ser pago é: R$ %.2f", totalPagar);
    }
}
