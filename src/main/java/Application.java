import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tutorial.InverionOfControl.Coach.BoxingCoach;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final BoxingCoach coach = context.getBean("coach", BoxingCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTrainingCamp());

        context.close();

      //  SpringApplication.run(Application.class, args);
    }
}
