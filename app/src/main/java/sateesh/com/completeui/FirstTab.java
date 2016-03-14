package sateesh.com.completeui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sateesh on 14-03-2016.
 */
public class FirstTab extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static FirstTab newInstance(int sectionNumber) {
        FirstTab fragment = new FirstTab();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first_tab, container, false);
        return rootView;
    }

}
