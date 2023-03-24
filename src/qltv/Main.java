package qltv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choose;
        int chse;
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            
            switch(choose) {
                case 1:
                    System.out.println("+----------------------------+");
                    System.out.println("|       QUAN LY TAC GIA      |");
                    System.out.println("+----------------------------+");
                    System.out.println("| 1 |    Hien thi tac gia    |");
                    System.out.println("| 2 |    Them tac gia        |");
                    System.out.println("| 3 |    Sua tac gia         |");
                    System.out.println("| 4 |    Xoa tac gia         |");
                    System.out.println("+----------------------------+");
                    System.out.println("Choose:");
                    chse = Integer.parseInt(scan.nextLine());
                    switch(chse){
                        case 1 -> showTacgia(); 
                        case 2 -> insertTacgia(); 
                        case 3 -> updateTacgia(); 
                        case 4 -> deleteTacGia(); 
                    }
                    break;
                case 2: 
                    System.out.println("+----------------------------+");
                    System.out.println("|     QUAN LY DOC GIA        |");
                    System.out.println("+----------------------------+");
                    System.out.println("| 1 |    Hien thi doc gia    |");
                    System.out.println("| 2 |    Them doc gia        |");
                    System.out.println("| 3 |    Sua doc gia         |");
                    System.out.println("| 4 |    Xoa doc gia         |");
                    System.out.println("+----------------------------+");
                    System.out.println("Choose:");
                    chse = Integer.parseInt(scan.nextLine());
                    switch(chse){
                        case 1 -> showDocgia();
                        case 2 -> insertDocGia();
                        case 3 -> updateDocgia();
                        case 4 -> deletedocgia();
                    }
                    break;
                case 3: 
                    System.out.println("+----------------------------+");
                    System.out.println("|       QUAN LY SACH         |");
                    System.out.println("+----------------------------+");
                    System.out.println("| 1 |    Hien thi sach       |");
                    System.out.println("| 2 |    Them sach           |");
                    System.out.println("| 3 |    Sua sach            |");
                    System.out.println("| 4 |    Xoa sach            |");
                    System.out.println("+----------------------------+");
                    System.out.println("Choose:");
                    chse = Integer.parseInt(scan.nextLine());
                    switch(chse){
                        case 1 -> showSach();
                        case 2 -> insertSach();
                        case 3 -> updateSach();
                        case 4 -> deleteSach();
                    }
                    break;
                case 4: 
                    System.out.println("+----------------------------+");
                    System.out.println("|        QUAN LY NXB         |");
                    System.out.println("+----------------------------+");
                    System.out.println("| 1 |    Hien thi NXB        |");
                    System.out.println("| 2 |    Them NXB            |");
                    System.out.println("| 3 |    Sua NXB             |");
                    System.out.println("| 4 |    Xoa NXB             |");
                    System.out.println("+----------------------------+");
                    System.out.println("Choose:");
                    chse = Integer.parseInt(scan.nextLine());
                    switch(chse){
                        case 1 -> showNXB();
                        case 2 -> insertNhaXuatBan();
                        case 3 -> updateNXB();
                        case 4 -> deleteNXB();
                    }
                    break;
                case 5:
                    System.out.println("+----------------------------+");
                    System.out.println("|     QUAN LY MUON SACH      |");
                    System.out.println("+----------------------------+");
                    System.out.println("| 1 |    Hien thi muon sach  |");
                    System.out.println("| 2 |    Them muon sach      |");
                    System.out.println("| 3 |    Sua muon sach       |");
                    System.out.println("| 4 |    Xoa muon sach       |");
                    System.out.println("+----------------------------+");
                    System.out.println("Choose:");
                    chse = Integer.parseInt(scan.nextLine());
                    switch(chse){
                        case 1 -> showMuonsach();
                        case 2 -> insertMuonSach();
                        case 3 -> updateMuonsach();
                        case 4 -> deleteMuonSach();
                    }
                    break;
                case 6: 
                    System.out.println("+----------------------------+");
                    System.out.println("|          TIM KIEM          |");
                    System.out.println("+----------------------------+");
                    System.out.println("| 1 |    Tim kiem sach       |");
                    System.out.println("| 2 |    Tim kiem tac gia    |");
                    System.out.println("| 3 |    Tim kiem doc gia    |");
                    System.out.println("| 4 |    Tim kiem NXB        |");
                    System.out.println("+----------------------------+");
                    System.out.println("Choose:");
                    chse = Integer.parseInt(scan.nextLine());
                    switch(chse){
                        case 1 -> findSach();
                        case 2 -> findTacgia();
                        case 3 -> findDocgia();
                        case 4 -> findNXB();
                    }
                    break;
                case 7: TKS_datra(); break;
                case 8: TKS_chuatra(); break;
                case 9: ThongKeTTSach();break;
                case 10: System.out.println("Exit!!!"); break;
                default: System.out.println("Failed!!!");
            }
        } while(choose != 10);
    }
    
    static void showMenu() {
        System.out.println("+------------------------------------------+");
        System.out.println("|              QUAN LY THU VIEN            |");
        System.out.println("+-----+------------------------------------+");
        System.out.println("|  1  |  Quan Li Tac gia                   |");
        System.out.println("|  2  |  Quan Li Doc Gia                   |");
        System.out.println("|  3  |  Quan Li Sach                      |");
        System.out.println("|  4  |  Quan Li NXB                       |");
        System.out.println("|  5  |  Quan Li Muon Sach                 |");
        System.out.println("|  6  |  Tim Kiem                          |");
        System.out.println("|  7  |  Thong Ke Sach Da Tra              |");
        System.out.println("|  8  |  Thong Ke Sach Chua Tra            |");
        System.out.println("|  9  |  Thong Ke Sach Con Trong Thu Vien  |");
        System.out.println("|  10 |  Thoat                             |");
        System.out.println("+-----+------------------------------------+");
        System.out.println("Choose: ");
    }    
    
    // Hien thi tac gia
    private static void showTacgia() {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select * from tacgia";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                tacgia tg = new tacgia(resultSet.getString("maTG"), 
                        resultSet.getString("tenTG"), 
                        resultSet.getString("diachi"), 
                        resultSet.getString("email"), 
                        resultSet.getString("ghichu"));
                tg.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    // Hien thi doc gia
    private static void showDocgia() {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select * from docgia";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); 
            while(resultSet.next()) {
                docgia dg = new docgia(resultSet.getString("maDG"), 
                        resultSet.getString("tenDG"), 
                        resultSet.getString("ngaysinh"), 
                        resultSet.getString("noisinh"), 
                        resultSet.getString("diachi"),
                        resultSet.getInt("sdt"));
                dg.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    // Hien thi sach
    private static void showSach() {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select * from sach";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); 
            while(resultSet.next()) {
                Sach sa = new Sach(resultSet.getString("masach"), 
                        resultSet.getString("tensach"), 
                        resultSet.getString("vitri"), 
                        resultSet.getString("tinhtrang"), 
                        resultSet.getString("maTG"),
                        resultSet.getString("maNXB"),
                        resultSet.getInt("sotrang"),
                        resultSet.getInt("namXB"),
                        resultSet.getInt("solantaiban"));
                sa.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    // Hien thi sach
    private static void showNXB() {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select * from nhaxuatban";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); 
            while(resultSet.next()) {
                NXB nxb = new NXB(resultSet.getString("maNXB"), 
                        resultSet.getString("tenNXB"), 
                        resultSet.getString("diachi"), 
                        resultSet.getString("email"),
                        resultSet.getInt("dienthoai")); 
                nxb.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }    
    //Hien thi muon sach
    private static void showMuonsach() {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select * from muonsach";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); 
            while(resultSet.next()) {
                muonsach ms = new muonsach(resultSet.getString("maPM"), 
                        resultSet.getString("maDG"), 
                        resultSet.getString("masach"), 
                        resultSet.getString("ngaymuon"), 
                        resultSet.getString("ngaytra"));
                ms.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    // Them tac gia
    private static void insertTacgia() {
        tacgia tg = new tacgia();
        tg.input();
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "insert into tacgia(maTG, tenTG, diachi, email, ghichu)"
                    + " values (?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement.setString(1, tg.getmaTG());
            statement.setString(2, tg.gettenTG());
            statement.setString(3, tg.gett_diachi());
            statement.setString(4, tg.gett_email());
            statement.setString(5, tg.gett_ghichu());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }    
    //Them Doc Gia
    private static void insertDocGia() {
        docgia docgia = new docgia();
        docgia.input();
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "insert into docgia(maDG, tenDG, ngaysinh, noisinh, diachi, sdt)"
                    + " values (?, ?, ?, ?, ?, ?)";
             
            statement = conn.prepareCall(sql);
            statement.setString(1, docgia.getmaDG());
            statement.setString(2, docgia.gettenDG());
            statement.setString(3, docgia.getngaysinh());
            statement.setString(4, docgia.getnoisinh());
            statement.setString(5, docgia.getd_diachi());
            statement.setInt(6, docgia.getsdt());
             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Them sach
    private static void insertSach() {
        Sach Sach = new Sach();
        Sach.input();          
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "insert into Sach(masach, tensach, vitri, tinhtrang, maTG, maNXB, sotrang, namXB, solantaiban)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement.setString(1, Sach.getMasach());
            statement.setString(2, Sach.getTensach());
            statement.setString(3, Sach.getVitri());
            statement.setString(4, Sach.getTinhtrang());
            statement.setString(5, Sach.gets_MaTG());
            statement.setString(6, Sach.gets_MaNXB());
            statement.setInt   (7, Sach.getSotrang());
            statement.setInt   (8, Sach.getNamXB());
            statement.setInt   (9, Sach.getSolantaiban());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Them Nha Xuat Ban
    private static void insertNhaXuatBan() {
        NXB nxb = new NXB();
        nxb.input();       
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "insert into nhaxuatban(maNXB, tenNXB, diachi, email, dienthoai)"
                    + " values (?, ?, ?, ?, ?)";
             
            statement = conn.prepareCall(sql);
            statement.setString(1, nxb.getmaNXB());
            statement.setString(2, nxb.gettenNXB());
            statement.setString(3, nxb.getn_diachi());
            statement.setString(4, nxb.getn_email());  
            statement.setInt   (5, nxb.getn_dienthoai());             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    private static void updateTacgia() {
        System.out.println("Sửa thông tin tac gia theo MaTG");
        tacgia tg = new tacgia();
        tg.input();          
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "update tacgia set tenTG = ?, diachi = ?, email = ?, ghichu = ? where maTG = ?";             
            statement = conn.prepareCall(sql);
            statement.setString(1, tg.gettenTG());
            statement.setString(2, tg.gett_diachi());
            statement.setString(3, tg.gett_email());
            statement.setString(4, tg.gett_ghichu());
            statement.setString(5, tg.getmaTG());             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Update Sach
    private static void updateSach() {
        System.out.println("Sửa thông tin sach theo ma sach");
        Sach sach = new Sach();
        sach.input();        
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");            
            String sql = "update sach set tensach = ?, vitri = ?, tinhtrang = ?, maTG = ?, maNXB = ?, sotrang = ?, namXB = ?, solantaiban = ? where masach = ?";            
            statement = conn.prepareCall(sql);
            statement.setString(1, sach.getTensach());
            statement.setString(2, sach.getVitri());
            statement.setString(3, sach.getTinhtrang());
            statement.setString(4, sach.gets_MaTG());
            statement.setString(5, sach.gets_MaNXB());
            statement.setInt(6, sach.getSotrang());
            statement.setInt(7, sach.getNamXB());
            statement.setInt(8, sach.getSolantaiban());
            statement.setString(9, sach.getMasach());             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Update Doc gia
    private static void updateDocgia() {
        System.out.println("Sửa thông tin sach theo ma sach");
        docgia dg = new docgia();
        dg.input();          
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");            
            String sql = "update docgia set tenDG = ?, ngaysinh = ?, noisinh = ?, diachi = ?, sdt = ? where maDG = ?";             
            statement = conn.prepareCall(sql);
            statement.setString(1, dg.gettenDG());
            statement.setString(2, dg.getngaysinh());
            statement.setString(3, dg.getnoisinh());
            statement.setString(4, dg.getd_diachi());
            statement.setInt(5, dg.getsdt());
            statement.setString(6, dg.getmaDG());             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Sua muon sach
    private static void updateMuonsach() {
        System.out.println("Sửa thông tin phiếu mượn theo maPM");
        muonsach pm = new muonsach();
        pm.input();         
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "update muonsach set maDG = ?, masach = ?, ngaymuon = ?, ngaytra = ? where maPM = ?";             
            statement = conn.prepareCall(sql);            
            statement.setString(1, pm.getm_maDG());
            statement.setString(2, pm.getm_masach());
            statement.setString(3, pm.getngaymuon());
            statement.setString(4, pm.getngaytra());
            statement.setString(5, pm.getmaPM());             
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Sua nha xuat ban
    private static void updateNXB() {
        System.out.println("Sửa thông tin tac gia theo maNXB");
        NXB nxb = new NXB();
        nxb.input();          
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "update nhaxuatban set tenNXB = ?, diachi = ?, email = ?, dienthoai = ? where maNXB = ?";             
            statement = conn.prepareCall(sql);            
            statement.setString(1, nxb.gettenNXB());
            statement.setString(2, nxb.getn_diachi());
            statement.setString(3, nxb.getn_email());
            statement.setInt   (4, nxb.getn_dienthoai());
            statement.setString(5, nxb.getmaNXB());              
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    private static void insertMuonSach() {
        muonsach ms = new muonsach();
        ms.input();         
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");             
            String sql = "insert into muonsach(maPM, maDG, masach, ngaymuon, ngaytra)"
                    + " values (?, ?, ?, ?, ?)";             
            statement = conn.prepareCall(sql);
            statement.setString(1, ms.getmaPM());
            statement.setString(2, ms.getm_maDG());
            statement.setString(3, ms.getm_masach());
            statement.setString(4, ms.getngaymuon());
            statement.setString(5, ms.getngaytra());              
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    //Xoa Doc Gia
    private static void deletedocgia() {
        System.out.println("Nhap Ma doc gia can xoa: ");
        String maDG = scan.nextLine();         
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "delete from docgia where maDG = ?";             
            statement = conn.prepareCall(sql);
            statement.setString(1, maDG);             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Xoa Muon Sach
    private static void deleteMuonSach() {
        System.out.println("Nhap Ma phieu muon can xoa: ");
        String maPM = scan.nextLine();
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "delete from muonsach where maPM = ?";             
            statement = conn.prepareCall(sql);
            statement.setString(1, maPM);             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
        try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Xoa theo ma sach
    private static void deleteSach() {
        System.out.println("Nhap ma sach can xoa: ");
        String masach = scan.nextLine();
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "delete from Sach where masach = ?";             
            statement = conn.prepareCall(sql);
            statement.setString(1, masach);             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    //Xoa tac gia
    private static void deleteTacGia() {
        System.out.println("Nhap ma tac gia can xoa: ");
        String maTG = scan.nextLine();
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "delete from tacgia where maTG = ?";             
            statement = conn.prepareCall(sql);
            statement.setString(1, maTG);             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    } 
    //Xoa NXB
    private static void deleteNXB() {
        System.out.println("Nhap ma nha xuat ban can xoa: ");
        String maNXB = scan.nextLine();
        Connection conn = null;
        PreparedStatement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "delete from nhaxuatban where maNXB = ?";             
            statement = conn.prepareCall(sql);
            statement.setString(1, maNXB);             
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }    
    /////////////////////////////////////-TIMKIEM-////////////////////////////////////////////
    // Tim Kiem
    // tim sach    
    private static void findSach() {
        System.out.println("Nhap ma sach can tim kiem: ");
        String Ma_Sach = scan.nextLine();        
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select * from sach where masach like ?";                   
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%"+Ma_Sach+"%");                   
            ResultSet resultSet = statement.executeQuery();                   
            while(resultSet.next()) {
                Sach abc = new Sach(resultSet.getString("masach"), 
                        resultSet.getString("tensach"),
                        resultSet.getString("vitri"),
                        resultSet.getString("tinhtrang"), 
                        resultSet.getString("maTG"),
                        resultSet.getString("maNXB"),
                        resultSet.getInt("sotrang"),
                        resultSet.getInt("namXB"),
                        resultSet.getInt("solantaiban"));                
                abc.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
     // tim tac gia    
    private static void findTacgia() {
        System.out.println("Nhap ma tac gia can tim kiem: ");
        String fullname = scan.nextLine();
        Connection conn = null;
        PreparedStatement statement = null;
        try {              
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", ""); 
            String sql = "select * from tacgia where maTG like ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%"+fullname+"%");                   
            ResultSet resultSet = statement.executeQuery();                   
            while(resultSet.next()) {
                tacgia abc = new tacgia(resultSet.getString("maTG"), 
                        resultSet.getString("tenTG"),
                        resultSet.getString("diachi"),
                        resultSet.getString("email"), 
                        resultSet.getString("ghichu"));                        
                abc.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }
    /// tim doc gia
        private static void findDocgia() {
        System.out.println("Nhap ten doc gia can tim kiem: ");
        String doc_gia = scan.nextLine();        
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");            
            String sql = "select * from docgia where tenDG like ?";            
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%"+doc_gia+"%");            
            ResultSet resultSet = statement.executeQuery();            
            while(resultSet.next()) {
                docgia abc = new docgia(resultSet.getString("maDG"), 
                        resultSet.getString("tenDG"),
                        resultSet.getString("ngaysinh"),
                        resultSet.getString("noisinh"), 
                        resultSet.getString("diachi"),
                        resultSet.getInt("sdt"));                        
                abc.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                   
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {                
                try {
                    conn.close();
                } catch (SQLException ex) {
                    
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
 //// TIM NXB
        private static void findNXB() {
        System.out.println("Nhap ten nha xuat ban can tim kiem: ");
        String nxb = scan.nextLine();        
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");            
            String sql = "select * from nhaxuatban where tenNXB like ?";            
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%"+nxb+"%");            
            ResultSet resultSet = statement.executeQuery();            
            while(resultSet.next()) {
                NXB abc = new NXB(resultSet.getString("maNXB"), 
                        resultSet.getString("tenNXB"), 
                        resultSet.getString("diachi"), 
                        resultSet.getString("email"),
                        resultSet.getInt("dienthoai")); 
                abc.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    //Thong ke sach da tra
    private static void TKS_datra() {         
        Connection conn = null;
        Statement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select distinct * from Sach inner join muonsach on Sach.masach = muonsach.masach where ngaytra < '2022-05-10'";
            System.out.println("Sach Da Duoc Tra Trong Thu Vien:");
            statement = conn.createStatement();             
            ResultSet resultSet = statement.executeQuery(sql); 
            while(resultSet.next()) {
                Sach sa = new Sach(resultSet.getString("masach"), 
                        resultSet.getString("tensach"), 
                        resultSet.getString("vitri"), 
                        resultSet.getString("tinhtrang"), 
                        resultSet.getString("maTG"),
                        resultSet.getString("maNXB"),
                        resultSet.getInt("sotrang"),
                        resultSet.getInt("namXB"),
                        resultSet.getInt("solantaiban"));
                sa.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    // Thong Ke sach chua tra
    private static void TKS_chuatra() {         
        Connection conn = null;
        Statement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");
            String sql = "select * from Sach inner join muonsach on Sach.masach = muonsach.masach where ngaytra > '2022-05-10'";
            System.out.println("Sach Chua Duoc Tra Trong Thu Vien:");
            statement = conn.createStatement();             
            ResultSet resultSet = statement.executeQuery(sql); 
            while(resultSet.next()) {
                Sach sa = new Sach(resultSet.getString("masach"), 
                        resultSet.getString("tensach"), 
                        resultSet.getString("vitri"), 
                        resultSet.getString("tinhtrang"), 
                        resultSet.getString("maTG"),
                        resultSet.getString("maNXB"),
                        resultSet.getInt("sotrang"),
                        resultSet.getInt("namXB"),
                        resultSet.getInt("solantaiban"));
                sa.display();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    //Thong ke sach con
    private static void ThongKeTTSach() {         
        Connection conn = null;
        Statement statement = null;
        try {             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qltv_ct467", "root", "");  
            String sql = "Select * from sach  where tinhtrang = 'con'";
            statement = conn.createStatement();             
            System.out.println("Thong ke tinh trang sach con trong thu vien");
            ResultSet resultSet = statement.executeQuery(sql); 
            while(resultSet.next()) {
                Sach sa = new Sach(resultSet.getString("masach"), 
                        resultSet.getString("tensach"), 
                        resultSet.getString("vitri"), 
                        resultSet.getString("tinhtrang"), 
                        resultSet.getString("maTG"),
                        resultSet.getString("maNXB"),
                        resultSet.getInt("sotrang"),
                        resultSet.getInt("namXB"),
                        resultSet.getInt("solantaiban"));
                sa.display();
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {             
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
