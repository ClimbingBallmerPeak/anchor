package climbingballmerspeak.apps.anchor;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Thomas on 1/3/2015.
 */
public class ListArrayAdapter extends ArrayAdapter<String> {



        public ListArrayAdapter(Context context,
                                int textViewResourceId,
                                String fileName) {
            super(context, textViewResourceId);

            //  Replaced by fileio
            String[] values = new String[]{"Android", "iPhone", "WindowsMobile",
                    "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                    "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                    "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                    "Android", "iPhone", "WindowsMobile", fileName};

            for ( String i : values )
                this.add(i);

        }

}




/*          Saving this due to historical involvement

            //  Create an Arraylist for use in the listview
            final ArrayList<String> list = new ArrayList<String>();
            // Populate the new ArrayList from the string array
            for ( String i : values )
                list.add(i);

            HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

            for (int i = 0; i < list.size(); ++i) {
                 mIdMap.put(list.get(i), i);
            }
*/
