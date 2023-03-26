import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Operasi operasi = new Operasi();
        Date now = new Date();
        Owner owner = new Owner();
        Restoran restoran = new Restoran();
        Pelanggan pelanggan = new Pelanggan();
        Pesanan pesanan = new Pesanan();
        Menu menu = new Menu();
        Makanan makanan = new Makanan();
        Minuman minuman = new Minuman();
        Akun akun = new Akun();
        assert false;
        int pesananMakanan, pesananMinuman, pesananTotal, bayar, kembalian, pilihOperasi, pilihAdmin, pilihKasir;

        operasi.anggotaKelompok();
        do {
            System.out.println();
            operasi.mulaiOperasi();
            pilihOperasi = scn.nextInt();
            switch (pilihOperasi) {
                case 1 -> {
                    int pilihOwner;
                    do {
                        System.out.println();
                        operasi.mulaiOwner();
                        pilihOwner = scn.nextInt();
                        switch (pilihOwner) {
                            case 1 -> {
                                System.out.println();
                                scn = new Scanner(System.in);
                                System.out.print("Masukkan nama Restoran : ");
                                String namaRestoran = scn.nextLine();
                                scn = new Scanner(System.in);
                                System.out.print("Masukkan alamat Restoran : ");
                                String alamatRestoran = scn.nextLine();
                                restoran = new Restoran();
                                restoran.setRestoran(namaRestoran, alamatRestoran);
                                System.out.println("Data Restoran tersimpan..");

                            }
                            case 2 -> {
                                System.out.println();
                                scn = new Scanner(System.in);
                                System.out.print("Masukkan nama Owner : ");
                                String namaOwner = scn.nextLine();
                                System.out.print("Masukkan alamat Owner : ");
                                scn = new Scanner(System.in);
                                String alamatOwner = scn.nextLine();
                                System.out.print("Masukkan no Telp Owner : ");
                                String noTelpOwner = scn.next();
                                owner = new Owner();
                                owner.setOwner(namaOwner, alamatOwner, noTelpOwner);
                                System.out.println("Data Owner tersimpan..");

                            }
                            case 3 -> {
                                if (restoran != null) {
                                    restoran.setRestoran(null, null);
                                    System.out.print("Masukkan nama baru Restoran : ");
                                    scn = new Scanner(System.in);
                                    String ubahRestoran = scn.nextLine();
                                    System.out.print("Alamat baru Restoran : ");
                                    scn = new Scanner(System.in);
                                    String ubahAlamatRestoran = scn.nextLine();
                                    restoran = new Restoran();
                                    restoran.setRestoran(ubahRestoran, ubahAlamatRestoran);
                                } else {
                                    System.out.println("Data restoran belum ada...");
                                }
                            }
                            case 4 -> {
                                if (owner != null) {
                                    owner.setOwner(null, null, null);
                                    System.out.print("Masukkan nama baru Owner : ");
                                    scn = new Scanner(System.in);
                                    String ubahOwner = scn.nextLine();
                                    System.out.print("Alamat baru Owner : ");
                                    scn = new Scanner(System.in);
                                    String ubahAlamatOwner = scn.nextLine();
                                    System.out.print("Masukkan no Telp baru Owner : ");
                                    String ubahnoTelpOwner = scn.next();
                                    owner = new Owner();
                                    owner.setOwner(ubahOwner, ubahAlamatOwner, ubahnoTelpOwner);
                                } else {
                                    System.out.println("Data owner belum ada...");
                                }

                            }
                            case 5 -> {
                                System.out.println();
                                System.out.println("Data Restoran");
                                if (restoran != null) {
                                    restoran.displayRestoran();
                                } else {
                                    System.out.println("Data belum didaftarkan");
                                }
                                System.out.println();
                                System.out.println("Data Owner ");
                                if (owner != null) {
                                    owner.displayOwner();
                                } else {
                                    System.out.println("Data belum didaftarkan");
                                }
                            }
                        }
                    } while (pilihOwner != 6);
                }
                case 2 -> {
                    do {
                        System.out.println();
                        operasi.mulaiAdmin();
                        pilihAdmin = scn.nextInt();
                        switch (pilihAdmin) {
                            case 1 -> {
                                System.out.println();
                                    makanan.MenuMakanan();
                                    minuman.MenuMinuman();
                            }
                            case 2 -> {
                                System.out.println();
                                operasi.mulaiTambahMenu();
                                int pilihTambahMenu = scn.nextInt();
                                if (pilihTambahMenu == 1) {
                                    String pilihTambahMenuMakanan;
                                    do {
                                        System.out.println();
                                        makanan.tambahMenuMakanan();
                                        makanan.displayTambahMenuMakanan();
                                        operasi.menuDibuat();
                                        pilihTambahMenuMakanan = scn.next();
                                    } while (!pilihTambahMenuMakanan.equals("n"));
                                } else {
                                    String pilihTambahMenuMinuman;
                                    do {
                                        System.out.println();
                                        minuman.tambahMenuMinuman();
                                        minuman.displayTambahMenuMinuman();
                                        operasi.menuDibuat();
                                        pilihTambahMenuMinuman = scn.next();
                                    } while (!pilihTambahMenuMinuman.equals("n"));
                                }
                            }
                            case 3 -> {
                                System.out.println();
                                operasi.mulaiUbahMenu();
                                int pilihUbahMenu = scn.nextInt();
                                System.out.println();
                                if (pilihUbahMenu == 1) {
                                    makanan.ubahMenuMakanan();
                                    makanan.displayUbahMenuMakanan();
                                } else {
                                    minuman.ubahMenuMinuman();
                                    minuman.displayUbahMenuMinuman();
                                }
                                System.out.println("Menu berhasil diubah..");
                            }
                            case 4 -> {
                                System.out.println();
                                operasi.mulaiHapusMenu();
                                int pilihHapusMenu = scn.nextInt();
                                if (pilihHapusMenu == 1) {
                                    makanan.MenuMakanan();
                                    System.out.print("Hapus menu Makanan nomor : ");
                                    int hapusMenu = scn.nextInt();
                                    makanan.menuMakanan.remove(hapusMenu - 1);
                                } else {
                                    minuman.MenuMinuman();
                                    System.out.print("Hapus menu Minuman nomor : ");
                                    int hapusMinuman = scn.nextInt();
                                    minuman.menuMinuman.remove(hapusMinuman - 1);
                                }
                                System.out.println("Menu berhasil dihapus..");
                            }
                            case 5 -> System.out.println("TERIMAKASIH ADMIN!");
                        }
                    } while (pilihAdmin != 5);
                }
                case 3 -> {
                    do {
                        System.out.println();
                        operasi.mulaiKasir();
                        pilihKasir = scn.nextInt();
                        switch (pilihKasir) {
                            case 1 -> {
                                System.out.println();
                                System.out.println("== LAYANI PESANAN ==");
                                System.out.println("Masukkan Data Pelanggan");
                                System.out.print("id : ");
                                String idPelanggan = scn.next();
                                System.out.print("Nama : ");
                                scn = new Scanner(System.in);
                                String namaPelanggan = scn.nextLine();
                                pelanggan = new Pelanggan();
                                pelanggan.setPelanggan(idPelanggan, namaPelanggan);
                                System.out.println("Data pelanggan berhasil dimasukkan!");
                                System.out.println();
                                makanan.MenuMakanan();
                                System.out.print("Makanan : ");
                                int inputMakanan = scn.nextInt();
                                System.out.print("Jumlah : ");
                                int jumlahMakanan = scn.nextInt();
                                pesananMakanan = makanan.hargaMakanan.get(inputMakanan - 1) * jumlahMakanan;
                                System.out.println();
                                minuman.MenuMinuman();
                                System.out.print("Minuman : ");
                                int inputMinuman = scn.nextInt();
                                System.out.print("Jumlah : ");
                                int jumlahMinuman = scn.nextInt();
                                pesananMinuman = minuman.hargaMinuman.get(inputMinuman - 1) * jumlahMinuman;
                                menu.setPesanan(makanan.menuMakanan.get(inputMakanan-1),minuman.menuMinuman.get(inputMinuman-1), jumlahMakanan, jumlahMinuman);
                                System.out.println();
                                pesananTotal = pesananMakanan + pesananMinuman;
                                pesanan.setTotalPembayaran(pesananTotal);
                                System.out.println("Total : " + pesananTotal);
                                System.out.print("Bayar : ");
                                bayar = scn.nextInt();
                                pesanan.setTotalPesanan(bayar);
                                kembalian = bayar - pesananTotal;
                                pesanan.setKembalian(kembalian);
                                System.out.println("Kembalian : " + kembalian);
                                menu.setPembayaran(pesananMakanan, pesananMinuman);
                            }
                            case 2 -> {
                                System.out.println();
                                System.out.println();
                                System.out.println("== NOTA PEMBAYARAN ==");
                                if (restoran != null) {
                                    restoran.displayRestoran();
                                    System.out.println("--------------------------------");
                                    System.out.println(now);
                                } else {
                                    System.out.println();
                                }
                                if (pelanggan != null) {
                                    pelanggan.displayPelanggan();
                                    System.out.println("--------------------------------");
                                    menu.displayMenu();
                                    pesanan.displayPesanan();
                                    System.out.println("--------------------------------");
                                    System.out.println();
                                    System.out.println("TERIMA KASIH HAVE A NICE DAY :)");
                                } else {
                                    System.out.println();
                                }
                            }
                            case 3 -> System.out.println("TERIMAKASIH KASIR!");
                        }
                    } while (pilihKasir != 3);
                }
            }
        } while (pilihOperasi != 4);
        System.out.println("TERIMAKASIH!");
    }
}
