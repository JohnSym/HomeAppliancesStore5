public class AirCondition extends Device {
    /**Variable Statements*/
    private int length;
    private int height;
    private int depth;
    private String manufacturer_name;
    private String device_name;
    private String device_type;
    private int energy_consumption;
    private boolean air_filter;
    private int cooling_power;
    private int heating_Power;
    private boolean ionist;
    private boolean Ecological_Coolant_R32;
    static int counter=0;
    /**Constructor for initializing the Air Condition objects*/
    public AirCondition(){}
    public AirCondition(int length, int height, int depth, String manufacturer_name, String device_name,
            String device_type, int energy_consumption, int cooling_Power, int heating_Power ,
        boolean Ecological_Coolant_R32, boolean air_filter ,boolean ionist){

        this.length=length;
        this.height=height;
        this.depth=depth;
        this.manufacturer_name=manufacturer_name;
        this.device_name=device_name;
        this.device_type=device_type;
        this.energy_consumption=energy_consumption;
        this.cooling_power=cooling_Power;
        this.heating_Power=heating_Power;
        this.Ecological_Coolant_R32=Ecological_Coolant_R32;
        this.air_filter=air_filter;
        this.ionist=ionist;
        counter++;
    }

    /**Setter and Getters*/
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

    public  void setheating_Power (int heating_Power){
        this.heating_Power = heating_Power;
    }
    public  void setcooling_power (int cooling_power){
        this.cooling_power = cooling_power;
    }
    public  void setair_filter (boolean air_filter){
        this.air_filter = air_filter;
    }
    public  void setionist (boolean ionist){
        this.ionist = ionist;
    }
    public  void setEcological_Coolant_R32 (boolean Ecological_Coolant_R32){
        this.Ecological_Coolant_R32 = Ecological_Coolant_R32;
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
    public int getheating_Power(){
        return heating_Power;
    }
    public int getcooling_power(){
        return cooling_power;
    }
    public boolean getair_filter(){
        return air_filter;
    }
    public boolean getionist(){
        return ionist;
    }
    public boolean getEcological_Coolant_R32(){
        return Ecological_Coolant_R32;
    }
    public int getCounter(){
        return counter;
    }
    /**Function for Air Condition device to print objects*/
    public void PrintAirCondition() {
        System.out.println("\ndevice details for Air Condition: ");
        System.out.println("dimensions: "+"\nlength:" +length  +"\nheight:"  +height  +"\ndepth:"  +depth);
        System.out.println("Manufacturer: " + manufacturer_name);
        System.out.println("Device name: " + device_name);
        System.out.println("device type: " + device_type);
        System.out.println("energy consumption: " + energy_consumption);
        System.out.println("cooling power: " + cooling_power);
        System.out.println("heating power: " + heating_Power);
        System.out.println("Ecological coolant (R32): " + Ecological_Coolant_R32);
        System.out.println("air filter: " + air_filter);
        System.out.println("ionist: " + ionist);
    }


}
