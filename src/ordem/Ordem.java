package ordem;

import java.util.Scanner;

public class Ordem {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        int a = input.nextInt();
        
        System.out.print("Digite um numero: ");
        int b = input.nextInt();
        
        System.out.print("Digite um numero: ");
        int c = input.nextInt();
        
        if (a > b){
            if (b > c){
                System.out.println("A é o maior número");
            }
        else if (a > c){
            if (b > a){
                System.out.println("B é o maior número");
            }
            else {
                        System.out.println("C é o maior número");
                        }
            
    }
    
}
    }}