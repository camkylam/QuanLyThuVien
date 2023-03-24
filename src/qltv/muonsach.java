
package qltv;

import java.util.Scanner;

public class muonsach {
    String maPM, m_maDG, m_masach, ngaymuon, ngaytra;     
    
    public muonsach() {
      
    }
     public muonsach(String maPM, String maDG, String masach, String ngaymuon, String ngaytra ) {
        this.maPM = maPM;
        this.m_maDG = maDG;
        this.m_masach = masach;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
    }
     public String getmaPM() {
        return maPM;
    }

    public void setmaPM(String maPM) {
        this.maPM= maPM;
    }
    public String getm_maDG() {
        return m_maDG;
    }

    public void setmaDG(String maDG) {
        this.m_maDG= maDG;
    }
    public String getm_masach() {
        return m_masach;
    }

    public void setm_masach(String masach) {
        this.m_masach= masach;
    }
    public String getngaymuon() {
        return ngaymuon;
    }

    public void setngaymuon(String ngaymuon) {
        this.ngaymuon= ngaymuon;
    }
    public String getngaytra() {
        return ngaytra;
    }

    public void setngaytra(String ngaytra) {
        this.ngaytra= ngaytra;
    }
    public String toString() {
        return "Muon Sach  \nMa phieu muon: " + maPM + "\nMa doc gia: " + m_maDG + "\nMa sach: " + m_masach + "\nNgay muon: " + ngaymuon + "\nNgay tra: " + ngaytra + "\n";
    }
     public void display() {
        System.out.println(this);
    }
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap Ma phieu muon :");
        maPM = scan.nextLine();
        System.out.println("Nhap ma doc gia :");
        m_maDG = scan.nextLine();
        System.out.println("Nhap ma sach:");
        m_masach = scan.nextLine();
        System.out.println("Ngay muon :");
        ngaymuon = scan.nextLine();
        System.out.println("Ngay tra : ");
        ngaytra = scan.nextLine();
    }
}
