import developers.Developer;
import developers.factories.AndroidDeveloperFactory;
import developers.factories.DeveloperFactory;
import developers.factories.GoDeveloperFactory;
import developers.factories.JavaDeveloperFactory;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {

        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("go")) {
            return new GoDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("android")) {
            return new AndroidDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " not found");
        }
    }
}
