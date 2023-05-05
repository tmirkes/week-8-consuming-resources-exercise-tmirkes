import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Film;
import entity.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceClient {
    private Client client = ClientBuilder.newClient();
    private ObjectMapper mapper = new ObjectMapper();
    private final Logger logger = LogManager.getLogger(this.getClass());

    public Vehicle retrieveVehicleNumberFour() throws Exception {
        WebTarget vehicleTarget =
                client.target("https://swapi.dev/api/vehicles/4");
        String vehicleResponse = vehicleTarget.request(MediaType.APPLICATION_JSON).get(String.class);
        Vehicle vehicle = mapper.readValue(vehicleResponse, Vehicle.class);
        return vehicle;
    }
    public Film retrieveFilmNumberOne() throws Exception {
        WebTarget filmTarget =
                client.target("https://swapi.dev/api/films/1");
        String filmResponse = filmTarget.request(MediaType.APPLICATION_JSON).get(String.class);
        Film film = mapper.readValue(filmResponse, Film.class);
        return film;
    }

    public Film retrieveFilmByURI(String uri) throws Exception {
        WebTarget target =
                client.target(uri);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        Film film = mapper.readValue(response, Film.class);
        return film;
    }
}
