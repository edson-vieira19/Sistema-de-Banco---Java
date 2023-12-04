/**
 *
 * @author Edson Vieira da Silva ra:743674
 */
public class Titular {
    
    private String nome;
    private int cpf;
    private Endereco endereco;
    private String telefone;
    private String email;
    
   public Titular(){
       
      nome="";
      cpf=0;
      endereco = new Endereco();
      telefone="";
      email="";
   }
   
   public Titular(String nome, int cpf, Endereco endereco,
                    String telefone, String email){
       this.nome= nome;
       this.cpf= cpf;
       this.endereco = endereco;
       this.telefone = telefone;
       this.email = email;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
}
