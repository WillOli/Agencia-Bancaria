import javax.swing.*;

public class Conta {
    private static int contadorDeConta = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private double saldo = 0.0;

    public Conta(Pessoa pessoa){
        this.numeroConta = Conta.contadorDeConta;
        this.pessoa = pessoa;
        Conta.contadorDeConta += 1;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "\nNúmero da conta : " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCpf() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + utils.doubleToString(this.getSaldo()) +
                "\n";
    }

    public void depositar(double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Seu depósito foi realizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o depósito!");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);

            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque!");
        }
    }
    public void transferir(Conta contaParadeposito, double valor) {
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            contaParadeposito.saldo = contaParadeposito.getSaldo() + valor;

            JOptionPane.showMessageDialog(null, "Trânsferência realizada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a transferência!");
        }
    }
}

