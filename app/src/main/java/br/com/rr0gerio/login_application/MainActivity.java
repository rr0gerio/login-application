package br.com.rr0gerio.login_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);

        EditText pwdUser = findViewById(R.id.pwdUser);
        EditText txtUserLogin = findViewById(R.id.txtUserLogin);

            btnLogin.setOnClickListener(view -> {
                if (validatePassword(pwdUser.getText().toString(), txtUserLogin.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Ai sim filhão!", Toast.LENGTH_LONG).show();
                    startActivity(
                            new Intent(getApplicationContext(), MainMenu.class)
                    );
                }
                else
                    Toast.makeText(this,"Senha errada padrin", Toast.LENGTH_LONG).show();
            });
    }
    protected boolean validatePassword(@NonNull String user, @NonNull String password){
        if(user.equals("admin") && password.equals("admin"))
            return true;
        else
            return false;
    }
}