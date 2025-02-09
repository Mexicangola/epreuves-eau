/* 
Créez un programme qui affiche toutes les différentes combinaisons de deux nombre entre 00 et 99 dans l’ordre croissant.
Exemples d’utilisation : 00 01, 00 02, 00 03, 00 04, ... , 00 99, 01 02, ... , 97 99, 98 99
*/

import java.util.ArrayList;

public class eau01
{ 
    public static void main(String[] args) 
    {
        int[] iTableauChiffres = new int[9999];//ceci est le tableau qui va contenir toutes les chiffres entre 0 et 9999
        int[][] iTableauDouble = new int[iTableauChiffres.length][];//ceci est le tableau de tableaux, [tableau ext][tableau int]
        int iChiffre = 1;
        int chiffreLength = 0;
        String sIndex0 = "";
        String sIndex1 = "";
        String[] sTableauChiffres = new String[iTableauChiffres.length];//INUTILE MAIS REFERENCE DE INT A STRING!!!
        String sChiffre = "hello, World!";
        ArrayList<int[]> myArrayList = new ArrayList<int[]>();
        ArrayList<String[]> myArrayListString = new ArrayList<String[]>();

        for(int i = 0 ; i < iTableauChiffres.length ; i++){// tableau pour compter de 1 a 9999, puis creer en parallele un tableau egale en String
            iTableauChiffres[i] = iChiffre;
            iChiffre++;
            sTableauChiffres[i] = String.valueOf(iTableauChiffres[i]); 
        }

        for(int i = 0 ; i < iTableauChiffres.length ; i++){// il fait transformer chaque iChiffre en un tableau avec 2 index [x , y]
        chiffreLength = String.valueOf(iTableauChiffres[i]).length();
            if(chiffreLength < 3){// si c'est une chifre de 1 ou deux chiffres (entre 1 et 99) alors:
                iTableauDouble[i] = new int[2];//initialiser chaque sous tableau avec 2 colones
                iTableauDouble[i][0] = 0;// le premier index est toujours zero
                iTableauDouble[i][1] = iTableauChiffres[i];//le deuxieme iChiffre est l'index en question.
            }
            else if(chiffreLength == 3){
                sChiffre = String.valueOf(iTableauChiffres[i]);
                sIndex0 = sChiffre.substring(0, 1);
                sIndex1 = sChiffre.substring(1);
                iTableauDouble[i] = new int[2];
                iTableauDouble[i][0] = Integer.parseInt(sIndex0);
                iTableauDouble[i][1] = Integer.parseInt(sIndex1);
            }
            else if(chiffreLength == 4){
                sChiffre = String.valueOf(iTableauChiffres[i]);
                sIndex0 = sChiffre.substring(0, 2);
                sIndex1 = sChiffre.substring(2, 4);
                iTableauDouble[i] = new int[2];
                iTableauDouble[i][0] = Integer.parseInt(sIndex0);
                iTableauDouble[i][1] = Integer.parseInt(sIndex1);
            }
            else{
                break;
            }
        }

        for(int i = 0 ; i < iTableauChiffres.length ; i++){//ce code met les paires ou index0 est < a index1 dans myArrayList<int[]>... pas gg. a passer se suite en String? voir en bas.
            if(iTableauDouble[i][0] < iTableauDouble[i][1]){
                myArrayList.add(iTableauDouble[i]);
            }
        }

        for(int i = 0 ; i < myArrayList.size() ; i++){
            if(myArrayList.get(i)[0] <= 9 && myArrayList.get(i)[1] <= 9){
                String[] sTableau2Chiffres = new String[2];
                sTableau2Chiffres[0] = "0" + (String.valueOf(myArrayList.get(i)[0]));
                sTableau2Chiffres[1] = "0" + (String.valueOf(myArrayList.get(i)[1]));
                if(sTableau2Chiffres[0] != sTableau2Chiffres[1]){
                    myArrayListString.add(sTableau2Chiffres);
                }
            }
            else if(myArrayList.get(i)[1] >= 9 && myArrayList.get(i)[0] <= 9){
                String[] sTableau2Chiffres = new String[2];
                sTableau2Chiffres[0] = "0" + (String.valueOf(myArrayList.get(i)[0]));
                sTableau2Chiffres[1] = String.valueOf(myArrayList.get(i)[1]);
                if(sTableau2Chiffres[0] != sTableau2Chiffres[1]){
                    myArrayListString.add(sTableau2Chiffres);
                }
            }
            else if(myArrayList.get(i)[0] > 9 && myArrayList.get(i)[1] > 9){
                String[] sTableau2Chiffres = new String[2];
                sTableau2Chiffres[0] = String.valueOf(myArrayList.get(i)[0]);
                sTableau2Chiffres[1] = String.valueOf(myArrayList.get(i)[1]);
                if(sTableau2Chiffres[0] != sTableau2Chiffres[1]){
                    myArrayListString.add(sTableau2Chiffres);
                }
            }
            else
                continue;
        }

        for(String[] element : myArrayListString){
        System.out.print("");
            for(String element2 : element){
                System.out.print(element2 + " ");
            }
        System.out.print(", ");
        }

        System.out.println(myArrayListString.size());
    }
}