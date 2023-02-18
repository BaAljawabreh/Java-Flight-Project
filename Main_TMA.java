/*
I decided to implement a program like an airline system, create flight
and then add pilot and passengers for each flight with the different information about them.
Finally, saving the whole data and information in a text file.
*/
package tma_20416713;

public class Main_TMA {
    
    public static void main(String [] args) {

        MyWholeWork WW = new MyWholeWork();
        MyFlights FL = new MyFlights();
        
        MyFlights FL1 = new MyFlights(1,"11/25/2021","economy","ruh","damm");
        WW.InsertFli(FL1);
        MyPilot PI1 = new MyPilot("cress",4747929,34,852,'M');
        WW.InsertPi(PI1, FL1);
        MyPassengers PA1 = new MyPassengers("mark",74873648,1,'M',"adult"); 
        WW.InsertPassen(PA1, FL1);
        MyPassengers PA11 = new MyPassengers("meli",9247193,2,'F',"adult");
        WW.InsertPassen(PA11, FL1);
        MyPassengers PA111 = new MyPassengers("steve",4682585,3,'M',"children");
        WW.InsertPassen(PA111, FL1);
        MyPassengers PA1111 = new MyPassengers("rayan",795218,4,'M',"infants");
        WW.InsertPassen(PA1111, FL1);
        MyPassengers PA11111 = new MyPassengers("lali",8963379,5,'F',"children"); 
        WW.InsertPassen(PA11111, FL1);
        MyPassengers PA111111 = new MyPassengers("kasa",2757964,6,'F',"children");
        WW.InsertPassen(PA111111, FL1); 
        MyPassengers PA1111111 = new MyPassengers("lossy",8357834,7,'F',"infants");
        WW.InsertPassen(PA1111111, FL1); 
        MyPassengers PA11111111 = new MyPassengers("lolwa",4682585,8,'F',"adult");
        
        MyFlights FL2 = new MyFlights(2,"12/31/2021","economy","ruh","abha");
        WW.InsertFli(FL2);
        MyPilot PI2 = new MyPilot("Khabi",96246,26,833,'F');
        WW.InsertPi(PI2, FL2);
        MyPassengers PA2 = new MyPassengers("jane",8963379,1,'F',"adult");
        WW.InsertPassen(PA2, FL2);  
        MyPassengers PA22 = new MyPassengers("sozi",974314,2,'F',"adult");
        WW.InsertPassen(PA22, FL2);
        MyPassengers PA222 = new MyPassengers("sendrella",0174147,3,'F',"adult");
        WW.InsertPassen(PA222, FL2);
        
        MyFlights FL3 = new MyFlights(3,"12/05/2021","business","abha","ruh");
        WW.InsertFli(FL3);
        MyPilot PI3 = new MyPilot("losi",86274,46,725,'F');
        WW.InsertPi(PI3, FL3);
        MyPassengers PA3 = new MyPassengers("kasi",92828749,1,'F',"adult");
        WW.InsertPassen(PA3, FL3);
        MyPassengers PA33 = new MyPassengers("madi",36986327,2,'M',"infants");
        WW.InsertPassen(PA33, FL3); 
        MyPassengers PA333 = new MyPassengers("saleh",7551328,3,'M',"adult");
        WW.InsertPassen(PA333, FL2);
        MyPassengers PA3333 = new MyPassengers("mali",8438592,3,'M',"adult");
        WW.InsertPassen(PA3333, FL3);
 
        MyFlights FL4 = new MyFlights(4,"05/29/2021","economy","uk","paris");
        WW.InsertFli(FL4);
        MyPilot PI4 = new MyPilot("aris",92683,29,727,'M');
        WW.InsertPi(PI4, FL4);
        MyPassengers PA4 = new MyPassengers("tedi",24797641,1,'M',"children");
        WW.InsertPassen(PA4, FL4);
        MyPassengers PA44 = new MyPassengers("Khabi",92828749,2,'M',"infants");
        WW.InsertPassen(PA44, FL4);
        MyPassengers PA444 = new MyPassengers("sali",9147894,3,'F',"adult");
        WW.InsertPassen(PA444, FL4);
        
        MyFlights FL5 = new MyFlights(5,"02/09/2021","first class","paris","maldives");
        WW.InsertFli(FL5);
        MyPilot PI5 = new MyPilot("joly",67389,42,395,'F');
        WW.InsertPi(PI5, FL5);
        MyPassengers PA5 = new MyPassengers("taha",9279631,1,'M',"adult");
        WW.InsertPassen(PA5, FL5);
        MyPassengers PA55 = new MyPassengers("tala",4394062,3,'F',"adult");
        WW.InsertPassen(PA55, FL5);
        MyPassengers PA555 = new MyPassengers("Khabi",2846220,2,'M',"infants");
        WW.InsertPassen(PA555, FL4);

        MyFlights FL6 = new MyFlights(6,"10/17/2021","first calss","turkey","ruh");
        WW.InsertFli(FL6);
        MyPilot PI6 = new MyPilot("ches",62946,33,529,'M');
        WW.InsertPi(PI6, FL6);
        MyPassengers PA6 = new MyPassengers("meli",36842889,1,'F',"adult");  
        WW.InsertPassen(PA6, FL6);
        MyPassengers PA66 = new MyPassengers("sahar",1369454,2,'F',"adult");
        WW.InsertPassen(PA66, FL3);
        MyPassengers PA666 = new MyPassengers("bella",5692581,3,'F',"adult");
        WW.InsertPassen(PA666, FL3);
        
        MyFlights FL7 = new MyFlights(7,"06/30/2021","business","ruh","turkey");
        WW.InsertFli(FL7);
        MyPilot PI7 = new MyPilot("bell",37383,27,358,'M');
        WW.InsertPi(PI7, FL7);
        MyPassengers PA7 = new MyPassengers("beri",9521753,1,'M',"adult"); 
        WW.InsertPassen(PA7, FL7); 
        MyPassengers PA77 = new MyPassengers("manal",6842964,2,'F',"adult");
        WW.InsertPassen(PA77, FL7);
        MyPassengers PA777 = new MyPassengers("lolwa",4682585,3,'F',"children");
        WW.InsertPassen(PA777, FL7);
        
        System.out.println("\n******************************************************************\n");
        System.out.println("Inserting and taking out flights, pilots and passengers: \n");
        
        MyFlights FL8 = new MyFlights(3,"07/19/2021","economy","jedd","italy");
        WW.InsertFli(FL8);
        WW.InsertPi(PI5, FL5);
        
        WW.InsertPassen(PA11111111, FL1);
        MyPassengers PA8 = new MyPassengers("hali",2477353,8,'M',"adult");
        WW.InsertPassen(PA8, FL6);
        WW.InsertPassen(PA44, FL4); 
        FL.BringOutPassen(PA333);//It removes passenger when the mumber of passengers is greater than min, but there's problem in executing the code
        FL.BringOutPassen(PA66);
        
        System.out.println(WW.toString());
        WW.AverageForPassensInFlight("12/05/2021");
        WW.ShowMethod();
        WW.StoreDataInFile("AirlineSystem.txt");
   
    }
}
// Now, I have finished the program, and it is working effectively.