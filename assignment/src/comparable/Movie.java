package comparable;

import java.lang.Comparable;

public class Movie implements Comparable<Movie>{
	
	private double rating;
	private String name;
	private int year;
	
	
	// constructor
	
	public Movie() {
		
		
	}
	
	public Movie(String name, double rating, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	
	// Getter
	
	
	public double getRating() {
		return rating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	
	
    // sorting by rating 
	@Override
	public int compareTo(Movie movie) {
		
		return this.year - movie.year;
	}
	
	
	

}
