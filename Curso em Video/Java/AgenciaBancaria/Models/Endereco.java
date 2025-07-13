package AgenciaBancaria.Models;

public class Endereco {

    private String Rua;
    private String Bairro;
    private int Numero;
    private String Cidade;

    public Endereco (String rua, String bairro, int numero, String cidade){
        this.Rua=rua;
        this.Bairro=bairro;
        this.Numero=numero;
        this.Cidade=cidade;
    }

    public void exibirEndereco(){

        System.out.println("Rua: " + Rua);
        System.out.println("Bairro: " + Bairro);
        System.out.println("Bairro: " + Numero);
        System.out.println("Bairro: " + Cidade);
    }

}
