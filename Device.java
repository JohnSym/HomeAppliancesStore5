public abstract class Device implements DeviceBasic {
    /**Variable Statements*/
    private  int length;
    private  int height;
    private  int depth;
    private  String manufacturer_name;
    private  String device_name;
    private  String device_type;
    private  int energy_consumption;
    private boolean status;
    /**Getters and Setters*/
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
    /**Overrides for the status of all devices*/
    @Override
    public void powerOn() {
        status=true;
    }

    @Override
    public void powerOff() {
        status=false;
    }

    @Override
    public int periodicMantainance() {
        return 0;
    }

    @Override
    public boolean status() {
        return status;
    }
}

