package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input data diri mahasiswa atau dosen");
        System.out.println("[1]Mahasiswa\n[2]Dosen");
        System.out.println("Inputan : ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt(); /*digunakan untuk menerima inputan pilahan dari user*/
        if(pilihan == 1){ /*kondisi apabila user memilih pilihan 1 yaitu mahasiswa*/
            System.out.print("Input nama Mahasiswa :");
            String nama = input.next(); /*digunakan untuk menerima inputan nama dari user*/
            System.out.print("input umur Mahasiswa (berupa angka saja) :");
            int umur = input.nextInt(); /*digunakan untuk menerima inputan umur dari user*/
            System.out.print("input NIM Mahasiswa :");
            String nim = input.next(); /*digunakan untuk menerima inputan nim dari user*/
            System.out.print("input semester (berupa angka saja) : ");
            String semester = input.next(); /*digunakan untuk menerima inputan semester dari user*/

            Student student1 = new Student(nama, umur, nim, semester);
            System.out.println("hasil : ");
            System.out.println(student1.getDetails()); /*digunakan untuk menampilkan hasil inputan dari user*/
        }
        else if(pilihan == 2) { /*kondisi apabila user memilih pilihan 2 yaitu dosen*/
            System.out.print("Input nama Dosen :");
            String nama = input.next(); /*digunakan untuk menerima inputan nama dari user*/
            System.out.print("input umur Dosen (berupa angka saja) :");
            int umur = input.nextInt(); /*digunakan untuk menerima inputan umur dari user*/
            System.out.print("input NIP Dosen :");
            String nip = input.next(); /*digunakan untuk menerima inputan nip dari user*/
            System.out.print("input mata kuliah : ");
            String mataKuliah = input.next(); /*digunakan untuk menerima inputan mata kuliah dari user*/

            Teacher teacher1 = new Teacher(nama, umur, nip, mataKuliah);
            System.out.println("hasil : ");
            System.out.println(teacher1.getDetails()); /*digunakan untuk menampilkan hasil inputan dari user*/
        }
        else {
            System.out.println("Inputan anda salah");
        }
    }
}
