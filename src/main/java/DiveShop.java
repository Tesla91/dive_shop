import gear.*;
import person.Client;

import java.util.Scanner;

class DiveShop {

    Boat[] boats;
    Fins[] fins;
    Tank[] tanks;
    Wetsuit[] wetsuits;

    public static void main(String[] args) {
        Client[] clients = new Client[100];
        int numClients = 0;

        DiveShop shop = new DiveShop();
        Scanner input = new Scanner(System.in);
        shop.populateDiveShop(input);
        System.out.println("***Switching to customer portal.***");

        System.out.println("Welcome to the Dive Shop - would you like to go diving? (yes/no)");
        String proceed = input.next();

        if (proceed.equalsIgnoreCase("yes")){
            System.out.println("How many people in your group?");
            int numDivers = input.nextInt();

            boolean available = shop.checkAvailability(numDivers);

            if (available){
                System.out.println("Awesome - let's get you guys set up...");
                for (int i = 0; i < numDivers; i++){
                    System.out.println("please enter the first name of the next diver");
                    String f_name = input.next();
                    System.out.println("please enter the last name of the next diver");
                    String l_name = input.next();
                    System.out.println("please enter the age of the next diver");
                    int age = input.nextInt();
                    System.out.println("please enter the dive type: (open, advanced, master)");
                    String d_type = input.next();
                    System.out.println("please enter the highest diver certification of the next diver");
                    String cert = input.next();

                    clients[numClients++] = new Client(f_name, l_name, age, d_type, cert);
                    System.out.println(f_name + " has been added to the dive");

                }
            } else {
                System.out.println("Hope you'll come again soon! (with a smaller group)");
            }
        }


    }

    public Client createClient(String first_name,
                               String last_name,
                               int age,
                               String lesson_type,
                               String cert_level){

        boolean isOk =
                validateClient(first_name, last_name, age, lesson_type,  cert_level);

        if (isOk){
            Client client = new Client(first_name, last_name, age, lesson_type, cert_level);
            return client;
        } else {
            System.out.println("You missed something important");
            return null;
        }
    }

    public boolean makeReservation(){

        return false;
    }

    public void startLesson(){

    }

    public void endLesson(){

    }

    private boolean validateClient(String first_name,
                 String last_name,
                 int age,
                 String lesson_type,
                 String cert_level) {

        if(first_name.isEmpty() || last_name.isEmpty()){
            return false;
        }
        if (age < 18 || age > 75){
            return false;
        }
        if (lesson_type.isEmpty()){
            return false;
        }
        if (cert_level.isEmpty()){
            return false;
        }
        return true;
    }

    private void populateDiveShop(Scanner input){
        System.out.println("Welcome to DiveShop Manager. Would you like to open the shop? (yes/no)");

        String open = input.next();
        if (open.equalsIgnoreCase("yes")){
            System.out.println("How many tanks do we have today?");
            int numTanks = input.nextInt();
            tanks = new Tank[numTanks];

            for (int i = 0; i < numTanks; i++){
                tanks[i] = new Tank(100, 5);
            }

            System.out.println("How many fins do we have?");
            int numFins = input.nextInt();
            fins = new Fins[numFins];

            for (int i = 0; i < numFins; i++){
                fins[i] = new Fins(10);
            }

            System.out.println("How many wetsuits do we have?");
            int numSuits = input.nextInt();
            wetsuits = new Wetsuit[numSuits];

            for (int i = 0; i < numSuits; i++){
                wetsuits[i] = new Wetsuit("Large", "Black", true);
            }

            boats = new Boat[1];
            boats[0] = new Boat(1, 5);

            System.out.println("Great, you are now open for business.");
            System.out.println("you have " + numTanks + " tanks available. " + numFins + " fins" +
                    " available and " + numSuits + " wetsuits available.");
        } else {
            System.out.println("bummer, must be bad day for having a good day.");
        }

    }

    public boolean checkAvailability(int numDivers){
        int numTanks = tanks.length;
        int numFins = fins.length;
        int numSuits = wetsuits.length;

        if (numDivers > numTanks){
            System.out.println("Dang, we don't have enough tanks for your group.");
            System.out.println("We only have " + numTanks + " tanks available today");
            return false;
        }
        if (numDivers > numFins / 2){
            System.out.println("Bummer, we don't have enough fins.");
            System.out.println("We only have " + numFins/2 + " sets of fins available today");
            return false;
        }
        if (numDivers > numSuits){
            System.out.println("Shoot, the water's too cold to dive without a suit.");
            System.out.println("We only have " + numSuits + " suits available today");
            return false;
        }
        if (numDivers > boats[0].getCapacity() - 1){
            System.out.println("Oh dang, our boat's not big enough for your group");
            System.out.println("We can only hold " + (boats[0].getCapacity() - 1) + "people");
            return false;
        }
        return true;
    }
}
