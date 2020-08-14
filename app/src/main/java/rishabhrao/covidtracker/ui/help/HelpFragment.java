/*
 * Copyright © 2020 Rishabh Rao.
 * All Rights Reserved.
 */

package rishabhrao.covidtracker.ui.help;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import rishabhrao.covidtracker.R;

public class HelpFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_help, container, false);

        Button btn1 = root.findViewById(R.id.btn_link1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link1 = new Intent(android.content.Intent.ACTION_VIEW);
                link1.setData(Uri.parse(getString(R.string.link1Url)));
                startActivity(link1);
            }
        });
        Button btn2 = root.findViewById(R.id.btn_link2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link2 = new Intent(android.content.Intent.ACTION_VIEW);
                link2.setData(Uri.parse(getString(R.string.link2Url)));
                startActivity(link2);
            }
        });
        Button btn3 = root.findViewById(R.id.btn_link3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link3 = new Intent(android.content.Intent.ACTION_VIEW);
                link3.setData(Uri.parse(getString(R.string.link3Url)));
                startActivity(link3);
            }
        });
        Button btn4 = root.findViewById(R.id.btn_link4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link4 = new Intent(android.content.Intent.ACTION_VIEW);
                link4.setData(Uri.parse(getString(R.string.link4Url)));
                startActivity(link4);
            }
        });
        Button btn5 = root.findViewById(R.id.btn_link5);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link5 = new Intent(android.content.Intent.ACTION_VIEW);
                link5.setData(Uri.parse(getString(R.string.link5Url)));
                startActivity(link5);
            }
        });
        Button btn6 = root.findViewById(R.id.btn_link6);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link6 = new Intent(android.content.Intent.ACTION_VIEW);
                link6.setData(Uri.parse(getString(R.string.link6Url)));
                startActivity(link6);
            }
        });
        Button btn7 = root.findViewById(R.id.btn_link7);
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link7 = new Intent(android.content.Intent.ACTION_VIEW);
                link7.setData(Uri.parse(getString(R.string.link7Url)));
                startActivity(link7);
            }
        });
        Button btn8 = root.findViewById(R.id.btn_link8);
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link8 = new Intent(android.content.Intent.ACTION_VIEW);
                link8.setData(Uri.parse(getString(R.string.link8Url)));
                startActivity(link8);
            }
        });
        Button btn9 = root.findViewById(R.id.btn_link9);
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent link9 = new Intent(android.content.Intent.ACTION_VIEW);
                link9.setData(Uri.parse(getString(R.string.link9Url)));
                startActivity(link9);
            }
        });

        return root;
    }
}