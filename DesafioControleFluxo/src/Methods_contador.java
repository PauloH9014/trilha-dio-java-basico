
// Exceção customizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

// Classe com a lógica da contagem
public class Methods_contador {
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    public static void main(String[] args) {
        try {
            int parametroUm = Integer.parseInt(args[0]);
            int parametroDois = Integer.parseInt(args[1]);

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira dois números inteiros válidos.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você precisa passar exatamente dois parâmetros.");
        }
    }
}
