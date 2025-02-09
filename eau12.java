public class eau12 // TRI A BULLE
{ 
    public static void main(String[] args)
    {
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
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            catch(Exception e){
                String sArgs = String.join(" ", args);
                System.out.println("'" + sArgs + "'" + " as un intrus suspect quelque part >:( !!");
            }
        }  
    }
}