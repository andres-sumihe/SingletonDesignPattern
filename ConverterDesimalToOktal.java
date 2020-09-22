package tugas2.pl.singleton;

public class ConverterDesimalToOktal {
    private static ConverterDesimalToOktal instance = new ConverterDesimalToOktal();
    
    private ConverterDesimalToOktal(){}
    
    public static ConverterDesimalToOktal getInstance(){
        return instance;
    }
    
    public void DesimalToOktal(int desimal){
        String Oktal = Integer.toOctalString(desimal);
        System.out.println("\nHasil Konversi Bilangan Desimal "+desimal+" ke Oktal Adalah "+Oktal);
        System.out.println("");
    }
}
