
package tma_20416713;
/* 
This class is a sub class of ComAtt_Fiel (Inheritance)
it decides the attribute for each passenger then comparing those passengers
by their passport numbers.
*/
public class MyPassengers extends ComAtt_Fiel {
    
    // Instance variables for passenger's attributes
    private long NumberOfPassport;
    private int NumOfSeat;
    private String AgeGroup;
    
    // zero-arg Constructer to give the variables defult  values
    
    public MyPassengers(){
        this("null",0,0,'\u0000',"null");    
    }
    // Constructor with args to give each attribute value when it's called
    public MyPassengers(String PassenName,long NOP, int NOS, char PassenGender,String agegroup){ 
        NumberOfPassport=NOP;   this.UserName = PassenName;     AgeGroup = agegroup;     
        NumOfSeat=NOS;          this.UserGender=PassenGender;
    }
    
    // Setter methods for each attribute
    public void setAgeGroup(String AgeGroup){
        this.AgeGroup = AgeGroup;
    }

    public void setNumberOfPassport(long NOP) {
        NumberOfPassport = NOP;
    }

    public void setNumOfSeat(int NOS){
        NumOfSeat = NOS;
    }
  
    // Getter methods for each attribute
    public String getAgeGroup() {
        return AgeGroup;
    }
   
    public long getNumberOfPassport(){
        return NumberOfPassport;
    }

    public int getNumOfSeat(){
        return NumOfSeat;
    }

    // Method compares two objects in passport numbers
    @Override
    public boolean equals(Object OB){
        MyPassengers pas = (MyPassengers) OB;
        return NumberOfPassport == pas.NumberOfPassport;
    }
    
     //Method prints the information of the passenger
   @Override
    public String toString() {
        return super.toString()+" Passport No. "+NumberOfPassport+" Seat number: "+NumOfSeat+" Age group: "+AgeGroup+"\n";
    }    
    
}
