package test1.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

class TestActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String s = intent.getStringExtra("key");

        Toast.makeText(TestActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
