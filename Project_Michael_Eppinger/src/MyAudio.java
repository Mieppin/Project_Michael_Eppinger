import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyAudio {


    PlayList playList=new PlayList();

    Menu menu;
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    /**
     * Play random downloaded audio
     */
    public void randomMusic(){
        ArrayList<File> randomMusic=new ArrayList();
        randomMusic.add(new File("/Project_Michael_Eppinger/music/1.wav"));
        randomMusic.add(new File("/Project_Michael_Eppinger/music/2.wav"));
        randomMusic.add(new File("/Project_Michael_Eppinger/music/3.wav"));
        randomMusic.add(new File("/Project_Michael_Eppinger/music/4.wav"));
        randomMusic.add(new File("/Project_Michael_Eppinger/music/5.wav"));

        for(int i = 0; i < 5; i++){
            try{
                AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(randomMusic.get(random.nextInt(5)));
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                System.out.println("space play\na Stop\nd reset\nf menu\nn next");
                boolean tr=true;
               while (tr){
                   String answer=scanner.nextLine();
                   switch (answer){
                        case " ":
                            clip.start();
                            break;
                        case "a":
                            clip.stop();
                            break;
                        case "d":
                            clip.setMicrosecondPosition(0);
                            break;
                        case "f":
                            clip.close();
                            menu.menu();
                            break;
                        case "n":
                            clip.close();
                            tr=false;
                            break;
                        default:
                            System.out.println("You didn't type any of available commands");
                            break;
                        }
               }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    /**
     * Play playlist
     * @param playList
     */
    public void musicPlayList(ArrayList<File> playList){
        System.out.println(playList);
        for(int i = 0; i < playList.size(); i++){
            try{
                AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(playList.get(i));
                Clip clipp = AudioSystem.getClip();
                clipp.open(audioInputStream);
                clipp.start();
                System.out.println("space play\na Stop\nd reset\nf menu\nn next");
                boolean tr=true;
                while (tr){
                    String answer=scanner.nextLine();
                    switch (answer){
                        case " ":
                            clipp.start();
                            break;
                        case "a":
                            clipp.stop();
                            break;
                        case "d":
                            clipp.setMicrosecondPosition(0);
                            break;
                        case "f":
                            clipp.close();
                            menu.menu();
                            break;
                        case "n":
                            clipp.close();
                            tr=false;
                            break;
                        default:
                            System.out.println("You didn't type any of available commands");
                            break;
                    }
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}


