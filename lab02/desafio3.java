public class Transcricao{
    static String codificacao(String dna){
        String rna;
        rna = "";
        for(int i = 0; i < dna.length(); i++){
            if(dna.charAt(i) == 'A'){
                rna += 'U';
            }else if(dna.charAt(i) == 'T'){
                rna += 'A';
            }else if(dna.charAt(i) == 'C'){
                rna += 'G';
            }else{
                rna += 'C';
            }
        }
        return rna;
    }
}

/////////////////////////////////////////////////

String dna, rna;
dna = "ATATGGCGCATAG";
rna = Transcricao.codificacao(dna);
System.out.println("DNA: " + dna);
System.out.println("RNA: " + rna);
