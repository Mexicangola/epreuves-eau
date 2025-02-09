import java.util.Arrays;

public class eau11
{ 
    public static void main(String[] args)
    {
        if(args.length == 0){
            System.out.println("donne moi au moins deux arguments numeriques");
        }

        if(args.length == 1){
            System.out.println("donne moi au poins DEUX arguments neumeriques");
        }

        if(args.length > 1){
            try{
                int[] tableauResultats = new int[(args.length) * (args.length)];
                int index = 0;

                for(int i = 0 ; i < (args.length) ; i++){
                    for(int j = 0 ; j < (args.length) ; j++){
                        tableauResultats[index] = Math.abs((Integer.parseInt(args[i])) - (Integer.parseInt(args[j])));
                        index++;
                    }
                }

                Arrays.sort(tableauResultats);
                System.out.println(tableauResultats[(args.length)]);
            }
            catch(Exception e){
                System.out.println("je veux que des arguments numeriques, la il y as une couille sur le potin!");
            }
        }
    }
}
