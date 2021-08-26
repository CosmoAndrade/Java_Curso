public class MainFuncionario {
    public static void main(String[] args) {
        

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Cosmo";
        funcionario.salario = 920.00;

        double salarioRecuperado = funcionario.recuperarSalario(150);
        System.out.println(salarioRecuperado);
        



    }
}