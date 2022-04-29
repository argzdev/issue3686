package com.argz.issue3686;

import androidx.annotation.Nullable;

import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.Button;
import com.google.firebase.inappmessaging.model.CampaignMetadata;
import com.google.firebase.inappmessaging.model.ImageData;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.Text;

import java.util.Map;

public class CustomInAppMessage extends InAppMessage {

    public CustomInAppMessage(Text title, Text body, String imageUrl, ImageData imageData, Button actionButton, Action action, String backgroundHexColor, String campaignId, String campaignName, Boolean isTestMessage, MessageType messageType, Map<String, String> data) {
        super(title, body, imageUrl, imageData, actionButton, action, backgroundHexColor, campaignId, campaignName, isTestMessage, messageType, data);
    }

    public CustomInAppMessage(CampaignMetadata campaignMetadata, MessageType messageType, Map<String, String> data) {
        super(campaignMetadata, messageType, data);
    }

    @Nullable
    @Override
    public Action getAction() {
        return null;
    }
}
