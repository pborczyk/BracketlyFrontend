package edu.bracketly.frontend.app.tournament.list;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import edu.bracketly.frontend.R;
import edu.bracketly.frontend.app.BaseFragment;
import edu.bracketly.frontend.navigation.Navigator;


public class TournamentListFragment extends BaseFragment<TournamentPresenter> {

    private Unbinder unbinder;

    @BindView(R.id.list)
    RecyclerView list;

    @BindView(R.id.no_items_message)
    TextView noItemsMessage;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    public TournamentListFragment() {
    }

    public static TournamentListFragment newInstance() {
        TournamentListFragment fragment = new TournamentListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    void setListEmpty(boolean isEmpty) {
        if (isEmpty) {
            list.setVisibility(View.GONE);
            noItemsMessage.setVisibility(View.VISIBLE);
        } else {
            list.setVisibility(View.VISIBLE);
            noItemsMessage.setVisibility(View.GONE);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tournament_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.fab)
    public void onFabClick(View view) {
        Navigator.openAddTournamentActivity(getContext());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
