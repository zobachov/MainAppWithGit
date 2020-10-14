package space.zobachov.mainappwithgit.presentation.mapFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import space.zobachov.mainappwithgit.R;


public class MapFragment extends Fragment {

    private MapViewModel mapViewModel = new ViewModelProvider(this).get(MapViewModel.class);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mapViewModel.test();

        return inflater.inflate(R.layout.fragment_map, container, false);
    }
}
