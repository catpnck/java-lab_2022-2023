package laba7.task4;

public class Task4 {
    public static void main(String[] args) {
        DriverLicenseClass licenseClass = new DriverLicenseClass('B');
        System.out.println(licenseClass.licenseClass);
        DriverLicenseClass licenseClass1 = new DriverLicenseClass(licenseClass);
        System.out.println(licenseClass1.licenseClass);

        DriverLicenseType licenseType = new DriverLicenseType('A', "Электронные");
        System.out.println(licenseType.licenseClass + " " + licenseType.licenseType);
        DriverLicenseType licenseType1 = new DriverLicenseType(licenseType);
        System.out.println(licenseType1.licenseClass + " " + licenseType1.licenseType);

        DriverLicense driverLicense = new DriverLicense('С', "Бумажные", 1234);
        System.out.println(driverLicense.licenseClass + " " + driverLicense.licenseType
                + " " + driverLicense.licenseNumber);
        DriverLicense driverLicense1 = new DriverLicense(driverLicense);
        System.out.println(driverLicense1.licenseClass + " " + driverLicense1.licenseType
                + " " + driverLicense1.licenseNumber);

    }
}
