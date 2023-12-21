import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audioclip {

  public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    File file = new File("ringtone.wav");
    AudioInputStream ais = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();

    clip.open(ais);
    char input = 'X';
    Scanner sc= new Scanner(System.in);


    while(input!='Q') {

      System.out.println("P for play, S for stop, Q for quit,R for reset ");
      System.out.println("Enter your choice:");

          input = sc.next().charAt(0);
          if(input > 96)
            input -= 32;

          switch(input) {

            case 'P':
                  clip.start();
                  break;
            case 'R':
                  clip.setMicrosecondPosition(0);
                  clip.start();
                  break;
            case  'S':
                  clip.stop();
                  break;
            case  'G':
                  System.out.println((clip.getMicrosecondLength())/10000000);       
                  System.out.println(clip.getFrameLength());
                  break;
            case  'L':
                  clip.setLoopPoints(0,4);
                  clip.loop(1); //how many time we want mention that manu time it will play
                  break;
            default:
                 return;                       
          }  

    }
   
    
  }
}