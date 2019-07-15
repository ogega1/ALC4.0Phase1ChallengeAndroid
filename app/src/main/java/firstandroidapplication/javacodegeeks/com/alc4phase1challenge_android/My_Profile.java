package firstandroidapplication.javacodegeeks.com.alc4phase1challenge_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class My_Profile extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Button back1=(Button)findViewById(R.id.back);
        back1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                            public void onClick(View v){
                        back1_btn();

            }
        }
        );

    }
    private void back1_btn(){
        Intent intent=new Intent(this,Main_Activity.class);
        startActivity(intent);
    }
}
