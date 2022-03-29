package eu;
import java.util.Scanner;

public class Tarefa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.println("Digite o periodo: ");
        int periodo = scanner.nextInt();
        System.out.println("Digite sua primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Quantidade de faltas: ");
        int qtFaltas = scanner.nextInt();



        float media = (nota1 + nota2)/2;
        System.out.println("sua media é " + media);

    }






}

