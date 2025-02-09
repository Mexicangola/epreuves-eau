public class eau13 // TRI PAR SELECTION
{ 
    public static void main(String[] args)
    {
        int[] tableauTri = new int[args.length];

        for(int i = 0 ; i < args.length ; i++){
            tableauTri[i] = Integer.parseInt(args[i]);
        }  

        for(int i = 0 ; i < tableauTri.length ; i++){
            int min = tableauTri[i];
            for(int j = i+1 ; j < tableauTri.length ; j++){// ici j'avais mit j = 1 sur la boucle, ca a fait tout FOIRER... pour quoi? => 1 6 5 4 3 2
                if(tableauTri[j] < min){
                    min = tableauTri[j];
                }
                if(tableauTri[i] != min){
                    int petiteChiffre = min;
                    int grandeChiffre = tableauTri[i];
                    tableauTri[i] = petiteChiffre;
                    tableauTri[j] = grandeChiffre;
                }
            }
        }

        for(int i : tableauTri){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}

/*
        if(args.length == 0){
            System.out.println("donne mois des arguments");
        }
        else if(args.length == 1){
            try{
                String sArgs = String.join("", args);
                int messageArgs = Integer.parseInt(sArgs);
                System.out.println("'" + messageArgs + "'" + " est une chiffre, mais il fe faut plus d'une");
            }
            catch(Exception e){
                String sArgs = String.join(" ", args);
                System.out.println("'" + sArgs + "'" + " n'est pas une chiffre... en plus il me faut au moins deux...");
            }
        }   
        else{
            try{
                int[] tableauTri = new int[args.length];

                for(int i = 0 ; i < args.length ; i++){
                    tableauTri[i] = Integer.parseInt(args[i]);
                }      

                for(int j = 0 ; j < (tableauTri.length) - 1 ; j++){
                    for(int i = 0 ; i < (tableauTri.length) - 1 ; i++){
                        if(tableauTri[i] > tableauTri[i+1]){
                            int grandeChiffre = tableauTri[i];
                            int petiteChiffre = tableauTri[i+1];
                            tableauTri[i] = petiteChiffre;
                            tableauTri[i+1] = grandeChiffre;
                        }
                    }
                }

                for(int i : tableauTri){
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println();
            }
            catch(Exception e){
                String sArgs = String.join(" ", args);
                System.out.println("'" + sArgs + "'" + " as un intrus suspect quelque part >:( !!");
            }
        } 
*/

/*BEUG BIZARRE A VOIR AVEC CHAT....
        int[] tableauTri = new int[args.length];

        for(int i = 0 ; i < args.length ; i++){
            tableauTri[i] = Integer.parseInt(args[i]);
        }  

        for(int i = 0 ; i < tableauTri.length ; i++){
            int min = tableauTri[i];
            for(int j = 1 ; j < tableauTri.length ; j++){
                if(tableauTri[j] < min){
                    min = tableauTri[j];
                }
                if(tableauTri[i] != min){
                    int petiteChiffre = min;
                    int grandeChiffre = tableauTri[i];
                    tableauTri[i] = petiteChiffre;
                    tableauTri[j] = grandeChiffre;
                }
            }
        }

        for(int i : tableauTri){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

8 4 3 6 9 7 5 2
=> 2 9 8 7 6 5 4 3
 */
