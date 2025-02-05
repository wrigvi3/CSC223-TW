package csc223.tw;

public class DNA {
    public static String countNucleotides(String dna){
        int Acount = 0;
        int Tcount = 0;
        int Ccount = 0;
        int Gcount = 0;
        for (int i = 0; i<dna.length(); i++){
            if (dna.charAt(i) == 'A'){
                Acount += 1;
            }
            else if (dna.charAt(i) == 'T'){
                Tcount += 1;
            }
            else if (dna.charAt(i) == 'C'){
                Ccount += 1;
            }
            else{
                Gcount += 1;
            }
        }
        return Acount + " " + Tcount + " " + Ccount + " " + Gcount;     
    }
    public static String transcribe(String dna){
        String newdna = dna.replace('T', 'U');
        return newdna;
    }
    public static String reverseComplement(String dna){
        String newdna = "";
        for (int i=dna.length()-1; i<0; i--){
            if (dna.charAt(i) == 'T'){
                newdna = newdna + 'A';
            }
            else if (dna.charAt(i) == 'G'){
                newdna = newdna + 'C';
            }
            else if (dna.charAt(i) == 'C'){
                newdna = newdna + 'G';
            }
            else if (dna.charAt(i) == 'A'){
                newdna = newdna + 'T';
            }
        }
        return newdna;
    }
}
