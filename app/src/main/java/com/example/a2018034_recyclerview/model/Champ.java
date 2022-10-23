package com.example.a2018034_recyclerview.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Champ implements Parcelable {
    public String name, role, diff, story;
    public int logo;

    public Champ(String name, String role, String diff, String story, int logo) {
        this.name = name;
        this.role = role;
        this.diff = diff;
        this.story = story;
        this.logo = logo;
    }

    protected Champ(Parcel in) {
        name = in.readString();
        role = in.readString();
        diff = in.readString();
        story = in.readString();
        logo = in.readInt();
    }

    public static final Creator<Champ> CREATOR = new Creator<Champ>() {
        @Override
        public Champ createFromParcel(Parcel in) {
            return new Champ(in);
        }

        @Override
        public Champ[] newArray(int size) {
            return new Champ[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(role);
        parcel.writeString(diff);
        parcel.writeString(story);
        parcel.writeInt(logo);
    }
}
