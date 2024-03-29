package edu.bracketly.frontend.navigation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import edu.bracketly.frontend.app.main.MainActivity;
import edu.bracketly.frontend.app.match.view.MatchActivity;
import edu.bracketly.frontend.app.match.view.MatchActivityFragment;
import edu.bracketly.frontend.app.signup.SignUpActivity;
import edu.bracketly.frontend.app.tournament.add.AddModifyTournamentActivity;
import edu.bracketly.frontend.app.tournament.add.AddModifyTournamentFragment;
import edu.bracketly.frontend.app.tournament.details.TournamentDetailsActivity;
import edu.bracketly.frontend.app.tournament.details.TournamentDetailsFragment;
import edu.bracketly.frontend.dto.MatchDto;
import edu.bracketly.frontend.dto.TournamentDto;

/**
 * Created by howor on 23.12.2017.
 */

public final class Navigator {
    private Navigator() {
    }

    public static void openMainActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void openAddTournamentActivity(Context context) {
        Intent intent = new Intent(context, AddModifyTournamentActivity.class);
        context.startActivity(intent);
    }

    public static void openTournamentDetailsActivity(Context context, long tournamentId) {
        Intent intent = new Intent(context, TournamentDetailsActivity.class);
        intent.putExtra(TournamentDetailsFragment.TOURNAMENT_ID, tournamentId);
        context.startActivity(intent);
    }

    public static void openMatchActivity(Context context, long bracketId, long matchId, boolean canEdit) {
        Intent intent = new Intent(context, MatchActivity.class);
        intent.putExtra(MatchActivityFragment.ARG_BRACKET_ID, bracketId);
        intent.putExtra(MatchActivityFragment.ARG_MATCH_ID, matchId);
        context.startActivity(intent);
    }

    public static void openMatchActivity(Context context, long bracketId, @NonNull MatchDto matchDto, boolean canEdit) {
        Intent intent = new Intent(context, MatchActivity.class);
        intent.putExtra(MatchActivityFragment.ARG_BRACKET_ID, bracketId);
        intent.putExtra(MatchActivityFragment.ARG_MATCH_DTO, matchDto);
        intent.putExtra(MatchActivityFragment.ARG_CAN_EDIT, canEdit);
        context.startActivity(intent);
    }

    public static void openSingUpActivity(Context context) {
        Intent intent = new Intent(context, SignUpActivity.class);
        context.startActivity(intent);
    }

    public static void openModifyTournamentActivity(Context context, TournamentDto tournament) {
        Intent intent = new Intent(context, AddModifyTournamentActivity.class);
        intent.putExtra(AddModifyTournamentFragment.TOURNAMENT_DTO, tournament);
        context.startActivity(intent);
    }
}
