package Databases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.komal.clientdb.R;

import Databases.Helper.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);

    }
}
