public class Main {
    public static void main(String[] args) {
        int vetor[] = { 1, 1, 2, 2, 3 };
        Funcoes funcoes = new Funcoes();
        int vetor2[] = funcoes.removeDuplicatas(vetor);
        for (int x = 0; x < vetor2.length; x++) {
            System.out.println(vetor2[x]);
        }
    }

    
}
