import java.util.Scanner;

public class Practica5 {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        //Encabezado
        System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
        System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
        System.out.println("\nSamano Machado Alexis.");
        System.out.println("Solución de integración numérica.");
        System.out.println("De 9:00 a 10:00 horas.");
        
        System.out.println("\n\t\t\t\t\t      Este programa ejecuta la solución de problemas");
        System.out.println("\t\t\t\t\t   utilizando los procesos lógicos de Solución de sistemas");
        System.out.println("\t\t\t\t\t     de Ecuaciones utilizando diversos métodos numéricos.");

        //Captura de datos
        System.out.print("\n\nPregunta del problema: ");
        String problema = scanner.nextLine();
        System.out.print("\nValor real del problema: ");
        double Vreal = scanner.nextDouble();
        scanner.nextLine();  
        System.out.print("Unidad del problema: ");
        String unidad = scanner.nextLine();

        System.out.print("\n\nEscribe el valor de a: ");
        double a_orig = scanner.nextDouble();
        System.out.print("Escribe el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Escribe la cantidad de trapecios iniciales: ");
        int n = scanner.nextInt();
        int n_inicial = n;  

        System.out.print("\n\nEscribe el valor del error del problema: ");
        double error = scanner.nextDouble();
        System.out.print("Escribe el total de cálculos máximo: ");
        int tc = scanner.nextInt();

        

        //Variables de calculo
        double errortrap = 0;
        int calculos = 0;
        double suma = 0;
        int trapfin = 0;

        // Calculo de integracion
        do {
            // Encabezado
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
            System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
            System.out.println("\nSamano Machado Alexis.");
            System.out.println("Métodos Numéricos - Integración Numérica.");
            System.out.println("Método de los trapecios.");
            System.out.println("De 9:00 a 10:00 horas.");
            System.out.println("\nPregunta: " + problema);
            System.out.println("_________________________________________________________________________");
            System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%-10s |%n", "No.", "a", "a+h", "f(a)", "f(a+h)", "Area");
            System.out.println("-------------------------------------------------------------------------");

            double a = a_orig;
            double h = (b - a) / n;
            suma = 0;

            for (int i = 1; i <= n; i++) {
                double ah = a + h;
                double fa = 40 + (8 * Math.sqrt(a));
                double fah = 40 + (8 * Math.sqrt(ah));
                double area = (h / 2) * (fa + fah);
                suma += area;

                System.out.printf("|%-10d |%-10.5f |%-10.5f |%-10.5f |%-10.5f |%-10.5f |\n", i, a, ah, fa, fah, area);
                a = ah;
            }

            System.out.println("-------------------------------------------------------------------------");
            errortrap = Math.abs(Vreal - suma);
            trapfin = n;
            calculos++;
            n *= 2;

        } while (errortrap > error && calculos < tc);

        if (errortrap > error) {
            System.out.println("No se encontro la mejor aproximacion.");
        } else {
        System.out.println("\nResultados:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Número inicial de trapecios= " + n_inicial);
        System.out.println("Número final de trapecios= " + trapfin);
        System.out.println("No. de procesos= " + calculos);
        System.out.println("Valor Real de la Integral= " + Vreal + " " + unidad);
        System.out.println("Valor calculado por trapecios= " + suma + " " + unidad);
        System.out.println("Error del problema= " + error + " " + unidad);
        System.out.print("Error del Método= ");
        System.out.printf("%.5f", errortrap );
        System.out.println(" " + unidad);
        }

        

        
    }
}
