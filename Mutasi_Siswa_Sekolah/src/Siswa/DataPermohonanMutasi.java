/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Siswa;

/**
 *
 * @author madey
 */
public class DataPermohonanMutasi {
 
    String npsn,namasekolahasal,sekolahtujuan,keterangan;

    public DataPermohonanMutasi(){}
    public DataPermohonanMutasi(String npsn,String namasekolahasal,String sekolahtujuan,String keterangan){
         this.npsn = npsn;
         this.namasekolahasal = namasekolahasal;
         this.sekolahtujuan = sekolahtujuan;
         this.keterangan = keterangan;
    } 
    
    
    public void inputnpsn(String npsn){
        this.npsn = npsn;
    }
    
    public String ambilnpsn(){
        return this.npsn;
    }
    public void inputnamasekolahasal(String namasekolahasal){
        this.namasekolahasal = namasekolahasal;
    }
    
    public String ambilnamasekolahasal(){
        return this.namasekolahasal;
    }
    public void inputsekolahtujuan(String sekolahtujuan){
        this.sekolahtujuan = sekolahtujuan;
    }
    
    public String ambilsekolahtujuan(){
        return this.sekolahtujuan;
    }
    public void inputketerangan(String keterangan){
        this.keterangan = keterangan;
    }
    public String ambilketerangan(){
        return this.keterangan;
    } 
    
}
