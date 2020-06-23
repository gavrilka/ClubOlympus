package android.example.clubolympus.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class OlympusContentProvider extends ContentProvider {

    private static final int MEMBERS = 111;
    private static final int MEMBER_ID = 222;

    OlympusDbOpenHelper dpOpenHelper;

    private static final UriMatcher sURIMatcher = new UriMatcher(UriMatcher.NO_MATCH);
    static
    {
        sURIMatcher.addURI(ClubOlympusContract.AUTHORITY, ClubOlympusContract.PATH_MEMBERS, MEMBERS);
        sURIMatcher.addURI(ClubOlympusContract.AUTHORITY, ClubOlympusContract.PATH_MEMBERS + "/#", MEMBER_ID);
    }

    @Override
    public boolean onCreate() {
        dpOpenHelper = new OlympusDbOpenHelper(getContext());
        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }
}

//Unified Resource Identifier