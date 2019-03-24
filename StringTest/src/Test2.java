import java.util.Arrays;
import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x=0;
		int num=0;
		boolean bool = false;
		StringBuffer r = new StringBuffer();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
Arrays.sort(a);
for(int i=1;i<=n;i++){
	x = Arrays.binarySearch(a,i);
	if(x<0){
		num=i;
		r.append(num+" ");
		bool = true;
	}
}
if(bool)
System.out.println(r.toString().trim());
else
	System.out.println("0");
	}

}
