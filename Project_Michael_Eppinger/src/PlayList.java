import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayList {

    private Scanner scanner=new Scanner(System.in);
    private ArrayList<File> audioPlaylist=new ArrayList<>();

    /**
     * User can manage his playlist
     */
    public void playList(){
        boolean exit=true;
        while(exit){
            System.out.println("if you want to add song to add song type 1\nto remove song type 2\nto go to menu type 3\nelse play playlist");
            String answear= scanner.nextLine();
                switch (answear){
                    case "1":
                        System.out.println("Type file path:");
                        File path= new File(scanner.nextLine());
                        plusMusicAudioPlaylist(path);
                        break;
                    case "2":
                        System.out.println("Type file path:");
                        File paths= new File(scanner.nextLine());
                        minusMusicAudioPlaylist(paths);
                        break;
                    case "3":
                        Menu menu=new Menu();
                        menu.menu();
                    default:
                        MyAudio myAudio=new MyAudio();
                        myAudio.musicPlayList(audioPlaylist);
                }
        }
    }

    /**
     * @param file add song to playList
     */
    public void plusMusicAudioPlaylist(File file){
        System.out.println("You just add audio into your playlist");
        audioPlaylist.add(file);
        System.out.println("you can add something from available audio\nIf you don't want to add something type anything else");
        System.out.println("you can chose: 1 wake-me-up-insiden\n2 there-is-nothing-we-can-do-meme-template\n3 pillar-men-theme-awaken\n4 goofy-edition\n5 fanfare-and-prologue-from-star-wars-the-rise-of-skywalker-audio-only");
        File musicPath;
        String answer=scanner.nextLine();
        switch (answer){
            case "1":
                musicPath=new File("/Project_Michael_Eppinger/music/1.wav");
                audioPlaylist.add(musicPath);
                break;
            case "2":
                musicPath=new File("/Project_Michael_Eppinger/music/2.wav");
                audioPlaylist.add(musicPath);
                break;
            case "3" :
                musicPath=new File("/Project_Michael_Eppinger/music/3.wav");
                audioPlaylist.add(musicPath);
                break;
            case "4" :
                musicPath=new File("/Project_Michael_Eppinger/music/4.wav");
                audioPlaylist.add(musicPath);
                break;
            case "5" :
                musicPath=new File("/Project_Michael_Eppinger/music/5.wav");
                audioPlaylist.add(musicPath);
                break;
            default:
                System.out.println("You didn't type any of available audio files");
                break;
        }
        playList();
    }

    /**
     * @param file remove song from playlist
     */
    public void minusMusicAudioPlaylist(File file){
        System.out.println("You just remove audio into your playlist");
        audioPlaylist.remove(file);

        System.out.println("you can remove something from available audio\nIf you don't want to add something type anything else");
        System.out.println("you can chose: 1 wake-me-up-insiden\n2 there-is-nothing-we-can-do-meme-template\n3 pillar-men-theme-awaken\n4 goofy-edition\n5 fanfare-and-prologue-from-star-wars-the-rise-of-skywalker-audio-only");
        File musicPath;
        String answer=scanner.nextLine();
        switch (answer){
            case "1":
                musicPath=new File("/Project_Michael_Eppinger/music/1.wav");
                audioPlaylist.remove(file);
                break;
            case "2":
                musicPath=new File("/Project_Michael_Eppinger/music/2.wav");
                audioPlaylist.remove(file);
                break;
            case "3" :
                musicPath=new File("/Project_Michael_Eppinger/music/3.wav");
                audioPlaylist.remove(file);
                break;
            case "4" :
                musicPath=new File("/Project_Michael_Eppinger/music/4.wav");
                audioPlaylist.remove(file);
                break;
            case "5" :
                musicPath=new File("/Project_Michael_Eppinger/music/5.wav");
                audioPlaylist.remove(file);
                break;
            default:
                System.out.println("You didn't type any of available audio files");
                break;
        }
        playList();
    }

    public ArrayList<File> getAudioPlaylist() {
        return audioPlaylist;
    }

    public void setAudioPlaylist(ArrayList<File> audioPlaylist) {
        this.audioPlaylist = audioPlaylist;
    }
}
