package fundamentos;

import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {

        String curso = "Java";
        System.out.println("Console");

        System.out.print("Java \n");
        System.out.printf("Nome:%s %n", curso);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Nome: " + nome);

        entrada.close();

    }

}
