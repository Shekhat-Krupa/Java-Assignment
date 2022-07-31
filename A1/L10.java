
public class L10 {
	public String encrypt(String text, int s)
	{
	    String result = "";
	  
	    // traverse text
	    for (int i=0;i<text.length();i++)
	    {
	        // apply transformation to each character
	        // Encrypt Uppercase letters
	        if (Character.isUpperCase(text.charAt(i)))
	            result += (char)(((int)text.charAt(i)+s-65)%26 +65);
		    else// Encrypt Lowercase letters
		        result += (char)(((int)text.charAt(i)+s-97)%26 +97);
	    }
	  
	    // Return the resulting string
	    return result;
	}

}
