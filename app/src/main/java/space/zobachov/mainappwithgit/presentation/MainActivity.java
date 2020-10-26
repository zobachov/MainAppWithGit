package space.zobachov.mainappwithgit.presentation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import space.zobachov.mainappwithgit.R;
import space.zobachov.mainappwithgit.presentation.mapFragment.MapFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setBackgroundDrawable(null);

        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(yourButton -> {
            Log.d("TestLog", "yourClick");

            MapFragment mapFragment = new MapFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fr_map, mapFragment).commit();
        });
    }
}