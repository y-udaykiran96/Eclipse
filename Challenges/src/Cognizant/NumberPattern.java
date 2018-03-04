package Cognizant;

public class NumberPattern {

	public void numberPattern(int n){
		int i=0,j=0,k=1,l=0;
		for(i=1;i<=n;i++){
			if(i%2==1){					// left to right
				for(j=1;j<=i;j++){
					if(j!=1)	System.out.print("*");
					System.out.print(k);
					k++;
				}
			} else{						// right to left
				l=k;
				for(j=i-1;j>=0;j--){
					if(j!=i-1)	System.out.print("*");
					System.out.print(l+j);
					k++;
				}
			}
			System.out.println();
		}
	}
}
