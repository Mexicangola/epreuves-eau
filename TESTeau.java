public class TESTeau // Tri par ordre Ascii
{ 
    public static void main(String[] args)
    {
        String[] sTableau = new String[args.length];
        char ch = args[0].charAt(0);
        int iCh = (int)args[0].charAt(0);      

        for(int i = 0 ; i < args.length ; i++){
            sTableau[i] = args[i];
        }

        for(int i = 0 ; i < sTableau.length-1 ; i++){
            int min = (int)sTableau[i].charAt(0);
            for(int j = i+1 ; j < sTableau.length ; j++){
                if((int)sTableau[j].charAt(0) <= min){
                    min = (int)sTableau[j].charAt(0);
                    String sMin = sTableau[j];
                    String sMax = sTableau[i];
                    sTableau[i] = sMin;
                    sTableau[j] = sMax;
                }
            }
        }

        for(int i = 0 ; i < sTableau.length-1 ; i++){
            int indexTableau = 0;
            if((int)sTableau[i].charAt(indexTableau) == (int)sTableau[i+1].charAt(indexTableau)){
                try{
                    for(int j = 1 ; j < sTableau[i].length() ; j++){
                        if((int)sTableau[i].charAt(j) == (int)sTableau[i+1].charAt(j)){
                            continue;
                        }
                        else if((int)sTableau[i].charAt(j) > (int)sTableau[i+1].charAt(j)){
                            String sMin = sTableau[i+1];
                            String sMax = sTableau[i];
                            sTableau[i] = sMin;
                            sTableau[i+1] = sMax;
                            break;
                        }
                        else if((int)sTableau[i].charAt(j) < (int)sTableau[i+1].charAt(j)){
                            String sMin = sTableau[i];
                            String sMax = sTableau[i+1];
                            sTableau[i] = sMin;
                            sTableau[i+1] = sMax;
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                }
                catch(StringIndexOutOfBoundsException e){
                    for(int j = 1 ; j < sTableau[i+1].length() ; j++){
                        if((int)sTableau[i].charAt(j) == (int)sTableau[i+1].charAt(j)){
                            continue;
                        }
                        else if((int)sTableau[i].charAt(j) > (int)sTableau[i+1].charAt(j)){
                            String sMin = sTableau[i+1];
                            String sMax = sTableau[i];
                            sTableau[i] = sMin;
                            sTableau[i+1] = sMax;
                            break;
                        }
                        else if((int)sTableau[i].charAt(j) < (int)sTableau[i+1].charAt(j)){
                            String sMin = sTableau[i];
                            String sMax = sTableau[i+1];
                            sTableau[i] = sMin;
                            sTableau[i+1] = sMax;
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                }
                System.out.println(sTableau[i].charAt(3)+":"+(int)sTableau[i].charAt(3) + " < " + sTableau[i+1].charAt(3)+":"+(int)sTableau[i+1].charAt(3));
            }
        }

        puts(sTableau);

        for(int i = 0 ; i < sTableau.length ; i++){
            for(int j = 0 ; j < sTableau[i].length() ; j++){
                System.out.print((int)sTableau[i].charAt(j));
                System.out.print("."); 
            }
            System.out.println(""); 
        }
        System.out.println("");
    }

    public static void puts(String[] sTableau){
        for(String i : sTableau){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
        
        