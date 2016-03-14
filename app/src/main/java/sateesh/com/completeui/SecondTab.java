package sateesh.com.completeui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sateesh on 14-03-2016.
 */
public class SecondTab extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static SecondTab newInstance(int sectionNumber) {
        SecondTab fragment = new SecondTab();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.second_tab, container, false);
        return rootView;
    }

}
