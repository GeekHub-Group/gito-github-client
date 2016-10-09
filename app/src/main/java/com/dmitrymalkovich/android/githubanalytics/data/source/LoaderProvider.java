package com.dmitrymalkovich.android.githubanalytics.data.source;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;

import com.dmitrymalkovich.android.githubanalytics.data.source.local.RepositoryContract;

import static com.google.common.base.Preconditions.checkNotNull;

public class LoaderProvider {

    @NonNull
    private final Context mContext;

    public LoaderProvider(@NonNull Context context) {
        mContext = checkNotNull(context, "context cannot be null");
    }

    public Loader<Cursor> createRepositoryLoader() {
        return new CursorLoader(
                mContext,
                RepositoryContract.RepositoryEntry.CONTENT_URI,
                RepositoryContract.RepositoryEntry.REPOSITORY_COLUMNS, null, null, null
        );
    }
}