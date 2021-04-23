public class Hayvan {


    private String tur;
    private String yasadigiYer;
    private int yas;


    public Hayvan(String tur, String yasadigiYer, int yas) {
        this.tur= tur;
        this.yasadigiYer= yasadigiYer;
        this.yas= yas;

    }

    public void bilgiler() {
        System.out.println("Tür:" + tur);
        System.out.println("Yaşadığı Yer: " + yasadigiYer);
        System.out.println("Yaş: " + yas);
    }




}
