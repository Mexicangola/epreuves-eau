// Créez un programme qui met en majuscule une lettre sur deux d’une chaîne de caractères. Seule les lettres (A-Z, a-z) sont prises en compte.

public class eau06
{ 
    public static void main(String[] args)
    {
        if(args.length == 0){
            System.out.println("donne moi un texte, n'importe quoi!!");
        }
        
        String message = String.join(" ", args);

        StringBuilder resultat = new StringBuilder();

        for(int i = 0 ; i < message.length() ; i++){
            char c = message.charAt(i);

            if(Character.isLetter(c)){
                if(i % 2 == 0){
                    c = Character.toUpperCase(c);
                }
            }

            resultat.append(c);
        }

        System.out.println(resultat.toString());
    }
}