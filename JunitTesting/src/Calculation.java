

public class Calculation {
	public static int findMax(int arr[]) {
		int max=arr[2];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) 
				max=arr[i];
		}
		return max;
		}
		
	}

