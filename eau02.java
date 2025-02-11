// Créez un programme qui affiche ses arguments reçus à l’envers.

public class eau02
{ 
    public static void main(String[] args) 
    {
        for(int i = args.length-1 ; i >= 0 ; i--){
            System.out.println(args[i]);
        }
    }
}

/*ROUND ONE
        String[] arguments = new String [args.length];
        int index = 0;

        for(int i = (args.length-1) ; i >= 0 ; i--){
            arguments[index] = args[i];
            index++;
        }

        for(String mot : arguments){
            System.out.println(mot);
        }
 */
