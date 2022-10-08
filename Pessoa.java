import java.util.Date;




public class Pessoa {

    private static int counter = 1;

    private int numeroPessoa;
    private String nome;
    private String cpf;
    private String email;
    private Date accountCreationDate;

    public Pessoa(String nome, String cpf, String email){
        this.numeroPessoa = Pessoa.counter;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.accountCreationDate = new Date();
        counter +=1;
    }

    public int getNumeroPessoa(){
        return this.getNumeroPessoa();
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getAccountCreationDate(){
        return this.accountCreationDate;
    }
    public String toString(){
        return "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEmail " + this.getEmail() +
                "\nAccount Creation Date: " + utils.dateToString(this.getAccountCreationDate());
    }

}
