import java.util.Scanner;

class Times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro time: ");
        String time1 = scanner.nextLine();

        System.out.println("Digite o nome do outro time: ");
        String time2 = scanner.nextLine();

        System.out.printf("Quantos gols o %s fez? ", time1);
        int placarTime1 = scanner.nextInt();

        System.out.printf("Quantos gols o %s fez? ", time2);
        int placarTime2 = scanner.nextInt();

        if (placarTime1 > placarTime2) {
            System.out.printf("O time vencedor foi %s\n", time1);
        } else if (placarTime1 < placarTime2) {
            System.out.printf("O time vencedor foi %s\n", time2);
        } else {
            System.out.println("O placar ficou empatado!");
        }
    }
}
