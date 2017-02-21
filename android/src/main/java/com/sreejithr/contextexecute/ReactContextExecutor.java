package com.sreejithr.contextexecute;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/**
 * Created by sreejith on 20/02/17.
 */

public class ReactContextExecutor {
    public ReactContext context = null;

    public ReactContextExecutor(ReactContext context) {
        this.context = context;
    }

    public void execute(String op, WritableMap data) {
        context.getCatalystInstance().getJSModule(ContextExecutorJSModule.class)
            .execute(op, data);
    }
}
