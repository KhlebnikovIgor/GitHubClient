package ru.smr.btec.igor.githubclient.presentation.view;

public interface AuthView extends LoadingView {

    void openRepositoriesScreen();

    void showLoginError();

    void showPasswordError();

}