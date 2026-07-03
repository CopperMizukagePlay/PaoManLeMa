package p083k6;

import java.util.concurrent.TimeUnit;
import p069i6.AbstractC2088a;
import p069i6.AbstractC2106s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.k */
/* loaded from: classes.dex */
public abstract class AbstractC2331k {

    /* renamed from: a */
    public static final String f13310a;

    /* renamed from: b */
    public static final long f13311b;

    /* renamed from: c */
    public static final int f13312c;

    /* renamed from: d */
    public static final int f13313d;

    /* renamed from: e */
    public static final long f13314e;

    /* renamed from: f */
    public static final C2327g f13315f;

    static {
        String str;
        int i7 = AbstractC2106s.f12382a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f13310a = str;
        f13311b = AbstractC2088a.m3438i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = AbstractC2106s.f12382a;
        if (i8 < 2) {
            i8 = 2;
        }
        f13312c = AbstractC2088a.m3439j(i8, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f13313d = AbstractC2088a.m3439j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f13314e = TimeUnit.SECONDS.toNanos(AbstractC2088a.m3438i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f13315f = C2327g.f13305a;
    }
}
