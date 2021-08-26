public class Conta {

    private int numeroConta;
    private double saldo = 100;


   


    public void depositar (double valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar (double valor){
        this.saldo = this.saldo - valor ; 
    
    
    }

}