import java.util.*;
import java.io.IOException;
class Add_Member
{
   public static void Add()throws IOException
  {
    System.out.print('\u000C');
    String name="";
    String phoneno="";
    String password="";
    String Email="";
    Storage S1=new Storage();
    Scanner sc=new Scanner(System.in);
    System.out.println("\t\t\tCreate Account");
    System.out.println("Enter Your Name");
    name=sc.next();
        S1.Name(name);
    System.out.println("Please Enter Your 10 Digit Phone Number");
    phoneno = sc.next();      
        int count = 0;
        Scanner abc = new Scanner(phoneno);
        for (;;)
          {
           int phonelen= phoneno.length();
           if (phonelen == 10)
           {
            for (int i=0 ;i<phonelen; i++)
            {
             phonelen= phoneno.length(); 
             char ch = phoneno.charAt(i);
             if (Character.isDigit(ch))
             {
              count++;
             }
             else
               System.out.print("");
 
            }
           }
             else
           {
            System.out.println("Please Enter A Number With 10 Digits");
            phoneno=sc.next();
            continue;
            }

           if (count == 10)
            {
             break;
            }
           else 
            {
             System.out.println("Please Enter A Valid 10 Digit Phone Number");
             phoneno=sc.next();
             count=0;
             continue;
            }
        }
        S1.Phoneno(phoneno);
        System.out.println("Enter Your e-mail ID");
        for(;;)
        {
        String email=sc.next();
        int a=email.indexOf("@");
         if(a==-1)
        {
         System.out.println("Enter a proper e-mail ID");
         continue;
        }
        else
        break;
       }
        System.out.println("Enter A password");
        password =sc.next();
        S1.Password(password);
        System.out.println("You are now a member");
        for(long i=1;i<1000000000;i++);
        for(long j=1;j<1000000000;j++);
        for(long k=1;k<1000000000;k++);
        for(long l=1;l<1000000000;l++);
        Home_Page.DisplayOption();
    }
} 