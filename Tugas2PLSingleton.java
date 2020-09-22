package tugas2.pl.singleton;

import java.util.Scanner;

public class Tugas2PLSingleton {
    private static boolean isNumber(String number){
        try {
            int a = Integer.parseInt(number);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int Menu = 0;
        int Bilangan = 0;
        String Bilangan1, test, BilanganInput;
        int pilihanlanjutan;
        while(Menu == 0 ){
        System.out.println("=====================================================");
        System.out.println("     Konversi Desimal ke Biner/Oktal/Hexadesimal     ");
        System.out.println("=====================================================");
        System.out.println("1.  Desimal      -   Biner");
        System.out.println("2.  Desimal      -   Hexadesimal");
        System.out.println("3.  Desimal      -   Oktal");
        System.out.println("4.  Oktal        -   Desimal");
        System.out.println("5.  Oktal        -   Biner");
        System.out.println("6.  Oktal        -   Hexadesimal");
        System.out.println("7.  Biner        -   Desimal");
        System.out.println("8.  Biner        -   Oktal");
        System.out.println("9.  Biner        -   Hexadesimal");
        System.out.println("10. Hexadesimal  -   Desimal");
        System.out.println("11. Hexadesimal  -   Oktal");
        System.out.println("12. Hexadesimal  -   Biner\n");
        System.out.print("Masukkan Pilihan Konversi Anda : ");
        int pilihan = Scan.nextInt();
        
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Bilangan Desimal Anda : ");
                    BilanganInput = Scan.next();
                    if(isNumber(BilanganInput)){
                        Bilangan = Integer.parseInt(BilanganInput);
                        ConverterDesimalToBinary convDB = ConverterDesimalToBinary.getInstance();
                        convDB.DesimalToBinary(Bilangan);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (0)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    } else {
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Desimal");
                        break;
                    }
                case 2:
                    System.out.print("Masukkan Bilangan Desimal Anda : ");
                    BilanganInput = Scan.next();
                    if(isNumber(BilanganInput)){
                        Bilangan = Integer.parseInt(BilanganInput);
                        ConverterDesimalToHex convDH = ConverterDesimalToHex.getInstance(); 
                        convDH.DesimalToHex(Bilangan);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    } else {
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Desimal");
                        break;
                    }
                case 3:
                    System.out.print("Masukkan Bilangan Desimal Anda : ");
                    BilanganInput = Scan.next();
                    if(isNumber(BilanganInput)){
                        Bilangan = Integer.parseInt(BilanganInput);
                        ConverterDesimalToOktal convDO = ConverterDesimalToOktal.getInstance(); 
                        convDO.DesimalToOktal(Bilangan);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    } else {
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Desimal");
                        break;
                    }
                case 4 :
                    System.out.print("Masukkan Bilangan Oktal Anda : ");
                    BilanganInput = Scan.next();
                    if(isNumber(BilanganInput)){
                        if(BilanganInput.matches("[12345670]+")){
                            Bilangan = Integer.parseInt(BilanganInput);
                            ConverterOktalToDesimal convOD = ConverterOktalToDesimal.getInstance();
                            convOD.OktalToDesimal(Bilangan, Bilangan);
                            System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                            pilihanlanjutan = Scan.nextInt();
                            if(pilihanlanjutan == 1){
                                break;
                            }else{
                                return;
                            }
                        }else{
                            System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Oktal");
                            break;
                        }
                    }else{
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Oktal");
                        break;
                    }
                case 5 :
                    System.out.print("Masukkan Bilangan Oktal Anda : ");
                    BilanganInput = Scan.next();
                    if(isNumber(BilanganInput)){
                        if(BilanganInput.matches("[12345670]+")){
                            Bilangan = Integer.parseInt(BilanganInput);
                            ConverterOktalToBinary convOB = ConverterOktalToBinary.getInstance();
                            convOB.OktalToBinary(Bilangan, Bilangan);
                            System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                            pilihanlanjutan = Scan.nextInt();
                            if(pilihanlanjutan == 1){
                                break;
                            }else{
                                return;
                            }  
                        }else{
                            System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Oktal");
                            break;
                        }
                    }else{
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Oktal");
                        break;
                    }
                case 6 :
                    System.out.print("Masukkan Bilangan Oktal Anda : ");
                    BilanganInput = Scan.next();
                    if(isNumber(BilanganInput)){
                        if(BilanganInput.matches("[12345670]+")){
                            Bilangan = Integer.parseInt(BilanganInput);
                            ConverterOktalToHex convOH = ConverterOktalToHex.getInstance();
                            convOH.OktalToHex(Bilangan, Bilangan);
                            System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                            pilihanlanjutan = Scan.nextInt();
                            if(pilihanlanjutan == 1){
                                break;
                            }else{
                                return;
                            }
                        }else{
                            System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Oktal");
                            break;
                        }
                    }else{
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Oktal");
                        break;
                    }
                case 7 :
                    System.out.print("Masukkan Bilangan Biner Anda : ");
                    Bilangan1 = Scan.next();
                    if (!Bilangan1.matches("[01]+")){
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Biner");
                    }else{
                        ConverterBinaryToDesimal convBD = ConverterBinaryToDesimal.getInstance();
                        convBD.BinaryToDesimal(Bilangan1, Bilangan1);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    }
                    break;
                case 8 :
                    System.out.print("Masukkan Bilangan Biner Anda : ");
                    Bilangan1 = Scan.next();
                    if (!Bilangan1.matches("[01]+")){
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Biner");
                    }else{
                        ConverterBinaryToOktal convBO = ConverterBinaryToOktal.getInstance();
                        convBO.BinaryToOktal(Bilangan1, Bilangan1);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    }
                    break;
                case 9 :
                    System.out.print("Masukkan Bilangan Biner Anda : ");
                    Bilangan1 = Scan.next();
                    if (!Bilangan1.matches("[01]+")){
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Biner");
                    }else{
                        ConverterBinaryToHex convBH = ConverterBinaryToHex.getInstance();
                        convBH.BinaryToHex(Bilangan1, Bilangan1);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    }
                    break;
                case 10 :
                    System.out.print("Masukkan Bilangan Hexadesimal Anda : ");
                    Bilangan1 = Scan.next();
                    if (!Bilangan1.matches("[01234567890abcdeABCDEF]+")){
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Hexadesimal");
                    }else{
                        ConverterHexToDesimal convHD = ConverterHexToDesimal.getInstance();
                        convHD.HexToDesimal(Bilangan1, Bilangan1);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    }
                    break;
                case 11 :
                    System.out.print("Masukkan Bilangan Hexadesimal Anda : ");
                    Bilangan1 = Scan.next();
                    if (!Bilangan1.matches("[01234567890abcdeABCDEF]+")){
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Hexadesimal");
                    }else{
                        ConverterHexToOktal convHO = ConverterHexToOktal.getInstance();
                        convHO.HexToOktal(Bilangan1, Bilangan1);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    }
                    break;
                case 12 :
                    System.out.print("Masukkan Bilangan Hexadesimal Anda : ");
                    Bilangan1 = Scan.next();
                    if (!Bilangan1.matches("[01234567890abcdeABCDEF]+")){
                        System.out.println("Bilangan yang Anda Masukkan Bukan Bilangan Hexadesimal");
                    }else{
                        ConverterHexToBinary convHB = ConverterHexToBinary.getInstance();
                        convHB.HexToBinary(Bilangan1, Bilangan1);
                        System.out.println("Apakah anda ingin melanjutkan konversi? ya(1) / tidak (2)");
                        pilihanlanjutan = Scan.nextInt();
                        if(pilihanlanjutan == 1){
                            break;
                        }else{
                            return;
                        }
                    }
                    break;
                case 13 :
                    System.out.println("Terima Kasih Telah Menggunakan Program Ini");
                    return;
                default:
                    System.out.println("Pilihan Tidak Ada.");
                    break;
            }
        }
    }
    
}
