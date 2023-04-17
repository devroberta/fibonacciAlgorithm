public class Fibonacci {

    public boolean isContainedFibonacci(int number) {

        int proximo = 0;
        int anterior = 0;
        int atual = 1;
        StringBuilder listNumbers = new StringBuilder();
        boolean isContained = false;
        
        for (int i = 1; i <= number; i++) {
            if (i == number) {
                listNumbers.append(anterior);
            } else {
                listNumbers.append(anterior + " - ");
            }
            if (anterior == number) {
                isContained = true;
            }
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println("Sequencia: Fibonacci: " + listNumbers);
        return isContained;
    }
}
