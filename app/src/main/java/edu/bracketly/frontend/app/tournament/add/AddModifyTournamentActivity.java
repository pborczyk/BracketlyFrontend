package edu.bracketly.frontend.app.tournament.add;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import edu.bracketly.frontend.R;
import edu.bracketly.frontend.app.BaseActivity;

public class AddModifyTournamentActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tournament);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            if (getIntent().hasExtra(AddModifyTournamentFragment.TOURNAMENT_DTO)) {
                arguments.putSerializable(AddModifyTournamentFragment.TOURNAMENT_DTO,
                        getIntent().getSerializableExtra(AddModifyTournamentFragment.TOURNAMENT_DTO));
                setTitle("Edit Tournament");
            }
            AddModifyTournamentFragment fragment = new AddModifyTournamentFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                break;
        }
        return true;
    }
}
