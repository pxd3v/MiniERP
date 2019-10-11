package empresa;

public class AssalariadoComissionado extends Comissionado{
    
    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas){    
        super(nome, sobrenome, numIdent, valorVendas);
    }
    
    @Override
    public double getValorAPagar(){
        double total=0;
        total = ControlePagamento.SALARIO*1.1 + valorVendas*0.06;
        return total;
    }
}
