package p035e1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import android.view.autofill.AutofillManager;
import com.paoman.lema.BriefVpnReplaceService;
import com.paoman.lema.KeepAliveService;
import com.paoman.lema.OverlayKeepAliveService;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.h */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0656h {
    /* renamed from: A */
    public static /* bridge */ /* synthetic */ Bitmap.Config m1363A() {
        return Bitmap.Config.HARDWARE;
    }

    /* renamed from: C */
    public static /* synthetic */ NotificationChannel m1365C() {
        return new NotificationChannel("speed_test_overlay_keep_alive", "悬浮窗保活", 2);
    }

    /* renamed from: a */
    public static /* synthetic */ Notification.Builder m1367a(BriefVpnReplaceService briefVpnReplaceService) {
        return new Notification.Builder(briefVpnReplaceService, "brief_vpn_replace");
    }

    /* renamed from: b */
    public static /* synthetic */ Notification.Builder m1368b(KeepAliveService keepAliveService) {
        return new Notification.Builder(keepAliveService, "speed_test_keep_alive");
    }

    /* renamed from: c */
    public static /* synthetic */ Notification.Builder m1369c(OverlayKeepAliveService overlayKeepAliveService) {
        return new Notification.Builder(overlayKeepAliveService, "speed_test_overlay_keep_alive");
    }

    /* renamed from: d */
    public static /* synthetic */ NotificationChannel m1370d() {
        return new NotificationChannel("brief_vpn_replace", "VPN 切换", 2);
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Bitmap.Config m1371e() {
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ Bitmap m1372f(int i7, int i8, Bitmap.Config config, ColorSpace colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, i7, i8, config, true, colorSpace);
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ Class m1374h() {
        return AutofillManager.class;
    }

    /* renamed from: i */
    public static /* synthetic */ void m1375i() {
    }

    /* renamed from: z */
    public static /* synthetic */ NotificationChannel m1392z() {
        return new NotificationChannel("speed_test_keep_alive", "测速保活", 2);
    }
}
