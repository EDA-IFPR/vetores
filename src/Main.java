public class Main {
    public static void main(String[] args) {
        int vetor[] = { 1, 1, 2, 2, 3 };
        int vetor2[] = Funcoes.removeDuplicatas(vetor);
        for (int x = 0; x < vetor2.length; x++) {
            System.out.println(vetor2[x]);
        }
    }

    
}
