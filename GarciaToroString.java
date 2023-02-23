import java.util.Scanner;
public class GarciaToroString {

	public static void main(String[] args) {
		// Garcia Toro Alberto 2208
		Scanner a=new Scanner(System.in);
		System.out.print("Escribe tu nombre,profesion y nacionalidad en ese orden");
		String b=a.nextLine();
		String[] c=b.split(" ");
		
		String nombre=c[0].toUpperCase();
		String profesion=c[1].toUpperCase();
		String pais=c[2].toUpperCase();
		System.out.println("Nombre: "+nombre+"\nProfesion: "+profesion+"\nPais: "+pais);
		          
	}

}
