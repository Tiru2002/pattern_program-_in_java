package basics;

public class ChartAtFunc {

	public static void main(String[] args) {
		String name="vishal";
		
		//charAt():
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i)+" | ");
			
		}
		System.out.println("");
		
		//compare:
		String str1="youTube";
		String str2="youTube";
		if(str1.compareTo(str2)==0)
			System.out.println("both Strings are equal");
		else
			System.out.println("both String are not equal");
		

	}

}
