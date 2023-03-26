import java.util.Scanner;
import java.util.ArrayList;

class Menu{
    private final Scanner scanner = new Scanner (System.in);
    private String makanan;
    private String minuman;
    private String tambahMakanan;
    private String tambahMinuman;
    private String ubahMakanan;
    private String ubahMinuman;
    private int ubahmakananHarga;
    private int ubahminumanHarga;
    private int jumlahMakanan;
    private int jumlahMinuman;
    private int hargaTotalMakanan;
    private int hargaTotalMinuman;
    private int makananHarga;
    private int minumanHarga;
    ArrayList<String> menuMakanan = new ArrayList<>();
    ArrayList<String> menuMinuman = new ArrayList<>();
    ArrayList<Integer> hargaMakanan = new ArrayList<>();
    ArrayList<Integer> hargaMinuman = new ArrayList<>();


    public Menu(){
        this.makanan = " ";
        this.minuman = " ";
        this.tambahMakanan = " ";
        this.tambahMinuman = " ";
        this.jumlahMakanan = 0;
        this.jumlahMinuman = 0;
        this.hargaTotalMakanan = 0;
        this.hargaTotalMinuman = 0;

    }
    public void MenuMakanan() {
        if (menuMakanan != null) {
            System.out.println("Data Menu Makanan : ");
            for (int i = 0; i < menuMakanan.size(); i++) {
                System.out.println((i + 1) + ". " + menuMakanan.get(i) + " [" + hargaMakanan.get(i) + "]");
            }
        }else {
            System.out.println("Menu makanan masih kosong !!");
        }
    }
    public void MenuMinuman() {
        if (menuMinuman != null) {
            System.out.println("Data Menu Minuman : ");
            for (int i = 0; i < menuMinuman.size(); i++) {
                System.out.println((i + 1) + ". " + menuMinuman.get(i) + " [" + hargaMinuman.get(i) + "]");
            }
        } else {
            System.out.println("Menu minuman masih kosong !!");
        }
    }
    public void tambahMenuMakanan(){
        System.out.print("Masukkan menu Makanan : ");
        String tambahMakanan = scanner.next();
        System.out.print("Masukkan harga : ");
        int makananHarga = scanner.nextInt();
        menuMakanan.add(tambahMakanan);
        hargaMakanan.add(makananHarga);
        setMenuMakanan(tambahMakanan, makananHarga);
    }
    public void tambahMenuMinuman (){
        System.out.print("Masukkan menu Minuman : ");
        String tambahMinuman = scanner.next();
        System.out.print("Masukkan harga : ");
        int minumanHarga = scanner.nextInt();
        menuMinuman.add(tambahMinuman);
        hargaMinuman.add(minumanHarga);
        setMenuMinuman(tambahMinuman, minumanHarga);
    }

    public void ubahMenuMakanan(){
        MenuMakanan();
        System.out.print("Ubah nomer Menu Makanan : ");
        int pilihUbahMenuMakanan = scanner.nextInt();
        menuMakanan.remove(pilihUbahMenuMakanan-1);
        hargaMakanan.remove(pilihUbahMenuMakanan-1);
        System.out.print("Masukkan menu baru : ");
        String menuMakananBaru = scanner.next();
        System.out.print("Masukkan harga baru : ");
        int hargaMakananBaru = scanner.nextInt();
        menuMakanan.add(menuMakananBaru);
        hargaMakanan.add(hargaMakananBaru);
        setUbahMenuMakanan(menuMakananBaru, hargaMakananBaru);
    }
    public void ubahMenuMinuman() {
        MenuMinuman();
        System.out.print("Ubah nomer Menu Minuman : ");
        int pilihUbahMenuMinuman = scanner.nextInt();
        menuMinuman.remove(pilihUbahMenuMinuman - 1);
        hargaMinuman.remove(pilihUbahMenuMinuman - 1);
        System.out.print("Masukkan menu baru : ");
        String menuMinumanBaru = scanner.next();
        System.out.print("Masukkan harga baru : ");
        int hargaMinumanBaru = scanner.nextInt();
        menuMinuman.add(menuMinumanBaru);
        hargaMinuman.add(hargaMinumanBaru);
        setUbahMenuMinuman(menuMinumanBaru, hargaMinumanBaru);
    }
    public void setUbahMenuMakanan(String ubahMakanan, int ubahmakananHarga){
        this.ubahMakanan = ubahMakanan;
        this.ubahmakananHarga = ubahmakananHarga;
    }
    public void setUbahMenuMinuman(String ubahMinuman, int ubahminumanHarga){
        this.ubahMinuman = ubahMinuman;
        this.ubahminumanHarga = ubahminumanHarga;
    }
    public void setMenuMakanan(String tambahMakanan, int makananHarga){
        this.tambahMakanan = tambahMakanan;
        this.makananHarga = makananHarga;
    }
    public void setMenuMinuman(String tambahMinuman, int minumanHarga){
        this.tambahMinuman = tambahMinuman;
        this.minumanHarga = minumanHarga;
    }
    public String getTambahMakanan(){
        return tambahMakanan;
    }
    public String getTambahMinuman(){
        return tambahMinuman;
    }
    public String getUbahMakanan(){
        return ubahMakanan;
    }
    public String getUbahMinuman(){
        return ubahMinuman;
    }
    public int getMakananHarga(){
        return makananHarga;
    }
    public int getMinumanHarga(){
        return minumanHarga;
    }
    public int getUbahmakananHarga(){
        return ubahmakananHarga;
    }
    public int getUbahminumanHarga(){
        return ubahminumanHarga;
    }
    public void displayTambahMenuMakanan() {
        System.out.println(getTambahMakanan() + "[" + getMakananHarga() + "]");
    }
    public void displayTambahMenuMinuman(){
        System.out.println(getTambahMinuman() + "[" + getMinumanHarga() + "]");
    }
    public void displayUbahMenuMakanan(){
        System.out.println("Data menu Makanan : " + getUbahMakanan() + "[" + getUbahmakananHarga() + "]");
    }
    public void displayUbahMenuMinuman(){
        System.out.println("Data menu Minuman : " + getUbahMinuman() + "[" + getUbahminumanHarga() + "]");
    }

    public void setPesanan(String makanan, String minuman, int jumlahMakanan, int jumlahMinuman){
        this.makanan = makanan;
        this.minuman = minuman;
        this.jumlahMakanan = jumlahMakanan;
        this.jumlahMinuman = jumlahMinuman;
    }
    public void setPembayaran(int hargaTotalMakanan, int hargaTotalMinuman){
        this.hargaTotalMakanan = hargaTotalMakanan;
        this.hargaTotalMinuman = hargaTotalMinuman;
    }
    public String getMakanan() {
        return makanan;
    }
    public String getMinuman() {
        return minuman;
    }
    public int getJumlahMakanan(){
        return jumlahMakanan;
    }
    public int getJumlahMinuman(){
        return jumlahMinuman;
    }
    public int getHargaTotalMakanan(){
        return hargaTotalMakanan;
    }
    public int getHargaTotalMinuman(){
        return hargaTotalMinuman;
    }
    public void displayMenu(){
        System.out.println(getMakanan() + "["+getJumlahMakanan()+"]           : " + getHargaTotalMakanan());
        System.out.println(getMinuman() + "["+getJumlahMinuman()+"]           : " + getHargaTotalMinuman());
    }
}

class Makanan extends Menu{
    Makanan(){
        super();
    }
}

class Minuman extends Menu{
    Minuman(){
        super();
    }
}