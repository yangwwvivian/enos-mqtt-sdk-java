package com.envisioniot.enos.iot_mqtt_sdk.message.upstream.status;

import java.util.Map;
import java.util.regex.Pattern;

import com.envisioniot.enos.iot_mqtt_sdk.core.internals.constants.ArrivedTopicPattern;
import com.envisioniot.enos.iot_mqtt_sdk.message.upstream.BaseMqttResponse;

/**
 * Description: sub-device login response response data contains sub-device
 * productKey and deviceKey
 *
 * @author zhonghua.wu
 * @create 2018-07-09 14:35
 */
public class SubDeviceLoginResponse extends BaseMqttResponse
{
	private static Pattern pattern = Pattern.compile(ArrivedTopicPattern.SUB_DEVICE_LOGIN_REPLY);
	public String getSubProductKey()
	{
		Map<String, String> data = ((Map<String, String>) getData());
		return data.get("productKey");
	}

	public String getSubDeviceKey()
	{
		Map<String, String> data = ((Map<String,String>) getData());
		return data.get("deviceKey");
	}

    @Override
    public Pattern getMatchTopicPattern()
    {
		return pattern;
	}
}
