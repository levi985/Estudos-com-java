
package media;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       
        
        //Solicitação dos números para o usuário
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        
        System.out.println("Digite só mais um número: ");
        int n3 = scanner.nextInt();
        
        //Realização dos calculos 
        
        //result = scanner.nextDouble();
        double media = (n1+n2+n3)/3;
                
        // Exibir o resultado para o usuário        
        System.out.println("O resultado dá media é" + media);
                
                
    }
    
}
