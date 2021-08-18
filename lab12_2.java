package lab12_2;
/**
 * @author Kayla Wagner
 * @version CSC 1301
 */
import java.util.Random;
public class lab12_2 {
	public static void main(String []args) {
		Random rand=new Random();
		//(max-min+1)+min range:[16,128] 
		int a=rand.nextInt(128-16+1)+16;
		System.out.println("Random number is: "+a);
		shortTwos(a);
	}
	public static void shortTwos(int a) { //list all factors continue if divisible by 2
		int count=0;
		System.out.print(a + " = ");
		while (a%2==0) {
			a=a/2; count++;
		}
		int rem= a;
		for(int i=0; i<count; i++ ) {
			System.out.print("2 * ");
		}
		System.out.print( rem);
	}
}



