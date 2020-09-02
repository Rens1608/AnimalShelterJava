package Animals;

import java.time.LocalDateTime;
import java.util.Date;

public class Dog extends Animal {
    public LocalDateTime LastWalk;
    public boolean NeedsWalk(){
        return (LocalDateTime.now().getDayOfMonth() - this.LastWalk.getDayOfMonth()) > 0;
    }

    public Dog(Animals.Gender gender, String name) {
        super(gender, name);
        LastWalk = LocalDateTime.now();
    }

}
