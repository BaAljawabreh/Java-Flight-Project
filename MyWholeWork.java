
package tma_20416713;
import java.util.*; // to use Array list and scanner 
import java.util.Collections; // to use the array list's methods
import java.io.*; // to use the streams
/* Class uses all the collections and implements several different methods. 
Like adding flights, pilots and passengers then find the average. After all that 
implement a method to save data in a file.
*/
public class MyWholeWork {
    
    // Array List for flight 
    final private ArrayList<MyFlights> Flis;
    // Constructer        
    public MyWholeWork(){
        this.Flis = new ArrayList<>();
    }
    // Getter method for the array list which gets the flights
    public ArrayList<MyFlights> getFlis(){
        return Flis;
    }
     // Method to take a flight and check if this flight is inserted or not
    public boolean FliBeing(MyFlights fli){
        boolean FliThere= false; //To make sure the conditions execute in right way
        for (MyFlights fligh : Flis){
            if(fligh.equals(fli)){
                FliThere= true;
                break;
            }
        }
        return FliThere;
    }
    // Method takes a pilot and check if this pilot is inserted to any flight or not
    public boolean PiBeing(MyPilot pi) {
        boolean PiThere= false; //To make sure the conditions execute in right way
        for (MyFlights fli : Flis) {
            if (fli.getPi() != null && fli.getPi().equals(pi)) {
                PiThere= true;
                System.out.println("The pilot who has the ID " + pi.getPiID() + " present in flight " + fli.getNumberingOfFlight());
                break;
            }
        }
        return PiThere;
    }
    
    // Method inserts a new flight if it's not there previously
    public void InsertFli(MyFlights FLi) {
        int found =0; //To make sure the conditions execute in right way
        if (!FliBeing(FLi) ){
            Flis.add(FLi);    
            System.out.println("\nFlight "+FLi.getNumberingOfFlight()+" successfully inserted.");
            found=1;
        }
        else{
            System.out.println("Flight "+FLi.getNumberingOfFlight()+" inserted previously.");
        }
    }
    // Method inserts a new pilot to specific flight if it's not there previously
    public void InsertPi(MyPilot pil, MyFlights flii) {
        if (Flis.contains(flii)){
            if ( !PiBeing(pil) ){
                flii.setPi(pil);
                System.out.println("The pilot who has this ID: " +pil.getPiID()+ " successfully inserted to flight "+ flii.getNumberingOfFlight());
            }   
        }
        else{
            System.out.println("This flight not found.");
        }
    }
    // Method inserts a new passenger to specific flight if it's not there previously
    public void InsertPassen(MyPassengers pass, MyFlights flii) {
        if (Flis.contains(flii)){
            if (flii.getPassenList().size() < flii.getMaxNumOfPassen()){
                if ( !flii.PassenBeing(pass)){
                    flii.getPassenList().add(pass);
                    System.out.println("The passenger who has the passport number: " + pass.getNumberOfPassport() + " successfully inserted to flight " + flii.getNumberingOfFlight());
                }
                else{
                    System.out.println("The passenger who has the passport number " + pass.getNumberOfPassport() + " present in flight " + flii.getNumberingOfFlight()+" immediately.");
                }
            }    
            else{
                System.out.println("Sorry, top number of passengers has been reached in flight " + flii.getNumberingOfFlight());
            }
        }
    }    
    // Method takes a date and calculates the average of passengers of this flight 
    public void AverageForPassensInFlight(String Tod){
        int NumOfFlights= 0;    int NumOfPassens= 0;    double TheAverage= 0.0;
        for(MyFlights fl : Flis){
            if(fl.getTakeOffDate().equals(Tod)){
                NumOfFlights++;
                NumOfPassens += fl.getPassenList().size();
            }
        }
        System.out.println("Number of whole passengers at " + Tod + " = " + NumOfPassens); // prints whole passengers in specific flight
        if(NumOfPassens !=0 && NumOfFlights !=0){
            TheAverage = NumOfPassens / NumOfFlights;
            System.out.println("*** The average of passengers per flight at " + Tod + " = " + TheAverage+"\n");
        } 
        else{ // If there are no passengers in the flight, the average will be 0.0
            System.out.println("*** The average of passengers per flight at " + Tod + " = " + 0.0+"\n");
        }
    }
    // This method sorts the flights by dates and prints the date with the number of the flight
    public void ShowMethod(){
        ArrayList<String> TODate = new ArrayList<>(); //to gather all dates 
        for(MyFlights fli : Flis){
            TODate.add(fli.getTakeOffDate()); 
        }    
        Collections.sort(TODate); //Sorting all dates
        for(String TOD : TODate) {
            System.out.print("* "+ TOD + " : ");
            ArrayList<Integer> NumOfFli = new ArrayList<>(); //to gather all flights numbers
            for(MyFlights flii : Flis){
                if (flii.getTakeOffDate().equals(TOD)){
                    NumOfFli.add(flii.getNumberingOfFlight());
                }
            }
            Collections.sort(NumOfFli); //Sortung all flights
            for(int No : NumOfFli ){//int No=0; No<=NumOfFli.size(); No++
                System.out.println("FlightNo."+No);
            }
        }
    }
    // Method takes the name of the text file and stores the data I entered in it
    public void StoreDataInFile(String NameOFile){
        try{
            PrintWriter MyData = new PrintWriter(NameOFile);
            for(MyFlights fli : Flis){
                MyData.write(fli.toString());
                MyData.write("\n");
            }
            MyData.close();
            System.out.println("\n*** Flights Data successfully Stored in file "+NameOFile+"\n");
        } 
        catch(IOException exc){
            System.out.println("You have an error: "+ exc +"\n");
        }
    }
    // method to print the number of flights
    @Override
    public String toString(){
        return "\nNumber of flights that inserted is: "+getFlis().size();
    }
    
}
