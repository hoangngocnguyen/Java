/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
// đếm số kí tự hoa thường và số trong chuối
import java.util.Scanner;
public class kiemtra_dang_cuachuoinhapvao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sokituhoa = 0, sokituthuong = 0, sochuso = 0;
        System.out.println("nhập vào một chuỗi kí tự:");
        String chuoi = scanner.nextLine();
        
        for (int i=0; i < chuoi.length(); i++) {
            if ( Character.isUpperCase(chuoi.charAt(i))) {
                sokituhoa++;
            }
            if ( Character.isLowerCase(chuoi.charAt(i))) {
                sokituthuong++;
            }
            if ( Character.isDigit(chuoi.charAt(i))) {
                sochuso++;
            }
            
        }
        
        System.out.println("trong chuỗi: " + chuoi + " có: " + sokituhoa 
        + " kí tự hoa, " + sokituthuong + " kí tự thường và "
        + sochuso + " chữ số");
    }
    
    
}
