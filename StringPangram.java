//This program checks if a String is Pangram or not in Java

public class StringPangram {
    public static boolean isPangram(String s)
    {
        if(s.length()<26)
        {
            return false;
        }

        boolean visited[] = new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                visited[s.charAt(i)-'a'] = true;
            }

            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                visited[s.charAt(i)-'A'] = true;
            }
        }

        for(int i=0;i<26;i++)
        {
            if(visited[i] == false)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        String s = "abcdefghijklmnopqrstuvwxyz";
        if(isPangram(s) == true)
        {
            System.out.println("It is a Pangram");
        }
        else
        {
            System.out.println("It is not a Pangram");
        }
    }
}