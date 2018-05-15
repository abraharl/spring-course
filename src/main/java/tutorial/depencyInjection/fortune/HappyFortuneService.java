package tutorial.depencyInjection.fortune;

import java.util.Random;

/**
 * Created by abrah on 5/13/2018.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        final String[] fortunes = new String[]{
                "You will find wealth.",
                "You will find health.",
                "You will find happiness",
        };

        return fortunes[(new Random()).ints(0, fortunes.length).findFirst().getAsInt()];
    }
}
