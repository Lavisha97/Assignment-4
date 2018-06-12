import java.util.Scanner;
class Wave
{
	public static void main(String args[])
	{
		int i = 0 , temp;
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 10 number array:");
		for(i = 0 ; i < 10 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(i = 0; i < 10 ; i = i+2)
		{
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println("Waveform:");
		for(i = 0 ; i < 10 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}