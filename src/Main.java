import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        //Command para pedir texto en console

        System.out.print("Hola por favor escribe un número y te diremos si es par o impar: ");
        String strNumero = br.readLine();
        Integer numero = Integer.parseInt(strNumero);

        Boolean esPar = (numero % 2)== 0;

        if (esPar) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        }
}