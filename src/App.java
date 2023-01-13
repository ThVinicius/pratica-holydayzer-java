import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao APP de feriados de 2023!");

        System.out.print("1 - Ver a lista de todos os feriados\n2 - Digitar uma data e verificar se ela é um feriado\n O que você deseja fazer? ");

        try {
            Calendar calendar = new Calendar();

            int optionMenu = scanner.nextInt();

            switch (optionMenu) {
                case 1 -> calendar.printHolidayList();
                case 2 -> {
                    Scanner scannerDate = new Scanner(System.in);
                    System.out.print("Informe a data (com o formato dia/mês/2023): ");
                    while (!scannerDate.hasNext("[0-3][1-9][/][0-1][1-9][/]2023")) {
                        System.out.print("Data no formato inválido!\nInforme uma nova data: ");
                        scannerDate.nextLine();
                    }
                    String date = scannerDate.next();
                    calendar.printHolidayName(date);
                }
                default -> System.out.println("Valor inválido");
            }
        } catch (InputMismatchException e) {
            System.out.println("número inválido!");
        }

    }

}
