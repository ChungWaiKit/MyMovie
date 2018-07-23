package sg.edu.rp.c346.mymovie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MovieListActivity extends AppCompatActivity {

    TextView tvname;
    TextView tvYear;
    TextView tvGenre;
    TextView tvDescription;
    TextView tvWatch_on;
    TextView tvIn_threater;
    ImageView imRating;
    RatingBar rbRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        tvname = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvGenre = findViewById(R.id.textViewGenre);
        tvDescription = findViewById(R.id.textViewDescription);
        tvWatch_on = findViewById(R.id.textViewWatch_on);
        tvIn_threater = findViewById(R.id.textViewIn_threater);
        imRating = findViewById(R.id.imageViewRating);
        rbRating = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        intentReceived = getIntent();
        String name = intentReceived.getStringExtra("name");
        String year = intentReceived.getStringExtra("year" );
        String genre = intentReceived.getStringExtra("genre" );
        String rating = intentReceived.getStringExtra("rating" );
        String in_threater = intentReceived.getStringExtra("in_threater");
        String watch_on = intentReceived.getStringExtra("date");
        String description = intentReceived.getStringExtra("Description");
        int rates = intentReceived.getIntExtra("Rating_star", 0);
        tvGenre.setText(genre);
        tvname.setText(name);
        tvYear.setText(year);
        tvDescription.setText(description);
        tvWatch_on.setText("watch on:"+watch_on);
        tvIn_threater.setText("In Threater:" +in_threater);
        rbRating.setIsIndicator(true);
        rbRating.setRating(rates);

        if (rating.equals("g") ){
            imRating.setImageResource(R.drawable.rating_g);
        }else if (rating.equals("pg") ){
            imRating.setImageResource(R.drawable.rating_pg);
        }else if (rating.equals("pg13") ) {
            imRating.setImageResource(R.drawable.rating_pg13);
        }else if (rating.equals("nc16") ) {
            imRating.setImageResource(R.drawable.rating_nc16);
        } else if (rating.equals("nc16") ) {
            imRating.setImageResource(R.drawable.rating_m18);
        } else {
            imRating.setImageResource(R.drawable.rating_r21);
        }


    }
}
