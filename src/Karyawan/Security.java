package Karyawan;

public class Security extends Employee {
    
    String jabat = "Security";
    int gaji = 6_500_000;
    double pot = 0.02;
    
    @Override
    int hitung(int gaji, int jamKerja) {
        int potongan = (int) (jamKerja * pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}