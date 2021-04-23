public class Papagan extends Hayvan{

    private String cocuklarınBeslemesineUygunMu;

    public Papagan(String tur, String yasadigiYer, int yas) {
        super(tur, yasadigiYer, yas);
        this.cocuklarınBeslemesineUygunMu=" Evet besleyebilirler. Tohum taneleri ve yemişlerden çok hoşlanırlar.";
    }


    public void bilgiler() {

        super.bilgiler();
        System.out.println("Çocuklar papağanları besleyebilir mi?" + cocuklarınBeslemesineUygunMu);
    }
}

