package a00957203.comp3717.bcit.ca.new_west_hangman;

import android.app.ListActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CategoriesActivity extends ListActivity {

    private ListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        adapter = new ArrayAdapter <>(this, android.R.layout.simple_list_item_1, new String[]{ "Countries", "Animals", "Dinosaurs" });
        setListAdapter (adapter);
    }

    public void onListItemClick (final ListView l, final View v, final int position, final long id) {
    }

    public void get_countries () {
        // https://gist.githubusercontent.com/keeguon/2310008/raw/bdc2ce1c1e3f28f9cab5b4393c7549f38361be4e/countries.json
    }

    public void get_animals () {
        // https://raw.githubusercontent.com/boennemann/animals/master/words.json
    }

    public void get_dinosaurs () {
        // https://raw.githubusercontent.com/dariusk/corpora/master/data/animals/dinosaurs.json
    }
}
