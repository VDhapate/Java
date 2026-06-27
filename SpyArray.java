class SpyArray{
	public static void main(String[] args) {
		int [] a = {123, 132, 156, 178};
		for(int i = 0; i < a.length; i++){
             if(prodI(a[i])==sumI(a[i]))
             	System.out.println("Spy number is "+a[i]);
		}
	}
	public static int sumI(int num){
		int sum = 0;
		while(num>0){
			int dgt = num%10;
			sum+=dgt;
			num/=10;
		}
		return sum;

	}
	public static int prodI(int num){
		int prod = 1;
		while(num>0){
			int dgt = num%10;
			prod*=dgt;
			num/=10;
		}
		return prod;
	}
}