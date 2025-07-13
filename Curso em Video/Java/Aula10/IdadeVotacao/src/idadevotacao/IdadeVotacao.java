/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idadevotacao;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class IdadeVotacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o Ano de Nascimento: ");
        int ano = ler.nextInt();
        int idade = 2024 - ano;
        System.out.println("Idade: " + idade);
        
        if (idade < 16){
            System.out.print("Nao Vota!");
        } else if (( idade >= 16 && idade < 18) || (idade >= 70)){
            System.out.println("Voto Opcional!");
        } else {
            System.out.println("Voto Obrigatorio!");
        }
    }
}
