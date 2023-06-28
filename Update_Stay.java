import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
class Update_Stay
{
    static String Password;
    static long Days;
    static int RoomNo;
    public static void Update ()throws IOException
    {
      System.out.print('\u000C');
      Storage S3=new Storage();
      Password=S3.returnpassword();
      Scanner sc=new Scanner(System.in);
      System.out.println("Have You Already Booked A Room??\n Yes/No");
     for(;;)
     {
      String ismemb=sc.nextLine();
      if(ismemb.equalsIgnoreCase("yes"))
      break;
      else if(ismemb.equalsIgnoreCase("no"))
      Booking.Book();
      else
      {
       System.out.println("Enter Approrriate Choice");
      }
    }
      System.out.println("Please Enter Your Password");
      int i=0;
      for(;;)
      {      
      String entpass=sc.next();
      if(entpass.equals(Password))
       break;
       else if (i==5)
       {
       System.out.println("Are You A Member\nYes/No");
       String ismemb=sc.next();
       if(ismemb.equalsIgnoreCase("yes"))
       break;
       else if(ismemb.equalsIgnoreCase("no"))
       Add_Member.Add();
       }
      else 
      {
      System.out.println("Please Enter Correct Password");
      i++;
      continue;
     }
    }
      System.out.println("\t\t\tUpdate Your Stay");
      Days=S3.returndays();
      RoomNo=S3.returnroomno();
      double final_lunch=0;
      int nl=0;
      double final_dinner=0;
      int nd=0;
      double final_spa=0;
      int ns=0;
      double final_mini=0;
      int nm=0;
      double final_games=0;
      int ng=0;
     for(int n=1; n<=Days; n++)
      {
        System.out.println("Day"+n);    
        System.out.println("We would like you to help us with some information-\nHow many people have eaten lunch today");
        int lunch=sc.nextInt();
        double rate_lunch=lunch*400;
        final_lunch=final_lunch+rate_lunch;
        nl=nl+lunch;
        System.out.println("How many people have eaten dinner today");
        int dinner=sc.nextInt();
        double rate_dinner=dinner*350;
        final_dinner=final_dinner+rate_dinner;
        nd=nd+dinner;
        System.out.println("Enter number of times Spa is used");
        int spa=sc.nextInt();
        double rate_spa=spa*1299;
        final_spa=final_spa+rate_spa;
        ns=ns+spa;
        System.out.println("Please enter number of items used from Minibar");
        int minibar=sc.nextInt();
        double rate_mini=79*minibar;
        final_mini=final_mini+rate_mini;
        nm=nm+minibar;
        System.out.println("Please enter number of times Games played");
        int games=sc.nextInt();
        double rate_games=199*games;
        final_games=final_games+rate_games;
        ng=ng+games;
    }
    S3.FinalLunch(final_lunch);
    S3.NoLunch(nl);
    S3.FinalDinner(final_dinner);
    S3.NoDinner(nd);
    S3.FinalSpa(final_spa);
    S3.NoSpa(ns);
    S3.FinalMini(final_mini);
    S3.NoMini(nm);
    S3.FinalGames(final_games);
    S3.NoGames(ng);    
    double foodcharges=final_lunch+final_dinner;
    S3.ftotal(foodcharges);
    double amitotal=final_spa+final_mini+final_games;
    S3.amtotal(amitotal);
    Home_Page.DisplayOption();
  }
}
