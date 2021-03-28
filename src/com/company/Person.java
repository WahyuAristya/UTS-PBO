package com.company;

public abstract class Person {  //kelas abstract
    private String nama; //Encapsulation
    private int umur;

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return umur;
    }

    public void setAge(int umur) {
        this.umur = umur;
    }

    public abstract String getDetails();
}
