package practica1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica1 {
    public static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese el valor de x: ");
        int x;
        entrada = bufer.readLine();
        x = Integer.parseInt(entrada);
        
        System.out.println("Ingrese el valor de y: ");
        int y;
        entrada = bufer.readLine();
        y = Integer.parseInt(entrada);
        
        System.out.println("Ingrese el valor de z: ");
        int z;
        entrada = bufer.readLine();
        z = Integer.parseInt(entrada);

        int resultado = sumaCuadrados(x, y, z);
        System.out.println("La suma de los números elevados al cuadrado es: " + resultado);
    }
 // public static int sumaCuadrados(int y, int z. Es la función recursiva que calcula la suma de los números elevados al cuadrado
    public static int sumaCuadrados(int x, int y, int z) {
        if (x > z) {
            return 0;
        } else {
            int cuadradoActual= y * y;
            return cuadradoActual + sumaCuadrados(x + 1, y, z);
 }
}
}