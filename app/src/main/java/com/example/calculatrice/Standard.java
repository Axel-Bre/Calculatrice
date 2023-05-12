package com.example.calculatrice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

//import static com.example.calculatrice.R.id.x_valeur;

public class Standard extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    )

    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.modeSuite).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Standard.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        }

        );    }

    public void addition(View view) {
        //EditText x_texte = (EditText) findViewById(R.id.x_valeur);
        //String x = x_texte.getText().toString(); // Récupération du texte saisi
        //TextView resultat = (TextView) findViewById(R.id.textview_first);
        //resultat.setText("Addition");
        //System.out.println("Addition");
    }

    public void soostraction(View view) {
        //EditText x_texte = (EditText) findViewById(R.id.x_valeur);
        //String x = x_texte.getText().toString(); // Récupération du texte saisi
        //TextView resultat = (TextView) findViewById(R.id.textview_first);
        //resultat.setText("Addition");
        //System.out.println("Addition");
    }
}