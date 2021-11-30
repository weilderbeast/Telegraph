package github.bob.andhand_in.res.user;

import android.net.Uri;

import com.google.android.material.imageview.ShapeableImageView;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private String UID;
    private String displayName;
    private boolean emailVerified;
    private String phoneNumber;
    private Uri photoUrl;
    private List<String> contactRefs;

    public User(String email, String UID) {
        this.email = email;
        this.UID = UID;
        contactRefs = new ArrayList<>();
    }

    public User(){
        contactRefs = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Uri getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(Uri photoUrl) {
        this.photoUrl = photoUrl;
    }

    public List<String> getContacts() {
        return contactRefs;
    }

    public void setContacts(List<String> contactRefs) {
        this.contactRefs = contactRefs;
    }
}
