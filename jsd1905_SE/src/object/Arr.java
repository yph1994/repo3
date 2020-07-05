package object;

import java.util.Arrays;

import javax.security.auth.x500.X500Principal;

import collection.test;

public class Arr {
	public static void main(String[] args) {
		int [] x={2,0,1};
		int [] y={5,6,4};
		int [] z={6,7,8};
		
		d.test(x,y,z);
	}
}
		


class d{
public static void test(int[]x,int[]y,int[]z ){
	int i=x.length;
	int j=y.length;
	int k=z.length;
	int [] sum= new int[i+j+k];
	System.arraycopy(x, 0, sum, 0, i);
	System.arraycopy(y, 0, sum, i, j);
	System.arraycopy(z, 0, sum, i+j, k);
	Arrays.sort(sum);
	System.out.println(Arrays.toString(sum));
	for (int l = 0; l < sum.length-1; l++) {
		if(sum[l+1]-sum[l]!=1){
			System.out.println("NO");
			return;
		}
	}
	System.out.println("YES");
	System.out.println(Arrays.toString(sum));
}}