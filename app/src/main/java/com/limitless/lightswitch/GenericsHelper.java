package com.limitless.lightswitch;

import android.content.Context;

//Because casting is for suckers
public class GenericsHelper {

	public static <T> T getSystemService(Context context, String serviceName) {
		return (T) context.getSystemService(serviceName);
	}

}
