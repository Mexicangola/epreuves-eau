// Créez un programme qui affiche le N-ème élément de la suite de Fibonacci. (0, 1, 1, 2) étant le début de la suite et le premier élément étant à l’index 0.

public class eau03
{ 
    public static void main(String[] args) 
    {
        if(args.length != 1){
            System.out.println("donne moi juste un argument");
            return;
        }

        try{
            Integer chiffre = Integer.parseInt(args[0]);
            if(chiffre < 0){
                System.out.println("la chiffre doit etre positive");
                return;
            } else{
                System.out.println(Fibonacci(chiffre));
            }
        }
        catch(NumberFormatException e){
            System.out.println("donne moi une chiffre breuh, pas des lettres");
        }
    }

    public static int Fibonacci(int chiffre){
        if(chiffre == 0)
            return 0;
        if(chiffre == 1)
            return 1;

        int a = 0, b = 1, temp = 0;

        for(int i = 2 ; i <= chiffre-1 ; i++){
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}

/* ROUND ONE
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