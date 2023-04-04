package Karyawan;

public class Boss extends Employee {
    
    String jabat = "Boss";
    int gaji = 30_000_000;
    
    @Override
    int hitung(int gaji, int jamKerja) {
        int potongan = (int) ((super.jamKerja - jamKerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}