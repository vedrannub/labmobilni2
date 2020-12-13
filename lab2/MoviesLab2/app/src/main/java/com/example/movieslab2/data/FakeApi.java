package com.example.movieslab2.data;

import com.example.movieslab2.data.models.Actor;
import com.example.movieslab2.data.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class FakeApi {
    private static FakeApi instance;

    private FakeApi(){}
    private List<Movie> movies = new ArrayList<Movie>();

    public static FakeApi getInstance(){
        if(instance==null){
            instance= new FakeApi();
            List<String> movie1 = new ArrayList<>();
            movie1.add("Morgan Freeman");
            movie1.add("Tim Robbins");
            movie1.add("Rob Gunton");
            List<String> movie2 = new ArrayList<>();
            movie2.add("Marlon Brando");
            movie2.add("Al Pacino");
            movie2.add("James Caan");
            List<String> movie3 = new ArrayList<>();
            movie3.add("Christian Bale");
            movie3.add("Heath Ledger");
            movie3.add("Aaron Eckhart");
            List<String> movie4 = new ArrayList<>();
            movie4.add("Brad Pitt");
            movie4.add("Edward Norton");
            movie4.add("Meat Loaf");
            List<String> movie5 = new ArrayList<>();
            movie5.add("Tom Hanks");
            movie5.add("Robin Wright");
            movie5.add("Gary Sinise");


            instance.movies.add(new Movie("1111","The Shawshank Redemption","Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.","Frank Darabont",movie1));
            instance.movies.add(new Movie("2222","The Godfather","The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.","Francis Ford Coppola",movie2));
            instance.movies.add(new Movie("3333","The Dark Knight","When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.","Christopher Nolan",movie3));
            instance.movies.add(new Movie("4444","Fight Club","An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more.","David Fincher",movie4));
            instance.movies.add(new Movie("5555","Forest Gump","The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate and other historical events unfold through the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.","Robert Zemeckis",movie5));


        }
        return instance;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addNewMovie(Movie movie) {
        this.movies.add(movie);
    }
    public void deleteMovie(Movie movie){
        this.movies.remove(movie);
    }
}

