package empresa;

public class Assalariado extends Empregado{

    private double horasTrabalhadas;
    public Assalariado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    
    @Override
    public double getValorAPagar() {
        double extra = 0;
        double total = 0;
        if(this.horasTrabalhadas >= 160){
            extra = this.horasTrabalhadas - 160;
            total = (ControlePagamento.SALARIO*1.1) + (ControlePagamento.HORA*extra); 
        }
        return total;
    }  
}
