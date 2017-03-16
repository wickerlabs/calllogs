
**Call Logs** - Android library for accessing device call logs
================
[![](https://jitpack.io/v/wickerlabs/CallLogs.svg)](https://jitpack.io/#wickerlabs/CallLogs)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Call%20logs-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/4523)

Installation
-------------

 **Step 1**. Add the JitPack repository to your root build.gradle file.
 

    allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

**Step 2**. Add the library dependency to your app build.gradle file

    dependencies {
	        compile 'com.github.wickerlabs:CallLogs:1+@aar'
	}

**Step 3**. Handle permissions (For API 23+)

    For those targeting API 23+, 
    you should handle the runtime permissions for READ_CONTACTS and READ_CALL_LOG. 
    As a reference, check  out the sample app in the repository. 
    Other than that, permissions are automatically added to the manifest file.

Usage
-------------

 - Initialization

     ```java
     LogsManager logsManager = new LogsManager(context);
     ```

 
 - Getting a list of call logs
 

     ```java
     List<LogObject> callLogs = logsManager.getLogs(type);
     ```

  
  >  Available list types :
  >  
  >  ***LogsManager.INCOMING_CALLS***: for getting the list (LogObject) of all the incoming calls.
  >  
  >  ***LogsManager.OUTGOING_CALLS***: for getting the list (LogObject) of all the incoming calls.
  >  
  >  ***LogsManager.MISSED_CALLS***: for getting the list (LogObject) of all the incoming calls.
  >  
  >  ***LogsManager.ALL_CALLS***: for getting the list (LogObject) of all the calls.
 
 - Getting call durations
 
 `logsManager.getIncomingDuration()`: returns the number of seconds for all the incoming calls made.
 
 `logsManager.getOutgoingDuration()`: returns the number of seconds for all the outgoing calls made.

  `logsManager.getTotalDuration()`: returns the number of seconds for all the calls made.

 `logsManager.getCoolDuration(type)`: returns a String in the form of  "***x* hrs *xx* mins**" or "***xx* mins *xx* secs**"
 
 >  Available duration types :
>  
>  ***LogsManager.INCOMING***: for getting duration for all the incoming calls.
>  
>  ***LogsManager.OUTGOING***: for getting duration for all the incoming calls.
>  
>    ***LogsManager.TOTAL***: for getting duration for all the calls.

Using LogObjects
--------------------
- Some useful methods
 
 `logObject.getDuration()`: returns an `int`  of the seconds used for that particular call.
 
 `logObject.getNumber()`: returns a `String` of the number associated with the call made.

 `logObject.getContactName()`: returns a `String` of the contact name for the number in the log, if not found, it returns the number.

  `logObject.getType()`: returns an `int` for the type of the call log.

 `logObject.getCoolDuration()`: returns a `String` in the form of  "***x* hrs *xx* mins**" or "***xx* mins *xx* secs**" based on the duration.

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

License
-------

    Copyright 2016 Wickerlabs.
    
    Licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, 
    software distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and limitations under the License.

