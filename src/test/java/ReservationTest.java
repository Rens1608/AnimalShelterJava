import Animals.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservationTest {
    private Reservation reservation;

    @BeforeEach
    public void TestInitialize()
    {
        this.reservation = new Reservation();
    }

    @Test
    public void TestNewCat()
    {
        Assertions.assertEquals(0, this.reservation.Animals.size());
        this.reservation.newCat("Ms. Meow", Gender.Female, "Scratches couch");
        Assertions.assertEquals(1, this.reservation.Animals.size());
    }

    @Test
    public void TestNewDog()
    {
        Assertions.assertEquals(0, this.reservation.Animals.size());
        this.reservation.newDog("Sgt. Woof", Gender.Male);
        Assertions.assertEquals(1, this.reservation.Animals.size());
    }
}
