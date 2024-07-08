/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetugasMutasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author madey
 */
public class Koneksi {
    
    private String databaseName = "dbmutasi";
    private String username = "root";    
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    public Koneksi (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.err.print(e.toString());
        }
    }
    
    public void simpandatasiswa (int paramnisn, String paramnamasiswa, String paramtempattanggallahir, String paramjeniskelamin ){
        
        
        try{
            String SQL =" INSERT INTO datasiswa (nisn, nama_siswa, tempat_tanggal_lahir, jenis_kelamin)"
                    + "VALUES (?,?,?,?)";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, paramnisn);
            perintah.setString(2, paramnamasiswa);
            perintah.setString(3, paramtempattanggallahir);
            perintah.setString(4, paramjeniskelamin);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
    public void ubahdatasiswa (int paramnisn, String paramnamasiswa, String paramtempattanggallahir, String paramjeniskelamin ){
        
        
        try{
            String SQL =" UPDATE datasiswa SET nama_siswa=?, tempat_tanggal_lahir=?, jenis_kelamin=?"
                    + "WHERE nisn=?";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramnamasiswa);
            perintah.setString(2, paramtempattanggallahir);
            perintah.setString(3, paramjeniskelamin);
            perintah.setInt(4, paramnisn);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
    
    public void hapusdatasiswa(int paramnisn){
        try{
            String SQL = "DELETE FROM datasiswa WHERE nisn=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramnisn);
            perintah.executeUpdate();
            System.out.println("DataBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void caridatasiswa(int paramnisn) {
        try{
            String SQL = "SELECT*FROM datasiswa WHERE nisn=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramnisn);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("nama_siswa:"+ data.getString("nama_siswa"));
                System.out.println("tempat_tanggal_lahir :"+ data.getString("tempat_tanggal_lahir"));
                System.out.println("jenis_kelamin :"+ data.getString("jenis_kelamin"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());   
        }
        
        
    }
    
    public void datadatasiswa(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM datasiswa ORDER BY nisn ASC ");
            while(baris.next()){
                System.out.println(baris.getInt("nisn")+" | "+
                        baris.getString("nama_siswa")+" | "+
                        baris.getString("tempat_tanggal_lahir")+" | "+
                        baris.getString("jenis_kelamin"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
                
    }
     public void simpandatapermohonanmutasi (int pramnosprsupt, int paramnisn, String paramkelas, String paramnamaorangtua,int paramnpsn,String paramnamasekolahasal, String paramkota,String paramprovinsi,
             String paramsekolahtujuan,String paramketerangan,int paramnotelpon,String paramskpssekolahasal,String paramsrpsupt ){
        
        
        try{
            String SQL =" INSERT INTO data_permohonan_mutasi (no_srps_upt, nisn, kelas,nama_orangtua,npsn,nama_sekolahasal,kota,provinsi,sekolah_tujuan,keterangan,no_telpon,skps_sekolahasal,srps_upt)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, pramnosprsupt);
            perintah.setInt(2, paramnisn);
            perintah.setString(3,paramkelas );
            perintah.setString(4, paramnamaorangtua);
            perintah.setInt(5, paramnpsn);
            perintah.setString(6, paramnamasekolahasal);
            perintah.setString(7, paramkota);
            perintah.setString(8, paramprovinsi);
            perintah.setString(9, paramsekolahtujuan);
            perintah.setString(10, paramketerangan);
            perintah.setInt(11, paramnotelpon);
            perintah.setString(12, paramskpssekolahasal);
            perintah.setString(13, paramsrpsupt);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
        public void ubahdatapermohonanmutasi (int pramnosprsupt, int paramnisn, String paramkelas, String paramnamaorangtua,int paramnpsn,String paramnamasekolahasal, 
             String paramkota,String paramprovinsi,String paramsekolahtujuan,String paramketerangan,int paramnotelpon,String paramskpssekolahasal,String paramsrpsupt ){
        
        
        try{
            String SQL =" UPDATE data_permohonan_mutasi SET nisn=? , kelas=? ,nama_orangtua=? ,npsn=? ,nama_sekolahasal=?,kota,provinsi=? ,sekolah_tujuan=? ,keterangan=?,no_telpon=? ,skps_sekolahasal=? ,srps_upt=?"
                    + "WHERE no_srps_upt=?";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, paramnisn);
            perintah.setString(2, paramkelas);
            perintah.setString(3, paramnamaorangtua);
            perintah.setInt(4, paramnpsn);
            perintah.setString(5, paramnamasekolahasal);
            perintah.setString(6, paramkota);
            perintah.setString(7, paramprovinsi);
            perintah.setString(8, paramsekolahtujuan);
            perintah.setString(9, paramketerangan);
            perintah.setInt(10, paramnotelpon);
            perintah.setString(11, paramskpssekolahasal);
            perintah.setString(12, paramsrpsupt);
            perintah.setInt(13, pramnosprsupt);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
        public void hapusdatapermohonanmutasi(int pramnosprsupt){
        try{
            String SQL = "DELETE FROM data_permohonan_mutasi WHERE no_srps_upt=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1,pramnosprsupt );
            perintah.executeUpdate();
            System.out.println("DataBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
        public void caridatapermohonanmutasi(int pramnosprsupt) {
        try{
            String SQL = "SELECT*FROM data_permohonan_mutasi WHERE no_srps_upt=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, pramnosprsupt);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("nisn:"+ data.getInt("nisn"));
                System.out.println("kelas:"+ data.getString("kelas"));
                System.out.println("nama_orangtua :"+ data.getString("nama_orangtua"));
                System.out.println("npsn :"+ data.getInt("npsn"));
                System.out.println("nama_sekolahasal :"+ data.getString("nama_sekolahasal"));
                System.out.println("kota :"+ data.getString("kota"));
                System.out.println("provinsi :"+ data.getString("provinsi"));
                System.out.println("sekolah_tujuan :"+ data.getString("sekolah_tujuan"));
                System.out.println("keterangan :"+ data.getString("keterangan"));
                System.out.println("no_telpon :"+ data.getInt("no_telpon"));
                System.out.println("skps_sekolahasal :"+ data.getString("skps_sekolahasal"));
                System.out.println("srps_upt :"+ data.getString("srps_upt"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage()); 
        }
    } 
    
     public void datadatapermohonanmutasi(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM data_permohonan_mutasi ORDER BY no_srps_upt ASC ");
            while(baris.next()){
                System.out.println(baris.getInt("no_srps_upt")+" | "+
                        baris.getInt("nisn")+" | "+
                        baris.getString("kelas")+" | "+
                        baris.getString("nama_orangtua")+" | "+
                        baris.getInt("npsn")+" | "+
                        baris.getString("nama_sekolahasal")+" | "+
                        baris.getString("kota")+" | "+
                        baris.getString("provinsi")+" | "+
                        baris.getString("sekolah_tujuan")+" | "+
                        baris.getString("keterangan")+" | "+
                        baris.getInt("no_telpon")+" | "+
                        baris.getString("skps_sekolahasal")+" | "+
                        baris.getString("srps_upt"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
                
    }
    
    public void simpanpetugasmutasi (int paramnippetugasmutasi, String paramnama, String paramtempattanggallahir, String paramjeniskelamin,int paramnotelpon ){
        try{
            String SQL =" INSERT INTO petugas_mutasi (nip_petugas_mutasi, nama, tempat_tanggal_lahir, jenis_kelamin,no_telpon)"
                    + "VALUES (?,?,?,?,?)";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, paramnippetugasmutasi);
            perintah.setString(2, paramnama);
            perintah.setString(3, paramtempattanggallahir);
            perintah.setString(4, paramjeniskelamin);
            perintah.setInt(5, paramnotelpon);
            perintah.executeUpdate();
            System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
    }    
        
    
    public void ubahpetugasmutasi (int paramnippetugasmutasi, String paramnama, String paramtempattanggallahir, String paramjeniskelamin,int paramnotelpon ){
        try{
            String SQL =" UPDATE petugas_mutasi SET nama=?, tempat_tanggal_lahir=?, jenis_kelamin=?,no_telpon=?"
                    + "WHERE nip_petugas_mutasi=?";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramnama);
            perintah.setString(2, paramtempattanggallahir);
            perintah.setString(3, paramjeniskelamin);
             perintah.setInt(4, paramnotelpon);
            perintah.setInt(5, paramnippetugasmutasi);
            perintah.executeUpdate();
            System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }   
    }
    public void hapuspetugasmutasi(int paramnippetugasmutasi){
        try{
            String SQL = "DELETE FROM petugas_mutasi WHERE nip_petugas_mutasi=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramnippetugasmutasi);
            perintah.executeUpdate();
            System.out.println("DataBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void caripetugasmutasi(int paramnippetugasmutasi) {
        try{
            String SQL = "SELECT*FROM petugas_mutasi WHERE nip_petugas_mutasi=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramnippetugasmutasi);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("nama:"+ data.getString("nama"));
                System.out.println("tempat_tanggal_lahir :"+ data.getString("tempat_tanggal_lahir"));
                System.out.println("jenis_kelamin :"+ data.getString("jenis_kelamin"));
                System.out.println("no_telpon :"+ data.getInt("no_telpon"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());   
        }
       
    }
    
    public void datapetugasmutasi(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM petugas_mutasi ORDER BY nip_petugas_mutasi ASC ");
            while(baris.next()){
                System.out.println(baris.getInt("nip_petugas_mutasi")+" | "+
                        baris.getString("nama")+" | "+
                        baris.getString("tempat_tanggal_lahir")+" | "+
                        baris.getString("jenis_kelamin")+" | "+
                        baris.getInt("no_telpon"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    } 
    
    public void simpandatasd (int paramnpsn, String paramnamasekolah, String paramalamat ){
        try{
            String SQL =" INSERT INTO data_sd (npsn, nama_sekolah, alamat)"
                    + "VALUES (?,?,?)";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setInt(1, paramnpsn);
            perintah.setString(2, paramnamasekolah);
            perintah.setString(3, paramalamat);
            perintah.executeUpdate();
            System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
    
    public void ubahdatasd (int paramnpsn, String paramnamasekolah, String paramalamat){
        try{
            String SQL =" UPDATE data_sd SET nama_sekolah=?, alamat=?"
                    + "WHERE npsn=?";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramnamasekolah);
            perintah.setString(2, paramalamat);
            perintah.setInt(3, paramnpsn);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
    
    public void hapusdatasd(int paramnpsn){
        try{
            String SQL = "DELETE FROM data_sd WHERE npsn=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramnpsn);
            perintah.executeUpdate();
            System.out.println("DataBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void caridatasd(int paramnpsn) {
        try{
            String SQL = "SELECT*FROM data_sd WHERE npsn=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setInt(1, paramnpsn);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("nama_sekolah:"+ data.getString("nama_sekolah"));
                System.out.println("alamat :"+ data.getString("almat"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());   
        }
       
    }
    
    public void datadatasd(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM data_sd ORDER BY npsn ASC ");
            while(baris.next()){
                System.out.println(baris.getInt("npsn")+" | "+
                        baris.getString("nama_sekolah")+" | "+
                        baris.getString("alamat"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}   

    