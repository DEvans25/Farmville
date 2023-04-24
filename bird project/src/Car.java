public class Car {


    public boolean canItDrive;
    public int carSize;
    public String carColor;
    public String type;
    public String carName;

    public Car(String pCarName, boolean pCanItDrive, int pCarSize, String pCarColor, String pType) {
        carName = pCarName;
        canItDrive = pCanItDrive;
        carSize = pCarSize;
        carColor = pCarColor;
        type = pType;
    }

    public void printCarInfo() {
        System.out.println("This car is a " + carName + ".");
        if (canItDrive) {
            System.out.println(carName + " can drive.");
        } //same as if(canItDrive == true)
        else {
            System.out.println(carName + " cannot drive.");
        }
        System.out.println("Size: " + carSize);
        System.out.println("Color: " + carColor);
        System.out.println("Type: " + type);

    }

}
