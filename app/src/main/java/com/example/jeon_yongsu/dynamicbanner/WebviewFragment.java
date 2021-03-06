package com.example.jeon_yongsu.dynamicbanner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SuYa on 2017. 5. 22..
 */

public class WebviewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_web_view, container, false);
        NestedWebView view = (NestedWebView)rootView.findViewById(R.id.webview);

        view.loadUrl("https://github.com/SuSkaJun");

        return rootView;
    }

}
