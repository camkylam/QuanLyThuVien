package qltv;

import java.util.Scanner;

public class Sach {
    String masach, tensach, vitri, tinhtrang, s_maTG, s_maNXB;
    int sotrang, namXB, solantaiban;

    public Sach() {
    }

    public Sach(String masach, String tensach, String vitri, String tinhtrang, String maTG, String maNXB,int sotrang, int namXB, int solantaiban) {
        this.masach = masach;
        this.tensach = tensach;
        this.vitri = vitri;
        this.tinhtrang = tinhtrang;
        this.s_maTG = maTG;
        this.s_maNXB = maNXB;
        this.sotrang = sotrang;
        this.namXB = namXB;
        this.solantaiban = solantaiban;
    }

    Sach(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Sach(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach= masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String gets_MaTG() {
        return s_maTG;
    }

    public void sets_MaTG(String maTG) {
        this.s_maTG = maTG;
    }

    public String gets_MaNXB() {
        return s_maNXB;
    }

    public void sets_MaNXB(String maNXB) {
        this.s_maNXB = maNXB;
    }
    
    public int getSotrang(){
        return sotrang;
    }
    
    public void setSotrang(int sotrang){
        this.sotrang = sotrang;
    }
    
    public int getNamXB() {
        return namXB;
    }
    
    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
    
    public int getSolantaiban(){
        return solantaiban;
    }
    
    public void setSolantaiban(int solantaiban){
        this.solantaiban = solantaiban;
    }

    @Override
    public String toString() {
        return "\bMa Sach: " + masach + "\nTen Sach: " + tensach + "\nVi Tri: " + vitri + "\nTinh Trang: " + tinhtrang + "\nMa Tac Gia: " + s_maTG + "\nMa NXB: " + s_maNXB + "\nNam Xuat Ban: " + namXB + "\nSo Lan Tai Ban: " + solantaiban + "\n" ;
    }
    
    public void display() {
        System.out.println(this);
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap mã sách :");
        masach = scan.nextLine();
        System.out.println("Nhap tên sách :");
        tensach = scan.nextLine();
        System.out.println("Nhap vị trí sách :");
        vitri = scan.nextLine();
        System.out.println("Nhap tình trạng sách:");
        tinhtrang = scan.nextLine();
        System.out.println("Nhap maTG : ");
        s_maTG = scan.nextLine();
        System.out.println("Nhap mã NXB :");
        s_maNXB = scan.nextLine();
        System.out.println("Nhap số trang: ");
        sotrang = scan.nextInt();
        System.out.println("Nhap nam XB: ");
        namXB = scan.nextInt();
        System.out.println("Nhập số lần tái bản: ");
        solantaiban = scan.nextInt();
    }
}
