package Karyawan;

public class Manager extends Employee {
    
    String jabat = "Manager";
    int gaji = 25_000_000;
    
    @Override
    int hitung(int gaji, int jamKerja) {
        int potongan = (int) ((super.jamKerja - jamKerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}