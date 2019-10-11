package empresa;

public class Titulo extends Conta {
    private int diaAtual;
    private int mesAtual;
    public Titulo(int dia, int mes, double valor, int diaAtual, int mesAtual) {
        super(dia, mes, valor);
        this.diaAtual = diaAtual;
        this.mesAtual = mesAtual;
    }

    
    public double getValorAPagar() {
        if(this.mesAtual > this.mes){
            if(this.diaAtual > this.dia){
                double total = this.valor * 1.1;
                return total;
            }
        }
        return this.valor;
    }
    
}
