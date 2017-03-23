
**Call Logs** - Android library for accessing device call logs
================
[![](https://jitpack.io/v/wickerlabs/CallLogs.svg)](https://jitpack.io/#wickerlabs/CallLogs)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Call%20logs-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/4523)

![Image of the library in action](https://s25.postimg.org/3pxthhhhr/device_2016_10_13_150816.png "screenshot")

Usage Details:
--------------
Visit [Here](http://wickerlabs.com/call-logs/) to get detailed information on how to use the library.

Examples
--------
- Retriving a list of all call logs:

	```java
	ListView logList = (ListView) findViewById(R.id.LogsList);
	LogsManager logsManager = new LogsManager(this);
	List<LogObject> callLogs = logsManager.getLogs(LogsManager.ALL_CALLS);
	LogsAdapter logsAdapter = new LogsAdapter(this, R.layout.log_layout, callLogs);
	logList.setAdapter(logsAdapter);
	```


be sure to check out the [sample](https://github.com/wickerlabs/CallLogs/tree/master/SampleApp) app in the repository.

Acknowledgements
----------------
> Icons made by [madebyoliver](http://www.flaticon.com/authors/madebyoliver) from [www.flaticon.com](http://www.flaticon.com) 
