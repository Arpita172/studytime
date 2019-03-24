import java.util.Scanner;


public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		int count=0;
		int sum=0;
		int result=0;
		boolean bool=false;
		int k = Integer.parseInt(scan.nextLine());
		for(int i=k;i<=s.length();i++){
			sum=0;
			for(int j = 1;j<=s.length()-(i-1);j++){
				String x = s.substring(j-1,i+j-1);
				result=x.length();
if(x.indexOf("a")==-1 && x.indexOf("e")==-1 && x.indexOf("i")==-1 && x.indexOf("o")==-1 && x.indexOf("u")==-1){
					count++;
				}
if(count>=k){
	sum++;
}
count=0;
			}
			if(sum==s.length()-(i-1)){
				System.out.println(result);
				bool=true;
				return;
			}
		}
		if(bool==false)
			System.out.println("-1");

	}

}
