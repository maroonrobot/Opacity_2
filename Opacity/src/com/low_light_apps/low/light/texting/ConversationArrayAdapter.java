package com.low_light_apps.low.light.texting;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class ConversationArrayAdapter extends ArrayAdapter<String> {

	private final Context context;
	private final ArrayList<String> values;
	private final ArrayList<String> messages;
	private final ArrayList<String> type;
	private final ArrayList<String> contacts;
	//constructor
	public ConversationArrayAdapter(Context context, ArrayList<String> values, ArrayList<String> messages, ArrayList<String> type, ArrayList<String> contacts) {
		super(context, R.layout.conversation_row, values);
		this.context = context;
		this.values = values;
		this.messages = messages;
		this.type = type;
		this.contacts = contacts;

	}

	 @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.conversation_row, parent, false);
	    TextView textView = (TextView) rowView.findViewById(R.id.label_1);
	    TextView textView2 = (TextView) rowView.findViewById(R.id.label_2);
	    TextView textView3 = (TextView) rowView.findViewById(R.id.label_3);
	    TextView textView4 = (TextView) rowView.findViewById(R.id.label_4);

	    

	    textView.setText(messages.get(position));
	    // set the same value for the second textView
	    textView2.setText(values.get(position)); //examples have this setting a imageview with logic.
	    String str_type = type.get(position);
	    Log.v("type", str_type);
	    if(str_type.equals("1")){
	    textView3.setText("received");
	    }
	    else {
	    	textView3.setText("sent");
	    }
	    textView4.setText(contacts.get(position));

	    return rowView;
	  }

    
}
