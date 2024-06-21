Here is the code for demoparty.java
  import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DinnerParty dinnerParty = new DinnerParty();

        System.out.print("Enter the number of guests for the dinner party: ");
        int guests = scanner.nextInt();
        dinnerParty.setNumGuests(guests);

        System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
        int menuOption = scanner.nextInt();
        dinnerParty.setFoodChoice(menuOption);

        System.out.println("\nThe dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");
        
        dinnerParty.showInvitation();

        scanner.close();
    }
}

here is the code for dinnerparty.java
  public class DinnerParty extends Party {
    private int foodChoice;


    public int getFoodChoice() {
        return foodChoice;
    }


    public void setFoodChoice(int choice) {
        this.foodChoice = choice;
    }


    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}

here is the code for party.java
  public class Party {
    private int numGuests;


    public int getNumGuests() {
        return numGuests;
    }


    public void setNumGuests(int num) {
        this.numGuests = num;
    }


    public void showInvitation() {
        System.out.println("Please come to my party!");
    }
}
