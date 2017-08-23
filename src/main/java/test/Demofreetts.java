/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Demofreetts {
    // Default voice is Kevin16
    // http://www.javatraineronline.com/java/convert-text-to-speech-using-freetts-api/
    // https://freetts.sourceforge.io/docs/index.php
    // http://vinaytechs.blogspot.com/2009/11/text-to-speech-using-java.html
    // http://sandyskg.blogspot.com/2013/01/how-convert-text-to-speech-using-java.html
    // http://www.vikparuchuri.com/blog/simple-speech-recognition-in-python/
    // https://github.com/mozilla/DeepSpeech
    // https://arxiv.org/pdf/1412.5567.pdf

    private static String VOICENAME = "kevin16";

    public static void main(String[] args) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice;
        // Taking instance of voice from VoiceManager factory.
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice(VOICENAME);
        // Allocating voice
        voice.allocate();
        // word per minute
        voice.setRate(130);
        voice.setPitch(110);
        String text = "The police used tear gas to disperse crowds numbering in the thousands on Tuesday night outside the Phoenix Convention Center as tempers flared around President Trump’s divisive speech at a campaign-style rally here.";
        // open up standard input
        voice.speak(text);
    }
}
