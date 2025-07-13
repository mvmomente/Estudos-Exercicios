package AgenciaBancaria.Models;

public class Conta {
    private int Agencia;
    private int Conta;
    private Titular Titular;

    public Conta (int agencia, int conta, Titular titular){
        this.Agencia = agencia;
        this.Conta = conta;
        this.Titular = titular;

    }

    public void exibirConta(){

        System.out.println("Agencia: " + Agencia);
        System.out.println("Conta: " + Conta);
        System.out.println("Titular: " + Titular);
    }

}
