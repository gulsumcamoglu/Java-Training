package Notes;

public class VariablesandDataTypes {
    public static void main(String[] args) {
        int x = 4; // tamsayılar
        x = 7; // değiştirirken

        int y; // initial etmeden
        y=3; // hata vermemesi için tanımalamam şart

        int a,b,c; // çoklu tanımlama

        int total = x + y ; // toplama

        //------------------------------------------
        int kisaKenar = 10, uzunKenar = 20;
        int cevre = 2*(kisaKenar+uzunKenar);

        // diğer tam sayı veri tipleri

        byte byteOrnek = 100; // 8 bit
        short shortOrnek = 10000; // 16 bit
        // int 32 bit ve optimize uzunlukta
        long longOrnek = 1000000000; // 64 bit
        // değişen tek şey boyutları


        // ondalıklılar

        float floatOrnek = 1;// 32 bit
        float float2 = 3.2F; // f yazılır doubledan ayırmak için
        double doubleOrnek = 4.3;
        double double2=1; // 64 bit

        // char , karakter :ascii kodları var 65 a harfi gibi
        char vChar = 'b'; // tek tırnak zorunlu , ve 'ba' yazamam
        char v2Char = 98; // 98 bye karşılık gelir ve b döndürür

        //-------------------

        char c1 = 'j';
        char c2 = 'a';
        char c3 = 'v';
        char c4 = 'a';
        System.out.println(""+c1+c2+c3+c4);

        // Boolean :True / False

        // String
        String vStr = "";

        // ? Operatörü
        int as = 20, bs = 10;
        if ((as < bs) && (bs++ < 25)){
            System.out.println(as);
        }else{
            System.out.print(as);
        }
        System.out.println(bs);


























    }
}
