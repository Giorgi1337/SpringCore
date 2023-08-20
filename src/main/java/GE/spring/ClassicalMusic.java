package GE.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("The Blue Danube");
        songs.add("The Four Seasons.");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
