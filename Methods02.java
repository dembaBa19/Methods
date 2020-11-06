package methods;
import java.lang.Math; 
public class Methods02 {
	static boolean prime(int number) {
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	static boolean palindrome(int number) {
		int ogledalo=0, number2=number;
		while(number2>0) {
			ogledalo*=10;
			ogledalo+=number2%10;
			number2/=10;
		}
		if(ogledalo==number) return true;
		return false;
	}
	public static void main(String[] args) {
		int current=1;
		int namereni=0;
		while(namereni<120) {
			if(prime(current) && palindrome(current)) {
				System.out.print(current + " ");
				namereni++;
				if(namereni%10==0) {
					System.out.println();
				}
			}
			current++;
		}
		
		
	}
}