public class Main {

    public static void main(String[] args) {
        System.out.println("--Aslanın Bilgileri-- ");
        Aslan aslan= new Aslan("Asya aslanı", "Hindistanın batısı ", 6);

        aslan.bilgiler();

        System.out.println("--Atın Bilgileri--");
        At at= new At("Midilli", "İrlanda,İskoçya", 15);

        at.bilgiler();


        System.out.println("--Papağanın Bilgileri--");
        Papagan papagan= new Papagan("Sülfür Kakadu", "Avustralya,Girne", 30);

        papagan.bilgiler();

       
        System.out.println("--Zürafanın Bilgileri--");
	Zurafa zurafa= new Zurafa("Masai", "Afrika", 15);

	zurafa.bilgiler();

    }

}


