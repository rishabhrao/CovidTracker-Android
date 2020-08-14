/*
 * Copyright © 2020 Rishabh Rao.
 * All Rights Reserved.
 */

package rishabhrao.covidtracker.ui.summary;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import rishabhrao.covidtracker.R;


public class SummaryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_summary, container, false);

        try {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String url = "https://en.wikipedia.org/wiki/Template:COVID-19_pandemic_data/India_medical_cases_by_state_and_union_territory";

        Document document = Jsoup.connect(url).get();

        Element content = document.select(".sorttop").first();
        String summaryCounts = content.toString();

            if (!summaryCounts.isEmpty()) {
                String summaryCountConfirmed = summaryCounts.split(">")[4];
                summaryCountConfirmed = summaryCountConfirmed.substring(0, summaryCountConfirmed.length() - 5);
                String summaryCountDeaths = summaryCounts.split(">")[6];
                summaryCountDeaths = summaryCountDeaths.substring(0, summaryCountDeaths.length() - 5);
                String summaryCountRecovered = summaryCounts.split(">")[8];
                summaryCountRecovered = summaryCountRecovered.substring(0, summaryCountRecovered.length() - 5);
                String summaryCountActive = summaryCounts.split(">")[10];
                summaryCountActive = summaryCountActive.substring(0, summaryCountActive.length() - 5);
                DateFormat time = new SimpleDateFormat("hh:mm aa");
                String summaryCountLastUpdate = time.format(new Date()).toString();

                TextView summary_countConfirmed = root.findViewById(R.id.summary_countConfirmed);
                summary_countConfirmed.setText(summaryCountConfirmed);
                TextView summary_countDeaths = root.findViewById(R.id.summary_countDeaths);
                summary_countDeaths.setText(summaryCountDeaths);
                TextView summary_countRecovered = root.findViewById(R.id.summary_countRecovered);
                summary_countRecovered.setText(summaryCountRecovered);
                TextView summary_countActive = root.findViewById(R.id.summary_countActive);
                summary_countActive.setText(summaryCountActive);
                TextView summary_countLastUpdate = root.findViewById(R.id.summary_countLastUpdate);
                summary_countLastUpdate.setText(summaryCountLastUpdate);
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return root;
    }

}
