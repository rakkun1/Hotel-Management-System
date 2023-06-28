import java.util.*;
import java.io.IOException;
public class Home_Page
 {
    //method to show display options
    public static void DisplayOption()throws IOException
    {
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        String Option;
        // Display options
        System.out.println("*****************************************");
        System.out.println("           Hotel WILASA                  ");
        System.out.println("*****************************************");
        System.out.println("|   HOTEL MANAGEMENT SYSTEM             |");
        System.out.println("*****************************************");
        System.out.println("| Options:                              |");
        System.out.println("|        1. Add New Member              |");
        System.out.println("|        2. Booking                     |");
        System.out.println("|        3. Update Stay Info            |");
        System.out.println("|        4. Check Out                   |");
        System.out.println("|        5. Exit                        |");
        System.out.println("*****************************************");

        System.out.print("Select option: ");

        Option = sc.next();
        for(;;)
      {  //options to select from
        switch (Option) {
            case "1":
                Add_Member.Add();
                break;
            case "2":
                Booking.Book();
                break;
            case "3":
            	Update_Stay.Update();
                break;
            case "4":
            	Check_Out.Out();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Selection Incorrect");
         for(long i=1;i<1000000000;i++);
         for(long j=1;j<1000000000;j++);
         for(long k=1;k<1000000000;k++);
         for(long l=1;l<1000000000;l++);                
                DisplayOption();
        }
    }
  }
}