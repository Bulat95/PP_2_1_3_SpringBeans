package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    @Qualifier("dog")
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
    @Autowired
    public Timer getTimer(){
        return applicationContext.getBean(Timer.class);
    }

}
