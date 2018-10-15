package ru.smr.btec.igor.githubclient.presentation.view;

import android.support.annotation.NonNull;

import java.util.List;

import io.reactivex.Observable;
import ru.smr.btec.igor.githubclient.presentation.presenter.Authorization;
import ru.smr.btec.igor.githubclient.presentation.presenter.Repository;

public interface GithubRepository {

    @NonNull
    Observable<List<Repository>> repositories();

    @NonNull
    Observable<Authorization> auth(@NonNull String login, @NonNull String password);
}