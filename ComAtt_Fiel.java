
package tma_20416713;
/* 
Super class of MyPilot and MyPassengers, creates attributes that both 
passenger and pilot have. Therefore, we use the inheritance.
*/
public abstract class ComAtt_Fiel {
    
    // Instance variable for common attributes between pilot ans passenger
    protected String UserName;
    protected char UserGender;
    
    // zero-arg Constructer
    public ComAtt_Fiel(){
    }
    
    // Setter methods for each attribute
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    public void setUserGender(char usergender){
        UserGender = usergender;
    }
    
    // Getter methods for each attribute
    public String getUserName(){
        return UserName;
    }

    public char getUserGender() {
        return UserGender;
    }

    // This method will be called by the sub classes to print the common attributes
    @Override
    public String toString(){
        return "Name: "+UserName+" Gender:"+UserGender;
    }
 
}
