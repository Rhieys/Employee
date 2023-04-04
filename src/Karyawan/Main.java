package Karyawan;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan Nama Anda          : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan NIP                : ");
        int nip = scan.nextInt();
        scan.nextLine();
        System.out.print("Masukkan Jabatan Anda       : ");
        String jabat = scan.nextLine();

        Boss boss = new Boss();
        Manager manager = new Manager();
        CleaningService cleaningService = new CleaningService();
        Security security = new Security();
        int ehem = 0;

        if (jabat.equalsIgnoreCase(boss.jabat)) {
            System.out.print("Berapa Lama Waktu Kerja Anda: ");
            int lamaKerja = scan.nextInt();
            ehem = boss.hitung(boss.gaji, lamaKerja);
            System.out.println("Gaji Maksimal Anda          : " + boss.gaji);
        } else if (jabat.equalsIgnoreCase(manager.jabat)) {
            System.out.print("Berapa Lama Waktu Kerja Anda: ");
            int lamaKerja = scan.nextInt();
            ehem = manager.hitung(manager.gaji, lamaKerja);
            System.out.println("Gaji Maksimal Anda          : " + manager.gaji);
        } else if (jabat.equalsIgnoreCase(cleaningService.jabat)) {
            System.out.print("Berapa Lama Waktu Kerja Anda: ");
            int lamaKerja = scan.nextInt();
            ehem = cleaningService.hitung(cleaningService.gaji, lamaKerja);
            System.out.println("Gaji Maksimal Anda          : " + cleaningService.gaji);
        } else if (jabat.equalsIgnoreCase(security.jabat)) {
            System.out.print("Berapa Lama Waktu Kerja Anda: ");
            int lamaKerja = scan.nextInt();
            ehem = security.hitung(security.gaji, lamaKerja);
            System.out.println("Gaji Maksimal Anda          : " + security.gaji);
        }

        System.out.print("Status (Menikah/ Belum)     : ");
        String status = scan.next();
        boolean st = true;
        int bonus = 0;
        if (status.equalsIgnoreCase("menikah")) {
            bonus += 2_000_000;
            System.out.println("Bonus : Rp 2.000.000" + bonus);
        }

        int jamKerja = 0;
        int potongan = 0;
        if (jamKerja < 8) {
            potongan = (int) (0.05 * ehem);
        }

        int gajiBersih = ehem + bonus - potongan;
        System.out.println("\n");
        System.out.println("========================================");
        System.out.println("\tNama Anda    : " + nama);
        System.out.println("\tNIP Anda     : " + nip);
        System.out.println("\tJabatan Anda : " + jabat);
        System.out.println("\tStatus Anda  : " + status);
        System.out.println("\tGaji Anda    : " + ehem);
        System.out.println("\tBonus Anda   : " + bonus);
        System.out.println("\tPotongan Gaji: " + potongan);
        System.out.println("\tGaji Bersih  : " + gajiBersih);
        System.out.println("=======================================");
    }
}