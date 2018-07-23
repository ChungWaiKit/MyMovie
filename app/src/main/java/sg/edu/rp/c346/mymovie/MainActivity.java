package sg.edu.rp.c346.mymovie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieList> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.ListViewMovie);

        alMovieList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2014,10,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2015,4,15);

        MovieList item1 = new MovieList("The Avengers", "2014", "pg13", "Action | Sci-Fi", date1, "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.",4);
        alMovieList.add(item1);
        MovieList item2 = new MovieList("The plane", "2015","pg","Animation | Comedy", date2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.",2);
        alMovieList.add(item2);





        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i , long l) {
                Intent intent = new Intent(getBaseContext(), MovieListActivity.class);
                MovieList movie = alMovieList.get(i);
                intent.putExtra("name", movie.getTitle());
                intent.putExtra("year", movie.getYear());
                intent.putExtra("rating", movie.getRated());
                intent.putExtra("genre", movie.getGenre());
                intent.putExtra("date", movie.getDateString());
                intent.putExtra("in_threater", movie.getIn_threater());
                intent.putExtra("Description", movie.getDescription());
                intent.putExtra("Rating_star", movie.getRating_star());

                startActivity(intent);
            }
        });

        caMovie = new CustomAdapter(this, R.layout.movie_list, alMovieList);
        lvMovie.setAdapter(caMovie);
    }
}
