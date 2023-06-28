import java.io.IOException;
import java.util.*;
class Check_Out
{
    static String Name;
    static int RoomNo;
    static long Days;
    static double FinalSpa;
    static int NoSpa;
    static double FinalMini;
    static int NoMini;
    static double FinalGames;
    static int NoGames;
    static double FinalLunch;
    static int NoLunch;
    static double FinalDinner;
    static int NoDinner;
    static double amtotal;
    static double ftotal;
    public static void Out()throws IOException
    {
      System.out.print('\u000C');
      Scanner abc=new Scanner (System.in);
      System.out.println("Have You Updated Your Stay\n Yes/No");
     for(;;)
     {
      String ismemb=abc.nextLine();
      if(ismemb.equalsIgnoreCase("yes"))
      break;
      else if(ismemb.equalsIgnoreCase("no"))
      Update_Stay.Update();
      else
      {
       System.out.println("Enter Approrriate Choice");
      }
    }
      Storage S3=new Storage();
      Name=S3.returnname();
      Days=S3.returndays();
      FinalLunch=S3.returnflunch();
      NoLunch=S3.returnnlunch();
      FinalDinner=S3.returnfdinner();
      NoDinner=S3.returnndinner();
      FinalSpa=S3.returnfspa();
      NoSpa=S3.returnnspa();
      FinalMini=S3.returnfmini();
      NoMini=S3.returnnmini();
      FinalGames=S3.returnfgames();
      NoGames=S3.returnngames();  
      RoomNo=S3.returnroomno();
      amtotal=S3.returnamtotal();
      ftotal=S3.returnftotal();
      long roomcharge=0;
     if(RoomNo>=100&&RoomNo<=140)//studio room
     roomcharge=3000*Days;
     else if(RoomNo>=200&&RoomNo<=230)//standard room
     roomcharge=3750*Days;
     else if(RoomNo>=300&&RoomNo<=320)//luxury room
     roomcharge=4750*Days;
    else if(RoomNo>=400&&RoomNo<=410)//suite room
    roomcharge=5550*Days;
    int billno=(int)((Math.random()*(1000-9999))+9999);
    System.out.print("****************************************");
    System.out.println("****************************************");
    System.out.println("                                      HOTEL WILASA");    
    System.out.println("********************************************************************************");
    System.out.println("| Bill No:"+billno+"\t\t\t    ITPL,Whitefield,");
    System.out.println("| GSTIN:29AAEPM0111C1Z8\t           Bangalore -560066");
    System.out.println("|\t\t\t\t    Ph:080-70704325  ");
    System.out.println("|\t\t\t      Email:Wilasa.hotels@gmail.com");
    System.out.println("|Name:"+Name);
    System.out.println("|Room Number:"+RoomNo);
    System.out.println("|Number Of Days Stayed:"+Days);
    System.out.println("|\t\t\t\t     Amenities Bill");    
    System.out.println("|\n| SNo. \tAmenities\t\t    No Of Times Used\t\t  Amount");
    System.out.println("|  1.   SPA\t\t\t\t    "+NoSpa+"\t\t\t  Rs."+FinalSpa+"");
    System.out.println("|  2.   Minibar\t\t\t\t    "+NoMini+"\t\t\t  Rs."+FinalMini+"0");
    System.out.println("|  3.   Games\t\t\t\t    "+NoGames+"\t\t\t  Rs."+FinalGames+"0");
    System.out.println("|\t\t\t\t\t\t\t\t----------------");
    System.out.println("|\t\t\t\t\t\t   Aminities Total  Rs."+amtotal+"0");
    System.out.print("|****************************************");
    System.out.println("****************************************");
    System.out.println("|\t\t\t\t        Food Bill");
    System.out.println("|\n| SNo. \tFood\t\t\t    No Of Times Ordered\t\t  Amount");
    System.out.println("|  1.   Lunch\t\t\t\t    "+NoLunch+"\t\t\t  Rs."+FinalLunch+"0");
    System.out.println("|  2.   Dinner\t\t\t\t    "+NoDinner+"\t\t\t  Rs."+FinalDinner+"0");
    System.out.println("|\t\t\t\t\t\t\t\t----------------");
    double ftotal=FinalLunch+FinalDinner;
    System.out.println("|\t\t\t\t\t\t\t   Total  Rs."+ftotal+"0");
    System.out.print("|****************************************");
    System.out.println("****************************************");
    System.out.println("|\t\t\t\t       Total Bill");
    System.out.println("|\n| SNo. \tItems\t\t\t       \t\t\t  Amount");
    System.out.println("|  1.   Room\t\t\t\t    \t\t\t  Rs."+roomcharge);
    System.out.println("|  3. \tFood Cost\t\t\t             \t\t  Rs."+ftotal+"0");
    System.out.println("|  4. \tAmenities Cost\t\t\t    \t\t\t  Rs."+amtotal+"0");
    System.out.println("|\t\t\t\t\t\t\t\t----------------");
    double finaltotalbtax=amtotal+ftotal+roomcharge;
    double sgst=0.09*finaltotalbtax;
    double cgst=0.09*finaltotalbtax;
    double finaltotal=finaltotalbtax+sgst+cgst;
    System.out.println("|\t\t\t\t\t\t\t   SGST   Rs."+sgst+"0");
    System.out.println("|\t\t\t\t\t\t\t   CGST   Rs."+cgst+"0");
    System.out.println("|\t\t\t\t\t\t\t   Total  Rs."+finaltotal+"0");
    System.out.println("|");
    System.out.println("|");
    System.out.println("|");
    System.out.println("|");
    System.out.println("|\n| \t\t\t\t\t\t\t\t "+Name);
    System.out.print("|");
    System.out.println("\t\t\t\t\t\t\t    Customer Signature");
    System.out.println("|");
    System.out.println("|\t\t\t\t       Thank You");
    System.out.println("|\t\t\t\t    Visit Us Again");
    System.out.println("|");
    System.out.print("-------------------------------------------");
    System.out.println("----------------------------------------");
    System.out.println("| NOTE:");
    System.out.println("| 1.There will be no refund on the event of cancellation.");
    System.out.println("| 2.Please hand over your keys at the reception while leaving the hotel.");
    for(;;)
   {
     System.out.println("Press 7 to continue");
     String cont=abc.next(); 
     String x="7";
     if(cont.equals(x))
     break;
     }
   Home_Page.DisplayOption();
  }
}

