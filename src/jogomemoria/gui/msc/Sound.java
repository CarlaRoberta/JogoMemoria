/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui.msc;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {

    public static final AudioClip ABERTURA = Applet.newAudioClip(Sound.class.getResource("abertura.wav"));
    public static final AudioClip FIMDEJOGO = Applet.newAudioClip(Sound.class.getResource("fim.wav"));
    public static final AudioClip CERTO = Applet.newAudioClip(Sound.class.getResource("certo.wav"));
    public static final AudioClip ERRO = Applet.newAudioClip(Sound.class.getResource("erro.wav"));

}
