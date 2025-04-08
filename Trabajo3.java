import java.util.Scanner;

public class Trabajo3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        //Pantalla de impresión
        System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
        System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
        System.out.println("\nSamano Machado Alexis.");
        System.out.println("Solución de inserte aqui.");
        System.out.println("De 9:00 a 10:00 horas.");
        
        System.out.println("\n\t\t\t\t\t      Este programa ejecuta la solución de problemas");
        System.out.println("\t\t\t\t\t   utilizando los procesos logicos de Solución de sistemas");
        System.out.println("\t\t\t\t\t     de Ecuaciones utilizando diversos métodos numericos.");

        //Captura de datos por teclado del problema, valor real y unidad 
        System.out.print("\n\nPregunta del problema: ");
        String problema = scanner.nextLine();
        System.out.print("\nValor real del problema: ");
        double Vreal = scanner.nextDouble();
        System.out.print("\nUnidad del problema: ");
        String unidad = scanner.nextLine();

        //Captura de los valores por teclado del valor a, b y n
        System.out.print("\n\nEscribe el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("\nEscribe el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("\nEscribe el valor de n: ");
        int n = scanner.nextInt();

        //Captura de los valores por teclado del error y total de trapecios
        System.out.print("\n\nEscribe el valor del error del problema: ");
        double error = scanner.nextDouble();
        System.out.print("\nEscribe el total de trapecios: ");
        int Ttr = scanner.nextInt();
        System.out.print("\nEscribe el total de calculos maximo: ");
        int tc = scanner.nextInt();

        //Inicializacion de los valores copia de a, b y n
        double copiaA = a;
        double copiaB = b;
        int copiaN = n;
        int calculos = 1;
        double Dif=0;

        //Impresion del encabezado
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
        System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
        System.out.println("\nSamano Machado Alexis.");
        System.out.println("Metodos Numericos - Integracion Numerica.");
        System.out.println("Metodo de los trapecios.");
        System.out.println("De 9:00 a 10:00 horas.");
        System.out.println("\nPregunta: "+problema);

        System.out.println("_________________________________________________________________________");
        System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%-10s |%n", "No.Tr", "a", "a+h", "f(a)", "f(a+h)", "Area");
        System.out.println("-------------------------------------------------------------------------");

        do{
        //Procedimiento y calculos
        double h = (b-a)/n;
        double Suma = 0;

        for(int i=1; i==n; i++){
            double ah = a + h;
            /*double fa = formula de integracion con a */
            /*double fah = formula de integracion con a+h */
            /*double area = (h/2)*(fa + fah); */
            /*Suma = Suma + area; */
            
            System.out.printf("|%-10s |%-10.5f |%-10.5f |%-10.5f |%-10.5f |%-10.5f |", i, a, ah, fa, fah, area);
            a = ah;
        }
        Dif = Math.abs(Vreal - Suma);
    }while (Dif > error || calculos < tc);


        

    }
    
}
