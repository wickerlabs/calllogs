/**************************************************************************************************
 * Copyright (C) 2016 WickerLabs. inc - All Rights Reserved.                                      *
 * *
 * NOTICE:  All information contained herein is, and remains the property of WickerLabs,          *
 * The intellectual and technical concepts contained herein are proprietary to WickerLabs.        *
 * Dissemination of this information or reproduction of this material                             *
 * is strictly forbidden unless prior permission is obtained from WickerLabs. inc                 *
 * *
 **************************************************************************************************/
package com.wickerlabs.logmanager.interfaces;

/**
 * Created by: WickerLabs.Inc
 * Project title: CallLogs
 * Time: 10:06 AM
 * Date: 1/27/2017
 * Website: http://www.wickerlabs.com
 */

public interface CallLogObject {

    public String getNumber();

    public void setNumber(String number);

    public int getType();

    public void setType(int type);

    public long getDate();

    public void setDate(long date);

    public int getDuration();

    public void setDuration(int duration);

    public String getCoolDuration();

    public String getContactName();

}
