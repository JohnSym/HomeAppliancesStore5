import java.awt.*;
import java.awt.print.Printable;
import java.util.Scanner;
public class HomeAppliancesStore {
    /**variable statements*/
    static String company;
    static String adress;
    static int employees;
    /** Getters and Setters*/
    public String getCompany() {
        return this.company;
    }

    public void setCompany(String newcompany) {
        this.company = newcompany;
    }

    public String getAddress() {
        return this.adress;
    }

    public void setAddress(String newaddress) {
        this.adress = newaddress;
    }

    public int getEmployees() {
        return this.employees;
    }

    public void setEmployees(int newemployees) {
        this.employees = newemployees;
    }

    public static void main(String [] args) {
        /**user add's company,adress,employees information*/
        Scanner myObj = new Scanner(System.in);
        System.out.println("what's the company's name: ");
        String company = myObj.nextLine();
        if (company == null) {
            System.out.println("there is no company name");
        } else {
            System.out.println("The company's name is: " + company);
        }

        {
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("What's the company's adress: ");
            String adress = myObj2.nextLine();
            if (adress == null) {
                System.out.println("there is no company adress");
            } else {
                System.out.println("the adress is : " + adress);
            }
        }

        {
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("How many people work in the company: ");
            int employees = myObj3.nextInt();
            if (employees == 0) {
                System.out.println("there is no employees");
            } else {
                System.out.println("There are: " + employees + " employees");
            }
        }


        /** here we give info for every device and call its function to print the info*/
        AirCondition AC= new AirCondition(777, 250, 200, "Tesla", "TT34X81-1232IAW","Air Condition",255,11942,12010,true,true,true);
        AC.PrintAirCondition();
        Fridge fridge = new Fridge(70, 190, 70, "Bosch", "KB90 AA","Fridge",120,false,112,114,110,true);
        fridge.PrintFridge();
        WashineMachine WM= new WashineMachine(85,60,60,"Pitsos","WNP1200D8","Washing Machine",175,8,55,false,14,1200);
        WM.PrintWashineMchine();
        Oven O=new Oven(81,60,60,"AEG","CCB6442ABM","Oven",140,75,7,true,true,"Immersed");
        O.PrintOven();


        /**Devices Status read*/
        O.powerOff();
        AC.powerOn();
        fridge.powerOn();
        WM.powerOff();
        deviceStatus(AC);

        /**It Prints all counter for all devices  */
        int Counter = O.getCounter()+ AC.getCounter()+ WM.getCounter()+ fridge.getCounter();
        System.out.println("There are are: "+Counter +" Devices Connected");



    }
    /**Devices Status print*/
    public static void deviceStatus(Device d) {
        System.out.println("Device Status: " + d.status());
        System.out.println("Device Type: ");

        if (d instanceof Oven)
            System.out.println("Oven");

        if (d instanceof AirCondition)
            System.out.println("Air Condition");

        if (d instanceof WashineMachine)
            System.out.println("Washing Machine");

        if (d instanceof Fridge)
            System.out.println("Fridge");


    }

}
