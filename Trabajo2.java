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
        
        // Entrada de problema y orden
        System.out.print("\nPregunta del Problema: ");
        String problema = scanner.nextLine();
        int orden=0;
        do {
            System.out.println("Orden del Problema (2 a 10): ");
            orden = scanner.nextInt();
            if (orden<2 || orden>10)
            System.out.println("Margen de orden fuera de rango, favor de volver a escribir");
        } while (orden<2 || orden>10);
        
        scanner.nextLine(); // Consumir el salto de línea pendiente

        // Creación de matrices para conceptos y unidades
        String Concepto[] = new String[orden];
        String Unidad[] = new String[orden];

        // Ciclo de entradas de conceptos y unidades en base al orden
        for (int i = 0; i < orden; i++) {
            System.out.println("Concepto No." + (i + 1) + " del Problema: ");
            Concepto[i] = scanner.nextLine();
            System.out.println("Unidad No." + (i + 1) + " del Problema: ");
            Unidad[i] = scanner.nextLine();
        }

        int op = 0;
        do{

            double[][] MatrizA = new double[orden][orden+1];
            double[] Vact = new double[orden];
            double[] Vant = new double[orden];
            double ErrorTotal=0, Suma = 0, Coef = 0;
            int Error=0,TC=0, nc=0;
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
                //Captura de datos de la matriz 
                for (int f=0; f<orden; f++){
                    for (int c = 0; c < orden+1; c++) {
                        if(c<orden){
                            System.out.print(" Ingresa el valor de x"+(c+1)+" en X"+(f+1)+":");
                            MatrizA[f][c] = scanner.nextDouble();
                        } else if (c==orden){
                            System.out.print(" Ingresa el resultado en X"+(f+1)+":");
                            MatrizA[f][c] = scanner.nextDouble();
                        }
                        
                    }
                }
                //Encabezado de la impresion
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
                System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
                System.out.println("\nSamano Machado Alexis.");
                System.out.println("Solucion de Sistemas de Ecuaciones.");
                System.out.println("De 9:00 a 10:00 horas.");
                System.out.println("\nPregunta: "+problema);

                //Primera impresion (Matriz de datos)
                System.out.println("\nMatriz de datos");
                System.out.println("--------------------------------------------------------------------------------------------------");
                for (int i = 0; i < orden; i++) {
                    for (int j = 0; j < orden+1; j++) {
                        System.out.printf("%-16.1f", MatrizA[i][j]);
                    }
                System.out.println();
                }
                System.out.println("--------------------------------------------------------------------------------------------------\n");

                // Proceso de hacer ceros abajo de la diagonal principal
                for (int k = 0; k < orden-1; k++) {         
                    Piv = MatrizA[k][k];
                    for (int f = k+1; f < orden; f++) {
                        Ecero = MatrizA[f][k];
                        for (int c = k; c < orden+1; c++) {
                            MatrizA[f][c] = (Piv*MatrizA[f][c]) - (Ecero*MatrizA[k][c]);
                        }
                    }
                }
                //Segunda impresion (Matriz ceros abajo de la diagonal)
                System.out.println("Matriz ceros abajo de la diagonal");
                System.out.println("--------------------------------------------------------------------------------------------------");
                for (int i = 0; i < orden; i++) {
                    for (int j = 0; j < orden+1; j++) {
                        System.out.printf("%-16.1f", MatrizA[i][j]);
                    }
                System.out.println();
                }
                System.out.println("--------------------------------------------------------------------------------------------------\n");


                // Proceso de hacer ceros arriba de la diagonal principal
                for (int k = orden-1; k > 0; k--) {         
                    Piv = MatrizA[k][k];
                    for (int f = 0; f < k; f++) {
                        factor = MatrizA[f][k] / Piv;
                        for (int c = k; c < orden+1; c++) {
                            MatrizA[f][c] = MatrizA[f][c] - (factor*MatrizA[k][c]);
                        }
                        MatrizA[f][k] = 0;
                    }
                }   

                //Tercera impresion (matriz ceros abajo y arriba de la diagonal)
                System.out.println("Matriz ceros abajo y arriba de la diagonal");
                System.out.println("--------------------------------------------------------------------------------------------------");
                for (int i = 0; i < orden; i++) {
                    for (int j = 0; j < orden+1; j++) {
                        System.out.printf("%-16.1f", MatrizA[i][j]);
                    }
                System.out.println();
                }
                System.out.println("--------------------------------------------------------------------------------------------------\n");
                
                // Generar matriz unitaria
                for (int f = 0; f < orden; f++) {           
                    MatrizA[f][orden] = MatrizA[f][orden] / MatrizA[f][f];
                    MatrizA[f][f] = MatrizA[f][f] / MatrizA[f][f];
                }
                
                //Ultima impresion (Matriz identidad)
                System.out.println("Matriz Identidad:");
                System.out.println("--------------------------------------------------------------------------------------------------");
                for (int i = 0; i < orden; i++) {
                    for (int j = 0; j < orden+1; j++) {
                        System.out.printf("%-16.1f", MatrizA[i][j]);
                    }
                System.out.println();
                }
                System.out.println("--------------------------------------------------------------------------------------------------\n");

                System.out.println("Resultados:\n");
                for (int i = 0; i < orden; i++) {
                    System.out.println(Concepto[i]+" = "+MatrizA[i][orden]+" "+Unidad[i]);
                }

                break;
            

                //-------Metodo de Gauss Seiden-------
                case 2: 
                System.out.println("Captura los Valores Iniciales del problema:");
                for (int f=0;f<orden;f++){
                    System.out.println(Concepto[f]);
                    System.out.println("Ingresa el valor anterior de x"+(f+1)+": ");
                    Vant[f]=scanner.nextDouble();
                    Vact[f]=0;
                }
                System.out.println("Como es un metodo de aproximaciones debe capturar el Error y cuantos calculos desea realizar:");
                System.out.println("Ingresa el valor del error: ");
                Error= scanner.nextInt();
                System.out.println("Ingresa la cantidad de calculos maxima: ");
                TC= scanner.nextInt();

                System.out.println("Captura de los datos de la matriz: ");
                //Captura de datos de la matriz 
                for (int f=0; f<orden; f++){
                    for (int c = 0; c < orden+1; c++) {
                        if(c<orden){
                            System.out.print(" Ingresa el valor de x"+(c+1)+" en X"+(f+1)+":");
                            MatrizA[f][c] = scanner.nextDouble();
                        } else if (c==orden){
                            System.out.print(" Ingresa el resultado en X"+(f+1)+":");
                            MatrizA[f][c] = scanner.nextDouble();
                        }
                        
                    }
                }
                //Encabezado de la impresion
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
                System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
                System.out.println("\nSamano Machado Alexis.");
                System.out.println("Solucion de Sistemas de Ecuaciones.");
                System.out.println("Metodo de Gauss Seidel");
                System.out.println("De 9:00 a 10:00 horas.");
                System.out.println("\nPregunta: "+problema);

                System.out.println("_________________________________________________________________________");
                System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%-10s |%n", "No.", "X1", "X2", "X3", "X4", "ErrorTotal");
                System.out.println("-------------------------------------------------------------------------");
                System.out.printf("|%-10s |", "0");
                for (int f = 0; f < orden; f++) {            
                    System.out.printf("%-10.5f |", Vant[f]);
                }
                System.out.printf("%-10.5f |", ErrorTotal);
                System.out.println("\n-------------------------------------------------------------------------");
                
                nc=0; ErrorTotal=0;

                //Calculo de Gauss Seidel
                do{
                    for (int f = 0; f < orden; f++) {
                        Suma = 0;
                        Coef = MatrizA[f][f];
                        Suma = Suma + MatrizA[f][orden];
                        for (int c = 0; c < orden; c++) {
                            if (f == c) {
                                
                            } else if (c<f) {
                                Suma = Suma + ( (MatrizA[f][c] * -1.0) * Vact[c] );
                            } else {
                                Suma = Suma + ( (MatrizA[f][c] * -1.0) * Vant[c] );
                            }
                        }
                        Suma = Suma / Coef;
                        Vact[f] = Suma;
                    }
    
    
                    ErrorTotal = 0;
                    for (int p = 0; p < orden; p++) {
                        ErrorTotal = ErrorTotal+Math.abs(Math.abs(Vact[p])-Math.abs(Vant[p]));               
                    }

                    nc = nc + 1;
                    //Impresion de nuevos valores de la tabla
                    System.out.printf("|%-10s |", nc);
                    for (int p = 0; p < orden; p++) {
                        System.out.printf("%-10.5f |", Vact[p]);
                        Vant[p] = Vact[p];
                    }
                    System.out.printf("%-10.5f |", ErrorTotal);
                    System.out.println("\n-------------------------------------------------------------------------");

        
                }while(ErrorTotal>Error && nc<=TC);

                if(ErrorTotal<=Error)
                {
                    System.out.println("Resultados: ");
                    for (int p=0;p<orden;p++){
                        System.out.printf("%-15s %-10.5f %-10s", Concepto[p]+"= ", Vact[p], Unidad[p]);
                        System.out.println();
                    }
                    
                }
                else 
                System.out.println("El proceso supero el numero maximo de calculos  no encontro la mejor aproximacion");
            }

        }while(op != 10 );
}}