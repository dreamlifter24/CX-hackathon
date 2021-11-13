package com.example.bottomnavigation.ui.vaccination;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VaccinationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VaccinationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}