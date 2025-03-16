import java.util.Scanner;

public class Trabajo2{

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        //Pantalla de inicio
        System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
        System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
        System.out.println("\nSamano Machado Alexis.");
        System.out.println("Solución de Ecuaciones.");
        System.out.println("De 9:00 a 10:00 horas.");
        
        System.out.println("\n\t\t\t\t\t      Este programa ejecuta la solución de problemas");
        System.out.println("\t\t\t\t\t   utilizando los procesos logicos de Solución de sistemas");
        System.out.println("\t\t\t\t\t     de Ecuaciones utilizando diversos métodos numericos.");      
        
        //Entrada de problema y orden
        System.out.print("\nPregunta del Problema: ");
        String problema = scanner.nextLine();
        System.out.print("\nOrden del Problema: ");
        Int orden = scanner.nextInt();

        //Ciclo de entradas de conceptos y unidades en base al orden
        for (int i=1;i<=orden;i++){
            System.out.print("\nConcepto No."+i+" del Problema: ");
            String concepto = scanner.nextLine();
            System.out.print("\nUnidad No."+i+" del Problema: ");
            String unidad = scanner.nextLine();
        }

        


        int op = 0;
        do{
            //Menu de selección
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");            
            System.out.println("\n\n\t\t\t\t\t\tSolución de Ecuaciones");
            System.out.println("\n1.- Método de Gauss Jordan");
            System.out.println("2.- Método de Gauss Seidel");
            System.out.println("10.- F I N");
            System.out.print(" \n\nCual es tu opción?: ");
            op = scanner.nextInt();
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");


            switch (op) {

                //-------Metodo de Gauss Jordan---------
                case 1:       
                break;

                //-------Metodo de Gauss Seiden-------
                case 2: 
                break;
            }

        }while(op != 10 );

    }
}