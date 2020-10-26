package space.zobachov.mainappwithgit.presentation.mapFragment;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MapViewModel extends AndroidViewModel {

    public MapViewModel(@NonNull Application application) {
        super(application);
    }

    void test(){
        Log.d("TestTag", "We are here!");
    }
}
