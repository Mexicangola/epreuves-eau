public class eau00
{ 
    public static void main(String[] args) 
    {
        int[] tableau = {0, 1, 2};
        int[][] tableauDeTableaux = new int[777][tableau.length];
        //ici 777 correspond a 789(taille max du chiffre)-12(on commence par 012, c'est le plus petit chiffre du tableau)

        for(int element : tableau)
        {
            System.out.print(element + " ");
        }
        System.out.println();

        while(tableau[0] != 7 && tableau[1] != 8 && tableau[2] != 9){
            if(tableau[2] != 9 && tableau[1] != 9 && tableau[0] != 9){
                tableau[2]++;
            }
            else if(tableau[2] == 9 && tableau[1] != 9 && tableau[0] != 9){
                tableau[2] = 0;
                tableau[1]++;
            }
            else(tableau[2] == 9 && tableau[1] == 9 && tableau[0] != 9){
                tableau[2] = 0;
                tebleau[1] = 0;
                tableau[0]++;
            }

        }
        
    }
        
}