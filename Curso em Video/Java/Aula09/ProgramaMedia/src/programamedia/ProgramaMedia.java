/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float n1 = ler.nextFloat(), n2 = ler.nextFloat(), m = (n1 + n2) / 2;
        
        System.out.println("Sua media foi: " + m);
        
        if(m > 9){
            System.out.println("Parabens, pequeno gafanhoto!");
        }
        
    }
    
}
