package com.ai.cloud.skywalking.api;

import com.ai.cloud.skywalking.protocol.common.CallType;

public interface IBuriedPointType {

    String getTypeName();

    CallType getCallType();
}
