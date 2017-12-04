package com.cristhoper.listviewactivity.widgetproviders;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import android.widget.Toast;

import com.cristhoper.listviewactivity.R;
import com.cristhoper.listviewactivity.models.ListItem;
import com.cristhoper.listviewactivity.services.ApiService;
import com.cristhoper.listviewactivity.services.ApiServiceGenerator;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Cris on 4/12/2017.
 */

public class ListProvider implements RemoteViewsService.RemoteViewsFactory {

    private static final String TAG = ListProvider.class.getSimpleName();

    private List<ListItem> listItemList = new ArrayList<>();
    private Context context = null;
    private int appWidgetId;

    public ListProvider(Context context, Intent intent) {
        this.context = context;
        appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                AppWidgetManager.INVALID_APPWIDGET_ID);

        populateListItem();
    }

    private void populateListItem() {

        /*for (int i = 0; i < 5 ; i++){
            ListItem listItem = new ListItem();
            listItem.heading = "Heading" + i;
            listItem.content = i + " This is the content";
            listItemList.add(listItem);
        }*/

        listItemList.add(new ListItem("Gato","felino",R.drawable.gato));
        listItemList.add(new ListItem("Perro","perruno",R.drawable.perro));
        listItemList.add(new ListItem("Zorro","vulpix",R.drawable.zorro));
    }

    @Override
    public int getCount() {
        return listItemList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public RemoteViews getViewAt(int position) {
        final RemoteViews remoteView = new RemoteViews(
                context.getPackageName(), R.layout.list_row);

        ListItem listItem = listItemList.get(position);

        remoteView.setImageViewResource(R.id.imageView, listItem.getImage());
        remoteView.setTextViewText(R.id.heading, listItem.getHeading());
        remoteView.setTextViewText(R.id.content, listItem.getContent());

        return remoteView;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDataSetChanged() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }
}
