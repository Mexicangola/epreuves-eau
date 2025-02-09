public class eau08
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
                System.out.println("'" + messageArgs + "'" + " est une chiffre");
            }
            catch(Exception e){
                String sArgs = String.join(" ", args);
                System.out.println("'" + sArgs + "'" + " n'est pas une chiffre!!!");
            }
        }   
        else{
            try{
                for(int i = 0 ; i < args.length ; i++){
                    int test = Integer.parseInt(args[i]);
                }
                String iArgs = String.join(" ", args);
                System.out.println("'" + iArgs + "'" + " sont tous des chiffres!");
            }
            catch(Exception e){
                String sArgs = String.join(" ", args);
                System.out.println("'" + sArgs + "'" + " as un intrus suspect quelque part >:( !!");
            }
        }          
    }
}