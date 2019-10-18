/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

import java.util.Scanner;



/**
 *
 * @author admin
 */


public class Sinhvien {
    
    public String ten;
    public int maso;
    public double diem;
  
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        ten = sc.nextLine();
        
        System.out.print("Nhap ma so sv: ");
        maso = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nhap diem cua sv ");
        diem = Double.parseDouble(sc.nextLine());
        
    }  
    
    public void output()
    {
        System.out.print("Ten: "+ten+"\nMa So: "+maso+"\nDiem: "+diem);
    }
    
    public String Xeploai(double diemtb)
    {
        if(0<=diemtb && diemtb<5) return "Yeu";
        if(diemtb>=5&&diemtb<6.5) return "Trung Binh";
        if(diemtb>=6.5&&diemtb<8.5) return "Kha";
        if(diemtb>=8.5&&diemtb<=10) return "Gioi";
        return "Nhap sai";
    }
    
    }
    

