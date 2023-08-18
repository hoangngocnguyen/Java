/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Ham_string_coban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "HUY HOÀNG";
        String chuoi2 = "NGUYỄN NGỌC";
        System.out.println("chuỗi 1: " + chuoi);
        System.out.println("chuỗi 2: " + chuoi2);
        int length = chuoi.length(); // độ dài chuỗi
        System.out.println("độ dài của chuỗi 1 là: " + length);
        // nối chuỗi
        String chuoi3 = chuoi2 + " " + chuoi;
        System.out.println("Nối 2 chuỗi ta được chuỗi: " + chuoi3);
        // nối chuỗi kiểu 2
        String chuoi4 = chuoi + " ".concat( chuoi3);
        System.out.println("chuỗi 4 là: " + chuoi4);
        // gọi kí tự qua chỉ số, bắt đầu từ 0 là kí tự đầu tiên
        System.out.println("nhập số thứ tự kí tự bạn muốn tìm trong chuỗi 1: ");
        int n = scanner.nextInt();
        
        System.out.println("kí tự thứ " + n + " của chuỗi '" + chuoi + "' là: " + chuoi.charAt(n-1));
        
        // so sánh hai chuoi
        int result = chuoi.compareTo(chuoi2);
        if (result ==0) {
            System.out.println("chuỗi " + chuoi + " = " + chuoi2);
        } else if (result > 0) {
            System.out.println("chuỗi " + chuoi + " > " + chuoi2);
        } else {
            System.out.println("chuỗi " + chuoi + " < " + chuoi2);
        }
        System.out.println("gia tri cua result là: " + result);
        
    }
}
