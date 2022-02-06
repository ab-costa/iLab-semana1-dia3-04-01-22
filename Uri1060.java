import java.util.Scanner;

public class Uri1060 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float n;
        int contador;

        contador = 0;

        for(int i = 0; i < 6; i++) {
            n = teclado.nextFloat();

            if(n > 0) {
                contador++;
            }
        }

        System.out.println(contador + " valores positivos");

        teclado.close();
    }
}