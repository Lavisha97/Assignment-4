import java.util.Scanner;
class Second
{
	public static void main(String args[])
	{
		int i = 0 , j = 0, temp;
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 10 number array:");
		for(i = 0 ; i < 10 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(i = 0; i < 10 ; i++)
		{
			for(j = 0 ; j < i ; j++)
			{
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Second Largest Number is: "+arr[1]);
		
	}
}