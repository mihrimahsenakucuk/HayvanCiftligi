public class At extends Hayvan  {


    public String kacYasindanitibarenBinilebilir;

    public At(String tur, String yasadigiYer, int yas) {
        super(tur, yasadigiYer, yas);
        this.kacYasindanitibarenBinilebilir= " 2 yaşından büyük çocuklar için uygundur.";

    }

    public void bilgiler() {
        super.bilgiler();
        System.out.println("Kaç yaşından itibaren at ile gezinti yapılabilir? " + kacYasindanitibarenBinilebilir);
    }


}
