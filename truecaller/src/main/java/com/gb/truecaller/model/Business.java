package com.rbm.truecaller.model;

import com.rbm.truecaller.model.common.Contact;
import com.rbm.truecaller.model.common.PersonalInfo;
import com.rbm.truecaller.model.common.SocialInfo;
import com.rbm.truecaller.model.common.Tag;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Business {
    private String businessName;
    private String businessDescription;
    private Tag tag;
    private BusinessSize businessSize;
    private Map<Days, OperatingHours> openHours;
    private Contact contact;
    private PersonalInfo personalInfo;
    private SocialInfo socialInfo;

    public Business(String name, Tag tag) {
        this.businessName = name;
        this.tag = tag;
    }
}
