package academy.Exception.runtime;

import javax.swing.table.TableRowSorter;

public class runtimeExceptionTeste02 {
    public static void main(String[] args) {
            divisao(1, 0);

        System.out.println("Codigo finalzado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao (int a, int b){
        if( b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;

    }
}
