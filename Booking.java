import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Booking
{
     static String Name;
     static String Phoneno;
   public static void Book()throws IOException
 {
      System.out.print('\u000C');
      Storage S2=new Storage();
      Name=S2.returnname();
      Phoneno=S2.returnphoneno(); 
      int rn=0;
      int choice=0;
      Scanner sc=new Scanner(System.in); 
      Scanner abc=new Scanner(System.in);
      System.out.println("Are You A Member\nYes/No");
     for(;;)
     {
      String ismemb=sc.nextLine();
      if(ismemb.equalsIgnoreCase("yes"))
      break;
      else if(ismemb.equalsIgnoreCase("no"))
      Add_Member.Add();
      else
      {
       System.out.println("Enter Approrriate Choice");
      }
    }
      System.out.print('\u000C');
      System.out.println("\t\t\t\t\t        WELCOME\n\t\t\t\t\t\t  TO\n\t\t\t\t\t      HOTEL WILASA");
      System.out.println("Are You:"+Name+"  Yes/No");
     for(;;)
     {
      String ismemb=sc.nextLine();
      if(ismemb.equalsIgnoreCase("yes"))
      break;
      else if(ismemb.equalsIgnoreCase("no"))
      Add_Member.Add();
      else
      {
       System.out.println("Enter Approrriate Choice");
      }
    }
      System.out.println("\t\t\t Booking Room(s)");
      final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String cin;
      String cout;
      long days;
      for(;;)
    {
      System.out.println("Enter date in DD/MM/YYYY format");
      System.out.println("Enter Check-In Date");
      cin = sc.next();
      System.out.println("Enter Check-Out Date");
      cout = sc.next();
      final LocalDate firstDate = LocalDate.parse(cin, formatter);
      final LocalDate secondDate = LocalDate.parse(cout, formatter);
      days = ChronoUnit.DAYS.between(firstDate, secondDate);
      S2.Days(days);
      if(days==0)
       System.out.println("Enter Appropriate Dates");
      else if(days<0)
       System.out.println("Enter Appropriate Dates");
      else
      break;
    }
      System.out.println("\nEnter The Number of Adults");
      int adult = sc.nextInt();
      System.out.println("Enter The Number of Children");      
      int child = sc.nextInt();
      int sum=adult+child;
      int numroom=0;
      System.out.println("\n\n\nEnter the room of your choice"); 
        for(;;)
   { 
        System.out.println("\n1- Studio Room \nMax Capacity - 3 persons\n Price:RS.3000/Day \n");
        System.out.println("2- Standard Room \nMax Capacity - 4 persons\n Price:RS.3750/Day \n");
        System.out.println("3- Luxury Room \nMax Capacity - 5 persons\n Price:RS.4750/Day \n");
        System.out.println("4- Suite \nMax Capacity - 4 persons\n Price:RS.5550/Day \n");
        choice = sc.nextInt();
       switch (choice)
       {
        case 1:
        if(sum<=3)
         {
          System.out.println("You Have Selected Studio Room");
          rn=(int)((Math.random()*(100-140))+140);
          System.out.println("Your Room Number:"+rn);
          
          }
        else 
        {
        numroom=sum/3;
        rn=(int)((Math.random()*(100-140))+140);
        System.out.println("You need "+numroom+" rooms");
       }
       break;
       
       case 2:
       if(sum<=4)
       {
        System.out.println("You Have Selected Standard Room");
        rn=(int)((Math.random()*(200-230))+230);
        System.out.println("Your Room Number:"+rn);
       }
       else 
       {
        numroom=sum/4;
        rn=(int)((Math.random()*(200-230))+230);
        System.out.println("You need "+numroom+" rooms");
       }
       break;
       
       case 3:
       if(sum<=5)
      {
       System.out.println("You Have Selected Luxury Room");
       rn=(int)((Math.random()*(300-320))+320);
       System.out.println("Your Room Number:"+rn);
      }
      else 
      {
        numroom=sum/5;
        rn=(int)((Math.random()*(300-320))+320);
        System.out.println("You need "+numroom+" rooms");
      }
      break;
      
      case 4:
      if(sum<=4)
      {
       System.out.println("You Have Selected Suite Room");
       rn=(int)((Math.random()*(400-410))+410);
       System.out.println("Your Room Number:"+rn);
      }
      else 
      {
        numroom=sum/4;
        rn=(int)((Math.random()*(400-410))+410);
        System.out.println("You need "+numroom+" rooms");
      }
      break;
      default:
      System.out.println("Enter appropriate room");
      for(long i=1;i<1000000000;i++);
      for(long j=1;j<1000000000;j++);
      for(long k=1;k<1000000000;k++);
      for(long l=1;l<1000000000;l++);      
      continue;
     }
     break;
    }
   S2.RoomNo(rn); 
     for(;;)
   {
     System.out.println("Press 7 to continue");
     String cont=abc.next(); 
     String x="7";
      if(cont.equals(x))
      break;
      else
      {
      System.out.println("Do You Want To Change Your Booking Details\nYes\tNo");
      String check2=abc.nextLine();
      if(check2.equalsIgnoreCase("yes"))
      Book();
      else if(check2.equalsIgnoreCase("no"))
      continue;
     }
   }
     System.out.print('\u000C');
     System.out.println("Booking details");
     System.out.println("Name:"+Name);
     System.out.println("Contact No:"+Phoneno);
     System.out.println("Check-In Date:"+cin);
     System.out.println("Check-Out Date:"+cout);
     System.out.println("Staying for "+ days+" days");
     S2.Days(days);
     System.out.println("Number Of People Staying:"+sum);
     System.out.println("Room No:"+rn);
     System.out.println("Floor No:"+choice+" Floor");
     System.out.println("AMENITIES AVAILABLE\n\nNON-FREE AMENITIES \n♦Spa - RS.1299 \n♦Minibar - RS.79 \n♦Outdoor and Indoor Games - RS.199 per game  \n♦Restaurant (Lunch and Dinner free for children)\n♦Laundry - RS.149 per load\n\nFREE AMENITIES\n♦Swimming Pool \n♦Gym \n♦Wi-Fi\n♦Complimentary Breakfast");
     System.out.println("\nThank You For Booking With Us.Enjoy Your Stay");
     for(;;)
   {
     System.out.println("Press 7 to continue");
     String cont=abc.next(); 
     String x="7";
      if(cont.equals(x))
      break;
      else
      {
      System.out.println("Do You Want To Re-enter Booking Details\nYes\tNo");
      String check2=abc.nextLine();
      if(check2.equalsIgnoreCase("yes"))
      Book();
      else if(check2.equalsIgnoreCase("no"))
      continue;
     }
    }
    Home_Page.DisplayOption();
    }
   }


