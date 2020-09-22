package tugas2.pl.singleton;

public class ConverterOktalToHex {
    private static ConverterOktalToHex instance = new ConverterOktalToHex();
    
    private ConverterOktalToHex(){}
    
    public static ConverterOktalToHex getInstance(){
        return instance;
    }
    
    public void OktalToHex(int oktalawal, int oktal){
        int desimal = 0, i = 0;
        
        while(oktal != 0 ){
            desimal += (oktal % 10 ) * Math.pow(8, i);
            i++;
            oktal/=10;
        }
        
        String hex = Integer.toHexString(desimal);
        
        System.out.println("\nHasil Konversi Bilangan Oktal "+oktalawal+" ke Hexadesimal Adalah "+hex);
        System.out.println("");
    }
}
