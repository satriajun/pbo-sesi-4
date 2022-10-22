import java.sql.Time;

public class Jadwal {

    public static void main(String[] args) {
        //Overriding

        Mahasiswa mhs = new Mahasiswa("Abi Fajarp");
        mhs.info();

        mhs = new Dosen("Alun Sujjada M.Kom");
        mhs.info();

        mhs = new Matkul("Pemrograman berorientasi Objek");
        mhs.info();

        waktu(100);
        waktu("16 Desember 2022");
        waktu("Rabu",7, "Pagi");
    }

    //Overloading
    static void waktu(int Wkt){
        System.out.println("Waktu Kuliah/M \t : " + Wkt);
    }

    static void waktu(String Wkt){
        System.out.println("Pada Tanggal \t : " + Wkt);
    }

    static void waktu(String hari, int Wkt, String waktu){
        System.out.println("Waktu \t\t\t : " + hari + ", Pukul " + Wkt + " " + waktu);
    }


}
