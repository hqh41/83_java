import java.util.*;

public class Test4 {
    public String replaceSpace(String iniString, int length) {
        // write code here
        String[] aa = iniString.split(" ");
        String a = new String("");
        for(int i = 0; i < aa.length - 1; i++){
        	a += aa[i] + "%20";
        }
        a += aa[aa.length - 1];
        return a; 
    }

    public static void main(String[] args){
    	Test4 b = new Test4();
    	String result = b.replaceSpace("owv SOv StA cbzZ dsscO HLrCkfOdjvroArQgMJR AOzfOlNgqjbk TxEjSWMhtG esyu F UpAWnSDVs ELksJIz w VeqIw lq FJC f bP foVImSJVcsvdjwKRf KioRrGax VtE DwQrRn B nwBoqA SmN ntWof cZuT L XPjuHZ Kvy K bCkbkARXKDtNjrFpDo vdOfAhnDqE ys f jQ D Bbui NnPWxiHs jnjKZpc jj kW wG C FGoaGIBl Uf Ib t cnwlvQ MhhykE TjGG cvcO Vbn HHUkb o sPpiCuhAtnUYt Q ZZdulgu giJygMObwlulDQGVEfyXjPX fvtTT cAhqEpk qOES tle yW tsWY mazpm EoGrptYl vFjnTp LSAOlSbtRKghVKljEn WsNVU yTnq GEZjc wtJldODsInbvzHthzj Sv yqzuOrTbYgg uXcJmz ft V ca tid esJbhxFZpbex nMvHdsYL oygaxuK YvfceAsw hvIoqU pCa vwtvuMBSs n jm syxRXslDfo ",602);
    	System.out.println(result);
    }
}