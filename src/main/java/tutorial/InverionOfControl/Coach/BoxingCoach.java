package tutorial.InverionOfControl.Coach;

import tutorial.depencyInjection.fortune.FortuneService;
import tutorial.depencyInjection.fortune.HappyFortuneService;

/**
 * Created by abrah on 5/13/2018.
 */
public class BoxingCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String trainingCamp;

    public BoxingCoach() {
        System.out.println("Inside the no arg constructor.");
    }

    public BoxingCoach(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spar for 3 rounds.";
    }

    @Override
    public String getDailyFortune() {
        return "Get ready because " + fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Calling setter");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        System.out.println("Setting email address to " + emailAddress);
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTrainingCamp() {
        return trainingCamp;
    }

    public void setTrainingCamp(String trainingCamp) {
        System.out.println("Setting training camp to " + trainingCamp);
        this.trainingCamp = trainingCamp;
    }
}
