public class eau10
{ 
    public static void main(String[] args)
    {
        String elementCherche = args[(args.length)-1];
        String elementDuTableau = new String();
        
        for(int i = 0 ; i < (args.length) ; i++){
            elementDuTableau = args[i];
            if(elementDuTableau.equals(elementCherche)){
                System.out.println("l'élément rechercé se trouve dans l'index " + i + " du tableau");
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}