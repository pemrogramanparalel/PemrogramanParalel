/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramanparalel.Serial;

import Model.Mahasiswa;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author FERY
 */
public class MainClassMahasiswa {
    
     public static void main(String[] args) {

        Random random = new Random();
        
        // buat sampe ranValue24
        int ranValue1 = 0;
        int ranValue2 = 0;
        int ranValue3 = 0;
        int ranValue4 = 0;
        int ranValue5 = 0;
        int ranValue6 = 0;
        int ranValue7 = 0;
        int ranValue8 = 0;
        int ranValue9 = 0;
        int ranValue10 = 0;
        int ranValue11 = 0;
        int ranValue12 = 0;
        int ranValue13 = 0;
        int ranValue14 = 0;
        int ranValue15 = 0;
        int ranValue16 = 0;
        int ranValue17 = 0;
        int ranValue18 = 0;
        int ranValue19 = 0;
        int ranValue20 = 0;
        int ranValue21 = 0;
        int ranValue22 = 0;
        int ranValue23 = 0;
        int ranValue24 = 0;
        

        List<Mahasiswa> mhs = new ArrayList<>();

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        System.out.println(generatedString);
        
        int leftLimit2 = 48; // letter '0'
        int rightLimit2 = 57; // letter '9'
        int targetStringLength2 = 8;
        StringBuilder buffer2 = new StringBuilder(targetStringLength2);
        for (int i = 0; i < targetStringLength2; i++) {
            int randomLimitedInt = leftLimit2 + (int) (random.nextFloat() * (rightLimit2 - leftLimit2 + 2));
            buffer2.append((char) randomLimitedInt);
        }
        String generatedString2 = buffer2.toString();

        System.out.println(generatedString2);

        for(int i = 0; i < 1000000; i++){
            
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            generatedString = buffer.toString();
            
            for (int j = 0; j < targetStringLength2; j++) {
                int randomLimitedInt = leftLimit2 + (int) (random.nextFloat() * (rightLimit2 - leftLimit2 + 1));
                buffer2.append((char) randomLimitedInt);
            }
            
            generatedString2 = buffer2.toString();
            
            // buat sampe ranValue24
            ranValue1 = random.nextInt(100);
            ranValue2 = random.nextInt(100);
            ranValue3 = random.nextInt(100);
            ranValue4 = random.nextInt(100);
            ranValue5 = random.nextInt(100);
            ranValue6 = random.nextInt(100);
            ranValue7 = random.nextInt(100);
            ranValue9 = random.nextInt(100);
            ranValue10 = random.nextInt(100);
            ranValue11 = random.nextInt(100);
            ranValue12 = random.nextInt(100);
            ranValue13 = random.nextInt(100);
            ranValue14 = random.nextInt(100);
            ranValue15 = random.nextInt(100);
            ranValue16 = random.nextInt(100);
            ranValue17 = random.nextInt(100);
            ranValue18 = random.nextInt(100);
            ranValue19 = random.nextInt(100);
            ranValue20 = random.nextInt(100);
            ranValue21 = random.nextInt(100);
            ranValue22 = random.nextInt(100);
            ranValue23 = random.nextInt(100);
            ranValue24 = random.nextInt(100);
            
            
            
            // buat sampe ranValue24
            mhs.add(new Mahasiswa(
                    generatedString,
                    generatedString2,
                    ranValue1,
                    ranValue2,
                    ranValue3,
                    ranValue5,
                    ranValue5,
                    ranValue6,
                    ranValue7,
                    ranValue8,
                    ranValue9,
                    ranValue10,
                    ranValue11,
                    ranValue12,
                    ranValue13,
                    ranValue14,
                    ranValue15,
                    ranValue16,
                    ranValue17,
                    ranValue18,
                    ranValue19,
                    ranValue20,
                    ranValue21,
                    ranValue22,
                    ranValue23,
                    ranValue24));
            
            buffer = new StringBuilder(targetStringLength);
            buffer2 = new StringBuilder(targetStringLength);
            
        }
        
        
        int count = 0;
        for(Mahasiswa ms : mhs){
            
            count = count + 1;
            System.out.println(ms.getNama() + " " + ms.getNpm() + " "+ ms.getNilai1() + " " + count);
        }
    }
}
