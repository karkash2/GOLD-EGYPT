package com.gold.egyptrates;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setBackgroundColor(Color.rgb(9,9,9));
        TextView title = new TextView(this);
        title.setText("✦ ذهب مصر");
        title.setTextColor(Color.rgb(242,205,105));
        title.setTextSize(25);
        title.setPadding(20,24,20,18);
        title.setGravity( android.view.Gravity.CENTER );
        page.addView(title);
        TextView note = new TextView(this);
        note.setText("مصدر الأسعار: eDahab عبر Ta3weem\nالأسعار المعروضة في المصدر تتحدث دورياً. افتح صفحة المصدر لمشاهدة آخر تحديث.");
        note.setTextColor(Color.rgb(220,205,165));
        note.setTextSize(14);
        note.setGravity(android.view.Gravity.CENTER);
        note.setPadding(18,8,18,14);
        page.addView(note);
        WebView web = new WebView(this);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.setBackgroundColor(Color.rgb(9,9,9));
        web.loadUrl("https://ta3weem.com/ar/gold-data-sources/edahab");
        page.addView(web, new LinearLayout.LayoutParams(-1,0,1));
        setContentView(page);
    }
}
