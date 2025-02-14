// Créez un programme qui détermine si une chaîne de caractère se trouve dans une autre.

public class eau05
{ 
    public static void main(String[] args)
    {        
        if(args.length != 2){
            System.out.println("donne moi deux arguments separés par des guillemets. Exemple : 'Hello' 'world!'");
            return;
        }

        if(args[0].length() < args[1].length()){
            subString(args[0], args[1]);
        } else{
            subString(args[1], args[0]);
        }
    }

    public static void subString(String petitTexte, String grandTexte){
        for(int i = 0 ; i < (grandTexte.length() - petitTexte.length()) ; i++){
            if(petitTexte.charAt(0) == grandTexte.charAt(i)){
                String substringGrandTexte = grandTexte.substring(i, (i + petitTexte.length()));
                if(substringGrandTexte.equals(petitTexte)){
                    System.out.printf("on trouve dans l'index %d le substring : '%s' du texte '%s'%n", i , substringGrandTexte, grandTexte);
                    return;
                }
            }
        }

        System.out.printf("on ne trouve pas le substring '%s' dans le texte '%s'%n", petitTexte, grandTexte);
    }
}

/* ROUND ONE
        String[] texteSplit1 = (args[0]).split("");
        String[] texteSplit2 = (args[1]).split("");
        int taille = (args[1]).length();

        for(int i = 0 ; i < texteSplit1.length ; i++){
            if((texteSplit1[i]).equals(texteSplit2[0])){
                String subSt = (args[0]).substring(i, (i + taille));
                //System.out.println(subSt);
                try{
                    if(subSt.equals(args[1])){
                        System.out.println("'" + args[1] + "'" + " se trouve dans le mot : " + "'" + args[0] + "'");
                    }
                    else{
                        System.out.println("'" + args[1] + "'" + " NE SE TROUVE PAS DANS LE MOT : " + "'" + args[0] + "'");
                    }
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("'" + args[1] + "'" + " NE SE TROUVE PAS DANS LE MOT : " + "'" + args[0] + "'" + "2");
                }
            }
        }
*/
