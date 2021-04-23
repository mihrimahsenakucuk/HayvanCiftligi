public class Zurafa extends Hayvan{

    private double boy;

    public Zurafa(String tur, String yasadigiYer, int yas) {
        super(tur, yasadigiYer, yas);
        this.boy=4.4;

    }

    public void bilgiler() {
        super.bilgiler();
        System.out.println("Zürafanın boyu kaç metre? : " + boy);
    }



}
