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

public class Chainsawfragment  extends Fragment {
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
        return inflater.inflate(R.layout.fragment_chainsawfragment, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        chapter = view.findViewById(R.id.chapter1);
        library = view.findViewById(R.id.libraryChain);
        update=view.findViewById(R.id.updateChain);
        hisory=view.findViewById(R.id.historyChain);
        browse=view.findViewById(R.id.browseChain);
        other=view.findViewById(R.id.otherChain);
        coments=view.findViewById(R.id.coments);



        chapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragment_to_lecturamanga);
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragment_to_library);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragment_to_updates);
            }
        });

        hisory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragment_to_history);
            }
        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragment_to_browse);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragment_to_more);
            }
        });

        coments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_chainsawfragment_to_chainsawfragmentComents);
            }
        });

    }
}
