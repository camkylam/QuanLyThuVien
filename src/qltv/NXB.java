package qltv;

import java.util.Scanner;

public class NXB {
    String maNXB, tenNXB, n_diachi, n_email;
    int n_dienthoai;
    
    public NXB() {
      
    }

    public NXB(String maNXB, String tenNXB, String diachi,  String email, int dienthoai) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
        this.n_diachi = diachi;
        this.n_email = email;
        this.n_dienthoai = dienthoai;
    }

    public String getmaNXB() {
        return maNXB;
    }

    public void setmaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String gettenNXB() {
        return tenNXB;
    }

    public void settenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public String getn_diachi() {
        return n_diachi;
    }

    public void setn_diachi(String diachi) {
        this.n_diachi = diachi;
    }
    
     public int getn_dienthoai() {
        return n_dienthoai;
    }

    public void setn_dienthoai(int dienthoai) {
        this.n_dienthoai = dienthoai;
    }


    public String getn_email() {
        return n_email;
    }

    public void setn_email(String email) {
        this.n_email = email;
    }
   
    @Override
    public String toString() {
        return "Ma NXB: " + maNXB + "\nTen NXB: " + tenNXB + "\nDia Chi: " + n_diachi +  "\nEmail: " + n_email + "\nDien thoai: " + n_dienthoai + "\n";
    }
    
    public void display() {
        System.out.println(this);
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap MaNXB :");
        maNXB = scan.nextLine();
        System.out.println("Nhap Ten NXB :");
        tenNXB = scan.nextLine();
        System.out.println("Nhap Dia Chi:");
        n_diachi = scan.nextLine();
        System.out.println("Nhap Email:");
        n_email = scan.nextLine();
        System.out.println("Nhap SDT:");
        n_dienthoai = scan.nextInt();        
    }
}


