class Restoran {
    private String nama;
    private String alamat;

    public Restoran (){
        this.nama = "";
        this.alamat = "";
    }
    public void setRestoran(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void displayRestoran(){
        System.out.println("Restoran : " + this.getNama());
        System.out.println("Alamat : " + this.getAlamat());
    }
}
