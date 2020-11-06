package methods;
import java.util.Random;
public class Methods01 {
	static boolean pair(int point) {
		Random rand = new Random();
		int d1 = rand.nextInt(6)+1;
		int d2 = rand.nextInt(6)+1;
		int sum = d1+d2;
		boolean win;
		System.out.println("You rolled " + d1 + " + " + d2 + " = " + sum);
		if(point!=0) {
			if(sum==point) {
				win = true;
			} else {
				if(sum==7) {
					win = false;
				} else {
					return pair(point);
				}
			}
		} else {
			if(sum==2 || sum==3 || sum==12) {
				win=false;
			} else {
				if(sum==7 || sum==11) {
					win=true;
				} else {
					System.out.println("point is " + sum);
					return pair(sum);
				}
			}
		}
		return (win);
	}
	public static void main(String[] args) {
		boolean win=pair(0);
		if (win) {
			System.out.println("You win!");
		}else {
			System.out.println("You lose!");
		}
	}
}