package tutorial.InverionOfControl.Coach;

import tutorial.depencyInjection.fortune.FortuneService;
import tutorial.depencyInjection.fortune.HappyFortuneService;

/**
 * Created by abrah on 5/6/2018.
 */
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(){}

    public TrackCoach(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
