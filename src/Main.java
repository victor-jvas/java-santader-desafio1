import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ContaTerminal conta = new ContaTerminal();
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência.");
    conta.agencia = sc.next();

    System.out.println("Por favor, digite o número da conta.");
    conta.numero = sc.nextInt();

    System.out.println("Por favor, digite o nome do cliente.");
    conta.nomeCliente = sc.next();

    sc.nextLine();
    System.out.print("Por favor, digite o saldo.\n");
    conta.saldo = sc.nextDouble();


    conta.print();

    }
}