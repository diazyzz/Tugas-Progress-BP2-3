class Pesanan {
    private int totalPembayaran;
    private int totalPesanan;
    private int kembalian;

    public Pesanan() {
        this.totalPembayaran = 0;
        this.totalPesanan = 0;
        this.kembalian = 0;
    }

    public void setTotalPembayaran (int totalPembayaran){
        this.totalPembayaran = totalPembayaran;
    }
    public void setTotalPesanan (int totalPesanan){
        this.totalPesanan = totalPesanan;
    }
    public void setKembalian(int kembalian){
        this.kembalian = kembalian;
    }
    public int getTotalPembayaran(){
        return totalPembayaran;
    }
    public int getTotalPesanan(){
        return totalPesanan;
    }
    public int getKembalian(){
        return kembalian;
    }

    public void displayPesanan(){
        System.out.println();
        System.out.println("TOTAL PESANAN           : " + getTotalPembayaran());
        System.out.println("TOTAL PEMBAYARAN        : " + getTotalPesanan());
        System.out.println("--------------------------------");
        System.out.println("KEMBALIAN               : " + getKembalian());
    }
}
