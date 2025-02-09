import java.util.ArrayList;
import java.util.Arrays;

public class eau03
{ 
    public static void main(String[] args) 
    {
        Integer[] fibonacci = {0, 1, 1, 2};

        try{
            if(args.length > 1){
            System.out.println("donne moi juste un argument, pas un million breuh!");
            return;
        }
            Integer chiffre = Integer.parseInt(args[0]);
            if(chiffre <= 4){
                System.out.println(fibonacci[chiffre-1]);
            }
            else{
                ArrayList <Integer> fibonacci2 = new ArrayList<>(chiffre + 4); 

                for(int i = 0 ; i < fibonacci.length ; i++){
                    fibonacci2.add(fibonacci[i]);
                }

                for(int i = 3 ; i < chiffre ; i++){
                    fibonacci2.add(i+1, (fibonacci2.get(i)) + (fibonacci2.get(i-1))); 
                }

                System.out.println(fibonacci2);
                System.out.println(fibonacci2.get(chiffre-1));
            }
        }
        catch(NumberFormatException e){
            System.out.println("donne moi une chiffre breuh, pas des lettres");
        }
    }
}

/*
        Integer[] fibonacci = {0, 1, 1, 2};
        Integer chiffre = Integer.parseInt(args[0]);

        if(args.length == 1){
            
        }
        else(args.length > 1){
            System.out.println("donne moi un argument numerique, pas plus stp");
            break;
        }

        try{
            if(chiffre <= 4){
                System.out.println(fibonacci[chiffre-1]);
            }
            else{
                ArrayList <Integer> fibonacci2 = new ArrayList<>(chiffre + 4); 

                for(int i = 0 ; i < fibonacci.length ; i++){
                    fibonacci2.add(fibonacci[i]);
                }

                for(int i = 3 ; i < chiffre ; i++){
                    fibonacci2.add(i+1, (fibonacci2.get(i)) + (fibonacci2.get(i-1))); 
                }

                System.out.println(fibonacci2);
                System.out.println(fibonacci2.get(chiffre-1));
            }
        }
        catch(NumberFormatException e){
            System.out.println("donne moi une chiffre breuh, pas des lettres");
        }
        catch(IllegalArgumentException e){
            System.out.println("donne moi une chiffre breuh, pas un million!!");
        }
*/