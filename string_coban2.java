/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class string_coban2 {
    public static void main(String[] args) {
        String chuoi = "Huy Hoàng";
        int vtfirst = chuoi.indexOf("Hoàng");
        System.out.println("vị trí xuất hiện đầu tiên của chuỗi Hoàng trong chuỗi " + chuoi + " là: " + (vtfirst+1));
        String chuoiend = "H";
        int vtend = chuoi.lastIndexOf(chuoiend);
        System.out.println("vị trí xuất hiện cuối cùng của chuỗi " + chuoiend +" trong chuỗi " + chuoi + " là: " + (vtend+1));
        // thay đổi chuỗi con trong chuỗi mẹ
        Scanner scanner = new Scanner(System.in);
        //////////////
        String changeChar;
        System.out.println("nhập kí tự muốn thay đổi trong chuỗi " + chuoi + " : ");
        changeChar = scanner.next();
        while (chuoi.indexOf(changeChar) <0) {
            System.out.println("không hợp lệ, vui lòng nhập lại: ");
        changeChar = scanner.next(); // hiểu là nhập vào string
        } 
        // kiểm tra kí tự nhập vào có trong chuỗi không? hiển thi bảng nhập
        // kiểm tra vị trí kí tự trong chuỗi, bé hơn 0 thì không thuộc
           System.out.println("bạn muốn thay thế kí tự "+ changeChar + " trong chuỗi " + chuoi + " bằng kí tự: ");
        String changeChar2 = scanner.next();
        System.out.println("chuỗi sau khi thay " + changeChar + " = " + changeChar2 +" là: " + chuoi.replace(changeChar , changeChar2));
        
        // loại bỏ dấu cách thừa
        String chuoi2 = "  đẹp trai!  ";
        System.out.println("chuỗi 2 ban đầu: " + chuoi2);
        System.out.println("chuỗi 2 sau khi xóa dấu cách thừa:" + chuoi2.trim());
        
        // tạo chuỗi con
        System.out.println("bạn muốn tạo chuỗi con từ chuỗi 1: " + chuoi + " từ vị trí: ");
        int taochuoi = scanner.nextInt();
        System.out.println("kết quả bạn nhận được là: " + chuoi.substring(taochuoi -1));
        System.out.println("bạn muốn tạo chuỗi con từ vị trí a đến b nào trong chuỗi 1: ");
        System.out.println("vị trí ban đầu: ");
        int vt1 = scanner.nextInt();
        System.out.println("vị trí cuối: ");
        int vt2 = scanner.nextInt();
        System.out.println("kết quả nhận được là: " + chuoi.substring(vt1-1 , vt2-1));
    }
}
