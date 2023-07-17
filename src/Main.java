import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        OverseaTour overseaTour;
        DomesticTour domesticTour;
        while (true) {
            //while true the program continue
            //ask user whether he/she want to continue
            System.out.print("(1)Start creating a new tour /  (2)Print Oversea Tours / (3)Print Domestic Tours / (4)Exit the program\n");
            System.out.print("Please make a choice: ");
            int choice;
            int tourSelection;
            choice = keyboard.nextInt();

            //Start creating a new tour
            if (choice == 1) {//ask user to choose the type of tour

                System.out.print("(1)Domestic Tour / (2)Oversea Tour: ");
                keyboard.nextLine();
                tourSelection = Integer.parseInt(keyboard.nextLine());
                if (tourSelection == 1) {


                    HashMap answers = askDomesticTourQuestion(keyboard);

                    String stateName = (String) answers.get("stateName");
                    boolean hasPrivateTour = (boolean) answers.get("hasPrivateTour");
                    int duration = (int) answers.get("duration");
                    boolean hasHoneyMoonTour = (boolean) answers.get("hasHoneyMoonTour");

                    domesticTour =
                            new DomesticTour(stateName, hasPrivateTour, duration, hasHoneyMoonTour);
                    domesticTour.addDomesticTour(domesticTour);

                } else {
                    HashMap answers = askOverseaTourQuestion(keyboard);

                    String countryName = (String) answers.get("countryName");
                    String stateName = (String) answers.get("stateName");
                    boolean hasPrivateTour = (boolean) answers.get("hasPrivateTour");
                    int duration = (int) answers.get("duration");
                    boolean hasJoinedTour = (boolean) answers.get("hasJoinedTour");

                    overseaTour = new OverseaTour(stateName, hasPrivateTour, duration, countryName, hasJoinedTour);

                    overseaTour.addOverseaTour(overseaTour);
                }
            } else if (choice == 2) {//print oversea tours list

            } else if (choice == 3) {//print domestic tours list

                DomesticTour tours =new DomesticTour();
                System.out.println(tours);

            } else {
                System.exit(0);
            }
        }
    }

    public static HashMap askDomesticTourQuestion(Scanner keyboard) {
        HashMap answers = new HashMap<>();


        while (true) {
            try {
                System.out.print("What is the state name: ");
                String stateName = keyboard.nextLine();
                answers.put("stateName", stateName);

                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }


        while (true) {
            try {
                System.out.print("Is the tour has private tour?(yes/no): ");
                String hasPrivateTour = keyboard.nextLine();
                if (hasPrivateTour.toLowerCase().matches("yes")) {
                    answers.put("hasPrivateTour", true);
                } else {
                    answers.put("hasPrivateTour", false);
                }
                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }

        while (true) {
            try {
                System.out.print("Is the tour has has honeymoon tour? (yes/no): ");
                String hasHoneyMoonTour = keyboard.nextLine();

                if (hasHoneyMoonTour.toLowerCase().matches("yes")) {
                    answers.put("hasHoneyMoonTour", true);
                } else {
                    answers.put("hasHoneyMoonTour", false);
                }

                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }
        while (true) {
            try {
                System.out.print("How many days is the tour?: ");
                int duration = keyboard.nextInt();
                answers.put("duration", duration);

                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }


        return answers;

    }

    public static HashMap askOverseaTourQuestion(Scanner keyboard) {
        HashMap answers = new HashMap<>();

        String countryName;
        while (true) {
            try {
                countryName = "";
                System.out.println("What is the country name: ");
                countryName = keyboard.nextLine();
                answers.put("countryName", countryName);

                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }

        String stateName;
        while (true) {
            try {
                stateName = "";
                System.out.println("What is the state name: ");
                stateName = keyboard.nextLine();
                answers.put("stateName", stateName);

                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }


        String hasPrivateTour;
        while (true) {
            try {
                hasPrivateTour = "";
                System.out.println("Is the tour has private tour?(yes/no): ");
                hasPrivateTour = keyboard.nextLine();
                if (hasPrivateTour.toLowerCase().matches("yes")) {
                    answers.put("hasPrivateTour", true);
                } else {
                    answers.put("hasPrivateTour", false);
                }
                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }

        String hasJoinedTour;
        while (true) {
            try {
                hasJoinedTour = "";
                System.out.println("Is the tour has joined tour?(yes/no): ");
                hasJoinedTour = keyboard.nextLine();
                if (hasJoinedTour.toLowerCase().matches("yes")) {
                    answers.put("hasJoinedTour", true);
                } else {
                    answers.put("hasJoinedTour", false);
                }
                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }
        int duration;
        while (true) {
            try {
                duration = 0;
                System.out.println("How many days is the tour?: ");
                duration = keyboard.nextInt();
                answers.put("duration", duration);

                break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }
        }


        return answers;

    }


}