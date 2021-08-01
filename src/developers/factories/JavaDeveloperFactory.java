package developers.factories;

import developers.Developer;
import developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
