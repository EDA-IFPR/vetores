public class Funcoes {
    public static int[] removeDuplicatas(int[] vetor) {
        int vetorAuxiliar[] = new int[vetor.length];
        int contador = 0;
        int repetidas = 0;
        for (int x = 0; x < vetor.length; x++) {
            if (x > 0) {
                if (vetor[x] == vetor[x - 1]) {
                    vetorAuxiliar[contador] = 0;
                    repetidas++;

                } else {
                    vetorAuxiliar[contador] = vetor[x];
                    contador++;
                }
            } else {
                vetorAuxiliar[contador] = vetor[x];
                contador++;
            }
        }
        System.out.println("Foram removidos " + repetidas + " elementos repetidos");	
        return vetorAuxiliar;
    }
}
