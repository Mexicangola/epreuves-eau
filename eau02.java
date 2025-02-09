import java.util.Arrays;

public class eau02
{ 
    public static void main(String[] args) 
    {
        System.out.println(args.length);

        for(int i = (args.length-1) ; i >= 0 ; i--){
            System.out.println(args[i] + " ");
        }
    }
}

/*
        String[] sArgs = String.join(" ", args);
        String[] tArgs = sArgs.split(" ");

        for(int i = (tArgs.length - 1) ; i >= 0 ; i--){
            System.out.println(tArgs[i] + " ");
        }
*/