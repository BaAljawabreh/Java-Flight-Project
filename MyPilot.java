
package tma_20416713;
/* 
This class is a sub class of ComAtt_Fiel (Inheritance)
it decides the attribute for each pilot then comparing those pilots by their id numbers.
*/
public class MyPilot extends ComAtt_Fiel{
 
    // Insrance variables for pilot's attributes
    private long PiID;
    private int PiAge;
    private int EMPID;
            
     // zero-arg Constructer to give the variables defult  values
    public MyPilot(){
        this("null",0,0,0,'\u0000');
    }
    // Constructor with args to give each attribute value when it's called
    public MyPilot(String PiName,long piid, int piage,int empId, char PiGender){
        PiID = piid;     PiAge = piage;     EMPID = empId;    
        this.UserGender=PiGender;   this.UserName=PiName;
    }
 
    // Setter methods for each attribute
    public void setEMPID(int EMPID) {
        this.EMPID = EMPID;
    }
   
    public void setPiID(long piid){
        PiID = piid;
    }

    public void setPiAge(int piage){
        PiAge = piage;
    }
    
    // Getter methods for each attribute
    public int getEMPID(){
        return EMPID;
    }

    public long getPiID() {
        return PiID;
    }

    public int getPiAge(){
        return PiAge;
    }

    // Method compares two objects in ID numbers for pilots
    @Override
    public boolean equals(Object OB){
        MyPilot pi = (MyPilot) OB;
        return PiID == pi.PiID;
    }
    
    //Method prints the information of the pilot
   @Override
    public String toString() {
        return super.toString()+" ID: "+PiID+" Employeed Id: ("+EMPID+") Age: "+PiAge+"\n";
    }  
    
}
