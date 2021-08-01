package developers.factories;

import developers.AndroidDeveloper;
import developers.Developer;

public class AndroidDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new AndroidDeveloper();
    }
}
