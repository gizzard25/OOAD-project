package ooad;

public class Main {

	public static void main(String[] args) {
		String[] years=new String[118];
		String[] days=new String[31];
		for(int i=2017,j=0;i>=1900;i--){years[j++]=Integer.toString(i);}
		for(int i=0;i<=30;i++){days[i]=Integer.toString(i+1);}
		for(int i=0;i<years.length;i++)
		System.out.print(years[i]);

	}

}
