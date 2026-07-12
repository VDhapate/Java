import java.util.Arrays;
class Insertionsort{
	public static void main(String[] args) {
		int a [] = {8, 3, 9, 5,2,0,6,1};
		System.out.println(Arrays.toString(a));
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void insertionSort(int a []){
		for(int i =0; i<a.length-1; i++){
			int min = i;
			for(int j = i+1; j<a.length; j++){
				if(a[min]>a[j])
					min =j;
				
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
}