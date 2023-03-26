class Pelanggan{
    private String nama;
    private String idPelanggan;

    Pelanggan () {
        this.nama = " ";
        this.idPelanggan = " ";
    }

    public void setPelanggan (String idPelanggan, String nama){
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    public String getIdPelanggan(){
        return idPelanggan;
    }
    public String getNama(){
        return nama;
    }
    public void displayPelanggan(){
        System.out.println("ID : "+ getIdPelanggan());
        System.out.println("Pelanggan : " + this.getNama());
    }
}
