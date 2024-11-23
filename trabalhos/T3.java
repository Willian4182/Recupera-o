package trabalhos;

public class T3 {

    //EXECUTAR O MAKE "     make -f T3.mk "


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

    public static void mostrarInteiros(int[] vetor, char separador) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);  
            
           
            if (i < vetor.length - 1) {
                System.out.print(separador);
            }
        }
        System.out.println();   
    }

    public static int[] filtrarMaiores(int[] vetor, int valor) {

        int maiores[];
        int cont = 0;
        int x = 0;


    
        for (int i = 0; i < vetor.length; i++) {
            
            if(vetor[i] > valor){
                cont ++;                         
            }  

        }

        maiores = new int[cont];

        for (int i = 0; i < vetor.length; i++) {
            
            if(vetor[i] > valor){
                maiores[x] = vetor[i];
                x++;                       
            }                     
        }

        return maiores;


    } 

    public static int[] filtrarMenores(int[] vetor, int valor) {

        int menores[];
        int cont = 0;
        int x = 0;


    
        for (int i = 0; i < vetor.length; i++) {
            
            if(vetor[i] < valor){
                cont ++;                         
            }  

        }

        menores = new int[cont];

        for (int i = 0; i < vetor.length; i++) {
            
            if(vetor[i] < valor){
                menores[x] = vetor[i];
                x++;                       
            }                     
        }

        return menores;


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

    public static boolean[] aplicarElogico(boolean v[], boolean w[]){

        boolean[] x = new boolean[v.length]; 

        for (int i = 0; i < x.length; i++) {
            x[i] = v[i] && w[i]; 
        }
        return x;
    
    }

    public static boolean[] aplicarOuLogico(boolean v[], boolean w[]){

        boolean[] x = new boolean[v.length]; 

        for (int i = 0; i < x.length; i++) {
            x[i] = v[i] || w[i]; 
        }
        return x;
    }


    public static int[] aplicarMascara (int v[], boolean mascara[]) {

        int [] saida;
        int c = 0;
        int x = 0;

        for (int i = 0; i < mascara.length; i++) {
            if(mascara[i] == true){
                c++;

            }

        }
        saida = new int[c];

        for (int i = 0; i < mascara.length; i++) {
            if(mascara[i] == true){
                saida[x] = v[i];
                x++;
            }
        }

        return saida;             
    }

    public static int[] uniao( int[] a, int[] b ) {

        int[] u = new int[a.length + b.length];

        if (u.length == 0) {
            return u;
        }

        int[] vetorComElemUnicos;

        int indiceb = 0;
        int contElemUnicos = 0;
        
        for (int i = 0; i < a.length; i++) {
            u[i] = a[i];           
        }
        
        for (int i = a.length; i < u.length; i++) {
            u[i] = b[indiceb];
            indiceb++;
        }  



        for (int i = 0; i < u.length; i++) {
            int elemAtual = u[i];
            boolean existe = false;

            for (int j = i+1; j < u.length; j++) {
                if (u[j] == elemAtual) {
                    existe = true;
                    break;
                }
            }

            if (existe == false) {
                contElemUnicos++;
            }
        }

        vetorComElemUnicos = new int[contElemUnicos];
        int indiceVetorUnico = 0;


        for (int i = 0; i < u.length; i++) {
            int elemAtual = u[i];
            boolean existe = false;

            for (int j = i+1; j < u.length; j++) {
                if (u[j] == elemAtual) {
                    existe = true;
                    break;
                }
            }

            if (existe == false) {
                vetorComElemUnicos[indiceVetorUnico] = u[i];
                indiceVetorUnico++;
            }
        }

    
        return vetorComElemUnicos;
    }


}
