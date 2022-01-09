package model;

public class Jadwal {
    private int no;
    private int kode;
    private String maskapai;
    private String penerbangan;
    private String tujuan;
    private String tanggal;
    private String jam;
    private String kelas;
    private String bangku;
    private String biaya;



    public Jadwal() {
        
    }

    public Jadwal(int kode,String maskapai, String penerbangan, String tujuan, String tanggal, String jam, String kelas, String bangku,String biaya) {
        this.kode = kode;
        this.maskapai = maskapai;
        this.penerbangan = penerbangan;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.kelas= kelas;
        this.bangku = bangku;
        this.biaya = biaya;
    }

    public Jadwal(String maskapai, String penerbangan, String tujuan, String tanggal, String jam, String kelas,String biaya) {
        this.maskapai = maskapai;
        this.penerbangan = penerbangan;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.kelas= kelas;
        this.biaya = biaya; 
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }


    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
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

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getBangku() {
        return bangku;
    }

    public void setBangku(String bangku) {
        this.bangku = bangku;
    }
    
     
}
