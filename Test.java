import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hoc sinh : ");
        int N = scanner.nextInt();
        Student[] cls = new Student[N];
        for(int i=0;i<N;++i){
            System.out.println("Nhap sinh vien thu "+(i+1));
            System.out.print("Name : ");
            String name = scanner.next();
            System.out.print("Year : ");
            int year = scanner.nextInt();
            cls[i] = new Student(name, year);
        }
        scanner.close();
        int total =0;
        System.out.println("Danh sach lop : ");
        for(int i=0;i<N;++i){
            total +=2024-cls[i].getYear();
            System.out.println(cls[i].getName());
        }
        System.out.println("Tong so tuoi : "+total);
    }
}
