package com.argz.issue3686;

import android.util.Log;

import com.google.firebase.inappmessaging.FirebaseInAppMessagingClickListener;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.ModalMessage;

public class MyClickListener implements FirebaseInAppMessagingClickListener {
    private static final String TAG = "MainActivity";

    @Override
    public void messageClicked(InAppMessage inAppMessage, Action action) {
        test(inAppMessage);
    }


    private void test(InAppMessage inAppMessage){
        try {
            Action messageAction = ModalMessage.builder().build(inAppMessage.getCampaignMetadata(), inAppMessage.getData()).getAction();
        } catch(Exception e) {
            Log.d("FIAM", e.toString());
        }
    }
}
