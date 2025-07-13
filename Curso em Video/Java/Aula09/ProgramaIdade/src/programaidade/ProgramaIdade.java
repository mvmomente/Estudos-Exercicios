/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author marcosmomente
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o ano de nascimento: ");
        int nasc = ler.nextInt();
        int idade = 2024 - nasc;
        System.out.println("Sua Idade e de: " + idade);
        if (idade >= 18){
            System.out.println("Maior de Idade!");
        } else {
            System.out.println("Menor de Idade!");
        }
    }
    
}
