package edu.bracketly.frontend.app.match.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import butterknife.BindView;
import edu.bracketly.frontend.R;
import edu.bracketly.frontend.app.BaseActivity;


public class MatchActivity extends BaseActivity implements MatchActivityFragment.HostContract {

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putLong(MatchActivityFragment.ARG_BRACKET_ID,
                    getIntent().getLongExtra(MatchActivityFragment.ARG_BRACKET_ID, -11L));
            arguments.putLong(MatchActivityFragment.ARG_MATCH_ID,
                    getIntent().getLongExtra(MatchActivityFragment.ARG_MATCH_ID, -11L));
            arguments.putSerializable(MatchActivityFragment.ARG_MATCH_DTO,
                    getIntent().getSerializableExtra(MatchActivityFragment.ARG_MATCH_DTO));
            arguments.putBoolean(MatchActivityFragment.ARG_CAN_EDIT,
                    getIntent().getBooleanExtra(MatchActivityFragment.ARG_CAN_EDIT, false));

            MatchActivityFragment fragment = new MatchActivityFragment();
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

    @Override
    public FloatingActionButton getFab() {
        return fab;
    }
}
