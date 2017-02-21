
package com.sreejithr.contextexecute;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.sreejithr.contextexecute.ReactContextExecutor;

public class RNContextExecuteModule extends ReactContextBaseJavaModule {

  public RNContextExecuteModule(ReactApplicationContext reactContext) {
    super(reactContext);
    ReactContextExecutor.getInstance().context = reactContext;
  }

  @Override
  public String getName() {
    return "RNContextExecute";
  }
}