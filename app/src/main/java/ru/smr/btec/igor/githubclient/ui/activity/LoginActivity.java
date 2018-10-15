package ru.smr.btec.igor.githubclient.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import butterknife.BindView;
import butterknife.OnClick;
import ru.smr.btec.igor.githubclient.R;
import ru.smr.btec.igor.githubclient.presentation.presenter.LoginPresenter;
import ru.smr.btec.igor.githubclient.presentation.view.LoginView;


public class LoginActivity extends MvpAppCompatActivity implements LoginView {
    public static final String TAG = "LoginActivity";
    @InjectPresenter
    LoginPresenter mLoginPresenter;

    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, LoginActivity.class);

        return intent;
    }

    @ProvidePresenter
    LoginPresenter providePresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @BindView(R.id.loginEdit)
    EditText mLoginEdit;

    @BindView(R.id.passwordEdit)
    EditText mPasswordEdit;

    private LoginPresenter mPresenter;

    @SuppressWarnings("unused")
    @OnClick(R.id.logInButton)
    public void onLogInButtonClick() {
        String login = mLoginEdit.getText().toString();
        String password = mPasswordEdit.getText().toString();
    }
}
