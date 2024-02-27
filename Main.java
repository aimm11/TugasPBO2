public class Main {
    public static void main(String[] args) {
        // Membuat instance dari kelas Books
        Books book1 = new Books("Aimm", "B Indo", 20, 12345);
        Books book2 = new Books("Atsal", "B Inggris", 25, 54321);
        Books book3 = new Books("Galang", "B Sunda", 30, 98765);

        // Menghitung total harga dari buku-buku yang dibeli
        double total_price = book1.getPrice() + book2.getPrice() + book3.getPrice();
        System.out.println("Total harga dari buku-buku yang dibeli: " + total_price);
    }
}

class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }
}

class Books {
    private double price;
    public Books(String author, String title, double price, int publisherNumber) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}