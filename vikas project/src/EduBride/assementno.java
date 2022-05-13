package EduBride;


public class assementno 
{
	public static void main(String[] args) 
	{
		String Vikas="Happy Birthday";
		String work="Happy Birthday";
		String str="superman";
		char[] str1= {'h','e','l','l','o'};
		String str2="";
		String str3="hello happy birthday how are you";
		str2=str2.copyValueOf(str1,0,5);
		String str4[]=str3.split(" ");
		for(int i=0;i<str4.length;i++)
			System.out.println(""+str4[i]);
		System.out.println("the"+Vikas);
		System.out.println("charAt is to print string's character from specific position and character at 1st position is "+Vikas.charAt(0));
		System.out.println("codePointAt is to determine the ASCII Value of Specific character at a given index in a String And ASCII value of 2nd position of String is"+Vikas.codePointAt(1));
		System.out.println("codePointBefore is to determine the ASCII Value of Specific character before the given index in a String And ASCII value before the 3rd position of String is"+Vikas.codePointBefore(2));
		System.out.println("codePointcount returns the no of ASCII values found in string"+Vikas.codePointCount(0,14));
		System.out.println("compareTo prints the difference between ASCII values from 2 strings & the difference is "+Vikas.compareTo(work));
		System.out.println("compareToIgnoreCase prints the difference between ASCII values and ignores the case difference of 2 strings & the difference is"+Vikas.compareToIgnoreCase(work));
		System.out.println("concat attaches two stringsto each other one string ti the end of another String "+Vikas.concat(work));
		System.out.println("contains is to checkif the string contains the specified sequence of letters "+Vikas.contains("appy"));
		System.out.println("contentEquals is to checkif the 2 strings contains the specified sequence of letters "+Vikas.contentEquals(work));
		System.out.println("copyValueOf is to copy from char array to string & the copied letters into empty string are "+str2);
		System.out.println("equalsIgnoreCase ignores the case and to find the strings are equal or not & the output is "+str2.equalsIgnoreCase(str3));
		System.out.println("getBytes Encodes the string into a sequence of Bytes using the named charset,sorting the result into a new byte array "+Vikas.getBytes());
		System.out.println("indexOf is To find the occurence of the given letter in the letter is repeated "+Vikas.indexOf("p",0)+" times");
		System.out.println("intern is to print the canonical representation of string object  "+Vikas.intern());
		System.out.println("isEmpty is to check the gien string is empty or not "+str2.isEmpty());
		System.out.println("lastIndex is to print the last occurence of index value for the given string character"+str3.lastIndexOf("birthday"));
		System.out.println("length is to check the the length of given string "+Vikas.length());
		System.out.println("matches is to check the 2 strings matching or not "+Vikas.matches(work));
		System.out.println("replace is to replace is to replace specified letter with given letter "+str3.replace('h','p'));
		CharSequence charsequence=str.subSequence(1, 7);
		String man=(String)charsequence;
		System.out.println("subSequence can find the subsequence or innerpart of given string and displays it & the subsequence of the string str is "+man);
		System.out.println("startsWith is to chech weather the String starts from the gien character or not "+str3.startsWith("h"));
	}

}
