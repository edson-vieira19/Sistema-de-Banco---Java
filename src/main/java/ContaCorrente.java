/**
 * 
 * @author Edson Vieira da Silva ra: 743674
 * 
 *  Regra de negócio: A conta corrente possui acesso ao cheque especial
 *  de no máximo 30% do saldo, porem é cobrado taxa para sacar
 *  ou transferir.
 */
public class ContaCorrente extends ContaBancaria implements SaidaDeDados{

    private static final double TARIFA = 0.05;
    private boolean possuiChequeEspecial;
    private double limiteChequeEspecial;

    public ContaCorrente() {
        
        this.possuiChequeEspecial = false;
        this.limiteChequeEspecial = 0;
    }
    
    public boolean isPossuiChequeEspecial() {
        return possuiChequeEspecial;
    }

    public void setPossuiChequeEspecial(boolean possui) {
        this.possuiChequeEspecial = possui;
        if(possui){
            saldo += this.limiteChequeEspecial;
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limite) {
        double limiteMaximo = saldo * 0.3;

    if (limite <= limiteMaximo) {
        this.limiteChequeEspecial = limite;
        System.out.println("Limite do cheque especial definido com sucesso.");
    } else {
        System.out.println("Limite do cheque especial não pode exceder 30% do saldo atual.");
        }
    }

    public static double getTARIFA() {
        return TARIFA;
    }
    
    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("saldo adicionado na conta R$: " +valor );
    }

    @Override
    public boolean sacar(double valor) {
        
        double desconto = valor*ContaCorrente.TARIFA;
        double valorComDesconto = valor + desconto;
    
    if (valorComDesconto <= saldo) {
        saldo -= valorComDesconto;
        System.out.println("Saque de R$" + valor + " efetuado com sucesso.");
        return true;
    } else {
        System.out.println("Saldo insuficiente para sacar R$" + valor);
        return false;
           }
    }

    @Override
    public boolean transferir(ContaBancaria destino, double valor) {
        
       double desconto = valor*ContaCorrente.TARIFA;
       double valorComDesconto = valor + desconto;
    
    if (valorComDesconto <= saldo) {
        saldo -= valorComDesconto;
        destino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " para a conta de "
                            + destino.getTitular() + " efetuada com sucesso.");
        return true;
    } else {
        System.out.println("Saldo insuficiente para transferir R$" + valor);
        return false;
    }
        
    }  

    @Override
    public void imprimirInformacoes() {
        
        System.out.println("\nInformações da Conta Corrente: ");
        System.out.println("Numero da conta: " + getNumeroDaConta());
        System.out.println("Nome do Titular: " + getTitular().getNome());
        System.out.println("cpf do Titular: " + getTitular().getCpf());
        System.out.println("Saldo da Conta: " + getSaldo());
        boolean opcao = isPossuiChequeEspecial();
        String valor = (opcao)?"Sim":"Não";
        System.out.println("Possui Cheque especial: " + valor);
        if(opcao){
            System.out.println("Valor do Saldo + Cheque Especial: " +
                    (saldo + limiteChequeEspecial));
        }
    }
}
