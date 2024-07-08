/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Siswa;
import java.util.ArrayList;

/**
 *
 * @author madey
 */
public class DataSiswa extends DataPermohonanMutasi {

    String nisn,namasiswa,alamat,jeniskelamin;
    
    ArrayList<String> nisns;
    ArrayList<String> namasiswas;
    ArrayList<String> alamats;
    ArrayList<String> jeniskelamins;

    public DataSiswa(){
        
        nisns = new ArrayList<>();
        namasiswas = new ArrayList<>();
        alamats = new ArrayList<>();
        jeniskelamins = new ArrayList<>();
        
    }
    public DataSiswa(String nisn,String namasiswa,String alamat,String jeniskelamin){
         this.nisn= nisn;
         this.namasiswa = namasiswa;
         this.alamat = alamat;
         this.jeniskelamin = jeniskelamin;
    } 
    
    public void isinisn (String nisn){
        nisns.add(nisn);
    }
    
    public  ArrayList<String> getnisn (){
        return this.nisns;
    }

    public void inputnisn(String nisn){
        this.nisn = nisn;
    }
  
    public String ambilnisn(){
        return this.nisn;
    }
    
    public void isinamasiswa (String namasiswa){
        namasiswas.add(namasiswa);
    }
    
    public  ArrayList<String> getnamasiswa (){
        return this.namasiswas;
    }
    
    public void inputnamasiswa(String namasiswa){
        this.namasiswa = namasiswa;
    }
    public String ambilnamasiswa(){
        return this.namasiswa;
    }
    
    public void inputalamat(String alamat){
        this.alamat = alamat;
    }
     public void isialamat (String alamat){
        alamats.add(alamat);
    }
    
    public  ArrayList<String> getalamat (){
        return this.alamats;
    }
    public String ambilalamat(){
        return this.alamat;
    }
    
    public void inputjeniskelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
     public void isijeniskelamin (String jeniskelamin){
        jeniskelamins.add(jeniskelamin);
    }
    
    public  ArrayList<String> getjeniskelamin (){
        return this.namasiswas;
    }
    public String ambiljeniskelamin(){
        return this.jeniskelamin;
    }
    
        
}
