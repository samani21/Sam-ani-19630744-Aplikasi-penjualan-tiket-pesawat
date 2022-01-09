package model;

public class Session {
    private static String id;
    private static String nama;
    private static String username;
    private static String tanggal;
    private static String tempat_lahir;
    private static String alamat;
    private static String agama;
    private static String password;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Session.id = id;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }

    public static String getTanggal() {
        return tanggal;
    }

    public static void setTanggal(String tanggal) {
        Session.tanggal = tanggal;
    }

    public static String getTempat() {
        return tempat_lahir;
    }

    public static void setTempat(String tempat) {
        Session.tempat_lahir = tempat;
    }
   
    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        Session.alamat = alamat;
    }

    public static String getAgama() {
        return agama;
    }

    public static void setAgama(String agama) {
        Session.agama = agama;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Session.password = password;
    }
    
    
}
