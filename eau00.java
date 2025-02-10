// Créez un programme qui affiche toutes les différentes combinaisons possibles de trois chiffres dans l’ordre croissant.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class eau00
{ 
    public static void main(String[] args) 
    {
        ArrayList<String> combinations = new ArrayList<>();

        for(int i = 0 ; i <= 7 ; i++){
            for(int j = i+1 ; j <= 8 ; j++){
                for(int k = j+1 ; k <= 9 ; k++){
                    combinations.add(String.format("%d%d%d", i, j, k));
                }
            }
        }

        System.out.println(combinations);
        System.out.println(combinations.size());
    }        
}

/* ROUND TWO (import java.util.Arrays; import java.util.LinkedHashSet;)
        ArrayList<String> sNumbers = new ArrayList <>();
        LinkedHashSet<String> sUniqueNumbers = new LinkedHashSet<>(sNumbers);

        for(int i = 12 ; i < 790 ; i++){
            int iNumber = i; //1ere it : iNumber = 12
            String sNumber = Integer.toString(iNumber); // 1ere it : sNumber = "12"
            char[] tChNumber = sNumber.toCharArray(); // 1ere it : tChNumber = {1, 2};
            Arrays.sort(tChNumber); // 
            String sSortedNb = new String(tChNumber);
            String finalNumber;
            if(sSortedNb.length() == 2){
                String zero = "0";
                finalNumber = zero + sSortedNb;
            }
            else{
                finalNumber = sSortedNb;
            }
            sNumbers.add(finalNumber);
        }

        for(int i = 0 ; i < sNumbers.size() ; i++){
            if(sNumbers.get(i).charAt(0) != sNumbers.get(i).charAt(1) 
            && sNumbers.get(i).charAt(0) != sNumbers.get(i).charAt(2) 
            && sNumbers.get(i).charAt(1) != sNumbers.get(i).charAt(2)){
                sUniqueNumbers.add(sNumbers.get(i));
            }
        }

        System.out.print(sUniqueNumbers);
        System.out.println(sUniqueNumbers.size());
 */