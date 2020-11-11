package com.comparator;

import com.comparable.Movie;
import java.util.Comparator;

// class to compare web series by rating

public class RatingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie movie1, Movie movie2) {
		
		if(movie1.getRating() < movie2.getRating()) return -1;
		if(movie1.getRating() < movie2.getRating()) return 1;
		else return 0;
	}
	
	

}
