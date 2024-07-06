package StringBuilder;

public class Decaleration {

	public static void main(String[] args) {

         StringBuilder sb=new StringBuilder("tony");
         System.out.println(sb);
         
         //char at 
         System.out.println(sb.charAt(0));
         
         //setcharAt:
         
         sb.setCharAt(0,'p');
         System.out.println(sb);
         
         //insert:
         sb.insert(0, 's');
         System.out.println(sb);
         
         sb.insert(2, 'n');
         System.out.println(sb);
         
       //delete:
         sb.delete(0, 1);
         System.out.println(sb);
         
         sb.delete(0,3);
         System.out.println(sb);
        
         StringBuilder str=new StringBuilder("hello");
         System.out.println(str);
         //append:
         str.append(' ');
         str.append('w');
         str.append('o');
         System.out.println(str);
         System.out.println(str.length());
         
         
         StringBuilder s=new StringBuilder("tiru");
         
         for(int i=0;i<=s.length()/2;i++) {
        	 int f=i;
        	 int b=s.length()-1-i;
        	 
        	 char fc=s.charAt(f);
        	 char bc=s.charAt(b);
        	 
        	 s.setCharAt(f, bc);
        	 s.setCharAt(b, fc);
         }
         System.out.println(s);
         
         
         
	}

}
