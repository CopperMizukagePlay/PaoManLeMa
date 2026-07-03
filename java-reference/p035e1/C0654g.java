package p035e1;

import android.graphics.Bitmap;
import android.os.Build;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.g */
/* loaded from: classes.dex */
public final class C0654g {

    /* renamed from: a */
    public final Bitmap f2144a;

    public C0654g(Bitmap bitmap) {
        this.f2144a = bitmap;
    }

    /* renamed from: a */
    public final int m1362a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.f2144a.getConfig();
        AbstractC3367j.m5097b(config3);
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 != Bitmap.Config.ARGB_4444) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                config2 = Bitmap.Config.RGBA_F16;
                if (config3 == config2) {
                    return 3;
                }
            }
            if (i7 >= 26) {
                config = Bitmap.Config.HARDWARE;
                if (config3 == config) {
                    return 4;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }
}
