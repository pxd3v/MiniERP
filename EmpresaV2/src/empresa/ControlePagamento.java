package empresa;

import java.util.ArrayList;
import java.util.Iterator;

public class ControlePagamento {
    public static final double SALARIO = 954;
    public static final double HORA = 8.00;
    private ArrayList <Pagavel> itensAPagar;

    public ControlePagamento() {
        this.itensAPagar = new ArrayList<>();
    }

    public void adicionarPendencia(Pagavel pendencia) {
        itensAPagar.add(pendencia);
    }
    
    public double[] totalAPagar() {
        Iterator <Pagavel> it = itensAPagar.iterator();
        double total[] = new double[2];
        total[0] = 0;
        total[1] = 0;
        while(it.hasNext()) {
            Pagavel aux = it.next();
            if(aux instanceof Conta) {
                total[0] += aux.getValorAPagar();
            }
            if(aux instanceof Empregado) {
                total[1] += aux.getValorAPagar();
            }
        }
        return total;
    }
}
