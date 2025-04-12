import java.util.Scanner;

public class EstadoCivil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el estado civil de la persona: 1.Soltero, 2.Casado, 3.Separado, 4.Viudo, 5.Unión libre: ");
        int estadoCiviL = scanner.nextInt();
        
        switch (estadoCiviL) {
            case 1:
                System.out.println(nombre + " es solter@.");
                break;
            case 2:
                System.out.println(nombre + " es casad@.");
                break;
            case 3:
                System.out.println(nombre + " es separad@.");
                break;
            case 4:
                System.out.println(nombre + " es viud@.");
                break;
            case 5:
                System.out.println(nombre + " esta en unión libre.");
                break;
            default:
                System.out.println("Estado civil no válido.");
                break;
        }
        
        scanner.close();
    }
}