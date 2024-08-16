import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        int parametroUm = 0;
        int parametroDois = 0;
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
            terminal.close();
        } catch (InputMismatchException e) {
            System.err.println("Tipo de variável errada foi colocada. É só tipo INTEIRO");
        }

        System.out.println(parametroDois);
        
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	/**
	 * @param parametroUm - Valor do tipo inteiro fornecido pelo usuário. Precisa ser menor que o parâmetro 2.
	 * @param parametroDois - Valor do tipo inteiro fornecido pelo usuário. Precisa ser maior que o parâmetro 1.
	 * @throws ParametrosInvalidosException - Exceção de parâmetros inválidos.
	 */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = parametroDois - parametroUm;
		    //realizar o for para imprimir os números com base na variável contagem
            for (int i = 0; i < contagem; i++) {
                System.out.printf("Imprimindo o número %d\n", i+1);
            }
        }
		
	}
}
