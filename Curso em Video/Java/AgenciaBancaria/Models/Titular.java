package AgenciaBancaria.Models;

public class Titular {
    private String Nome;
    private String Sobrenome;
    private String Telefone;
    private String Cpf;
    private Endereco Endereco;

    public Titular(String nome, String sobrenome, String telefone, String cpf, Endereco endereco){

        this.Nome = nome;
        this.Sobrenome = sobrenome;
        this.Telefone = telefone;
        this.Cpf = cpf;
        this.Endereco = endereco;
    }

    public void dadosTitular(){

        System.out.println("Nome: " + Nome);
        System.out.println("Sobrenome: " + Sobrenome);
        System.out.println("Telefone: " + Telefone);
        System.out.println("CPF: " + Cpf);
        AgenciaBancaria.Models.Endereco.exibirEndereco();
    }
}
