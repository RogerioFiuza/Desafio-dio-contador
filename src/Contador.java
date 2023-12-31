import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
    System.out.println("------------------------------------");    
    System.out.println("     Desafio DIO - Contador         ");
    System.out.println("------------------------------------");  
    System.out.println("                                    ");  
    
    try (Scanner terminal = new Scanner(System.in)) {
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
        }
    }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprima o número: " + x);
        }

    }
}    
