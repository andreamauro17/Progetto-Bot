import java.util.Scanner;
public class calcoloConsumo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int chilometri; int litri; int distanza;
		
		try{
			System.out.println("Inserire i chilometri percorsi");
			chilometri = scan.nextInt();
			System.out.println("Inserire i litri di benzina consumati");
			litri = scan.nextInt();
			distanza = chilometri / litri;
			System.out.println("La tua uto fa "+distanza+" chilometri al litro");
			System.out.println("Fine del programma...");
		}
		
		
		
	}
}