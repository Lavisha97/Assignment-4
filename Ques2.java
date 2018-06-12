import java.util.Scanner;

class Complex
{
	int real , imaginary;
	
	public void Display()
	{
		int r , i;
		r = this.real;
		i = this.imaginary;
		System.out.println(r+"+"+i+"i");
	}
	
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		Complex com = new Complex();
		com.real = sc.nextInt();
		com.imaginary = sc.nextInt();
		com.Display();
	}
}