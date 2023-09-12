package laba7.task4;

public class DriverLicenseClass {
    public char licenseClass;

    public DriverLicenseClass(char licenseClass) {
        this.licenseClass = licenseClass;
    }

    public DriverLicenseClass(DriverLicenseClass driverLicenseClass) {
        this.licenseClass = driverLicenseClass.licenseClass;
    }
}
