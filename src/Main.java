import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Conversiones conversion = new Conversiones();

        while(n == 1){
            System.out.println("-- Presiona 1 para Usar conversor de Monedas: ");
            System.out.println("-- Presione 0 para salir! ...");
            n = lectura.nextInt();
            lectura.nextLine();
            if (n == 1){
                System.out.println("Escribe la moneda que quieres convertir (ejemplo: USD): ");
                var base1 = lectura.nextLine();
                System.out.println("Escribe hacia la moneda que quieres convertir (ejemplo: PEN): ");
                var target1 = lectura.nextLine();
                Moneda moneda = consulta.conversorMoneda(base1,target1);
                System.out.println("ingrese la cantidad de " + moneda.base_code() + " que quieres converitir a "+
                        moneda.target_code()+": ");
                double cantidad = lectura.nextDouble();
                double resultado = conversion.conversor(moneda.conversion_rate(),cantidad);
                System.out.println(cantidad + " "+moneda.base_code()+" = " +resultado + " "+ moneda.target_code());
            }

        }



    }
}