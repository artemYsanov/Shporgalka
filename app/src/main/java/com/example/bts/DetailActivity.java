package com.example.bts;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WebView webView = findViewById(R.id.webView);
        int position = getIntent().getExtras().getInt("title");

        if (position == 0) {
            webView.loadUrl("https://www.k-pop.ru/article/48711");
        }
        if (position == 1) {
            webView.loadUrl("https://www.k-pop.ru/article/48720");

        }
        if (position == 2) {
            webView.loadUrl("https://www.k-pop.ru/article/48746");

        }
        if (position == 3) {
            webView.loadUrl("https://www.k-pop.ru/article/48737");

        }
        if (position == 4) {
            webView.loadUrl("https://www.k-pop.ru/article/48730");

        }
        if (position == 5) {
            webView.loadUrl("https://www.k-pop.ru/article/48725");

        }
        if (position == 6) {
            webView.loadUrl("https://www.k-pop.ru/article/48742 ");

        }


    }
}