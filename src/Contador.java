import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: " + parametroUm);
        int parametroUm = terminal.nextInt();
        System.out.println("Informe o segundo valor: " + parametroDois);
        int parametroDois = terminal.nextInt();
       try {
           contar(parametroUm, parametroDois);
       } catch (ParametrosInvalidosException exception) {
           System.out.println("O segundo parâmetro deve ser maior que o primeiro");
       }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int diferenca = parametroDois - parametroUm;

        if (parametroUm < parametroDois) {
            for (int i = 1; diferenca >= 1; diferenca--, i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
