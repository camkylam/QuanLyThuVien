package qltv;

import java.util.Scanner;

public class tacgia {
    String maTG, tenTG, t_diachi, t_email, t_ghichu;
    
    public tacgia(){
        
    }
    
    public tacgia(String maTG, String tenTG, String diachi, String email, String ghichu) {
        this.maTG = maTG;
        this.tenTG = tenTG;
        this.t_diachi = diachi;
        this.t_email = email;
        this.t_ghichu = ghichu;
    }

    public String getmaTG() {
        return maTG;
    }

    public void setmaTG(String maTG) {
        this.maTG = maTG;
    }

    public String gettenTG() {
        return tenTG;
    }

    public void settenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String gett_diachi() {
        return t_diachi;
    }

    public void sett_diachi(String diachi) {
        this.t_diachi = diachi;
    }

    public String gett_email() {
        return t_email;
    }

    public void sett_email(String email) {
        this.t_email = email;
    }

    public String gett_ghichu() {
        return t_ghichu;
    }

    public void sett_ghichu(String ghichu) {
        this.t_ghichu = ghichu;
    }

   
    @Override
    public String toString() {
        return "Ma Tac Gia: " + maTG + "\nTen Tac Gia: " + tenTG + "\nDia Chi: " + t_diachi + "\nEmail: " + t_email + "\nGhiChu: " + t_ghichu + "\n";
    }
    
    public void display() {
        System.out.println(this);
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap MaTG :");
        maTG = scan.nextLine();
        System.out.println("Nhap Ho va Ten :");
        tenTG = scan.nextLine();
        System.out.println("Nhap Dia Chi:");
        t_diachi = scan.nextLine();
        System.out.println("Nhap Email:");
        t_email = scan.nextLine();
        System.out.println("Nhap Ghi Chu : ");
        t_ghichu = scan.nextLine();
    }

    String gett_maTG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

