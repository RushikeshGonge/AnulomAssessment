public class Q1_StringReversalTechniques {

    public static String usingStringBuilder(String str)
    {

        String reverse = new StringBuilder(str).reverse().toString();
        
        return reverse;
    }

    public static String usingCharArray(String str)
    {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while(left < right)
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        String reverse = new String(charArray);
        return reverse;
    }


    public static String usingRecursion(String str)
    {
        if(str.isEmpty()) return str;
    
        return usingRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args)
    {
        String originalString = "Anulom";

        String reverseString1 = usingStringBuilder(originalString); // string reversal using StringBuilder class
        String reverseString2 = usingCharArray(originalString); // string reversal using character array
        String reverseString3 = usingRecursion(originalString); // string reversal using recursion function

        System.out.println("Reverse string using StringBuilder Technique : " + reverseString1);
        System.out.println("Reverse string using using character array : " + reverseString2);
        System.out.println("Reverse string using recursion function : " + reverseString3);

    }
    
}
