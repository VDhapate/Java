import java.util.Scanner;
class ReverseArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of an array");
		int a [] = new int[sc.nextInt()];
		System.out.println("enter array elements");
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
			//System.out.println(a[i]);
		}
		for(int i = 0; i<a.length ; i++){
			System.out.println(reverse(a[i]));
		}
    }
		public static int reverse(int num){
			int rev =0;
			while(num!=0){
				int dgt = num%10;
				rev = rev*10+dgt;
				num/=10;
			}
			return rev;
		}

}