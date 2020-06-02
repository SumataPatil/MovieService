package com.centurylink.microservice.movieinfo.MovieInfoService;

import java.io.Serializable;

public class MovieInfo implements Serializable{
	int movieId;
	String name;
	
	
	
	
	public MovieInfo() {
		super();
	}
	public MovieInfo(int movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
