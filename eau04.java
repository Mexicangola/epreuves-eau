// Créez un programme qui affiche le premier nombre premier supérieur au nombre donné en argument.

public class eau04
{ 
    public static void main(String[] args)
    {
        if(args.length != 1){
            System.out.println("donne moi UN seul argument numerique");
            return;
        }

        try {
            int chiffre = Integer.parseInt(args[0]);

            if(chiffre <= 0){
                System.out.println("donne moi un chiffre positif ou superieur a zero, '" + chiffre + "' n'est pas un argument valide");
                return;
            }

            do{
                chiffre++;
            } while(!isPrime(chiffre));

            System.out.println("le prochain chiffre prime apres '" + args[0] + "' est : " + chiffre);

        } catch(Exception e){
            System.out.println("donne moi une chiffre valide, '" + args[0] + "' n'est pas une chiffre");
        }
    }

    public static boolean isPrime(int n){
        int racine = (int) Math.sqrt(n);

        for(int i = 2 ; i <= racine ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

/*ROUND ONE
import java.util.ArrayList;

public class eau04
{ 
    public static void main(String[] args)
    {
        Integer chiffre = Integer.parseInt(args[0]);
        ArrayList <Integer> liste1 = new ArrayList<>();
        ArrayList <Integer> listeMulti = new ArrayList<>();
        ArrayList <Integer> listePrimes = new ArrayList<>();
        int index = 0;

        for(int i = 2 ; i < chiffre * 2 ; i++){
            liste1.add(i);
        }

        //System.out.println("liste tableau 1 : " + liste1);

        for(int i = 0 ; i < liste1.size() ; i++){
            for(int j = 0 ; j < liste1.size() ; j++){
                listeMulti.add(liste1.get(i) * liste1.get(j));
            }
        }

        //System.out.println("tableau de multiplications : " + listeMulti);
        //System.out.println("Size de tableau de multiplications : " + listeMulti.size());

        for(int i = 2 ; i < chiffre * 2; i++){
            if(listeMulti.contains(i))
                continue;
            else
                listePrimes.add(i);
        }

        System.out.println("tableau de nombres premiers : " + listePrimes);

        for(int i = 0 ; i < listePrimes.size() ; i++){
            Integer chiffre2 = listePrimes.get(i);
                if(chiffre2 < chiffre || chiffre2 == chiffre)
                    continue;
                else
                    System.out.println(listePrimes.get(i));
                    break;
        }
    }
}
 */

/*ROUND TWO
if(args.length != 1){
            System.out.println("donne moi UN seul argument numerique");
            return;
        }

        try{
            int chiffre = Integer.parseInt(args[0]);
            int racine = (int)Math.sqrt(chiffre);
            ArrayList<Integer> tableauMultiples = new ArrayList<>(racine);
            tableauMultiples.add(0);

            while (!tableauMultiples.isEmpty()) {
                tableauMultiples.clear();
                chiffre++;
                racine = (int)Math.sqrt(chiffre);
                for(int i = 2 ; i <= racine ; i++){
                    if(chiffre % i == 0){
                        tableauMultiples.add(i);
                    }
                }
            }
            System.out.println("le prochain nombre premier apres " + args[0] + " est : " + chiffre);

        } catch(Exception e){
            System.out.println("donne moi juste une chiffre, '" + args[0] + "' est une lettre");
        }
*/

