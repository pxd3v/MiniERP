package empresa;

public class Comissionado extends Empregado{
    protected double valorVendas;
    public Comissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
        super(nome, sobrenome, numIdent);
        this.valorVendas = valorVendas;
        
    }

    
    @Override
    public double getValorAPagar() {
        double total = 0;
        total = valorVendas*0.06;
        return total;
    }
    
}
