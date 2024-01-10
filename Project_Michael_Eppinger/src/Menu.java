import java.io.File;
import java.util.Scanner;

public class Menu {
    Scanner scanner=new Scanner(System.in);
    PlayList playList=new PlayList();
    MyAudio audio=new MyAudio();

    /**
     * Giving user choice to do a playlist or play random music
     */
    public void menu(){
        System.out.println("1 to play random\n2 to create play list");
        String answer=scanner.nextLine();
        File file;
        switch (answer){
            case "1":
                audio.randomMusic();
                break;
            case "2":
                playList.playList();
            default:
                System.out.println("chose one of the available options");
                menu();
        }
    }
}
