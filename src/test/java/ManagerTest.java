
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ManagerTest {

    Manager manager = new Manager();

    @Test
    public void addFilmTest() {
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyPosterTest() {

        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastPosterTest() {

        Manager manager = new Manager(5);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8"
        };

        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterEqualThanLimit() {

        Manager manager = new Manager(6);

        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7"


        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterLessThanLimit() {
        Manager manager = new Manager(7);


        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");


        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7"


        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterMoreThanLimit() {
        Manager manager = new Manager(5);


        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");


        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8"


        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
