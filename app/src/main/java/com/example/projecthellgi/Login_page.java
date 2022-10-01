package com.example.projecthellgi;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_page extends AppCompatActivity {

    Button  mLoginBtn;
    TextView mResigettxt;
    EditText mEmailText, mPasswordText;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("로그인");

        actionBar.setDisplayHomeAsUpEnabled(true); //뒤로가기버튼
        actionBar.setDisplayShowHomeEnabled(true); //홈 아이콘

        firebaseAuth =  FirebaseAuth.getInstance();
        //버튼 등록하기
        mResigettxt = findViewById(R.id.registerbtn);
        mLoginBtn = findViewById(R.id.logInButton);
        mEmailText = findViewById(R.id.idInput);
        mPasswordText = findViewById(R.id.pwInput);

        //가입 버튼이 눌리면
        mResigettxt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //intent함수를 통해 register액티비티 함수를 호출한다.
                startActivity(new Intent(Login_page.this,RegisterPage.class));
            }
        });

        //로그인 버튼이 눌리면
        mLoginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = mEmailText.getText().toString().trim();
                String pwd = mPasswordText.getText().toString().trim();
                firebaseAuth.signInWithEmailAndPassword(email,pwd)
                        .addOnCompleteListener(Login_page.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Log.d(TAG, "signInWithEmail:success");

                                    Intent intent = new Intent(Login_page.this, HomeActivity.class);
                                    startActivity(intent);
                                }else{
                                    Log.w(TAG, "signInWithEmail:failure", task.getException());
                                    Toast.makeText(Login_page.this,"로그인 오류",Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
    public boolean onSupportNavigateUp(){
        onBackPressed();; // 뒤로가기 버튼이 눌렸을시
        return super.onSupportNavigateUp(); // 뒤로가기 버튼
    }
}