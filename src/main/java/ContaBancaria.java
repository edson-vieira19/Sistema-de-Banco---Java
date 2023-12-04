import java.util.Random;

/**
 *
 * @author Edson Vieira da Silva ra: 743674
 */
public abstract class ContaBancaria {

    private final int numeroDaConta;
    protected double saldo;
    private String dataAbertura;
    private Titular titular;

    public ContaBancaria(){
    
        this.numeroDaConta = gerarNumeroDaConta();
        this.saldo = 0;
        this.dataAbertura = "";
        this.titular = new Titular();
    
    }
    
    public abstract void depositar(double valor);
    
    public abstract boolean sacar(double valor);
    
    public abstract boolean transferir(ContaBancaria destino, double valor);
    
    
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldoInicial){
    
        this.saldo = saldoInicial;
    }
    public void setDataAbertura(String data){
        this.dataAbertura = data;
    }
    
    public String getDataAbertura(){
        return dataAbertura;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    private int gerarNumeroDaConta() {
        Random random = new Random();
        int numero = random.nextInt(900000) + 100000;
        return numero; 
    }
    
}
