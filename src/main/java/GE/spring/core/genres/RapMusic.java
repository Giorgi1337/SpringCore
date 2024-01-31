package GE.spring.core.genres;

import GE.spring.core.Music;
import org.springframework.stereotype.Component;

import java.util.List;


public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "You don't know";
    }
}
