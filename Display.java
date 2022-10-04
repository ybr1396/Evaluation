package ybr.basics;
public class Display {
public static void main(String[] args) {
	int value = 0,i,j,k;
		for( i = 1; i <= 4; i++){
			for( j = 1; j <= 4; j++){
				for( k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						value++;
						System.out.println(i + "" + j + "" + k);
	}}}}
		System.out.println("Total number of the three-digit-number is " + value);
	}
}


