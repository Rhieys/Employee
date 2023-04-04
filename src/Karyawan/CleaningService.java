package Karyawan;

public class CleaningService extends Employee {
    
    String jabat = "Cleaning Service";
    int gaji = 3_500_000;
    
    @Override
    int hitung(int gaji, int jamKerja) {
        int potongan = (int) ((super.jamKerja - jamKerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}