import java.util.Scanner;
public class GarciaToroJuegoGato2daParte {
		
	//Garcia Toro Alberto grupo:2208
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa 9 caracteres que solo sean 'X' 'O' y '_' ");
        String caracteres = scanner.nextLine();
        if (caracteres.length() != 9)
        {
            System.out.println("No es el numero de caracteres solicitados");
            return;
        }
        for (int i = 0; i < caracteres.length(); i++) {
            char a = caracteres.charAt(i);
            if (a != 'X' && a != 'x' &&a != 'o' &&   a!= 'O' && a!= '_') {
                System.out.println("Solo se puede ingresar los 3 tipos de carateres mostrados");
                return;}
        }
        System.out.println(""+caracteres.charAt(0)+"|"+caracteres.charAt(1)+"|"+caracteres.charAt(2) + " ");
        System.out.println("-+-+-");
        System.out.println(""+caracteres.charAt(3)+"|"+caracteres.charAt(4)+"|"+caracteres.charAt(5) + " ");
        System.out.println("-+-+-");
        System.out.println(""+caracteres.charAt(6)+"|"+caracteres.charAt(7)+"|"+caracteres.charAt(8) + " ");
    }
}
