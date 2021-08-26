public class Funcionario{


String nome;
double salario;

double  recuperarSalario (double bonus){
    this.salario = this.salario - (this.salario * 0.1);
    return this.salario + bonus;
    
    
};


}