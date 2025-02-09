public class eau09
{ 
    public static void main(String[] args)
    {
        if(args.length == 0){
            System.out.println("donne mois des arguments");
        }
        else if(args.length == 1){
            System.out.println("donne moi DEUX arguments numeriques, pas un seul...");
        }
        else if(args.length == 2){
            try{
                int ch1args = Integer.parseInt(args[0]);
                int ch2args = Integer.parseInt(args[1]);
                int Max = 0;
                int Min = 0;

                if(ch1args > ch2args){
                    Max = ch1args;
                    Min = ch2args;
                }
                else{
                    Max = ch2args;
                    Min = ch1args;
                }

                int taille = Max - Min;
                int[] tableauChiffres = new int[taille];

                for(int i = 0 ; i < taille ; i++){
                    tableauChiffres[i] = Min;
                    Min++;
                }

                for(int i : tableauChiffres){
                    System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println();
            }
            catch(Exception e){
                String sArgs = String.join(" ", args);
                System.out.println("'" + sArgs + "'" + " as un intrus suspect... il me faut DEUX CHIFFRES!!");
            }
        }   
        else{
            System.out.println("il faut deux arguments NUMERIQUES, mas in million!!");
        }          
    }
}