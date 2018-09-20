import cs1.Keyboard;
import java.util.Scanner;

public class tele
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String num;
		String area;
		String mid;
		String end;

		System.out.print("Enter a telephone number: ");
		num = input.next();

		area = (num.substring(0,3));
		mid =  (num.substring(3,6));
	    end =  (num.substring(6,10));

		System.out.printf("(%s)-%s-%s",area,mid,end);


	}
}