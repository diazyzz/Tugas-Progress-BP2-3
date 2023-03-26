class Operasi {
    public void anggotaKelompok(){
        System.out.println("Oleh : ");
        System.out.println("1. Dias Norman (22082010134)");
        System.out.println("2. Krisna Eko Prasetyo (22082010149)");
        System.out.println("3. Hisyam Abiyansah G. (22082010161)");
        System.out.println("4. M. Farhan Hidayatulloh (22082010141)");
    }
    public void mulaiOperasi(){
        System.out.println("====BISNIS KULINER====");
        System.out.println("1. Owner");
        System.out.println("2. Admin");
        System.out.println("3. Kasir");
        System.out.println("4. Exit");
        System.out.print("pilih operasi : ");
    }
    public void mulaiOwner(){
        System.out.println("==SELAMAT DATANG OWNER==");
        System.out.println("1. Input Restoran");
        System.out.println("2. Input Owner");
        System.out.println("3. Ubah Restoran");
        System.out.println("4. Ubah Owner");
        System.out.println("5. Info Restoran & Owner");
        System.out.println("6. Exit");
        System.out.print("pilih : ");
    }
    public void mulaiAdmin(){
        System.out.println("SELAMAT DATANG ADMIN");
        System.out.println("1. Lihat Menu");
        System.out.println("2. Tambah Menu");
        System.out.println("3. Ubah Menu");
        System.out.println("4. Hapus Menu");
        System.out.println("5. Exit");
        System.out.print("Pilih : ");
    }
    public void mulaiKasir(){
        System.out.println("SELAMAT DATANG KASIR");
        System.out.println("1. Layani Pesanan");
        System.out.println("2. Cetak Nota");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
    }
    public void mulaiTambahMenu(){
        System.out.println("Tambah Menu");
        System.out.println("1. Makanan\n2. Minuman");
        System.out.print("pilih : ");
    }
    public void mulaiUbahMenu(){
        System.out.println("Ubah Menu");
        System.out.println("1. Makanan\n2. Minuman");
        System.out.print("pilih : ");
    }
    public void mulaiHapusMenu(){
        System.out.println("Pilih Jenis Menu yang ingin dihapus\n1. Makanan\n2. Minuman");
        System.out.print("Pilih : ");
    }
    public void menuDibuat(){
        System.out.println("Menu dibuat..");
        System.out.println("Tambah menu lagi? (y/n)");
    }
}
