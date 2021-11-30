package com.example.app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app.R;
import com.example.app.databinding.ActivityChatBinding;
import com.example.app.models.User;
import com.example.app.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
//        setContentView(R.layout.activity_chat);
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }

    private void loadReceiverDetails() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners() {
        binding.imageBack.setOnClickListener(v -> onBackPressed());
    }
}