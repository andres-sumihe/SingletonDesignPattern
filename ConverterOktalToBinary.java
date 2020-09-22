package tugas2.pl.singleton;

public class ConverterOktalToBinary {
    private static ConverterOktalToBinary instance = new ConverterOktalToBinary();
    
    private ConverterOktalToBinary(){}
    
    public static ConverterOktalToBinary getInstance(){
        return instance;
    }
    
    public void OktalToBinary(int oktalawal, int oktal){
        int desimal = 0, i = 0;
        
        while(oktal != 0 ){
            desimal += (oktal % 10 ) * Math.pow(8, i);
            i++;
            oktal/=10;
        }
        
        String binary = Integer.toBinaryString(desimal);
        
        System.out.println("\nHasil Konversi Bilangan Oktal "+oktalawal+" ke Biner Adalah "+binary);
        System.out.println("");

    }
}
