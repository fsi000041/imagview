package www.com.demo1;

import android.app.Application;

import com.previewlibrary.ZoomMediaLoader;

/**
 * 作者：Nick CY on 2017/10/16 13:51
 * 邮箱：fsi000044@163.com
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZoomMediaLoader.getInstance().init(new TestImageLoader());
    }
}
