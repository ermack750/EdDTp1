import java.util.Scanner;

public class Helper {
    private static final Scanner scanner = new Scanner(System.in);

    public static Integer leerEntero(String mensaje){
        int numero;
        while(true){
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                if(numero>0){
                    break;
                } else{
                    System.out.println("Introduzca un numero positivo");
                }
            }catch (NumberFormatException e){
                System.out.println("Entrada no valida");
            }
        }
        return numero;
    }

    public static double leerDouble(String mensaje){
        double numero;
        while(true){
            try {
                System.out.println(mensaje);
                numero = Double.parseDouble(scanner.nextLine());
                if(numero>0){
                    break;
                } else{
                    System.out.println("Introduzca un numero positivo");
                }
            } catch (NumberFormatException e){
                System.out.println("Entrada no valida");
            }
        }
        return numero;
    }

    public static String leerString(String mensaje){
        System.out.println(mensaje);
        return scanner.nextLine().trim();
    }

    public static boolean leerBoolean(String mensaje){
        while(true){
            System.out.println(mensaje + "(s/n): ");
            String entrada = scanner.nextLine().trim().toLowerCase();
            if(entrada.equals("s")){
                return true;
            } else if  (entrada.equals("n")){
                return false;
            } else{
                System.out.println("Entrada no valida");
            }
        }
    }
}
