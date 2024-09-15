package handson1;

public class forloop {
    public static void main(String[] args) {
        String[] buah = {"apel", "pisang", "mangga", "jeruk", "durian", "anggur" };
        for (int i = 0; i < buah.length; i++) {
            if (i == 2  || i ==3){
                continue;
            }
            System.out.println("elemen ke " + (i + 1) + "adalah :" + buah[i]);
        }
    }
}
