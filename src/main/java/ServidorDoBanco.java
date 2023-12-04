
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edson
 */
public class ServidorDoBanco {
    
    private static ServidorDoBanco instancia;
    
    private static List<ContaCorrente> listaDeContasCorrentes;
    private static List<ContaPoupanca> listaDeContasPoupanca;
    private static List<ContaSalario> listaDeContasSalario;
    
    private ServidorDoBanco(){
        
        listaDeContasCorrentes = new ArrayList<>();
        listaDeContasPoupanca = new ArrayList<>();
        listaDeContasSalario = new ArrayList<>();
    }

    public static ServidorDoBanco getInstance(){
    
        if(instancia == null){
           instancia = new ServidorDoBanco();
        }
        return instancia;
    }
    
    
    public List<ContaCorrente> getListaDeContasCorrentes() {
        return listaDeContasCorrentes;
    }

    public List<ContaPoupanca> getListaDeContasPoupanca() {
        return listaDeContasPoupanca;
    }

    public List<ContaSalario> getListaDeContasSalario() {
        return listaDeContasSalario;
    }
    
    public ContaCorrente buscarContaCorrente(int numeroDaConta) throws ContaNaoEncontradaException{
        for(int i=0; i< listaDeContasCorrentes.size();i++){
            if(numeroDaConta == listaDeContasCorrentes.get(i).getNumeroDaConta()){
                return listaDeContasCorrentes.get(i);
            }
        }
        throw new ContaNaoEncontradaException();    
    }  
    
    public ContaBancaria buscarContaBancaria(int numeroDaConta) throws ContaNaoEncontradaException {
        for (ContaCorrente cc : listaDeContasCorrentes) {
            if (numeroDaConta == cc.getNumeroDaConta()) {
                return cc;
            }
        }
        for (ContaPoupanca cp : listaDeContasPoupanca) {
            if (numeroDaConta == cp.getNumeroDaConta()) {
                return cp;
            }
        }
        for (ContaSalario cs : listaDeContasSalario) {
            if (numeroDaConta == cs.getNumeroDaConta()) {
                return cs;
            }
        }
        throw new ContaNaoEncontradaException();
    }
     
}
