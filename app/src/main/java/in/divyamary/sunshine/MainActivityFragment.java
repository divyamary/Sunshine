package in.divyamary.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 73/23",
                "Weds - Misty - 43/21",
                "Thurs - Sunny - 87/45",
                "Fri - Rainy - 74/23",
                "Sat - Cloudy - 45/32",
                "Sun - HELP TRAPPED IN WEATHERSTATION - 63/22"};
        List<String> forecastList = new ArrayList<String>(Arrays.asList(forecastArray));
        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast,
                R.id.list_item_forecast_textview, forecastList );
        ListView listView = (ListView)root.findViewById(R.id.listView_forecast);
        listView.setAdapter(mForecastAdapter);
        return root;
    }
}
