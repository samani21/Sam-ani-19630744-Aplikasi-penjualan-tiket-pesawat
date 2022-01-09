package model;


public class Trans {
  private int no_tiket;
  private String id_pelanggan;
  private String nm_pelanggan;
  private String kelas;
  private String maskapai;
  private String penerbangan;
  private String tujuan;
  private String tanggal;
  private String jam;
  private String biaya;

    public Trans(int no_tiket, String id_pelanggan, String nm_pelanggan, String maskapai, String penerbangan, String tujuan, String tanggal, String jam,String kelas, String biaya) {
        this.no_tiket = no_tiket;
        this.id_pelanggan = id_pelanggan;
        this.nm_pelanggan = nm_pelanggan;
        this.maskapai = maskapai;
        this.penerbangan = penerbangan;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.kelas = kelas;
        this.biaya = biaya;
    }

    public Trans() {
        
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    
    
    public Trans(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getNo_tiket() {
        return no_tiket;
    }

    public void setNo_tiket(int no_tiket) {
        this.no_tiket = no_tiket;
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getNm_pelanggan() {
        return nm_pelanggan;
    }

    public void setNm_pelanggan(String nm_pelanggan) {
        this.nm_pelanggan = nm_pelanggan;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getPenerbangan() {
        return penerbangan;
    }

    public void setPenerbangan(String penerbangan) {
        this.penerbangan = penerbangan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }
  
  
}
