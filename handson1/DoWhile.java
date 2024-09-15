package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanBuah = {"apel", "pisang", "Mangga", "jeruk", "durian", "anggur"};
        int counter = 0;
        do {
            System.out.println("elemen ke" + (counter + 1) + "adalah :" + kumpulanBuah(counter));
            counter++;
        } while (counte < kumpulanBuah.length)
    }
}
