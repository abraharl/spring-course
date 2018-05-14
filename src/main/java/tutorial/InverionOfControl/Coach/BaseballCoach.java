package tutorial.InverionOfControl.Coach;

import tutorial.depencyInjection.fortune.FortuneService;
import tutorial.depencyInjection.fortune.HappyFortuneService;

/**
 * Created by abrah on 5/6/2018.
 */
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(){}

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
