package entity;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Film{

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("director")
	private String director;

	@JsonProperty("created")
	private String created;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("opening_crawl")
	private String openingCrawl;

	@JsonProperty("title")
	private String title;

	@JsonProperty("url")
	private String url;

	@JsonProperty("characters")
	private List<String> characters;

	@JsonProperty("episode_id")
	private int episodeId;

	@JsonProperty("planets")
	private List<String> planets;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("starships")
	private List<String> starships;

	@JsonProperty("species")
	private List<String> species;

	@JsonProperty("producer")
	private String producer;

	public void setEdited(String edited){
		this.edited = edited;
	}

	public String getEdited(){
		return edited;
	}

	public void setDirector(String director){
		this.director = director;
	}

	public String getDirector(){
		return director;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setVehicles(List<String> vehicles){
		this.vehicles = vehicles;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public void setOpeningCrawl(String openingCrawl){
		this.openingCrawl = openingCrawl;
	}

	public String getOpeningCrawl(){
		return openingCrawl;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setCharacters(List<String> characters){
		this.characters = characters;
	}

	public List<String> getCharacters(){
		return characters;
	}

	public void setEpisodeId(int episodeId){
		this.episodeId = episodeId;
	}

	public int getEpisodeId(){
		return episodeId;
	}

	public void setPlanets(List<String> planets){
		this.planets = planets;
	}

	public List<String> getPlanets(){
		return planets;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setStarships(List<String> starships){
		this.starships = starships;
	}

	public List<String> getStarships(){
		return starships;
	}

	public void setSpecies(List<String> species){
		this.species = species;
	}

	public List<String> getSpecies(){
		return species;
	}

	public void setProducer(String producer){
		this.producer = producer;
	}

	public String getProducer(){
		return producer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Film film = (Film) o;
		return getEpisodeId() == film.getEpisodeId() && getEdited().equals(film.getEdited()) && getDirector().equals(film.getDirector()) && getCreated().equals(film.getCreated()) && getVehicles().equals(film.getVehicles()) && getOpeningCrawl().equals(film.getOpeningCrawl()) && getTitle().equals(film.getTitle()) && getUrl().equals(film.getUrl()) && getCharacters().equals(film.getCharacters()) && getPlanets().equals(film.getPlanets()) && getReleaseDate().equals(film.getReleaseDate()) && getStarships().equals(film.getStarships()) && getSpecies().equals(film.getSpecies()) && getProducer().equals(film.getProducer());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getEdited(), getDirector(), getCreated(), getVehicles(), getOpeningCrawl(), getTitle(), getUrl(), getCharacters(), getEpisodeId(), getPlanets(), getReleaseDate(), getStarships(), getSpecies(), getProducer());
	}

	@Override
 	public String toString(){
		return
			"Film{" +
			"edited = '" + edited + '\'' +
			",director = '" + director + '\'' +
			",created = '" + created + '\'' +
			",vehicles = '" + vehicles + '\'' +
			",opening_crawl = '" + openingCrawl + '\'' +
			",title = '" + title + '\'' +
			",url = '" + url + '\'' +
			",characters = '" + characters + '\'' +
			",episode_id = '" + episodeId + '\'' +
			",planets = '" + planets + '\'' +
			",release_date = '" + releaseDate + '\'' +
			",starships = '" + starships + '\'' +
			",species = '" + species + '\'' +
			",producer = '" + producer + '\'' +
			"}";
		}
}