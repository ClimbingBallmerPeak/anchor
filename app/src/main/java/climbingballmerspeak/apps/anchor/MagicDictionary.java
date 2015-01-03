package climbingballmerspeak.apps.anchor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


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



    }

    /**
     * Called when the user chooses a listview item
     */
    public void loadMagicDictionary(View view) {
        setContentView(R.layout.activity_magic_dictionary);
    }

}




        /*  Backed up listener code
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                view.animate().setDuration(2000).alpha(0)

                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                //list.remove(item);
                                adapter.notifyDataSetChanged();
                                view.setAlpha(1);
                            }
                        });
                 }

        });
        */
