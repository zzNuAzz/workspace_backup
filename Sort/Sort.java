public class Sort {
	private static void merge(int[] arr, int l, int m, int r) {
	
		int len1 = m - l + 1;
		int len2 = r - m;
		int[] arrL = new int[len1];
		int[] arrR = new int[len2];

		for(int i = 0; i < len1; i++) arrL[i] = arr[i + l];
		for(int i = 0; i < len2; i++) arrR[i] = arr[i + m + 1];
		
		int i = 0;
		int j = 0;
		int k = l;

		while(i < len1 && j < len2) {
			if (arrL[i] < arrR[j]) arr[k++] = arrL[i++];
			else arr[k++] = arrR[j++]; 
		}
		while(i < len1 ) arr[k++] = arrL[i++];
		while(j < len2 ) arr[k++] = arrR[j++];

	}
	public static void  mergeSort(int[] arr, int l, int r) {
		if (l >= r) return;
		int m = (l + r) / 2;

		mergeSort(arr, l, m);
		mergeSort(arr, m + 1, r);
		merge(arr, l, m ,r);
	}
}