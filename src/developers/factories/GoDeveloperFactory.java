package developers.factories;

import developers.Developer;
import developers.GoDeveloper;

public class GoDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new GoDeveloper();
    }
}
