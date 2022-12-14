import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 *
 */
class koperasi {
    
    private String idAnggota;
    private String namaAnggota;
    private String nomorRekening;
    
    int pinjam;
    double saldo,pajak;
    
    //method non void
    
    public koperasi (String idAnggota, String namaAnggota, String nomorRekening){
        this.idAnggota = idAnggota;
        this.namaAnggota = namaAnggota;
        this.nomorRekening = nomorRekening;
    }

    koperasi(int saldo, int pinjam, double pajak){
        this.saldo = saldo;
        this.pinjam = pinjam;
        this.pajak = pajak;
    }

    double hitungSaldo (){
        return this.saldo = (saldo + (pinjam - (pinjam * pajak)));
    }
    
    //Method Void
    
    void tampil (){
        DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println ("Id Anggota : "+this.idAnggota);
        System.out.println ("Nama Anggota : "+this.namaAnggota);
        System.out.println ("Nomor Rekenng : "+this.nomorRekening);
        System.out.println ();
    }
    
    void ambilSaldo (){
        System.out.println ("Saldo anda : "+ saldo);
        System.out.println ("Jumlah pinjaman : "+this.pinjam);
        System.out.println ("Bunga pinjaman : "+this.pajak);
        System.out.println ("Sisa saldo anda sebesar : "+  this.hitungSaldo());
    }
}

public class Quiz {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        koperasi anggota = new koperasi ("ID-123","Ricky Andriansyah","NR-001");
        koperasi ambil = new koperasi (50000,100000,0.15);
        anggota.tampil();
        ambil.ambilSaldo();
    }
}