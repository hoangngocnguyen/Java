/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//ĐẾM SỐ LẦN XUẤT HIỆN CỦA MỘT KÍ tự trong chuỗi dưới 30 kí tự/**

import java.util.Scanner;
public class solanxuathienkitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        System.out.println("nhập vào chuỗi bất kì, không quá 30 kí tự: ");
        chuoi = scanner.nextLine();
        
        while ( chuoi.length() > 30 ) {
            System.out.println("vui lòng nhập lại chuỗi: ");
            chuoi = scanner.nextLine();
        }
        System.out.println("nhập kí tự bạn muốn đếm số lần xuất hiện:");
           char kitu = scanner.next().charAt(0);
           int count = 0;
           
        for (int i=0; i< chuoi.length(); i++) {
            if (kitu == chuoi.charAt(i) ) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của kí tự " + kitu +" là: " + count);
        
    }
}
