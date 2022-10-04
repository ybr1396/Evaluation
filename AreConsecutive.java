package ybr.basics;
import java.util.Arrays;
public class AreConsecutive {
		boolean areConsecutive(int arr[], int n)
		{Arrays.sort(arr);
			for(int i=1;i<n;i++)
			{if(arr[i]!=arr[i-1]+1){
					return false;}
			}return true;}
	public static void main(String[] args) {
				AreConsecutive consecutive = new AreConsecutive();
				int arr[] = {-1,5,4,2,0,3,1};
				int n = arr.length;
				if (consecutive.areConsecutive(arr, n) == true)
					System.out.println("Array elements are consecutive");
				else
					System.out.println("Array elements are not consecutive");
			}	}

