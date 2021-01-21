public class Oven extends Device {
    /**Variable Statements*/
    private int length;
    private int height;
    private int depth;
    private String manufacturer_name;
    private String device_name;
    private String device_type;
    private int energy_consumption;
    private int oven_capacity;
    private int ways_of_baking;
    private boolean digital_Screen;
    private boolean telescopic_Mechanism;
    private String switches;
    static int counter=0;

    /**Constructor for initializing the Air Condition objects*/
    public Oven(){}
    public Oven(int length, int height, int depth, String manufacturer_name, String device_name,
                String device_type, int energy_consumption, int oven_capacity, int ways_of_Baking,
                boolean telescopic_Mechanism, boolean digital_Screen, String switches)
    {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.manufacturer_name = manufacturer_name;
        this.device_name = device_name;
        this.device_type = device_type;
        this.energy_consumption = energy_consumption;
        this.oven_capacity = oven_capacity;
        this.ways_of_baking = ways_of_Baking;
        this.telescopic_Mechanism = telescopic_Mechanism;
        this.digital_Screen = digital_Screen;
        this.switches = switches;
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

    public  void set (int oven_capacity){
        this.oven_capacity = oven_capacity;
    }
    public  void setways_of_baking (int ways_of_baking){
        this.ways_of_baking = ways_of_baking;
    }
    public  void setdigital_Screen (boolean digital_Screen){
        this.digital_Screen = digital_Screen;
    }
    public  void settelescopic_Mechanism (boolean telescopic_Mechanism){
        this.telescopic_Mechanism = telescopic_Mechanism;
    }
    public  void setswitches (String switches){
        this.switches = switches;
    }
    public  int getlength () {
        return length;
    }
    public  int getheight () {
        return height;
    }
    public  int getdepth () {
        return depth;
    }
    public  String getmanufacturer_name () {
        return manufacturer_name;
    }
    public  String getdevice_name () {
        return device_name;
    }
    public  String getdevice_type () {
        return device_type;
    }
    public  int getenergy_consumption () {
        return energy_consumption;
    }
    public  int getoven_capacity () {
        return oven_capacity;
    }
    public  int getways_of_baking () {
        return ways_of_baking;
    }
    public  boolean getdigital_Screen () {
        return digital_Screen;
    }
    public  boolean gettelescopic_Mechanism () {
        return telescopic_Mechanism;
    }
    public  String getswitches () {
        return switches;

    }
    public int getCounter(){
        return counter;
    }
    /**Function for Oven device to print objects*/
    public void PrintOven(){
        System.out.println("\ndevice details for Oven: ");
        System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
        System.out.println("Manufacturer: " + manufacturer_name);
        System.out.println("Device name: " + device_name);
        System.out.println("device type: " + device_type);
        System.out.println("energy consumption: " + energy_consumption);
        System.out.println("oven capacity: " + oven_capacity);
        System.out.println("ways of baking: " + ways_of_baking);
        System.out.println("telescopic mechanism: " + telescopic_Mechanism);
        System.out.println("digital screen: " + digital_Screen);
        System.out.println("switches: " + switches);

    }


}