package com.company;

public class Teacher extends Person {
    private String nip;
    private String mataKuliah;

    @Override
    public String getDetails() {
        return getName() + " adalah dosen yang berumur " + getAge() + " tahun yang mengajar mata kuliah " + mataKuliah + ", dengan NIP: " + nip;
    }

    public Teacher(String nama, int umur, String nip, String mataKuliah) {
        setName(nama);
        setAge(umur);
        this.nip = nip;
        this.mataKuliah = mataKuliah;
    }
}
