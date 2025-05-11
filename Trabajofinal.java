import java.util.Scanner;

public class Trabajofinal {
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

        //Captura de problema, Vreal, a, b, Unidad
        System.out.println("Pregunta del problema: ");
        String pregunta = scanner.nextLine();
        System.out.println("Valor real del problema: ");
        double Vreal = scanner.nextDouble();
        System.out.println("Valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Unidad del problema: ");
        String unidad = scanner.nextLine();

        do{
            //Menu de selección
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");            
            System.out.println("\n\n\t\t\t\t\t\tMétodo Reglas de Simpson");
            System.out.println("\n1.- Regla 1 n=2");
            System.out.println("2.- Regla 2 n=3");
            System.out.println("3.- Regla 3 n>2 y n=par");
            System.out.println("4.- Regla 4 n>3 y n=impar");
            System.out.println("0.- F I N");
            System.out.print(" \n\nCual es tu opción?: ");
            op = scanner.nextInt();
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

            switch(op){

                case 1: 
                    double n = 2;
                    System.out.println("Simpson de 1/3 formula simple")
                    // Encabezado
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
                    System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
                    System.out.println("\nSamano Machado Alexis.");
                    System.out.println("Integración Numerica - Método de Simpson");
                    System.out.println("De 9:00 a 10:00 horas.");
                    System.out.println("\nPregunta: " + problema);
                    System.out.println("_________________________________________________________________________");
                    System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%n", "Pxy", "x", "f(x)", "Factor", "Area");
                    System.out.println("-------------------------------------------------------------------------");

                    //Calculos y logica
                    double h = (b-a)/n;
                    fa = 0.03(a*a) + 1.5;
                    x1 = a+h;
                    fx1 = 0.03(x1*x1) + 1.5;
                    fb = 0.03(b*b) + 1.5;
                    Vcalc = ((1*h)/3)*(fa+(4*fx1)+fb);
                    Error = abs(Vreal-Vcalc);

                    //impresion de datos
                    System.out.printf("|%-10d |%-10.5f |%-10.5f |%-10.5f |%-10.5f |\n", 1, a, fa, 1, 1*fa);
                    System.out.printf("|%-10d |%-10.5f |%-10.5f |%-10.5f |%-10.5f |\n", 2, x1, fx1, 4, 4*fx1);
                    System.out.printf("|%-10d |%-10.5f |%-10.5f |%-10.5f |%-10.5f |\n", 3, b, fb, 1, 1*fb);
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("No. de Divisiones = "+ n);
                    System.out.println("Valor Real de la Integral = " + Vreal + " " + unidad);
                    System.out.println("Valor por el Método = "+ Vcalc + " " + unidad);
                    System.out.println("Error del Método = "+ Error + " " + unidad);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default: System.out.println("Opcion no valida, vuelva a ingresar."); break;
            }
        }while (op != 0);
        
    }
    
}