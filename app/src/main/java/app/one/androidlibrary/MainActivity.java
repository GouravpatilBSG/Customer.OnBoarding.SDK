package app.one.androidlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import app.one.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.simpleToast(this,"This is my first Library");
    }
}