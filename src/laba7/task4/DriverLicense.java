package laba7.task4;

public class DriverLicense extends DriverLicenseType {
    public int licenseNumber;

    public DriverLicense(char licenseClass, String licenseType, int licenseNumber) {
        super(licenseClass, licenseType);
        this.licenseNumber = licenseNumber;
    }

    public DriverLicense(DriverLicense driverLicense) {
        super(driverLicense);
        this.licenseNumber = driverLicense.licenseNumber;
    }
}
