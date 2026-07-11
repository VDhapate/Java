import java.util.Arrays;
class SelectionSort{
	public static void main(String[] args) {
		int n [] = {4,3,5,8,1,6,0,8,2};
		System.out.println(Arrays.toString(n));
		selectionSort(n);
		System.out.println(Arrays.toString(n));
	}
	public static void selectionSort(int a []){
		for(int i =0; i<a.length-1; i++){
			for(int j =i+1; j<a.length;j++){
				if(a[j]<a[i])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
}