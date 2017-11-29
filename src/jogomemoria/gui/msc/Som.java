/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui.msc;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Som {

    public static void main(String[] args) throws Exception {
        URL url = Som.class.getResource("abertura.wav");
        AudioClip clip = Applet.newAudioClip(url);
        AudioClip clip2 = Applet.newAudioClip(url);
        clip.play();
        Thread.sleep(1000);
        clip2.loop();
        Thread.sleep(20000);
        clip2.stop();

        System.out.println("end");
        
    }
}
