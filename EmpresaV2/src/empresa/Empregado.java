package empresa;

public abstract class Empregado implements Pagavel{
    protected String nome;
    protected String sobrenome;
    protected int numIdent;

    public Empregado(String nome, String sobrenome, int numIdent) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
    }
    
    
}
