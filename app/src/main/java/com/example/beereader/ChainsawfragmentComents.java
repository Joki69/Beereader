package com.example.beereader;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import org.jetbrains.annotations.Nullable;

public class ChainsawfragmentComents   extends Fragment {
    TextView chapter;

    ImageView library;

    ImageView update;

    ImageView hisory;

    ImageView browse;

    ImageView other;
    ImageView coments;


    NavController navController;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chainsawfragmentcoments, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        library = view.findViewById(R.id.libraryChainComents);
        update=view.findViewById(R.id.updateChainComents);
        hisory=view.findViewById(R.id.historyChainComents);
        browse=view.findViewById(R.id.browseChainComents);
        other=view.findViewById(R.id.otherChainComents);
        coments=view.findViewById(R.id.comentsBlancos);





        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragmentComents_to_library);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragmentComents_to_updates);
            }
        });

        hisory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragmentComents_to_history);
            }
        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragmentComents_to_browse);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragmentComents_to_more);
            }
        });

        coments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragmentComents_to_chainsawfragment);
            }
        });

    }
}
