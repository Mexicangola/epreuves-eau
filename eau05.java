import java.util.ArrayList;

public class eau05
{ 
    public static void main(String[] args)
    {
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
    }
}
