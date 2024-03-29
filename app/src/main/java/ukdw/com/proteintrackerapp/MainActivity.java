package ukdw.com.proteintrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button helpBtn = (Button)findViewById(R.id.btnMain2);
        helpBtn.setOnClickListener(btnMain2Listener);


    }

    private View.OnClickListener btnMain2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(
                    MainActivity.this,Main2Activity.class);
            startActivity(intent);
        } };

}
