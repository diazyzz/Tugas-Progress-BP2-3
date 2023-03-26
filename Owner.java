class Owner {
    private String nama;
    private String alamat;
    private String noTelp;

    public Owner() {
        this.nama = "";
        this.alamat = "";
        this.noTelp = "";
    }
    public void setOwner(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getNamaOwner() {
        return this.nama;
    }

    public String getAlamatOwner() {
        return this.alamat;
    }

    public String getNoTelpOwner() {
        return this.noTelp;
    }

    public void displayOwner() {
        System.out.println("Nama : " + this.getNamaOwner());
        System.out.println("Alamat : " + this.getAlamatOwner());
        System.out.println("No Telp : " + this.getNoTelpOwner());
    }
}
