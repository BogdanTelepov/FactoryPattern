public class AndroidDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new AndroidDeveloper();
    }
}
