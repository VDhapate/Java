class PalindromArray{
	public static void main(String[] args) {
		int a [] = {124, 345, 121, 875, 88};
		int count = 0;
		for(int i = 0; i < a.length; i ++){
			if(a[i]== reverse(a[i])){
				count ++;
				System.out.println("palindrom is "+ a[i]);
			}
			System.out.println(count);
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