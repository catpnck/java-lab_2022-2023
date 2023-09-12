package laba7.task4;

public class DriverLicenseType extends DriverLicenseClass {
    public String licenseType;

    public DriverLicenseType(char licenseClass, String licenseType) {
        super(licenseClass);
        this.licenseType = licenseType;
    }

    public DriverLicenseType(DriverLicenseType driverLicenseType) {
        super(driverLicenseType);
        this.licenseType = driverLicenseType.licenseType;
    }
}
