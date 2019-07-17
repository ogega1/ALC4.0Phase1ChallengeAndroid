package firstandroidapplication.javacodegeeks.com.alc4phase1challenge_android;

import android.app.Activity;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class About_ALC extends Activity {
    WebView webView;

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
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new MyBrowser());
        webView.loadUrl("https://andela.com/alc/");



    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl("https://andela.com/alc/");
            return true;
        }
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            super.onReceivedSslError(view, handler, error);

            // this will ignore the Ssl error and will go forward to your site
            handler.proceed();
        }
    }



    public void back2_btn(){
        Intent intent=new Intent(this,Main_Activity.class);
        startActivity(intent);
    }
}
