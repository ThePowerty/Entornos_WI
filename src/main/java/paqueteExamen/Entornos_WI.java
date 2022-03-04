package paqueteExamen;

public class Entornos_WI {

    public static void main(String[] args) {

    }

    //Este es un método de ordenacion de una matriz de numeros enteros.
    /*
    El metodo original es este:
    public static void unMetodoSospechoso(int[] estoDebeSerUnaMatriz) {
        int aquiUnaVariable, vayaOtraVariable, aquiUnosAmigos;
        for (aquiUnaVariable = 0; aquiUnaVariable < estoDebeSerUnaMatriz.length - 1; aquiUnaVariable++) {
            for (vayaOtraVariable = 0; vayaOtraVariable < estoDebeSerUnaMatriz.length - aquiUnaVariable - 2; vayaOtraVariable++) {
                if (estoDebeSerUnaMatriz[vayaOtraVariable + 1] < estoDebeSerUnaMatriz[j]) {
                    aquiUnosAmigos = estoDebeSerUnaMatriz[vayaOtraVariable + 1];
                    estoDebeSerUnaMatriz[vayaOtraVariable + 1] = estoDebeSerUnaMatriz[vayaOtraVariable];
                    estoDebeSerUnaMatriz[vayaOtraVariable] = aquiUnosAmigos;
                }
            }
        }
    }
    Le aplicamos refactorización para al final dar con esto: 
    Le refactorizamos el nombre al método para que se vea más claro lo que hace
     */
    public static void ordenaArray(int[] arrayEnteros) { //Cambiamos "estoDebeSerUnaMatriz" por "arrayEnteros" para tener una idea mas clara de lo que se pasa como parámetro al método.
        //Primero cambiamos de nombre a las variables para que sean mas claras.
        int aux;//Eliminamos la declaración de dos variables que se usan como iteradores en los for y las declaramos dentro, puesto que esta es la manera estandar de hacerlo. Ademas "aquiUnosAmigos" pasa a llamrse "aux".
        //Se refactorizan los for para que recorran toda la dimensión del array.
        for (int i = 0; i < arrayEnteros.length; i++) {//La variable "aquiUnaVariable" pasara a llamarse "i".
            for (int j = 0; j < arrayEnteros.length - 1; j++) {//La variable "vayaOtraVariable" pasará a llamarse "j".
                if (arrayEnteros[j + 1] < arrayEnteros[j]) {
                    aux = arrayEnteros[j + 1];
                    arrayEnteros[j + 1] = arrayEnteros[j];
                    arrayEnteros[j] = aux;
                }
            }
        }
    }

}
