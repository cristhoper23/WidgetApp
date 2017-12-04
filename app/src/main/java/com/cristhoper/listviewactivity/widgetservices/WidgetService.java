package com.cristhoper.listviewactivity.widgetservices;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViewsService;

import com.cristhoper.listviewactivity.models.ListItem;
import com.cristhoper.listviewactivity.services.ApiService;
import com.cristhoper.listviewactivity.services.ApiServiceGenerator;
import com.cristhoper.listviewactivity.widgetproviders.ListProvider;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Created by Cris on 4/12/2017.
 */

public class WidgetService extends RemoteViewsService{

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        int appWidgetId = intent.getIntExtra(
                AppWidgetManager.EXTRA_APPWIDGET_ID,
                AppWidgetManager.INVALID_APPWIDGET_ID);

        return (new ListProvider(this.getApplicationContext(), intent));
    }



}
