package entities;

public class Cliente {
    protected String cpf;
    protected String nome;
    protected ContaCorrente contaCorrente;
    protected ContaPoupanca contaPoupanca;


    public Cliente(){
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.contaCorrente = new ContaCorrente(this,0.0);
        this.contaPoupanca = new ContaPoupanca(this,0.0);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", contaCorrente=" + contaCorrente +
                ", contaPoupanca=" + contaPoupanca +
                '}';
    }
}
