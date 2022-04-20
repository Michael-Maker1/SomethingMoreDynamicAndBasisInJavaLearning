package accountbalance;


public class replacement{
	
	
	private static String replacement1(String string, String replace,  String replaceWith) {
		StringBuilder results = new StringBuilder();
		int index = 0;
		
		 for(;;) {
			 int position1 = string.indexOf(replace, index);
			 int position2 = string.indexOf(replaceWith ,index);
			 if(position1 == -1) {
				 results.append(string.substring(index));
				 break;}
			 results.append(string.substring(index,position1));
			 results.append(replace);
			 results.append(replaceWith);
			 index = replace.length() + position1;
			 index = replaceWith.length() + position2;
 		 }
		  
		return results.toString();
		
		}


	public static void main(String[] args) {
		System.out.print(replacement1("Java ist cool, ich liebe  Java", "Pyhno", "Java"));

	}}






	
