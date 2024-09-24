package oop;


public class SmartPhone {
    private String merk;
    private String ram;
    private String rom;
    private String cameraDepan;
    private String cameraBelakang;
    private int tahunRilis;

    public SmartPhone() {
    }

    public SmartPhone(String merk, String ram, String rom, String cameraDepan, String cameraBelakang, int tahunRilis) {
        this.merk = merk;
        this.ram = ram;
        this.rom = rom;
        this.cameraDepan = cameraDepan;
        this.cameraBelakang = cameraBelakang;
        this.tahunRilis = tahunRilis;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getCameraDepan() {
        return cameraDepan;
    }

    public void setCameraDepan(String cameraDepan) {
        this.cameraDepan = cameraDepan;
    }

    public String getCameraBelakang() {
        return cameraBelakang;
    }

    public void setCameraBelakang(String cameraBelakang) {
        this.cameraBelakang = cameraBelakang;
    }
    
    
}
