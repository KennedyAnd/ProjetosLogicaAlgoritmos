public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Vetor vetores = new Vetor();
        int[] vet = new int [10];
        int n;

        // Gerar numeros aleaorios
        for (int i = 0 ; i<10 ; i++){
        vet[i] = vetores.numeros();           
        }

        // Ordenar vetores em ordem crecente
        for (int i = 0; i < 9; i++){
            for (int j = i + 1; j < 10; j++ ){
                if (vet[i] > vet[j]){
                    n = vet[i];
                    vet[i] = vet[j];
                    vet[j] = n;
            }

        }
    }
    //imprimir
        for(int i = 0; i < 10 ; i++){
            System.out.println("Meus numeros _ " + vet[i]);
        }





    }
}
