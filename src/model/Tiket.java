package model;

public class Tiket {
    public int id;
    public String kelas;
    public String maskapai;
    public String penerbangan;
    public String tujuan;
    public String tanggal;
    public String jam;
    public String biaya;

    public Tiket(int id, String kelas, String maskapai, String penerbangan, String tujuan, String tanggal, String jam, String biaya) {
        this.id = id;
        this.kelas = kelas;
        this.maskapai = maskapai;
        this.penerbangan = penerbangan;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.biaya = biaya;
    }

    public Tiket() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
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
