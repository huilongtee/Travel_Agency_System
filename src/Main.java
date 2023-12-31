import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TourAgency tourAgency = new TourAgency();
        Scanner keyboard = new Scanner(System.in);
        OverseaTour overseaTour;
        DomesticTour domesticTour;
        while (true) {
            //while true the program continue
            //ask user whether he/she want to continue
            System.out.println("#################################################################################################################################");
            System.out.println("(1)Create a new country /  (2)Create a new state / (3)Create a new tour / (4)View Tours / (5)Update Price / (6)Exit the program");
            System.out.println("#################################################################################################################################");

            System.out.print("Please make a choice: ");
            int choice;
            int tourSelection;
            choice = keyboard.nextInt();

//            //Start creating a new tour
//            if (choice == 1) {//ask user to choose the type of tour
//
//                System.out.print("(1)Domestic Tour / (2)Oversea Tour: ");
//                keyboard.nextLine();
//                tourSelection = Integer.parseInt(keyboard.nextLine());
//                if (tourSelection == 1) {
//
//
//                    HashMap answers = askDomesticTourQuestion(keyboard);
//
//                    String stateName = (String) answers.get("stateName");
//                    boolean hasPrivateTour = (boolean) answers.get("hasPrivateTour");
//                    int duration = (int) answers.get("duration");
//                    boolean hasHoneyMoonTour = (boolean) answers.get("hasHoneyMoonTour");
//
//                    domesticTour =
//                            new DomesticTour(stateName, hasPrivateTour, duration, hasHoneyMoonTour);
//                    domesticTour.addDomesticTour(domesticTour);
//
//                } else {
//                    HashMap answers = askOverseaTourQuestion(keyboard);
//
//                    String countryName = (String) answers.get("countryName");
//                    String stateName = (String) answers.get("stateName");
//                    boolean hasPrivateTour = (boolean) answers.get("hasPrivateTour");
//                    int duration = (int) answers.get("duration");
//                    boolean hasJoinedTour = (boolean) answers.get("hasJoinedTour");
//
//                    overseaTour = new OverseaTour(stateName, hasPrivateTour, duration, countryName, hasJoinedTour);
//
//                    overseaTour.addOverseaTour(overseaTour);
//                }
//            } else if (choice == 2) {//print oversea tours list
//
//            } else if (choice == 3) {//print domestic tours list
//
//                DomesticTour tours =new DomesticTour();
//                System.out.println(tours);
//
//            } else {
//                System.exit(0);
//            }
//        }

            switch (choice) {
                //Create a new country
                case 1: {
                    askAddCountryQuestion(keyboard, tourAgency);
                    break;
                }
                //Create a new state
                case 2: {
                    askAddStateQuestion(keyboard, tourAgency);
                    break;
                }
                //Create a new tour
                case 3: {
                    askAddTourQuestion(keyboard, tourAgency);
                    break;

                }
                case 4: {
                    askShowWhichTourQuestion(keyboard, tourAgency);
                    break;
                }
                case 5: {
                    askUpdatePriceQuestion(keyboard, tourAgency);
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default:
                    System.out.print("Please enter a valid number");
            }

        }


//    public static HashMap askDomesticTourQuestion(Scanner keyboard) {
//        HashMap answers = new HashMap<>();
//
//
//        while (true) {
//            try {
//                System.out.print("What is the state name: ");
//                String stateName = keyboard.nextLine();
//                answers.put("stateName", stateName);
//
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//
//
//        while (true) {
//            try {
//                System.out.print("Is the tour has private tour?(yes/no): ");
//                String hasPrivateTour = keyboard.nextLine();
//                if (hasPrivateTour.toLowerCase().matches("yes")) {
//                    answers.put("hasPrivateTour", true);
//                } else {
//                    answers.put("hasPrivateTour", false);
//                }
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//
//        while (true) {
//            try {
//                System.out.print("Is the tour has has honeymoon tour? (yes/no): ");
//                String hasHoneyMoonTour = keyboard.nextLine();
//
//                if (hasHoneyMoonTour.toLowerCase().matches("yes")) {
//                    answers.put("hasHoneyMoonTour", true);
//                } else {
//                    answers.put("hasHoneyMoonTour", false);
//                }
//
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//        while (true) {
//            try {
//                System.out.print("How many days is the tour?: ");
//                int duration = keyboard.nextInt();
//                answers.put("duration", duration);
//
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//
//
//        return answers;
//
//    }
//
//    public static HashMap askOverseaTourQuestion(Scanner keyboard) {
//        HashMap answers = new HashMap<>();
//
//        String countryName;
//        while (true) {
//            try {
//                countryName = "";
//                System.out.println("What is the country name: ");
//                countryName = keyboard.nextLine();
//                answers.put("countryName", countryName);
//
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//
//        String stateName;
//        while (true) {
//            try {
//                stateName = "";
//                System.out.println("What is the state name: ");
//                stateName = keyboard.nextLine();
//                answers.put("stateName", stateName);
//
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//
//
//        String hasPrivateTour;
//        while (true) {
//            try {
//                hasPrivateTour = "";
//                System.out.println("Is the tour has private tour?(yes/no): ");
//                hasPrivateTour = keyboard.nextLine();
//                if (hasPrivateTour.toLowerCase().matches("yes")) {
//                    answers.put("hasPrivateTour", true);
//                } else {
//                    answers.put("hasPrivateTour", false);
//                }
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//
//        String hasJoinedTour;
//        while (true) {
//            try {
//                hasJoinedTour = "";
//                System.out.println("Is the tour has joined tour?(yes/no): ");
//                hasJoinedTour = keyboard.nextLine();
//                if (hasJoinedTour.toLowerCase().matches("yes")) {
//                    answers.put("hasJoinedTour", true);
//                } else {
//                    answers.put("hasJoinedTour", false);
//                }
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//        int duration;
//        while (true) {
//            try {
//                duration = 0;
//                System.out.println("How many days is the tour?: ");
//                duration = keyboard.nextInt();
//                answers.put("duration", duration);
//
//                break;
//            } catch (Exception e) {
//                System.out.println(e);
//                keyboard.next();
//            }
//        }
//
//
//        return answers;
//
//    }


    }

    public static void askAddCountryQuestion(Scanner keyboard, TourAgency tourAgency) {


        try {
            keyboard.nextLine();
            System.out.print("Please enter the country name: ");
            String countryName = keyboard.nextLine();
            ArrayList<State> stateList = new ArrayList<>();

            if (!countryName.isEmpty()) {

                while (true) {
                    boolean isExit = false;
                    System.out.println("(1)Create a new state / (2)Exit");
                    System.out.print("Please make a choice: ");
                    int choice = keyboard.nextInt();
                    keyboard.nextLine();
                    if (choice == 1) {
                        System.out.print("Please enter the state name: ");
                        String stateName = keyboard.nextLine();


                        stateList.add(new State(stateName));

                    } else if (choice == 2) {
                        isExit = true;
                        break;
                    }

                }

                Country country = new Country(countryName, stateList);
                tourAgency.addCountry(country);
            }


        } catch (Exception e) {
            System.out.println(e);
            keyboard.next();
        }
    }


    public static void askAddStateQuestion(Scanner keyboard, TourAgency tourAgency) {
        System.out.println("###################################################################################################################");

        tourAgency.printCountryList();
        System.out.println("###################################################################################################################");

        try {
            System.out.print("Please select a country that you want to add the new state: ");
            keyboard.nextLine();
            int index = keyboard.nextInt();
            String countryName = tourAgency.getCountryName(index - 1);

            if (!countryName.isEmpty()) {
                while (true) {
                    boolean isExit = false;

                    System.out.println("(1)Create a new state / (2)Exit");
                    System.out.print("Please make a choice: ");
                    int choice = keyboard.nextInt();
                    keyboard.nextLine();
                    if (choice == 1) {
                        System.out.print("Please enter the state name: ");
                        String stateName = keyboard.nextLine();

                        tourAgency.addState(countryName, stateName);
                    } else if (choice == 2) {
                        isExit = true;
                        break;
                    }

                }

            }
        } catch (Exception e) {
            System.out.println(e);
            keyboard.next();
        }
    }

    public static void askAddTourQuestion(Scanner keyboard, TourAgency tourAgency) {
        String tourName = "";
        boolean hasPrivateTour = false;
        boolean hasHoneyMoonTour = false;
        int duration = 1;
        boolean hasJoinedTour = false;

        try {
            keyboard.nextLine();
            System.out.println("(1) Domestic Tour / (2) Oversea Tour");
            System.out.print("Please make a choice: ");
            int choice = keyboard.nextInt();
            if (choice == 1) {
                System.out.println("###################################################################################################################");

                //Domestic Tour
                tourAgency.printStateList();//print all states in Malaysia
                System.out.println("###################################################################################################################");

                System.out.print("Please select a state that you want to add the new tour: ");
                keyboard.nextLine();
                int index = keyboard.nextInt();
                String stateName = tourAgency.getLocalStateName(index - 1);
                keyboard.nextLine();


                while (true) {
                    try {
                        System.out.print("What is the tour name: ");
                        tourName = keyboard.nextLine();

                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        keyboard.next();
                    }
                }


                while (true) {
                    try {
                        System.out.print("Is the tour has private tour?(yes/no): ");
                        String answer = keyboard.nextLine();
                        if (answer.toLowerCase().matches("yes")) {
                            hasPrivateTour = true;
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
                        String answer = keyboard.nextLine();

                        if (answer.toLowerCase().matches("yes")) {
                            hasHoneyMoonTour = true;
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
                        duration = keyboard.nextInt();


                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                        keyboard.next();
                    }
                }
                DomesticTour tour = new DomesticTour(tourName, hasPrivateTour, duration, hasHoneyMoonTour, stateName);
                tourAgency.addTour(tour);

            } else if (choice == 2) {
                System.out.println("###################################################################################################################");

                tourAgency.printCountryList();
                System.out.println("###################################################################################################################");


                System.out.print("Please select a country that you want to add for the new trip: ");
                keyboard.nextLine();
                int index = keyboard.nextInt();
                String countryName = tourAgency.getCountryName(index - 1);

                if (!countryName.isEmpty()) {
                    tourAgency.printStateList(index - 1);
                    System.out.print("Please select a state that you want to add for the new trip: ");
                    keyboard.nextLine();
                    int stateIndex = keyboard.nextInt();
                    String stateName = tourAgency.getOverseaStateName(index - 1, stateIndex - 1);
                    keyboard.nextLine();

                    while (true) {
                        try {
                            System.out.print("What is the tour name: ");
                            tourName = keyboard.nextLine();

                            break;
                        } catch (Exception e) {
                            System.out.println(e);
                            keyboard.next();
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Is the tour has private tour? (yes/no): ");
                            String answer = keyboard.nextLine();
                            if (answer.toLowerCase().matches("yes")) {
                                hasPrivateTour = true;
                            }
                            break;
                        } catch (Exception e) {
                            System.out.println(e);
                            keyboard.next();
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Is the tour has joined tour? (yes/no): ");
                            String answer = keyboard.nextLine();
                            if (answer.toLowerCase().matches("yes")) {
                                hasJoinedTour = true;
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
                            duration = keyboard.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println(e);
                            keyboard.next();
                        }
                    }

                    OverseaTour tour = new OverseaTour(tourName, hasPrivateTour, duration, countryName, hasJoinedTour, stateName);
                    tourAgency.addTour(tour);

                }


            } else {
                System.out.println("Please enter a valid number");
            }
        } catch (Exception e) {
            System.out.println(e);
            keyboard.next();
        }
    }

    public static void askShowWhichTourQuestion(Scanner keyboard, TourAgency tourAgency) {
        keyboard.nextLine();
        System.out.println("###################################################################################################################");

        tourAgency.printTourList();
        System.out.println("###################################################################################################################");

        System.out.print("Please select a trip: ");

        int index = keyboard.nextInt();
        tourAgency.printTour(index - 1);
    }

    public static void askUpdatePriceQuestion(Scanner keyboard, TourAgency tourAgency) {
        try {
            keyboard.nextLine();
            System.out.println("###################################################################################################################");

            tourAgency.printTourList();
            System.out.println("###################################################################################################################");

            System.out.print("Please select a trip to update its price: ");
            int index = keyboard.nextInt();

            String priceType = "";
//            HashMap<String, Double> priceMap = null;

            keyboard.nextLine();
            System.out.println("(1) Normal Price / (2) Peak Price");
            System.out.print("Please make a choice: ");
            int priceChoice = keyboard.nextInt();
            if (priceChoice == 1) {
                priceType = "NormalPrice";
                keyboard.nextLine();
                HashMap<String, Double> priceMap = getUpdatedPrice(keyboard);
                tourAgency.updatePrice(index - 1, priceType, priceMap);

            } else if (priceChoice == 2) {
                priceType = "PeakPrice";
                keyboard.nextLine();
                HashMap<String, Double> priceMap = getUpdatedPrice(keyboard);
                tourAgency.updatePrice(index - 1, priceType, priceMap);

            } else {
                System.out.println("Please enter a valid number");
            }


        } catch (Exception e) {
            System.out.println(e);
            keyboard.next();
        }

    }

    public static HashMap<String, Double> getUpdatedPrice(Scanner keyboard) {
        HashMap<String, Double> priceMap = new HashMap<>();
        double adultPrice = 0;
        double childWithExtraBedPrice = 0;
        double childWithNoExtraBedPrice = 0;
        double infantPrice = 0;

        System.out.print("Please enter the new adult price: ");
        adultPrice = keyboard.nextDouble();

        System.out.print("Please enter the new child with extra bed price: ");
        childWithExtraBedPrice = keyboard.nextDouble();

        System.out.print("Please enter the new child with no extra bed price: ");
        childWithNoExtraBedPrice = keyboard.nextDouble();

        System.out.print("Please enter the new infant price: ");
        infantPrice = keyboard.nextDouble();

        priceMap.put("adultPrice", adultPrice);
        priceMap.put("childWithExtraBedPrice", childWithExtraBedPrice);
        priceMap.put("childWithNoExtraBedPrice", childWithNoExtraBedPrice);
        priceMap.put("infantPrice", infantPrice);
        return priceMap;
    }
}