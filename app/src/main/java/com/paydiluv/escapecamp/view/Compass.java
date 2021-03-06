package com.paydiluv.escapecamp.view;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.paydiluv.escapecamp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Compass extends Fragment {

    @BindView(R.id.backToMap)
    public ImageButton backToMapButton;
    private Context context;

    public void BackToMap(View button){
        Navigation.findNavController(button).navigate(CompassDirections.actionCompassToMap());
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_compass, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        backToMapButton.setOnClickListener(this::BackToMap);
    }

}