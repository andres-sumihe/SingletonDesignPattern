package tugas2.pl.singleton;

public class ConverterOktalToDesimal {
    private static ConverterOktalToDesimal instance = new ConverterOktalToDesimal();
    
    private ConverterOktalToDesimal(){}
    
    public static ConverterOktalToDesimal getInstance(){
        return instance;
    }
    
    public void OktalToDesimal(int oktalawal, int oktal){
        int i = 0, desimal = 0;
        while(oktal != 0 ){
            desimal += (oktal % 10 ) * Math.pow(8, i);
            i++;
            oktal/=10;
        }
        System.out.println("\nHasil Konversi Bilangan Oktal "+oktalawal+" ke Desimal Adalah "+desimal);
        System.out.println("");
    }
}
