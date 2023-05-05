import entity.Film;
import entity.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceClientTest {
    private ServiceClient client;
    private Vehicle vehicle;
    private Film film;
    private final Logger logger = LogManager.getLogger(this.getClass());

    @BeforeEach
    void setUp() {
        client = new ServiceClient();
    }

    @Test
    void retrieveVehicleNumberFour() {
        try {
            vehicle = client.retrieveVehicleNumberFour();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String expectedVehicleName = "Sand Crawler";
        String expectedModel = "Digger Crawler";
        String expectedManufacturer = "Corellia Mining Corporation";
        String expectedLength = "36.8 "; // Who is the monster who left a trailing space in this field?
        String expectedCrew = "46";
        String expectedCargoCapacity = "50000";
        String expectedFilmsFirst = "https://swapi.dev/api/films/1/";
        assertEquals(expectedVehicleName, vehicle.getName());
        logger.info(expectedVehicleName + " : " + vehicle.getName());
        assertEquals(expectedModel, vehicle.getModel());
        logger.info(expectedModel + " : " + vehicle.getModel());
        assertEquals(expectedManufacturer, vehicle.getManufacturer());
        logger.info(expectedManufacturer + " : " + vehicle.getManufacturer());
        assertEquals(expectedLength, vehicle.getLength());
        logger.info(expectedLength + " : " + vehicle.getLength());
        assertEquals(expectedCrew, vehicle.getCrew());
        logger.info(expectedCrew + " : " + vehicle.getCrew());
        assertEquals(expectedCargoCapacity, vehicle.getCargoCapacity());
        logger.info(expectedCargoCapacity + " : " + vehicle.getCargoCapacity());
        assertEquals(expectedFilmsFirst, vehicle.getFilms().get(0));
        logger.info(expectedFilmsFirst + " : " + vehicle.getFilms().get(0));
    }

    @Test
    void retrieveFilmNumberOne() {
        try {
            film = client.retrieveFilmNumberOne();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String expectedTitle = "A New Hope";
        String expectedDirector = "George Lucas";
        int expectedEpisodeId = 4;
        int expectedCharacterCount = 18;
        assertEquals(expectedTitle, film.getTitle());
        logger.info(expectedTitle + " : " + film.getTitle());
        assertEquals(expectedDirector, film.getDirector());
        logger.info(expectedDirector + " : " + film.getDirector());
        assertEquals(expectedEpisodeId, film.getEpisodeId());
        logger.info(expectedEpisodeId + " : " + film.getEpisodeId());
        assertEquals(expectedCharacterCount, film.getCharacters().size());
        logger.info(expectedCharacterCount + " : " + film.getCharacters().size());
    }

    @Test
    void testSubObjectRetrieval() {
        Film apiFilm = new Film();
        try {
            vehicle = client.retrieveVehicleNumberFour();
            film = client.retrieveFilmNumberOne();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String vehicleFilm = vehicle.getFilms().get(0);
        try {
            apiFilm = client.retrieveFilmByURI(vehicleFilm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(film, apiFilm);
        logger.info(film + " : " + apiFilm);
    }
}