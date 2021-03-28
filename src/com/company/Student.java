package com.company;

public class Student extends Person { //inheritance
    private String nim;
    private String semester;

    @Override //polymorphism
    public String getDetails() {
        return getName() + " adalah mahasiswa berumur " + getAge() + " tahun yang berada di semester " + semester + ", dengan NIM : " + nim;
    }

    public Student(String nama, int umur, String nim, String semester) {
        setName(nama);
        setAge(umur);
        this.nim = nim;
        this.semester = semester;
    }


}
