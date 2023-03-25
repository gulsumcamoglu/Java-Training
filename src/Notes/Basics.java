package Notes;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World"); // alt satıra inmemesi
        // Escape Characters
        System.out.println("Hello \nWorld"); // alta indirir
        System.out.println("Hello\tWorld"); // bit tablık boşluk bırakmak
        System.out.println("Hello\bWorld"); // back space gerisini siler
        System.out.println("Hello\rWorld"); // öncesindeki herşeyi siler
        System.out.println("Hello\fWorld"); // artık kullanılmıyor
        System.out.println("Hello \'World"); // kesme işaretini bastırmak için kullanım
        System.out.println("Hello \"dersler\" World");// çift tırnak alıntı yapımı
        System.out.println("Hello\\tWorld"); // ekrana sadece ters slash bastırmak istiyorsam

        System.out.printf("Hello World");

        /**
         * çoklu satır comment Javadoc için
         * @author Gulsum Camoglu
         * @param
         * @return
         * @exception
         * {@code}
         * @see
         * @since
         * @version
         *
         *
         */
    }
}
