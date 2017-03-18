package com.github.bsparanoid.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bsparanoid on 18/03/17.
 */

public class CustomAdapter extends ArrayAdapter<DataModel>/* implements View.OnClickListener*/{

    private ArrayList<DataModel> dataSet;
    Context _context;

    // View lookup cache
    private static class ViewHolder {
        TextView titleTask;
        TextView descTask;
    }



    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.row_items, data);
        this.dataSet = data;
        this._context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        DataModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        if (convertView == null) {


            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_items, parent, false);
            viewHolder.titleTask = (TextView) convertView.findViewById(R.id.name);
            viewHolder.descTask = (TextView) convertView.findViewById(R.id.type);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.titleTask.setText(dataModel.get_titleTask());
        viewHolder.descTask.setText(dataModel.get_descTask());
        // Return the completed view to render on screen
        return convertView;
    }


}
