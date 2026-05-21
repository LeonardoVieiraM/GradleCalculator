package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA SIMPLES (FLOAT) ===");
        
        while (true) {
            System.out.println("\nEscolha uma operacao:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }
            
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opcao invalida!");
                continue;
            }
            
            System.out.print("Digite o primeiro numero: ");
            float num1 = scanner.nextFloat();
            
            System.out.print("Digite o segundo numero: ");
            float num2 = scanner.nextFloat();
            
            float resultado;
            String operacao = "";
            
            try {
                switch (opcao) {
                    case 1:
                        resultado = calc.somar(num1, num2);
                        operacao = "+";
                        break;
                    case 2:
                        resultado = calc.subtrair(num1, num2);
                        operacao = "-";
                        break;
                    case 3:
                        resultado = calc.multiplicar(num1, num2);
                        operacao = "*";
                        break;
                    case 4:
                        resultado = calc.dividir(num1, num2);
                        operacao = "/";
                        break;
                    default:
                        continue;
                }
                
                System.out.printf("Resultado: %.2f %s %.2f = %.2f%n", 
                                 num1, operacao, num2, resultado);
                                 
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}