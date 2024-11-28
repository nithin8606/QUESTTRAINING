package com.quest.oops.oops2;

public class LibraryMember {
    private String memberId;
    private String name;
    private String contactInfo;

    public LibraryMember(String memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "LibraryMember [ID=" + memberId + ", Name=" + name + ", Contact=" + contactInfo + "]";
    }
}
