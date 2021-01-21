import java.awt.*;
public class Fridge extends Device{
    private int length;
    private int height;
    private int depth;
    private String manufacturer_name;
    private String device_name;
    private String device_type;
    private int energy_consumption;
    private boolean no_frost;
    private int total_capacity;
    private int maintenance_capacity;
    private int freezing_capacity;
    private boolean Built_in;
    static int counter=0;
    /**Constructor for initializing the Fridge objects*/
    public Fridge(){}
    public Fridge(
             int length, int height,int depth, String manufacturer_name,  String device_name,
            String device_type, int energy_consumption, boolean no_frost, int total_capacity, int maintenance_capacity
            , int freezing_capacity, boolean Built_in)
    {
        this.length=length;
        this.height=height;
        this.depth=depth;
        this.manufacturer_name=manufacturer_name;
        this.device_name=device_name;
        this.device_type=device_type;
        this.energy_consumption=energy_consumption;
        this.freezing_capacity=freezing_capacity;
        this.maintenance_capacity=maintenance_capacity;
        this.total_capacity=total_capacity;
        this.no_frost=no_frost;
        this.Built_in=Built_in;
        counter++;
    }
    /**Setters and Getters*/
    public void setlength (int length){
        this.length = length;
    }
    public void setheight (int height){
        this.height = height;
    }
    public void setdepth (int depth){
        this.depth = depth;
    }
    public  void setmanufacturer_name (String manufacturer_name){
        this.manufacturer_name = manufacturer_name;
    }
    public  void setdevice_name (String device_name){
        this.device_name = device_name;
    }
    public  void setdevice_type (String device_type){
        this.device_type = device_type;
    }
    public  void setenergy_consumption (int energy_consumption){
        this.energy_consumption = energy_consumption;
    }
    public  void setno_frost (boolean no_frost){
        this.no_frost = no_frost;
    }
    public  void settotal_capacity (int total_capacity){
        this.total_capacity = total_capacity;
    }
    public  void setmaintenance_capacity(int maintenance_capacity){
        this.maintenance_capacity = maintenance_capacity;
    }
    public  void setBuilt_in (boolean Built_in){
        this.Built_in = Built_in;
    }
    public  void setfreezing_capacity (int freezing_capacity){
        this.freezing_capacity = freezing_capacity;
    }
    public int getlength(){
        return length;
    }
    public int getheight(){
        return height;
    }
    public int getdepth(){
        return depth;
    }
    public String getmanufacturer_name(){
        return manufacturer_name;
    }
    public String getdevice_name(){
        return device_name;
    }
    public String getdevice_type(){
        return device_type;
    }
    public boolean getno_frost(){
        return no_frost;
    }
    public int gettotal_capacity(){
        return total_capacity;
    }
    public int getmaintenance_capacity(){
        return maintenance_capacity;
    }
    public int getfreezing_capacity(){
        return freezing_capacity;
    }
    public boolean getBuilt_in(){
        return Built_in;
    }
    public int getenergy_consumption(){
        return energy_consumption;
    }
    public int getCounter(){
        return counter;
    }
    /**Function for Fridge device to print objects*/
    public void PrintFridge(){
        System.out.println("\ndevice details for Fridge: ");
        System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
        System.out.println("Manufacturer: " + manufacturer_name);
        System.out.println("Device name: " + device_name);
        System.out.println("device type: " + device_type);
        System.out.println("energy consumption: " + energy_consumption);
        System.out.println("freezing capacity: " + freezing_capacity);
        System.out.println("maintenance_capacity: " + maintenance_capacity);
        System.out.println("total capacity: " + total_capacity);
        System.out.println("no frost: " + no_frost);
        System.out.println("built in: " + Built_in);
    }




}

