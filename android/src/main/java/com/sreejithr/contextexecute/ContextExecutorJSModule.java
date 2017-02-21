package com.sreejithr.contextexecute;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableMap;

/**
 * Created by sreejith on 20/02/17.
 */

public interface ContextExecutorJSModule extends JavaScriptModule {
    void execute(String op, WritableMap data);
}