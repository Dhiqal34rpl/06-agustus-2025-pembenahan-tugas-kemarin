//Objects class --> tidak butuh main method
public class Friends {
    //property class
    String nama;
    int usia;
    String cita;
    String hobi;

    //constructor
    public Friends(String n, int u, String c, String h) {

        nama = n;
        usia = u;
        cita = c;
        hobi = h;
    }
     

    //method untuk menampilkan data
    public void print() {
        System.out.println("nama : " + nama);
        System.out.println("usia : " + usia);
        System.out.println("cita cita : " + cita);
        System.out.println("hobi : " + hobi);


    }
}
