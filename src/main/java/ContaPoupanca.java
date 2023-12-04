/**
 *
 * @author Edson Vieira da Silva ra:743674
 * 
 *  Regra de Negocio: A conta poupanca ganha um "juros" como uma porcentagem
 *  do valor do deposito. mas em contrapartida o saque e transferencia
 *  sao limitados a até 30% do valor total do saldo.
 */

public class ContaPoupanca extends ContaBancaria implements SaidaDeDados{
    
    private static final double JUROS = 0.05;
    private double limiteDeSaque;
    private double limiteDeTransferencia;

    public ContaPoupanca() {
        
        super();
        this.limiteDeSaque = 0.3*saldo;
        this.limiteDeTransferencia = 0.3*saldo;
        
    }

    public double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(double limite) {
        
        double limiteMaximo = saldo * 0.3;
        
        if (limite <= limiteMaximo) {
        this.limiteDeSaque = limite;
        System.out.println("Limite de saque definido com sucesso.");
        } else {
        System.out.println("Limite de saque não pode exceder 30% do valor do saldo.");
        }
    }

    public double getLimiteDeTransferencia() {
            return limiteDeTransferencia;
    }

    public void setLimiteDeTransferencia(double limite) {
        double limiteMaximo = 0.3;
        
        if (limite <= limiteMaximo) {
        this.limiteDeTransferencia = limite;
        System.out.println("Limite de transferencia definido com sucesso.");
        } else {
        System.out.println("Limite de transferencia"
                        + " não pode exceder 30% do valor do saldo.");
        }
    }

    @Override
    public void depositar(double valor) {
        
        double acrescimo = saldo * ContaPoupanca.JUROS;
        double valorComAcrescimo = saldo + acrescimo;
        
        saldo +=valorComAcrescimo;
        
    }

    @Override
    public boolean sacar(double valor) {
        
        if(valor <=saldo){
            saldo -= valor;
            System.out.println("Voce efetuou um saque de R$ " + valor);
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    @Override
    public boolean transferir(ContaBancaria destino, double valor) {
        if(valor <=saldo){
            destino.depositar(valor);
            saldo -= valor;
            System.out.println("Voce efetuou uma Transferencia"
                    + " de R$ " + valor + "para " + 
                    destino.getTitular().getNome());
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
        
    }

    @Override
    public void imprimirInformacoes() {
       
        System.out.println("\nInformações da Conta Poupança: ");
        System.out.println("Numero da conta: " + getNumeroDaConta());
        System.out.println("Nome do Titular: " + getTitular().getNome());
        System.out.println("cpf do Titular: " + getTitular().getCpf());
        System.out.println("Saldo da Conta: " + getSaldo()); 
        System.out.println("Limite de Saque: " + limiteDeSaque);
        System.out.println("Limite de Transferência: " + limiteDeTransferencia);
        
    }

   
    
    
    
    
    
    
    
}
