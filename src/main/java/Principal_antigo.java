/**
 *
 * @author Edson Vieira da Silva ra:743674
 */
public class Principal_antigo {
    
    private static final ServidorDoBanco servidor = ServidorDoBanco.getInstance();
    private static final Leitura l = new Leitura();
    
    private static ContaCorrente contaCorrente;
    private static ContaPoupanca contaPoupanca;
    private static ContaSalario contaSalario;
    
    
    public static void main(String[] args) {
        
    boolean continua = true;
    int opcao = 0;
     
    while(continua){    
    System.out.println("\n=============================================");
    System.out.println("Seja bem Vindo ao nosso Banco! - MENU INICIAL");
    System.out.println("===============================================");
    System.out.println("(1) Abrir uma nova Conta Corrente");
    System.out.println("(2) Abrir uma nova Conta Poupanca");
    System.out.println("(3) Abrir uma nova Conta Salario");
    System.out.println("(4) Acessar uma conta Corrente Existente");
    System.out.println("(5) Acessar uma conta Poupança Existente");
    System.out.println("(6) Acessar uma conta Salario Existente");
    System.out.println("(7) SAIR");
    System.out.println("=============================================");
    
    try{
        opcao = Integer.parseInt(l.entDados("\tEscolha uma Opcção:"));
    }
    catch(NumberFormatException nfe){
        System.out.println("Deve ser um valor inteiro! - Aperte Enter");
        l.entDados("");
        continue;
    }
    switch(opcao){
    
        case 1:
            
            System.out.println("\n=====================================");
            System.out.println("Abertura de uma nova Conta Corrente: = ");
            System.out.println("Preencha os dados do titular da conta :");
            
            contaCorrente = new ContaCorrente();
            
            contaCorrente.getTitular().setNome(l.entDados("Digite o Nome: "));
            
            boolean vai =true;
            while(vai){
            try{
            contaCorrente.getTitular().setCpf(Integer.parseInt(l.entDados("Digite o CPF: ")));
            vai=false;
            }
            catch(NumberFormatException e){
                l.entDados("O valor deve ser inteiro <aperte enter>");
                }
            }
            contaCorrente.getTitular().setTelefone("Digite o telefone: ");
            contaCorrente.getTitular().setEmail(l.entDados("Digite o e-mail: "));
            
            System.out.println("Preencha os dados de endereço do titular: ");
            
            //reflexividade
            contaCorrente.getTitular().getEndereco().setRua(l.entDados("Rua: "));
            vai=true;
            while(vai){
                try{
            contaCorrente.getTitular().getEndereco()
                    .setNumero(Integer.parseInt(l.entDados("numero: ")));
                    vai=false;
                }
                catch(NumberFormatException e){
                    l.entDados("o numero deve ser inteiro <aperte enter> ");
                }
            }
            contaCorrente.getTitular().getEndereco()
                    .setCidade(l.entDados("Cidade: "));
            contaCorrente.getTitular().getEndereco().setEstado(l.entDados("Estado: "));
            contaCorrente.getTitular().getEndereco().setCep("Cep: ");
            System.out.println("Dados do Titular cadastrados com Sucesso");
            System.out.println("Sua Conta Corrente ja esta aberta");
            vai=true;
            String escolha ="";
            while(vai){
                escolha = l.entDados("Deseja Adicionar algum Saldo inicial na conta? S/N");
            if(escolha.equalsIgnoreCase("s")){
                try{
                contaCorrente.setSaldo(Double.parseDouble(l.entDados
                                ("Digite um valor para o Saldo Inicial: ")));
                vai=false;
                }
                catch(NumberFormatException nfe){
                    l.entDados("deve ser um valor do tipo double <aperte enter>");
                    }
                }else if(escolha.equalsIgnoreCase("N")){
                vai=false;
                }
            }
            System.out.println("So mais Algumas Configurações: ");
            vai=true;
            while(vai){
                escolha = l.entDados("Deseja contratar o Cheque Especial? S/N");
                if(escolha.equalsIgnoreCase("S")){
                    contaCorrente.setPossuiChequeEspecial(true);
                    vai=false;
                }
                else if(escolha.equalsIgnoreCase("N")){
                   contaCorrente.setPossuiChequeEspecial(false);
                   vai=false;
                } 
            }
            System.out.println("Conta Corrente Aberta com Sucesso! ");
            System.out.println("Anote o Numero da sua conta!: "
                    + contaCorrente.getNumeroDaConta());
            
            servidor.getListaDeContasCorrentes().add(contaCorrente);
            
           break; 
        case 2:
            
            // TODO: case 2 criar conta poupanca
            
            break;
        case 3:
            
            //TODO: case 3 criar conta salario
            
            break;
        case 4:
            
            //o case 4 Trata operaçoes com conta corrente como saque
            //transferencia e deposito
            
            System.out.println("Buscar conta corrente: ");
            
            vai= true;
            while(vai){
            try{
            int numero = Integer.parseInt(l.entDados("Digite o numero da Conta: "));
            contaCorrente = servidor.buscarContaCorrente(numero);
                vai=false;
            }
            catch(NumberFormatException e){
                l.entDados("o numero deve ser inteiro: <aperte enter>");
            } catch (ContaNaoEncontradaException ex) {
                l.entDados("Conta nao encontrada <aperte enter>");
                vai=false;
        }
            }
            
            vai=true;
            
            while(vai){
                System.out.println("O que deseja fazer: ");
                System.out.println(" (1) Depositar dinheiro na conta: ");
                System.out.println(" (2) Sacar dinheiro da conta");
                System.out.println(" (3) Fazer uma transferencia ");
                System.out.println(" (4) Exibir Informações da conta");
                System.out.println(" (5) cancelar");
                try{
                opcao = Integer.parseInt(l.entDados("Digite uma opcao "));
                }
                catch (NumberFormatException n){
                   l.entDados("numero dever ser um inteiro <enter>");
                }
                switch(opcao){
                
                    case 1: 
                        
                            System.out.println("realizar um deposito: ");
                            double valorDeposito 
                                    = Double.parseDouble(l.entDados("Valor do Deposito: "));
                            contaCorrente.depositar(valorDeposito);
                            
                           // vai=false;
                            break;
                            
                    case 2:
                        
                            System.out.println("Realizar um saque da Conta Corrente: ");
                            try{
                                double valorSaque = Double.parseDouble(l.entDados
                                            ("Digite o valor do Saque: "));
                             
                                contaCorrente.sacar(valorSaque);
                                
                                //vai=false;
                                break;
                            }
                            catch(NumberFormatException ex){
                                System.out.println("o valor do saque dever ser do tipo double");
                            }
                            
                            break;
                    case 3:
                        
                            System.out.println("Realizar uma Transferencia"
                                    + " da Conta Corrente: ");
                           try{
                              
                               double valorTransferencia = Double.parseDouble(
                                       l.entDados("Informe o valor da transferencia: "));
                               
                               int numeroDestino = Integer.parseInt(
                                       l.entDados("Digite o numero da conta destino: "));
                               
                               ContaCorrente destino; 
                               
                               destino = servidor.buscarContaCorrente(numeroDestino);
                               
                               destino.transferir(destino, valorTransferencia);
                               
                               break;
                           } 
                           catch(NumberFormatException ex){
                               System.out.println("O valor deve ser tipo double");
                           }
                           catch(ContaNaoEncontradaException cne){
                               System.out.println(cne.getMessage());
                           }
                            break;
                    case 4:
                            contaCorrente.imprimirInformacoes();
                            vai=false;
                            break;
                        
                    case 5:
                        System.out.println("Voltando ao menu Inicial\n");
                        vai=false;
                        break;
                    default:    
                l.entDados("A opcao deve estar entre 1 e 4 <press Enter>");
        break;
                
                }
            }
            break;
        case 5:
            
            //TODO: operacoes com conta poupanca
            
            break;
        case 6:
            
            //TODO: operacoes com conta salario
            
            break;
        case 7:
            
            String resp= l.entDados("Deseja realmente sair (S/N)");
            if(resp.equalsIgnoreCase("s")){
            continua=false;
            }
            break;
            
        default:
        
        l.entDados("A opcao deve estar entre 1 e 7 <press Enter>");
        break;
    }
    
    }
    
    }
}
