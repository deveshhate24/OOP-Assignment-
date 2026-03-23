import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        RNo = sc.nextInt();
        Name = sc.next();
        Charges = sc.nextFloat();
        Days = sc.nextInt();
    }

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000)
            amount = 1.02f * amount;
        return amount;
    }

    void DispInfo() {
        float amount = Compute();
        System.out.println(RNo + " " + Name + " " + Charges + " " + Days + " " + amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}