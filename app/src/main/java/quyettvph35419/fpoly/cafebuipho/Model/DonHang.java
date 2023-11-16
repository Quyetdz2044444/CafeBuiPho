package quyettvph35419.fpoly.cafebuipho.Model;

import java.util.Date;

public class DonHang {
    private int maDH;
    private int maKH;
    private Date ngay;
    private int gia;
    private int trangThai;

    public DonHang() {
    }

    public DonHang(int maDH, int maKH,  Date ngay, int gia, int trangThai) {
        this.maDH = maDH;
        this.maKH = maKH;
        this.ngay = ngay;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
