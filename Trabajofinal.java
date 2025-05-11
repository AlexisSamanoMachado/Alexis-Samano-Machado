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
        String problema = scanner.nextLine();
        System.out.println("Valor real del problema: ");
        double Vreal = scanner.nextDouble();
        System.out.println("Valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Valor de b: ");
        double b = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Unidad del problema: ");
        String unidad = scanner.nextLine();

        //Inicializacion de variables a utilizar en el programa
        double h, fa, x1, x2, fx1, fx2, fb, Vcalc, Error,  pto, fpto, valor, Pos, Res;
        int n, factor;
        do{
            //Menu de selección
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");            
            System.out.println("\n\n\t\t\t\t\t\tMétodo Reglas de Simpson");
            System.out.println("\nRegla 1 n=2");
            System.out.println("Regla 2 n=3");
            System.out.println("Regla 3 n>2 y n=par");
            System.out.println("Regla 4 n>3 y n=impar");
            System.out.println("F I N. n=0");
            System.out.print(" \n\nCual es el número de Divisiones?: ");
            n = scanner.nextInt();
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

            if (n==2){
                    //---REGLA 1---
                    System.out.println("Simpson de 1/3 formula simple");
                    // Encabezado
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
                    System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
                    System.out.println("\nSamano Machado Alexis.");
                    System.out.println("Integración Numerica - Método de Simpson");
                    System.out.println("De 9:00 a 10:00 horas.");
                    System.out.println("\nPregunta: " + problema);
                    System.out.println("_____________________________________________________________");
                    System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%n", "Pxy", "x", "f(x)", "Factor", "Area");
                    System.out.println("-------------------------------------------------------------");

                    //Calculos y logica
                    h = (b-a)/n;
                    fa = 0.03*(a*a) + 1.5;
                    x1 = a+h;
                    fx1 = 0.03*(x1*x1) + 1.5;
                    fb = 0.03*(b*b) + 1.5;
                    Vcalc = ((1*h)/3)*(fa+(4*fx1)+fb);
                    Error = Math.abs(Vreal-Vcalc);

                    //impresion de datos
                    System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", 1, a, fa, 1, 1*fa);
                    System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", 2, x1, fx1, 4, 4*fx1);
                    System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", 3, b, fb, 1, 1*fb);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("No. de Divisiones = "+ n);
                    System.out.println("Valor Real de la Integral = " + Vreal + " " + unidad);
                    System.out.println("Valor por el Método = "+ Vcalc + " " + unidad);
                    System.out.println("Error del Método = "+ Error + " " + unidad);
            }

            if (n==3){
                    //---REGLA 2---
                    System.out.println("Simpson de 3/8 formula simple");
                    // Encabezado
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
                    System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
                    System.out.println("\nSamano Machado Alexis.");
                    System.out.println("Integración Numerica - Método de Simpson");
                    System.out.println("De 9:00 a 10:00 horas.");
                    System.out.println("\nPregunta: " + problema);
                    System.out.println("_____________________________________________________________");
                    System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%n", "Pxy", "x", "f(x)", "Factor", "Area");
                    System.out.println("-------------------------------------------------------------");
                    //Calculos y logica
                    h = (b-a)/n;
                    fa = 0.03*(a*a) + 1.5;
                    x1 = a+(1*h);
                    x2 = a+(2*h);
                    fx1 = 0.03*(x1*x1) + 1.5;
                    fx2 = 0.03*(x2*x2) + 1.5;
                    fb = 0.03*(b*b) + 1.5;
                    Vcalc = ((3*h)/8)*(fa+(3*fx1)+(3*fx2)+fb);
                    Error = Math.abs(Vreal-Vcalc);

                    //impresion de datos
                    System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", 1, a, fa, 1, 1*fa);
                    System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", 2, x1, fx1, 3, 3*fx1);
                    System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", 3, x2, fx2, 3, 3*fx2);
                    System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", 4, b, fb, 1, 1*fb);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("No. de Divisiones = "+ n);
                    System.out.println("Valor Real de la Integral = " + Vreal + " " + unidad);
                    System.out.println("Valor por el Método = "+ Vcalc + " " + unidad);
                    System.out.println("Error del Método = "+ Error + " " + unidad);
            }

            if (n>2 && n % 2 == 0){
                    //---REGLA 3---
                    System.out.println("Simpson de 1/3 formula compleja");
                    // Encabezado
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
                    System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
                    System.out.println("\nSamano Machado Alexis.");
                    System.out.println("Integración Numerica - Método de Simpson");
                    System.out.println("De 9:00 a 10:00 horas.");
                    System.out.println("\nPregunta: " + problema);
                    System.out.println("_____________________________________________________________");
                    System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%n", "Pxy", "x", "f(x)", "Factor", "Area");
                    System.out.println("-------------------------------------------------------------");

                    //Calculos y logica
                    Vcalc=0;
                    h = (b-a)/n;
                    double ca = a;
                    double cb = b;

                    for (int x=1;x <= n+1; x++){
                        if (x==1){
                            factor = 1;
                            pto = ca;
                            fpto = 0.03*(pto*pto) + 1.5;
                            valor = factor*fpto;
                            Vcalc = Vcalc + valor;
                            System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);

                        }
                        if (x==n+1){
                            factor = 1;
                            pto = cb;
                            fpto = 0.03*(pto*pto) + 1.5;
                            valor = factor*fpto;
                            Vcalc = Vcalc + valor;
                            System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);
                        }
                        if (x>1 && x<n+1){
                            Pos=x-1;
                            Res=(x%2);
                            if (Res == 0){
                                factor = 4;
                                pto = ca + (Pos*h);
                                fpto = 0.03*(pto*pto) + 1.5;
                                valor = factor*fpto;
                                Vcalc = Vcalc + valor;
                                System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);
                            } else {
                                factor = 2;
                                pto = ca + (Pos*h);
                                fpto = 0.03*(pto*pto) + 1.5;
                                valor = factor*fpto;
                                Vcalc = Vcalc + valor;
                                System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);

                            }
                        }                
                    }
                    Vcalc = (1*h/3)*Vcalc;
                    Error = Math.abs(Vreal - Vcalc);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("No. de Divisiones = "+ n);
                    System.out.println("Valor Real de la Integral = " + Vreal + " " + unidad);
                    System.out.println("Valor por el Método = "+ Vcalc + " " + unidad);
                    System.out.println("Error del Método = "+ Error + " " + unidad);
                    
            }
            
            if (n>3 && n % 2 != 0){
                //---REGLA 3---
                    System.out.println("Simpson de 3/8 formula compleja");
                    // Encabezado
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n\n\t\t\t\t\t\tInstituto Tecnológico de Culiacán");
                    System.out.println("\t\t\t\t\t\tIng. En Sistemas computacionales");
                    System.out.println("\nSamano Machado Alexis.");
                    System.out.println("Integración Numerica - Método de Simpson");
                    System.out.println("De 9:00 a 10:00 horas.");
                    System.out.println("\nPregunta: " + problema);
                    System.out.println("_____________________________________________________________");
                    System.out.printf("|%-10s |%-10s |%-10s |%-10s |%-10s |%n", "Pxy", "x", "f(x)", "Factor", "Area");
                    System.out.println("-------------------------------------------------------------");

                    //Calculos y logica
                    Vcalc=0;
                    h = (b-a)/n;
                    double ca = a;
                    double cb = b;

                    for (int x=1;x <= n+1; x++){
                        if (x==1){
                            factor = 1;
                            pto = ca;
                            fpto = 0.03*(pto*pto) + 1.5;
                            valor = factor*fpto;
                            Vcalc = Vcalc + valor;
                            System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);
                        }
                        if (x==n+1){
                            factor = 1;
                            pto = cb;
                            fpto = 0.03*(pto*pto) + 1.5;
                            valor = factor*fpto;
                            Vcalc = Vcalc + valor;
                            System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);
                        }
                        if (x>1 && x<n+1){
                            Pos=x-1;
                            Res=(x-1)%3;
                            if (Res == 0){
                                factor = 2;
                                pto = ca + (Pos*h);
                                fpto = 0.03*(pto*pto) + 1.5;
                                valor = factor*fpto;
                                Vcalc = Vcalc + valor;
                                System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);
                            } else {
                                factor = 3;
                                pto = ca + (Pos*h);
                                fpto = 0.03*(pto*pto) + 1.5;
                                valor = factor*fpto;
                                Vcalc = Vcalc + valor;
                                System.out.printf("|%-10d |%-10.2f |%-10.2f |%-10d |%-10.2f |\n", x, pto, fpto, factor, valor);
                            }
                        }                
                    }
                    Vcalc = (3*h/8)*Vcalc;
                    Error = Math.abs(Vreal - Vcalc);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("No. de Divisiones = "+ n);
                    System.out.println("Valor Real de la Integral = " + Vreal + " " + unidad);
                    System.out.println("Valor por el Método = "+ Vcalc + " " + unidad);
                    System.out.println("Error del Método = "+ Error + " " + unidad);
                
            }
        }while (n != 0);
        
    }
    
}