package com.devfun.vo;

class MovieVO{
	
	private int Movie_id;
	private String Movie_name;
	private String director;
	private String types;
	
	public void setMovie_id(int Movie_id) {
		this.Movie_id = Movie_id;
	}
	public void setMovie_name(String Movie_name) {
		this.Movie_name = Movie_name;
	}
	public void setdirector(String director) {
		this.director = director;
	}
	public void settypes(String types) {
		this.types = types;
	}
	
	public int getMovie_id() {
		return Movie_id;
	}
	public String getMovie_name() {
		return Movie_name;
	}
	public String getdirector() {
		return director;
	}
	public String gettypes() {
		return types;
	}
}