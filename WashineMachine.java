public class WashineMachine extends Device{
    /**Variable Statements*/
    private int length;
    private int height;
    private int depth;
    private String manufacturer_name;
    private String device_name;
    private String device_type;
    private int energy_consumption;
    private int RPM;
    private int Washing_capacity;
    private int Number_of_Programs;
    private boolean smart_properties;
    private int Washing_Noise_Level;
    static int counter=0;
    /**Constructor for initializing the Oven objects*/
    public WashineMachine(){}
    public WashineMachine(int length, int height, int depth, String manufacturer_name, String device_name,
                          String device_type, int energy_consumption, int Washing_capacity , int Washing_Noise_Level ,
                          boolean smart_properties , int Number_of_programms , int RPM)
    {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.manufacturer_name = manufacturer_name;
        this.device_name = device_name;
        this.device_type = device_type;
        this.energy_consumption = energy_consumption;
        this.Number_of_Programs=Number_of_programms;
        this.smart_properties=smart_properties;
        this.RPM=RPM;
        this.Washing_capacity=Washing_capacity;
        this.Washing_Noise_Level=Washing_Noise_Level;
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

    public  void setWashing_capacity (int Washing_capacity){
        this.Washing_capacity = Washing_capacity;
    }
    public  void setRPM (int RPM){
        this.RPM = RPM;
    }
    public  void setWashing_Noise_Level (int Washing_Noise_Level){
        this.Washing_Noise_Level = Washing_Noise_Level;
    }
    public  void setNumber_of_Programs (int Number_of_Programs){
        this.Number_of_Programs = Number_of_Programs;
    }
    public  void setsmart_properties (boolean smart_properties){
        this.smart_properties = smart_properties;
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
    public int getenergy_consumption(){
        return energy_consumption;
    }
    public int getWashing_capacity(){
        return Washing_capacity;
    }
    public int getRPM(){
        return RPM;
    }
    public int getWashing_Noise_Level(){
        return Washing_Noise_Level;
    }
    public int getNumber_of_Programs(){
        return Number_of_Programs;
    }
    public boolean getsmart_properties(){
        return smart_properties;
    }
    public int getCounter(){
        return counter;
    }
    /**Function for Washing Machine device to print objects*/
    public void PrintWashineMchine(){
        System.out.println("\ndevice details for Washing Machine: ");
        System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
        System.out.println("Manufacturer: " + manufacturer_name);
        System.out.println("Device name: " + device_name);
        System.out.println("device type: " + device_type);
        System.out.println("energy consumption: " + energy_consumption);
        System.out.println("Washine noise level: " +Washing_Noise_Level);
        System.out.println("Washine capacity: " +Washing_capacity);
        System.out.println("smart properties: " +smart_properties);
        System.out.println("Number of programms: " +Number_of_Programs);
        System.out.println("Number of RPM's: " +RPM);
    }


}
