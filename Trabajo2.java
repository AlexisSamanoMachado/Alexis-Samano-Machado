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
        String problema = scanner.next();
        System.out.print("\nOrden del Problema: ");
        int orden = scanner.nextInt();

        //Ciclo de entradas de conceptos y unidades en base al orden
        for (int i=1;i<=orden;i++){
            System.out.print("\nConcepto No."+i+" del Problema: ");
            String concepto = scanner.next();
            System.out.print("\nUnidad No."+i+" del Problema: ");
            String unidad = scanner.next();
        }

        int op = 0;
        do{

            double[][] MatrizA = new double[orden][orden+1];
            double Piv=0;
            double Ecero=0;
            double factor=0;

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

                //Captura de valores de la matriz con respecto al orden
                for(int f=1;f<orden;f++)
                {
                   for(int c=1;c<orden+1;c++)
                   {
                    System.out.println("Ingresa el valor de x"+(c)+" para X"+(f)+": ");
                    MatrizA[f][c] = scanner.nextDouble();
                   }
                   System.out.println("Ingresa el valor del resultado de X"+(f)+":");

                }

                //Proceso para hacer ceros abajo de la diagonal principal
                for (int k=1;k<=orden-1;k++){
                    Piv= MatrizA[k][k];
                    for(int f=k+1;f<=orden;f++){
                        Ecero=MatrizA[f][k];
                        for(int c=k;c<=orden+1;c++){
                            MatrizA[f][c]=(Piv*MatrizA[f][c])-(Ecero*MatrizA[f][c]);
                        }
                    }
                }

                //Proceso para hacer arriba de la diagonal principal
                for(int k=orden;k<=2;k++){
                    Piv=MatrizA[k][k];
                    for(int f=1;f<=k-1;f++){
                        factor = MatrizA[f][k]/Piv;
                        for(int c=k;c<=orden+1;c++){
                            MatrizA[f][c] = MatrizA[f][c] - (factor*MatrizA[k][c]);
                        }
                    }
                }

                //Generar matriz unitaria
                for (int f=1;f<=orden;f++){
                    MatrizA[f][orden+1] = MatrizA[f][orden+1]/MatrizA[f][f];
                    MatrizA[f][f]=MatrizA[f][f]/MatrizA[f][f];
                }

                //Impresion de matriz



                break;

                //-------Metodo de Gauss Seiden-------
                case 2: 
                break;
            }

        }while(op != 10 );

    }
}