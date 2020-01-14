import java.util.*;
class ankush
{
    public static void main(String[] args) {
    
        System.out.print("Hello World");
        Scanner s  =new Scanner(System.in);
        String str = s.nextLine();
        char ch[] = new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i] = str.charAt(i);
        }
        for(int i=0;i<str.length();i++)
        {
            if(i%2!=0)
            {
                System.out.print(ch[i]);
            }
        }
        System.out.println();
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                System.out.print(ch[i]);
            }
        }


    }
}
