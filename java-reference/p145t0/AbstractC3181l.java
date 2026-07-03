package p145t0;

import android.os.Looper;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t0.l */
/* loaded from: classes.dex */
public abstract class AbstractC3181l {

    /* renamed from: a */
    public static final long f15906a;

    static {
        long j6;
        try {
            j6 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j6 = -1;
        }
        f15906a = j6;
    }
}
