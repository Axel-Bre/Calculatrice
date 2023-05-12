package com.example.calculatrice;

import android.os.Bundle;

import com.example.calculatrice.R.id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

/*        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addition(View view) {
        EditText x_texte = (EditText) findViewById(R.id.editTextNumberSigned);
        String x = x_texte.getText().toString(); // Récupération du texte saisi
        double X=Double.parseDouble(x);

        EditText y_texte = (EditText) findViewById(R.id.editTextNumberSigned2);
        String y = y_texte.getText().toString(); // Récupération du texte saisi
        double Y=Double.parseDouble(y);
        double somme=X+Y;
        TextView resultat = (TextView) findViewById(id.









































































































































































































































                );
        resultat.setText(""+somme);
    }

    public void soustraction(View view) {
        EditText x_texte = (EditText) findViewById(R.id.editTextNumberSigned);
        String x = x_texte.getText().toString(); // Récupération du texte saisi
        double X=Double.parseDouble(x);

        EditText y_texte = (EditText) findViewById(R.id.editTextNumberSigned2);
        String y = y_texte.getText().toString(); // Récupération du texte saisi
        double Y=Double.parseDouble(y);
        double difference=X-Y;
        TextView resultat = (TextView) findViewById(id.textview_first);
        resultat.setText(""+difference);
    }

    public void multiplication(View view) {
        EditText x_texte = (EditText) findViewById(R.id.editTextNumberSigned);
        String x = x_texte.getText().toString(); // Récupération du texte saisi
        double X=Double.parseDouble(x);

        EditText y_texte = (EditText) findViewById(R.id.editTextNumberSigned2);
        String y = y_texte.getText().toString(); // Récupération du texte saisi
        double Y=Double.parseDouble(y);
        double produit=X*Y;
        TextView resultat = (TextView) findViewById(id.textview_first);
        resultat.setText(""+produit);
    }

    public void division(View view) {
        EditText x_texte = (EditText) findViewById(R.id.editTextNumberSigned);
        String x = x_texte.getText().toString(); // Récupération du texte saisi
        double X=Double.parseDouble(x);
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        EditText y_texte = (EditText) findViewById(R.id.editTextNumberSigned2);
        String y = y_texte.getText().toString(); // Récupération du texte saisi
        double Y=Double.parseDouble(y);
        double division=X/Y;
        TextView resultat = (TextView) findViewById(id.textview_first);
        resultat.setText(""+df.format(division));
    }

    public void ajouter(View view) {
        EditText x_texte = (EditText) findViewById(id.editTextNumberSigned3);
        String x = x_texte.getText().toString(); // Récupération du texte saisi
        double X=Double.parseDouble(x);
        DecimalFormat df = new DecimalFormat("#,###,##0.00");

        nb=nb+1; // nombre de valeurs
        som=som+X;
        prod=prod*X;
        moyenne=(som)/nb;
        TextView sommeSuite = (TextView) findViewById(id.textview_second);
        TextView produitSuite = (TextView) findViewById(id.textView6);
        TextView moyenneSuite = (TextView) findViewById(id.textView7);
        //resultatSuite.setText(""+df.format(division));
        //resultatSuite.setText(""+X);
        sommeSuite.setText(""+som);
        produitSuite.setText(""+prod);
        moyenneSuite.setText(""+df.format(moyenne));
    }
    int nb=0;
    double som=0;
    double prod=1;
    double moyenne=0;
}