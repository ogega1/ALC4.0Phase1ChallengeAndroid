package firstandroidapplication.javacodegeeks.com.alc4phase1challenge_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main_Activity extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Button about_alc=(Button)findViewById(R.id.about);
        Button profile=(Button)findViewById(R.id.profile);
        about_alc.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        btn1();

                    }

        }
        );

        profile.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        btn2();

                    }

                }
        );


    }

    private void btn2(){
        Intent my_profile=new Intent(this, My_Profile.class);
        startActivity(my_profile);

    }

    private void btn1(){
        Intent my_profile=new Intent(this, About_ALC.class);
        startActivity(my_profile);

    }

}
