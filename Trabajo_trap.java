import java.util.Scanner;

public class Trabajo_trap {

    public static void main (String[] args){

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

        //Captura de los valores por teclado del valor a, b y trapecios iniciales (n)
        System.out.print("\n\nEscribe el valor de a: ");
        double a_orig = scanner.nextDouble();
        System.out.print("\nEscribe el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("\nEscribe la cantidad de trapecios iniciales: ");
        int n = scanner.nextInt();

        //Captura de los valores por teclado del error y total de calculos
        System.out.print("\n\nEscribe el valor del error del problema: ");
        double error = scanner.nextDouble();
        System.out.print("\nEscribe el total de calculos maximo: ");
        int tc = scanner.nextInt();

        
        //Impresion del encabezado
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
        System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
        System.out.println("\nSamano Machado Alexis.");
        System.out.println("Metodos Numericos - Integracion Numerica.");
        System.out.println("Metodo de los trapecios.");
        System.out.println("De 9:00 a 10:00 horas.");
        System.out.println("\nPregunta: " + problema);

        

        //Inicializacion de variables dentro del ciclo for y while
        double errortrap = 0;
        int calculos = 0;
        double suma = 0;
        double a = 0;
        double trapfin = 0;

        //Proceso de calculo
        do{
            System.out.println("Cantidad de trapecios a usar: " + n);

            System.out.println("_________________________________________________________________________");
            System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%-10s |%n", "No.Tr", "a", "a+h", "f(a)", "f(a+h)", "Area");
            System.out.println("-------------------------------------------------------------------------");

            a = a_orig;
            double h = (b-a)/n;
            suma = 0;

            for(int i=1; i<=n; i++){
                //calculo de a+h, f(a), f(a+h), area del trapecio actual y suma (area total de la figura)
                double ah = a + h;
                double fa = 40 + (8*Math.sqrt(a));
                double fah = 40 + (8*Math.sqrt(ah));
                double area = (h/2)*(fa + fah); 
                suma = suma + area; 
            
                //impresion de datos del trapecio actual
                System.out.printf("|%-10s |%-10.5f |%-10.5f |%-10.5f |%-10.5f |%-10.5f |\n", i, a, ah, fa, fah, area);
                
                a = ah;
        }
        System.out.println("-------------------------------------------------------------------------");
        errortrap = Math.abs(Vreal - suma);
        n = n*2;
        trapfin = n;
        calculos ++;

        }while (errortrap > error && calculos <= tc);

        //Impresion de datos en caso que el error de trapecios haya sido menor o igual que el error del problema
        if (errortrap <= error){
            System.out.println("Resultados: ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Numero inicial de trapecios= " + n);
                System.out.println("Numero final de trapecios= " + trapfin);
                System.out.println("No. de procesos= " + calculos);
                System.out.println("Valor Real de la Integral= " + Vreal + " " + unidad);
                System.out.println("Valor calculado por trapecios= " + suma + " " + unidad);
                System.out.println("Error del problema= " + error);
                System.out.println("Error del Método= " + errortrap);
        }else{
            System.out.println("No se encontro la mejor aproximacion.");
        }
    }

    
}
