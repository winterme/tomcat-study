package zzq.listener;

import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

public class MyListener implements LifecycleListener {
    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        System.out.println("my listener exec...");
    }
}
