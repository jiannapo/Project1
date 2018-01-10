package com.jiannapohotmail.com.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.jiannapohotmail.com.project1.R;

/**
 * Created by Stamatis on 10/1/2018.
 */

public class PointInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    Context context;
    LayoutInflater inflater;

    public PointInfoWindowAdapter(Context context) {
        this.context = context;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }

    @Override
    public View getInfoWindow(Marker marker) {

        inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.point_info_window, null);

        TextView title = (TextView) v.findViewById(R.id.location_info_window_txt);
        TextView subtitle = (TextView) v.findViewById(R.id.descr_info_window_txt);

        title.setText(marker.getTitle());
        subtitle.setText(marker.getSnippet());

        return v;

    }
}