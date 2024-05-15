import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
    
        System.out.print("Digite um número: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite mais um número: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o segundo");
            //e.printStackTrace();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        
        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
}
