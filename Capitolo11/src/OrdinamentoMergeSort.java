import java.util.Arrays;

public class OrdinamentoMergeSort {
	static void mergeSort(int[] a) {
		mergeSort(a, 0, a.length-1);
	}
	
	private static void mergeSort(int[] a, int min, int max) {
		// caso base
		if(min >= max)
			return;
		
		int middle = (max + min) / 2;
		
		mergeSort(a, min, middle);
		mergeSort(a, middle + 1, max);
		merge(a, min, middle, max);
	}
	
	private static void merge(int[] a, int min, int middle, int max) {
		int sx = min, dx = middle + 1;
		int[] temp = new int[max - min + 1];
		int i = 0;
		
		while(i < temp.length) {
			if(dx > max || (sx <= middle && a[sx] < a[dx]))
				temp[i++] = a[sx++];
			else
				temp[i++] = a[dx++];
		}
		
		for (int k=0; k<temp.length; k++)
			a[min+k] = temp[k];
	}
	
	public static void main(String[] args) {
		int[] a = {10, 5, 2, 20, 19, 15, 4};
		System.out.println(Arrays.toString(a));
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
}
