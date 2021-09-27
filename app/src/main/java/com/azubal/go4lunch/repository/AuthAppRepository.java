package com.azubal.go4lunch.repository;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AuthAppRepository {
    Application application;

    FirebaseAuth firebaseAuth;
    AuthUI authUI;
    MutableLiveData<FirebaseUser> userLiveData;

    public AuthAppRepository(Application application) {
        this.application = application;
        this.firebaseAuth = FirebaseAuth.getInstance();
        this.userLiveData = new MutableLiveData<>();
        this.userLiveData.postValue(firebaseAuth.getCurrentUser());
        this.authUI = AuthUI.getInstance();
    }

    public MutableLiveData<FirebaseUser> getUserLiveData() {
        return userLiveData;
    }

    public void signOut(){
        authUI.signOut(application.getApplicationContext());
    }

    public void deleteUser(){
        authUI.delete(application.getApplicationContext());
    }

}
