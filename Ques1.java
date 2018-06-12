import java.util.Scanner;

class Rectangle
{
	int length , breadth;

	public void CalculateArea()
	{
		int l,b;
		l=this.length;
		b=this.breadth;
		System.out.println("Area is "+l*b);
	}
	
	public static void main(String[] args)
	{
		Rectangle obj1=new Rectangle();
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter length :");
		obj1.length=scan.nextInt();
		System.out.println("Enter breadth :");
		obj1.breadth=scan.nextInt();
		obj1.CalculateArea();
	}
}