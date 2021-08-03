import java.util.Scanner;

public class TimesTable{
	public static void main (String[] args) {
		System.out.println("Enter your number: ");
		Scanner readinput=new Scanner(System.in);
		int N = readinput.nextInt();
		
		for(int i=1;i<11;i++){
			int j=N*i;
			System.out.println(N+ " x " +i+ " = " +j);
		}
		
	}
}