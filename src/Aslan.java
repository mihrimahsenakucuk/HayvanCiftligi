public class Aslan extends Hayvan{


    private String kukreme="Evet aslanımız doğası gereği tepkiler verebilir.Çocukların aileleriyle birlekte görmeleri daha uygun olucaktır.";

    public Aslan(String tur, String yasadigiYer, int yas) {
        super(tur, yasadigiYer, yas);
        this.kukreme= kukreme;
    }


    public void bilgiler() {
        super.bilgiler();
        System.out.println("Aslan kükrüyor mu? Çocukları korkutabilir mi? " + kukreme );
    }

}
