package fundamentos;
public class Aula1 {
    public static void main(String[] args) {

        System.out.println("Hello Word!");

        String nome = "Cosmo";
        int idade = 36;
        double altura = 1.75;
        boolean casado = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Casado: " + casado);

        System.out.println();

        // -----------------------------------------

        System.out.printf("Nome: %s \n", nome);
        System.out.printf("Idade: %d \n ", idade);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Casado: %b ", casado);

    }
}