package empresa;

public class Terceirizado extends Empregado {

    private double horasTrabalhadas;
    
    public Terceirizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorAPagar() {
        double total = this.horasTrabalhadas*ControlePagamento.HORA;        
        return total;
    }
}
