package GE.spring.core.config;

import GE.spring.core.Computer;
import GE.spring.core.Music;
import GE.spring.core.MusicPlayer;
import GE.spring.core.genres.ClassicalMusic;
import GE.spring.core.genres.RapMusic;
import GE.spring.core.genres.RockMusic;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return  new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return  new Computer(musicPlayer());
    }
}