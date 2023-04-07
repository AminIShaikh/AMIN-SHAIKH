package String;

public class MethodsInString {
	
	public static void main(String[] args) {
		
		String a ="amin";
		
		String b ="  Amin  ";
		
		String c ="AMIN SHAIKH";
		
		String d ="Amin1234";
		
		System.out.println(a==c);           //use for Comparison of address i.e.storage location
		
		System.out.println(a.equals(c));    //use to compare data between the two Strings
		
		System.out.println(a.length());    //finds out the length of the String
		
		System.out.println(a.isEmpty());    //checks whether the string is empty
		
		System.out.println(b.trim());       //trim will delete all the spaces available before and after the String
		
		System.out.println(c.equalsIgnoreCase(a));  //compares the characters present in the string and ignores the lower and upper case 
		
		System.out.println(c.concat(b));     //use to add two strings
		
		System.out.println(c.subSequence(1,3));  //will show characters between the two index values
		
		System.out.println(a.substring(2));   //will create a new String from the old String after we provide index value 
		
		System.out.println(a.replace('i', 'e'));  //will replace the old character with new character
		
		System.out.println(a.indexOf('i'));  // will show index value of a character
		
		System.out.println(c.lastIndexOf('I'));  //will show index value of last character "I" present in a String
		
		System.out.println(c.charAt(7));    //will show character present at the index position
		
		System.out.println(c.contains(b));  //will check whether one String contains Same character as other String
		
		System.out.println(a.startsWith(a));  //will check whether starts with 'a' character
		
		System.out.println(a.endsWith(c));
		
		System.out.println(a.toUpperCase()); //will convert all the characters to upper case
		
		System.out.println(c.toLowerCase()); //will convert all characters to lower case
		
		String replace = d.replaceAll("[1-4]", "S");
		System.out.println(replace);
	}

}
