
public class Recp {

    //EXECUTAR O MAKE "  make -f T3.mk    "


    public static void mostrarResultado() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean v[] = {};
        boolean w[] = {};  
        int vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean mascara[] = {true, false, true, false, true, false, false, false, false, true};
        
        int valor = 11; // execução do mostrar maiores.
         
        String separador = "\n";
        
        //mostrarInteiros(vetor, separador);
        //mostrarMaiores(vetor, valor);
        //mostrarMenores(vetor, valor);
        //aplicarElogico(v, w);
        //aplicarOuLogico(v, w);
        aplicarMascara(vet, mascara);
    }   

    

    public static void mostrarInteiros(int[] vetor, String separador) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);  
            
           
            if (i < vetor.length - 1) {
                System.out.print(separador);
            }
        }
        System.out.println();   
    }

    public static void mostrarMaiores(int[] vetor, int valor) {
        System.out.print(" [");
        for (int i = 0; i < vetor.length; i++) {
            
            if(vetor[i] > valor){
                System.out.print(vetor[i]);
            }
            if(i < vetor.length -1){
                System.out.print(", ");
            }
                     
        }

        System.out.println("] ");
    }

    public static void mostrarMenores(int[] vetor, int valor) {
        System.out.print(" [");
        for (int i = 0; i < vetor.length; i++) {
            
            if(vetor[i] < valor){
                System.out.print(vetor[i]);
            }
            if(i < vetor.length -1){
                System.out.print(", ");
            }
                     
        }

        System.out.println("] ");
    }

    public static void mostrarLogicos(boolean x[]) {

        System.out.print("[");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);  
            
           
            if (i < x.length - 1) {
                System.out.print(", "); // Imprime o separador de acordo com a execução do for, quado imprimri o x[i], imprimi a " ,";
            }
        }
        System.out.println("]");
        
    }

    public static void aplicarElogico(boolean v[], boolean w[]){

        boolean[] x = new boolean[v.length]; 

        for (int i = 0; i < x.length; i++) {
            x[i] = v[i] && w[i]; 
        }
        mostrarLogicos(x);        
    }

    public static void aplicarOuLogico(boolean v[], boolean w[]){

        boolean[] x = new boolean[v.length]; 

        for (int i = 0; i < x.length; i++) {
            x[i] = v[i] || w[i]; 
        }
        mostrarLogicos(x);
    }


    public static void aplicarMascara (int v[], boolean mascara[]) {

        int [] saida;
        int c = 0;

        for (int i = 0; i < mascara.length; i++) {
            if(mascara[i] == true){
                c++;

            }

        }
        saida = new int[c];
        
        System.out.println("True: " + c);               

    }
}
