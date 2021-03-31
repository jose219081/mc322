public class Transcricao{
    static String codificacao(String dna){
        String rna;
        for(int i = 0; i < dna.length(); i++){
            if(dna[i] == 'A'){
                rna[i] = 'U';
            }else if(dna[i] == 'T'){
                rna[i] = 'A';
            }else if(dna[i] == 'C'){
                rna[i] = 'G';
            }else{
                rna[i] = 'C';
            }
        }
        return rna;
    }
}

/////////////////////////////////////////////////

String dna, rna;
dna = "ATATGGCGCATAG";
rna = Transcricao.codificacao(dna);
println("DNA: " + dna);
println("RNA: " + rna);
