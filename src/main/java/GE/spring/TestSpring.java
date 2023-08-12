package GE.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
//
//        boolean comparison = musicPlayer == musicPlayer1;
//        System.out.println(comparison);
//
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer1);
//
//        musicPlayer1.setVolume(10);
//
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
