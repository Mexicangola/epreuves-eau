public class eau07
{ 
    public static void main(String[] args)
    {
        //String message0 = "bonjour ma pote, \tcomment vas-tu? \nhello! moi, je m'appelle ana-maria, j'ai 34 ans!";
        String message0 = String.join(" ", args);// args test : "bonjour ma pote, comment vas-tu? hello! moi, je m'appelle ana-maria, j'ai 34 ans!"

        if(message0.length() > 0){
            try{
                int test = Integer.parseInt(message0);
                System.out.println(test + " est une chiffre, donne moi un argument en String, pas un argument numerique!!");
            }
            catch(Exception e){
                String message = String.join(" ", message0);
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
        }

        System.out.println("");
    }
}

