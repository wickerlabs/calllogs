package com.wickerlabs.calls;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wickerlabs.calls.Adapter.LogsAdapter;
import com.wickerlabs.logmanager.LogObject;
import com.wickerlabs.logmanager.LogsManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView logList = (ListView) findViewById(R.id.LogsList);

        LogsManager logsManager = new LogsManager(this);
        List<LogObject> callLogs = logsManager.getLogs(LogsManager.ALL_CALLS);

        LogsAdapter logsAdapter = new LogsAdapter(this, R.layout.log_layout, callLogs);

        logList.setAdapter(logsAdapter);
    }
}
