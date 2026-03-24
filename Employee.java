import java.util.Scanner;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);
        empno = sc.nextInt();
        ename = sc.next();
        basic = sc.nextFloat();
        hra = sc.nextFloat();
        da = sc.nextFloat();
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + basic + " " + hra + " " + da + " " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata();
        e.dispdata();
    }
}