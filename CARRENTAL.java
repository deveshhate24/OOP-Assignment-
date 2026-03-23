import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar() {
        Scanner sc = new Scanner(System.in);
        CarId = sc.nextInt();
        CarType = sc.next();
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small"))
            Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;
        else
            Rent = 0;
        return Rent;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar();
        c.GetRent();
        c.ShowCar();
    }
}