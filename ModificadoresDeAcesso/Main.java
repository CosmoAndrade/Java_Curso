public class Main {
    public static void main(String[] args) {
        

        Conta minhaConta = new Conta ();
        minhaConta.depositar(100);
        minhaConta.sacar();

        System.out.println(minhaConta.saldo);

    }
}