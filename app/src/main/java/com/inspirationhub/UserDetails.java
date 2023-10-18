package com.inspirationhub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.inspirationhub.databinding.ActivityUserDetailsBinding;

public class UserDetails extends AppCompatActivity {
    ActivityUserDetailsBinding binding;
    String name,mobile,email ,UserName;

    FirebaseDatabase db ;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUserDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = binding.EtxtUname.getText().toString();
                mobile = binding.EtxtUnumber.getText().toString();
                email = binding.EtxtUemail.getText().toString();
                UserName = binding.EtxtUserid.getText().toString();

                if (!name.isEmpty() && !mobile.isEmpty() && !email.isEmpty() && !UserName.isEmpty()){
                    Users users = new Users(name,mobile,email,UserName);
                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("Users");
                    reference.child(UserName).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.EtxtUname.setText("");
                            binding.EtxtUnumber.setText("");
                            binding.EtxtUemail.setText("");
                            binding.EtxtUserid.setText("");

                            Toast.makeText(UserDetails.this,"Congratulations You are Registered",Toast.LENGTH_LONG).show();
                            Intent intent1 = new Intent(UserDetails.this,HomeScreen.class);
                            startActivity(intent1);
                        }
                    });
                }

                else{
                    Toast.makeText(UserDetails.this,"Plz Enter Valid data First",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}