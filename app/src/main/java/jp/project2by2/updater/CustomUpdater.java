package jp.project2by2.updater;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemProperties;
import android.view.View;
import androidx.fragment.app.DialogFragment;

public class CustomUpdater {

    public static String getDownloadPage() {
        return "https://sourceforge.net/projects/project2by2-test/files/"
             + SystemProperties.get("ro.lineage.device", "") + "/"
             + SystemProperties.get("ro.build.version.release", "");
    }

}
