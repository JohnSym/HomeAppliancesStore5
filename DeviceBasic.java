public interface DeviceBasic {
    /**call getters and setters*/
    void setlength (int length);


    void setheight (int height);


    void setdepth (int depth);


    void setmanufacturer_name (String manufacturer_name);


    void setdevice_name (String device_name);


    void setdevice_type (String typos_syskevis);


    void setenergy_consumption (int energy_consumption);



    int getlength();

    int getheight();

    int getdepth();

    String getmanufacturer_name();

    String getdevice_name();

    String getdevice_type();

    int getenergy_consumption();




    /**Status for devices*/
    public void powerOn();
    public void powerOff();
    public int periodicMantainance();
    public boolean status();

}
