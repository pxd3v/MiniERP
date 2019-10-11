package empresa;

public abstract class Conta implements Pagavel {
    protected int dia;
    protected int mes;
    protected double valor;

    public Conta(int dia, int mes, double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }
    
}
