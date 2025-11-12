import java.util.Date;

public abstract class Robot {

    private String name;
    private String manufacturer;
    private int manufactureYear;
    private Date registrationDate;

    public Robot(String name, String manufacturer, int manufactureYear, Date registrationDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return name + " by " + manufacturer + " (" + manufactureYear + "), registered " + registrationDate;
    }
}
