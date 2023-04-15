import java.util.*;

//Define class WrongDestinationException
class WrongDestinationException extends Exception {
    // public WrongDestinationException (String message) {
    //     super(message);
    // }
    public String toString() {
        return "WrongDestinationException: Invalid destination";
    }
}

//Define class ImproperHeadCountException
class ImproperHeadCountException extends Exception {
    public ImproperHeadCountException (String message) {
        super(message);
    }
    public String toString() {
        return "ImproperHeadCountException";
    }
}

class CarRental{
    int passenger_count;
    String chosen_destination;
    HashMap<String,Double> available_destinations;  
	
    public CarRental(int pc, String dest) {
        passenger_count = pc;
        chosen_destination = dest;
        //preassigned destinations and total car fare
        //Leave the code below as it is
        available_destinations = new HashMap<String,Double>();
        available_destinations.put("Marina Beach", 2000.0);
        available_destinations.put("Elliot's Beach", 5000.0);
        available_destinations.put("Film City", 8000.0);
    }
    public void carBooker() throws WrongDestinationException, ImproperHeadCountException, NullPointerException {
        //define this method according to the problem description
        Double cost;
        
        try {
            if (passenger_count <= 0) {
                ImproperHeadCountException ihce = new ImproperHeadCountException("Head count should be positive non zero value");
                throw ihce;
            } else {
                try {
                    if (this.available_destinations.containsKey(chosen_destination)) {
                        cost = this.available_destinations.get(chosen_destination);
                        System.out.println("Destination: " + chosen_destination + ", Head cost: " + cost/passenger_count);
                    } else {
                        throw new NullPointerException();
                    }
                }
                catch (NullPointerException npe) {
                    WrongDestinationException wde = new WrongDestinationException();
                    npe.initCause(wde);
                    throw npe;
                }
            }
        }
        catch (ImproperHeadCountException ihce) {
            System.out.println(ihce + ": " + ihce.getMessage());
        }
    }


/*Complete the following program which models a car rental kiosk, and handles user requests as detailed below.
The program should first accept the number of car rental requests, and then accept details of each request in the following format.
Total number of passengers in the group for the rental request.
Destination of the visit.	
            These values are used for initialization of fields inside the constructor of CarRental class.
There is a HashMap called available_destinations which contains a set of preassigned destinations and the fare  for dropping at that destination. This map is also initialized in the constructor of CarRental class.
 The carBooker() method processes the booking requests, and should have the following functionalities:
It should retrieve the fare for the chosen destination from the available_destinations map and calculate the fare per head by dividing the fare for the destination by passenger_count. 
Then, it should print the destination and the fare per head, in the format shown in the public test cases. 
 The method should generate/handle the following exceptions.	
ImproperHeadCountException should be thrown when passenger_count is zero or negative. The catch block handling this exception should print the exception type along with the message: 
"Head count should be positive non-zero value".	
 If the chosen_destination is not found in available_destinations, a NullPointerException is thrown. The catch block handling this should create a new exception called WrongDestinationException, 
 set the new exception as the cause of the NullPointerException, and then re-throw it.            WrongDestinationException object should be created such that when getCause() is called, 
 it prints the message as shown in the public test cases. 
 
 
ImproperHeadCountException: Head count should be positive non zero value
Destination: Elliot's Beach, Head cost: 1250.0
WrongDestinationException: Invalid destination

 */
}
public class Test4{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt(); //input the number of car rental requests
        try {
            for(int i=1;i<=num;i++) {
                int heads = s.nextInt(); //enter head count
                s.nextLine();  //enter destination
                String dest = s.nextLine();     
                CarRental obj = new CarRental(heads,dest);
                obj.carBooker();
            }
        }catch(Exception e) {
            System.out.println(e.getCause());
        }
    }
}
