import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] ds = {
            new Student("2603610002", "Nguyen Duc Vuong", "20/12/2008"),
            new Student("SV002", "Tran Van B", "02/02/2006")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV can tim: ");
        String ma = sc.nextLine().trim();

        boolean timThay = false;
        for (Student sv : ds) {
            if (sv.getMaSV().equalsIgnoreCase(ma)) {
                sv.hienThi();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sinh vien");
        }
        sc.close();
    }
}