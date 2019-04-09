package org.montanajr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String CONFIG_LOCATION = "beans.xml";
    public static void main(String[] args) {
        log.info("This is the guess the number game");

        // creating container
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

//        NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);

        NumberGenerator numberGenerator = context.getBean( NumberGenerator.class);
        //call method next()

        int number = numberGenerator.next();
        log.info("Number = {}", number);

        //get game bean from context (container)
        Game game = context.getBean(Game.class);
      //  game.reset();

        //close context

        context.close();

    }
}
