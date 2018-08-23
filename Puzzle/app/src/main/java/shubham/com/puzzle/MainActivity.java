package shubham.com.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fwgc,puzzle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         fwgc = (Button) findViewById(R.id.fwgc);

        View.OnClickListener l=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.fwgc:startActivity(new Intent(MainActivity.this,fwgc.class));
                        break;

                }
            }
        };
        fwgc.setOnClickListener(l);

    }
}
