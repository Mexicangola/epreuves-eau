// Créez un programme qui met en majuscule la première lettre de chaque mot (délimités que par un espace, tabulation ou retour à la ligne.)


public class eau07
{ 
    public static void main(String[] args)
    {
        if(args.length == 0){
            System.out.println("donne moi un argument stp, écrit entre guilleumets, ex : 'Bonjour mon ami.e, comment tu vas?'");
            return;
        }
        // argument args avec \t et \n = $'ana\tbanana\nbinbanbon banana en Java puis 152'
        String[] mots = args[0].split("\\s+");
        StringBuilder motsMaj = new StringBuilder();

        for(String mot : mots){
            motsMaj.append(Character.toUpperCase(mot.charAt(0)));
            for(int i = 1 ; i < mot.length() ; i++){
                motsMaj.append(mot.charAt(i));
            }
            motsMaj.append(" ");
        }
        
        System.out.println(motsMaj.toString().trim());
    }
}

/*
        //String sMessageArgs = "bonjour ma pote, \tcomment vas-tu? \nhello! moi, je m'appelle ana-maria, j'ai 34 ans!";
        String sMessageArgs = String.join(" ", args);// args test : "bonjour ma pote, comment vas-tu? hello! moi, je m'appelle ana-maria, j'ai 34 ans!"

        if(sMessageArgs.length() > 0){
            try{
                int test = Integer.parseInt(sMessageArgs);
                System.out.println(test + " est une chiffre, donne moi un argument en String, pas un argument numerique!!");
            }
            catch(Exception e){
                String message = String.join(" ", sMessageArgs);
                String[] splitMessage = message.split("\t");
                message = String.join("", splitMessage);
                splitMessage = message.split("\n");
                message = String.join("", splitMessage);
                splitMessage = message.split(" ");
                
                for(int i = 0 ; i < splitMessage.length ; i++){
                    String[] splitMessageMot = splitMessage[i].split("");
                    splitMessageMot[0] = (splitMessageMot[0]).toUpperCase();
                    splitMessage[i] = String.join("", splitMessageMot);
                    System.out.print(splitMessage[i]);
                    System.out.print(" ");
                }
            }
*/

/*Merde
        //String sMessageArgs = "bonjour ma pote, \tcomment vas-tu? \nhello! moi, je m'appelle ana-maria, j'ai 34 ans!";
        //args = "bonjour ma pote, \tcomment vas-tu? \nhello! moi, je m'appelle ana-maria, j'ai 34 ans!"
        String stringMessageArgs = String.join(" ", args);// args test : "bonjour ma pote, comment vas-tu? hello! moi, je m'appelle ana-maria, j'ai 34 ans!"
        System.out.println(stringMessageArgs);
        String[] arrayMessage = stringMessageArgs.split("[\n\t]+");// ceci split le String et enleve les tabulations (\t) et les sauts a la ligne (\n)
        
        for(String i : args){
            System.out.print(i);
        }
        System.out.println();

        for(String i : arrayMessage){
            System.out.print(i);
        }
        System.out.println();
 */

