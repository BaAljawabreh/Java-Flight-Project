
package tma_20416713;
import java.util.*; // to use Array list
/*
This class  decides the attribute for each flight, creates a list 
to gather the passengers then implement methods to remove passengers, 
for sure before comparing those passengers between them.
*/
public class MyFlights {
    
    // Array List for passengers 
    final private ArrayList <MyPassengers> PassenList = new ArrayList<>();
    
    // Instance variables for flight's attributes
    private String CabinClass,TakeOffCity,LandCity;
    private int NumberingOfFlight;
    private String TakeOffDate;
    private MyPilot Pi;
    final public int MinNumOfPassen=3;
    final public int MaxNumOfPassen=7;
    
    
    // zero-arg Constructer 
    public MyFlights(){
    }
    // Constructor with args to give each attribute value when it's called
    public MyFlights(int NOF,String TOD,String CCL,String TOC,String LC){
        CabinClass=CCL;  TakeOffCity=TOC;  
        LandCity=LC;    NumberingOfFlight=NOF;    TakeOffDate=TOD;   
    }
    
    // Setter methods for each attribute 
    public void setCabinClass(String CCL) {
        CabinClass = CCL;
    }

    public void setTakeOffCity(String TOC){
        TakeOffCity = TOC;
    }

    public void setLandCity(String LC){
        LandCity = LC;
    }

    public void setNumberingOfFlight(int NOF){
        NumberingOfFlight = NOF;
    }

    public void setTakeOffDate(String TOD) {
        TakeOffDate = TOD;
    }
 
    public void setPi(MyPilot pi){
        Pi = pi;
    }

    // Getter methods for each attribute
    public String getCabinClass() {
        return CabinClass;
    }

    public String getTakeOffCity(){
        return TakeOffCity;
    }

    public String getLandCity(){
        return LandCity;
    }

    public int getNumberingOfFlight(){
        return NumberingOfFlight;
    }
    
    public ArrayList<MyPassengers> getPassenList(){
        return PassenList;
    }

    public String getTakeOffDate(){
        return TakeOffDate;
    }

    public int getMinNumOfPassen() {
        return MinNumOfPassen;
    }

    public int getMaxNumOfPassen(){
        return MaxNumOfPassen;
    }

    public MyPilot getPi(){
        return Pi;
    }
    
    // Method takes a passenger and check if this passenger is inserted to any flight or not
    public boolean PassenBeing(MyPassengers Pass){
        boolean passenThere= false; //To make sure the conditions execute in right way
        for (MyPassengers passen : PassenList){
            if (passen.equals(Pass)){
                passenThere= true;
                break;
            }
        }
        return passenThere;
    }
    // Method to take out specific passenger from flight
    public void BringOutPassen(MyPassengers PA){
        if(MinNumOfPassen < PassenList.size()){
            if(PassenBeing(PA)){
                PassenList.remove(PA);
                System.out.println("Passenger you entered successfuly taken out.");
            }
        }
        else{
            System.out.println("Sorry we can't take out passenger, minimum number of passengers has been reached.");
        } 
    }
    // Method prints the information of the passengers 
    public void PassensInfo(){
        if (PassenList.isEmpty()){ //if there are no passengers it prints no passengers 
            System.out.println("There are no passengers on this flight.");
        } 
        else{
            for (MyPassengers passens : PassenList){
                System.out.println(passens.toString());
            }
        }
    }
    // Method compares two objects in No. of flight and the date of it  
    @Override
    public boolean equals(Object ob){
        MyFlights FLI= (MyFlights)ob;
        return NumberingOfFlight == FLI.NumberingOfFlight || TakeOffDate.equals(FLI.TakeOffDate) ;
    }
    
    //Method prints the information of the flight
    @Override
    public String toString(){
        String PilotBeing = "There is no pilot "; //if there are no piolt inserted it prints no pilot
        if (Pi != null){
            PilotBeing = Pi.toString();
        }
        return "Flight "+NumberingOfFlight+"\nIt's pilot: "+PilotBeing+"At "+TakeOffDate+" Departure city: "+TakeOffCity+
               " Arrival city: "+LandCity +"  Cabin class: "+CabinClass+"  There are "+PassenList.size()+" passengers on this flight."+"\n";
    }
       
}