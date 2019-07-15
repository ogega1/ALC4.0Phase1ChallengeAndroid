package firstandroidapplication.javacodegeeks.com.alc4phase1challenge_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class About_ALC extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Button back2=(Button)findViewById(R.id.back);
        back2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        back2_btn();
                    }
                }
        );
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://andela.com/alc/");



    }
    private void back2_btn(){
        Intent intent=new Intent(this,Main_Activity.class);
        startActivity(intent);
    }
}
