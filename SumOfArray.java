import java.util.Scanner;
class SumOfArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		int arr [] = new int[4];
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("[");
		for(int i = 0; i<arr.length; i++){
			System.out.print(" "+arr[i]+" ");
		}System.out.println("]");

		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum+=arr[i];
		}	
		System.out.println("sum is "+ sum);
	}
}