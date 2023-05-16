import java.util.Scanner;


public class Lombardo
{

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Raggio");
			double n=scan.nextDouble();
			Cerchio a=new Cerchio(n);
			a.perimetro();
			a.area();
			a.risultati();
			
		}

	}
