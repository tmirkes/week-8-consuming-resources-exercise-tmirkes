package entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle{

	@JsonProperty("max_atmosphering_speed")
	private String maxAtmospheringSpeed;

	@JsonProperty("cargo_capacity")
	private String cargoCapacity;

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("passengers")
	private String passengers;

	@JsonProperty("pilots")
	private List<Object> pilots;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("consumables")
	private String consumables;

	@JsonProperty("created")
	private String created;

	@JsonProperty("length")
	private String length;

	@JsonProperty("url")
	private String url;

	@JsonProperty("manufacturer")
	private String manufacturer;

	@JsonProperty("crew")
	private String crew;

	@JsonProperty("vehicle_class")
	private String vehicleClass;

	@JsonProperty("cost_in_credits")
	private String costInCredits;

	@JsonProperty("name")
	private String name;

	@JsonProperty("model")
	private String model;

	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed){
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}

	public String getMaxAtmospheringSpeed(){
		return maxAtmospheringSpeed;
	}

	public void setCargoCapacity(String cargoCapacity){
		this.cargoCapacity = cargoCapacity;
	}

	public String getCargoCapacity(){
		return cargoCapacity;
	}

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
	}

	public void setPassengers(String passengers){
		this.passengers = passengers;
	}

	public String getPassengers(){
		return passengers;
	}

	public void setPilots(List<Object> pilots){
		this.pilots = pilots;
	}

	public List<Object> getPilots(){
		return pilots;
	}

	public void setEdited(String edited){
		this.edited = edited;
	}

	public String getEdited(){
		return edited;
	}

	public void setConsumables(String consumables){
		this.consumables = consumables;
	}

	public String getConsumables(){
		return consumables;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setLength(String length){
		this.length = length;
	}

	public String getLength(){
		return length;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public void setCrew(String crew){
		this.crew = crew;
	}

	public String getCrew(){
		return crew;
	}

	public void setVehicleClass(String vehicleClass){
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleClass(){
		return vehicleClass;
	}

	public void setCostInCredits(String costInCredits){
		this.costInCredits = costInCredits;
	}

	public String getCostInCredits(){
		return costInCredits;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	@Override
 	public String toString(){
		return
			"Vehicle{" +
			"max_atmosphering_speed = '" + maxAtmospheringSpeed + '\'' +
			",cargo_capacity = '" + cargoCapacity + '\'' +
			",films = '" + films + '\'' +
			",passengers = '" + passengers + '\'' +
			",pilots = '" + pilots + '\'' +
			",edited = '" + edited + '\'' +
			",consumables = '" + consumables + '\'' +
			",created = '" + created + '\'' +
			",length = '" + length + '\'' +
			",url = '" + url + '\'' +
			",manufacturer = '" + manufacturer + '\'' +
			",crew = '" + crew + '\'' +
			",vehicle_class = '" + vehicleClass + '\'' +
			",cost_in_credits = '" + costInCredits + '\'' +
			",name = '" + name + '\'' +
			",model = '" + model + '\'' +
			"}";
		}
}