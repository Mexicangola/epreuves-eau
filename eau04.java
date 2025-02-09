//Algorithme a modifier avec le "crible d'Eratosthene" + control d'erreurs.

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
                if(chiffre2 <= chiffre)
                    continue;
                else
                    System.out.println(listePrimes.get(i));
                    break;
        }
    }
}

/*
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

