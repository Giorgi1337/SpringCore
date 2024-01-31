package GE.spring.core.genres;

import GE.spring.core.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}