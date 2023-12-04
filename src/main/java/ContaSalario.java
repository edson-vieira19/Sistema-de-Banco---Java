/**
 *
 * @author Edson Vieira da Silva ra:743674
 * 
 * Regra de negócio: a Conta salario recebe um deposito no valor 
 * do salario, e nao é permitido realizar transferencia
 * 
 * nao é descontado nenhuma tarifa e  e tambem nao ganha nenhum acrescimo
 * 
 */
public class ContaSalario extends ContaBancaria implements SaidaDeDados{
    
    private double salario;
    private String empresaPagadora;
    private String dataDePagamento;

    public ContaSalario(){
        super();
        this.salario=0;
        this.empresaPagadora="";
        this.dataDePagamento="";
        
        this.saldo = salario;
        System.out.println("O Salário ja foi depositado na sua Conta");
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmpresaPagadora() {
        return empresaPagadora;
    }

    public void setEmpresaPagadora(String empresaPagadora) {
        this.empresaPagadora = empresaPagadora;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }
    
    @Override
    public void depositar(double valor) {
        
        saldo+=valor;
       
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
        System.out.println("Saldo da Conta: " + saldo); 
        System.out.println("Empresa pagadora: " + empresaPagadora);
        System.out.println("Data do pagamento: " + dataDePagamento);
        System.out.println("Salario: " + salario);
        
    }
     
}
