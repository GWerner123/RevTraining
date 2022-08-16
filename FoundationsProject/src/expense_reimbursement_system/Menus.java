package expense_reimbursement_system;




import java.math.*;
import java.text.*;
import java.util.*;







public class Menus implements IMainMenu, IManagerPortal, IEmployeePortal{

    String employeePassword = "ep";      //the user's actual password created upon registration and stored in DATABASE
    String employeeUsername = "eu";      //the user's actual username created upon registration and stored in DATABASE
    String testPassword = "tp";         //the password the user enters at login that must be tested
    String testUsername = "tu";         //the username the user enters at login that must be tested
    String managerPassword = "secret";  //the password that allows managers access to manager portal
    String managerUsername = "manager"; //the username that allows managers access to manager portal



    static boolean manager = false;     //tells if-statement in main to go to manager portal or not



    static boolean mpLoggedIn = true;   //lets us log out of manager portal
    static boolean epLoggedIn = true;   //lets us log out of employee portal




    Scanner scannerNum = new Scanner(System.in);       //scanner that reads number input from console
    Scanner scannerString = new Scanner(System.in);    //scanner that reads string input from console























    //main menu
    @Override
    public void openMainMenu() {
        while(true) {
        System.out.println("Main Menu\n1 - Register\n2 - Login");
        int option = scannerNum.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Register - or type 'back' to return to Main Menu");
                    System.out.println("Create Username: ");
                    String euInput = scannerString.nextLine();
                    if(euInput.equalsIgnoreCase("back")) {
                        continue;
                    } else{
                        employeeUsername = euInput;
                    }
                    System.out.println("Create Password: ");
                    String epInput = scannerString.nextLine();
                    if(epInput.equalsIgnoreCase("back")) {
                        continue;
                    }else{
                        employeePassword = epInput;
                    }

                case 2:
                    System.out.println("Login - or type 'back' to return to Main Menu");
                    System.out.println("Username: ");
                    String tuInput = scannerString.nextLine();
                    if(tuInput.equalsIgnoreCase("back")){
                        continue;
                    }else{
                        testUsername = tuInput;
                    }
                    System.out.println("Password: ");
                    String tpInput = scannerString.nextLine();
                    if(tpInput.equalsIgnoreCase("back")){
                        continue;
                    }else{
                        testPassword = tpInput;
                    }
            }
            if (testUsername.equals(employeeUsername) && testPassword.equals(employeePassword)) {
                break;
            } else if(testUsername.equals(managerUsername) && testPassword.equals(managerPassword)) {
                manager = true;
                break;
            }
        }
    }



















    //manager portal
    //the string array below is just dummy data for now
    String[] ticketArray = {"$134.75 - new chairs for the office","$167.42 - window cleaning for the building","$45.00 - paper for the copier machine","34.29 - ink for the printer"};
    @Override
    public void openManagerPortal() {
       while(mpLoggedIn){                            //this while loop brings the user back to the manager portal menu after review is complete
        System.out.println("Manager Portal\n1 - Review Submissions\n2 - Log Out");
        int option = scannerNum.nextInt();
        switch(option) {
            case 1:
                System.out.println("Review Submissions-----type 'A' to Approve-----'D' to Deny------or 'back' to return to Manager Portal Menu");
                for (int i = 0; i < ticketArray.length; i++) {       //this for-loop iterates through the data
                    System.out.println("Please review the submission below: ");            //and allows the manager to approve or deny the submission
                    System.out.println(ticketArray[i]);
                    String stamp = scannerString.nextLine();
                    if (stamp.equalsIgnoreCase("A")) {
                        System.out.println("Approved: " + ticketArray[i]);
                    } else if (stamp.equalsIgnoreCase("D")) {
                        System.out.println("Denied: " + ticketArray[i]);
                    } else if(stamp.equalsIgnoreCase("back")){
                        break;
                    }
                }
                continue;
            case 2:
                System.out.println("Logging out...");
                mpLoggedIn = false;

        }
        }

    }



















    //employee portal
    @Override
    public void openEmployeePortal() {
        while(epLoggedIn) {
            System.out.println("Employee Portal\n1 - Submit a New Ticket\n2 - View My Past Submissions\n3 - Log Out");
            int option = scannerNum.nextInt();
            switch (option) {
                case 1:
                    openTicketSubmissionPortal();
                    break;
                case 2:
                    openTicketFilter();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    epLoggedIn = false;
            }
        }
    }

    //this method is a branch of the openEmployeePortal method and is called from there rather than from the main method
    public void openTicketFilter() {
        System.out.println("View Past Submissions\n1 - Approved\n2 - Denied\n3 - Pending");
        int option = scannerNum.nextInt();
        switch(option) {
            case 1:
                System.out.println("Approved Submissions");
                for(int j = 0; j < ticketArray.length; j ++) {
                    System.out.println(ticketArray[j]);
                }
                break;
            case 2:
                System.out.println("Denied Submissions");
                for(int j = 0; j < ticketArray.length; j ++) {
                    System.out.println(ticketArray[j]);
                }
                break;
            case 3:
                System.out.println("Pending Submissions");
                for(int j = 0; j < ticketArray.length; j ++) {
                    System.out.println(ticketArray[j]);
                }
                break;
        }
    }

    //this method opens the ticket submission portal and is called from the openEmployeePortal method rather than from the main method
    public void openTicketSubmissionPortal() {
        while(true) {
            System.out.println("Press Enter to Submit a New Ticket-------or-------type 'back' to return to Employee Portal Menu");
            String submit = scannerString.nextLine();
            if (submit.equalsIgnoreCase("back")) {
                break;
            }else if(submit.equals("")){
                System.out.println("Ticket Amount in $: ");
                BigDecimal amt = new BigDecimal(scannerNum.nextDouble());
                NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
                String s = n.format(amt);
                System.out.println("Description of Purchase: ");
                String description = scannerString.nextLine();
                System.out.println(s + " - " + description);
                System.out.println("Press Enter to Confirm Submission--------or--------type 'back' to return to Employee Portal Menu");
                String submit2 = scannerString.nextLine();
                if (submit2.equals("")) {
                    System.out.println("submission saved");
                } else if (submit2.equalsIgnoreCase("back")) {
                    break;
                }
            }
        }
    }
}
