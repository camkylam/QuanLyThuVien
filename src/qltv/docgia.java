package qltv;

import java.util.Scanner;

public class docgia {
    String maDG, tenDG, ngaysinh, noisinh, d_diachi;     
    int sdt;
    public docgia() {
   
    }
    
    public docgia(String maDG, String tenDG, String ngaysinh, String noisinh, String diachi, int sdt) {
        this.maDG = maDG;
        this.tenDG = tenDG;
        this.ngaysinh = ngaysinh;
        this.noisinh = noisinh;
        this.d_diachi = diachi;
        this.sdt = sdt;
    }
    
    public String getmaDG() {
        return maDG;
    }

    public void setmaDG(String maDG) {
        this.maDG= maDG;
    }
    
    public String gettenDG() {
        return tenDG;
    }

    public void settenDG(String tenDG) {
        this.tenDG = tenDG;
    }
    public String getngaysinh() {
        return ngaysinh;
    }

    public void setngaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String getnoisinh() {
        return noisinh;
    }

    public void setnoisinh(String noisinh) {
        this.noisinh = noisinh;
    }
    public String getd_diachi() {
        return d_diachi;
    }

    public void setd_diachi(String diachi) {
        this.d_diachi = diachi;
    }
    public int getsdt() {
        return sdt;
    }

    public void setsdt(int sdt) {
        this.sdt = sdt;
    }
    
   
    
    @Override
    public String toString() {
        return "Ma Doc Gia: " + maDG + "\nTen Goc Gia: " + tenDG + "\nNgay Sinh:" + ngaysinh + "\nNoisinh:" + noisinh + "\nDia Chi: " + d_diachi + "\nSo dien thoai:" + sdt + "\n";
    }
    
     public void display() {
        System.out.println(this);
    }
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap Ma doc gia :");
        maDG = scan.nextLine();
        System.out.println("Nhap Ho va Ten :");
        tenDG = scan.nextLine();
        System.out.println("Nhap Ngay Sinh (YYYY-MM-DD) :");
        ngaysinh = scan.nextLine();
        System.out.println("Noisinh :");
        noisinh = scan.nextLine();
        System.out.println("Nhap Dia chi : ");
        d_diachi = scan.nextLine();
        System.out.println("Nhap So dien thoai :");
        sdt = scan.nextInt();
    }
}
