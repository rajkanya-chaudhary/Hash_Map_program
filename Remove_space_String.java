import java.util.Scanner;

public class Remove_space_String {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
	  String s = "Prepinsta is best";
	  char[] c = s.toCharArray();
	  StringBuffer sb = new StringBuffer();
	  
	  
	  for (int i = 0; i < c.length; i++) {
	     if( (c[i] != ' ') && (c[i]!= '\t' )) {
	    	 sb.append(c[i]);
	     }    	
          }
	  System.out.println("String after removing spaces : "+sb);

    }
}
