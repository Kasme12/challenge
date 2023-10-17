package challenge;
import java.util.Scanner;
public class CodingChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many letter you have: ");
		int letter = input.nextInt();
		System.out.print("\nEnter how many sentences you have: ");
		int sentences = input.nextInt();
		System.out.print("\nEnter how many words you have: ");
		int words = input.nextInt();


		Double L=(double)(letter)/words*100;
		System.out.print("\nL=");
		System.out.printf("%3.2f",L);
		Double s= (double)(sentences)/words*100;
		System.out.print("\nS=");
		System.out.printf("%3.2f",s);

		int Index = (int)((0.0588 * L) - (0.296*s) - 15.8);
		System.out.println("\nIndex = 0.0588 * L – 0.296 * S – 15.8");
		System.out.printf("\nIndex= %1d",Index);
		}
		catch (Exception e) {
		System.out.println(e);
		}
		}


		}