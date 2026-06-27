class NeonNum{
	public static void main(String[] args) {
		int a [] = {9, 1, 87, 45, 53};
        for(int i = 0; i<a.length; i++){
        	if(a[i]==sum(sqr(a[i])))
        		System.out.println("neon number is "+a[i]);
        }
	}
	public static int sqr(int num){
		return num*num;
	}
	public static int sum(int num){
		int sum = 0;
		while(num>0){
			int dgt = num%10;
			sum+=dgt;
			num/=10;
		}
		return sum;
	}
}