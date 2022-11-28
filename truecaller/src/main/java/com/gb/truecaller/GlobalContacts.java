package com.rbm.truecaller;

import com.rbm.truecaller.model.tries.ContactTrie;
import lombok.Getter;

public class GlobalContacts {
    private GlobalContacts() {
    }
    public static GlobalContacts INSTANCE = new GlobalContacts();
    @Getter
    private ContactTrie contactTrie = new ContactTrie();
}
