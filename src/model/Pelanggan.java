package model;


public class Pelanggan {
    private int id;
    private String nama;
    private String username;
    private String tanggal;
    private String tempat;
    private String alamat;
    private String agama;


    public Pelanggan(int id, String nama, String username, String tanggal, String tempat, String alamat, String agama) {
        this.id        = id;
        this.nama      = nama;
        this.username  = username;
        this.tanggal   = tanggal;
        this.tempat    = tempat;
        this.alamat    = alamat;
        this.agama     = agama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    
  
}
