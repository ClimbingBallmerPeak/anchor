package climbingballmerspeak.apps.anchor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class MagicDictionary extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_magic_dictionary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when the user clicks the Begin button
     */
    public void loadMacroListView(View view) {
        //  switch to  listview screen
        setContentView(R.layout.macro_list_view);
        //  localize listview for referencing
        final ListView listview = (ListView) findViewById(R.id.macroListView);
        //  Set up an adapter for the listview
        final ListArrayAdapter adapter = new ListArrayAdapter(this,android.R.layout.simple_list_item_1,"macrodata.txt");
        //  Define adapter in listview
        listview.setAdapter(adapter);

        //  Now setup a basic listener for the listView selection
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                //  Acquire data from adapter
                final String item = (String) parent.getItemAtPosition(position);


                // Load new content into the layout resource, get textview locations
                setContentView(R.layout.activity_magic_dictionary);

                TextView macro = (TextView) findViewById(R.id.macroNameText);
                TextView object = (TextView) findViewById(R.id.objectText);
                TextView description = (TextView) findViewById(R.id.descriptionText);

                // Set display text
                macro.setText("@.appl");
                object.setText("/(.S)APPL");
                description.setText("The currently defined application");

            }

        });

    }

    /**
     * Called when the user chooses a listview item  // not really
     */
    public void loadMagicDictionary(View view) {
        setContentView(R.layout.activity_magic_dictionary);
    }

}


