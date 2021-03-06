package com.iconuim.alc_project;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Intent;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQuery;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class BackgroundUpdateService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    public static final String ACTION_INSERT = "com.iconuim.alc_project.action.INSERT";
    public static final String ACTION_UPDATE = "com.iconuim.alc_project.action.UPDATE";
    public static final String ACTION_CREATE = "com.iconuim.alc_project.action.CREATE";
    public static final String ACTION_TABLE_NAME = "com.iconuim.alc_project.action.TABLE_NAME";
    public static final String ACTION_SELECT = "com.iconuim.alc_project.action.SELECT";




    public static final String IMAGE_ID_COLUMN ="_id";
    public static final String TITLE_COLUMN = "TITLE";
    public static final String DESCRIPTION_COLUMN ="DESCRIPTION";
    public static final String IMAGE_PATH_REF_COLUMN ="IMAGE_PATH_REF";

    private static final String  [] res = new String[]{IMAGE_ID_COLUMN,TITLE_COLUMN,DESCRIPTION_COLUMN,IMAGE_PATH_REF_COLUMN};
    private static final SQLiteDatabase.CursorFactory fac =  new SQLiteDatabase.CursorFactory() {
        @Override
        public Cursor newCursor(SQLiteDatabase db, SQLiteCursorDriver masterQuery, String editTable, SQLiteQuery query) {
            return null;
        }
    };
    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.iconuim.alc_project.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.iconuim.alc_project.extra.PARAM2";
    private static String [] tempColumns ;
    private static String [] tempData;
    private static String tempWhereClause;
    private static String [] tempWhereArgs;
    private static String tempSelection;
    private static String tempSelectionWhere;
    private static String [] tempSelectionArgs;
    private static Cursor cursor;
    private static ContentValues contentValues;
    private static   PDDBOpenHelper pddbOpenHelper;
    private static SQLiteDatabase dbInsert ;
    private static SQLiteDatabase dbUpdate ;
    private static SQLiteDatabase dbSelect ;

    public BackgroundUpdateService() {
        super("BackgroundUpdateService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionInsert(Context context, Intent intent) {
       // Intent intent = new Intent(context, BackgroundUpdateService.class);
       // intent.setAction(ACTION_INSERT);
       // intent.putExtra(EXTRA_PARAM1, param1);
       // intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    public static void startActionOpen(Intent intent, Context context)
    {
         intent = new Intent(context, BackgroundUpdateService.class);
        if( intent.getAction() == ACTION_CREATE ) {
            pddbOpenHelper =  new PDDBOpenHelper(context,"pd_db.db",fac,1);
            contentValues = new ContentValues();


        }

      //  return pddbOpenHelper;
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionUpdate(Context context, String param1, String param2) {
        Intent intent = new Intent(context, BackgroundUpdateService.class);
        intent.setAction(ACTION_UPDATE);
        //intent.putExtra(EXTRA_PARAM1, param1);
       // intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {




    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionUpdate(String param1, String param2) {
        // TODO: Handle action Foo

        //update happens here



        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionInsert(String param1, String param2) {
        // TODO: Handle action Baz

        //insert happens here



        throw new UnsupportedOperationException("Not yet implemented");
    }




}
