import java.util.ArrayList;

public class eau06
{ 
    public static void main(String[] args)
    {
        String message = String.join(" ", args);

        try{
            Integer iArgs = Integer.parseInt(message);
            System.out.println(iArgs + " est une chiffre, donne moi des arguents en String!");
        }
        catch(Exception e){
            String[] splitMessage = message.split("");
            for(int i = 0 ; i < splitMessage.length ; i = i + 2){
                splitMessage[i] = (splitMessage[i]).toUpperCase();
            }
            String message2 = String.join("", splitMessage);
            System.out.println(message2);
        }
    }
}