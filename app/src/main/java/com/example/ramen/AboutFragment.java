package com.example.ramen;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutFragment extends Fragment
{



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_about, container, false);
        WebView webView = (WebView)view.findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); //enables javascript
        webView.setWebViewClient(new WebViewClient());//allows us to open URL in app
        webView.loadUrl("https://www.google.com/maps?q=wakayama+ramen+kamloops&rlz=1C1CHBF_enCA876CA876&um=1&ie=UTF-8&sa=X&ved=2ahUKEwivh96aqoToAhUPCTQIHSjdDDcQ_AUoAnoECBQQBA");
        return view;


    }//end onCreateView




}//end class
