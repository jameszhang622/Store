public class Phone extends ElectronicItem{
    String internetType;
    int screenSize;

    public Phone(String name, String location, int price, String desc, int storageCapacity, String model, String maker, String operatingSystem, String internetType, int screenSize) {
        super(name, location, price, desc, storageCapacity, model, maker, operatingSystem);
        this.internetType = internetType;
        this.screenSize = screenSize;
    }

    public String getInternetType() {
        return internetType;
    }

    public void setInternetType(String internetType) {
        this.internetType = internetType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "internetType='" + internetType + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
