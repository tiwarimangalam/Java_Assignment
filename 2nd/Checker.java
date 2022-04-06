public class Checker {
    public boolean checkerFunction(String str)
    {
        int [] frequency=new int[26];
        for(int i=0;i<26;i++)
        {
            // Initializing the array element by zero
            frequency[i]=0;
        }
        for (int i=0;i<str.length();i++)
        {
            int c=str.charAt(i)-'a';
            frequency[c]=1;
        }
        for(int i=0;i<26;i++)
        {
            if(frequency[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}
