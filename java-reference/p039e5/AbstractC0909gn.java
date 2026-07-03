package p039e5;

import java.util.concurrent.ConcurrentHashMap;
import p032d6.C0565q1;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gn */
/* loaded from: classes.dex */
public abstract class AbstractC0909gn {

    /* renamed from: a */
    public static final C1701c0 f4317a;

    /* renamed from: b */
    public static final C1701c0 f4318b;

    /* renamed from: c */
    public static volatile boolean f4319c;

    /* renamed from: d */
    public static C0565q1 f4320d;

    /* renamed from: e */
    public static final ConcurrentHashMap f4321e;

    static {
        C1701c0 m2771b = AbstractC1719t.m2771b(new C1497zm());
        f4317a = m2771b;
        f4318b = m2771b;
        f4321e = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static C1701c0 m1549a() {
        return f4318b;
    }

    /* renamed from: b */
    public static void m1550b() {
        f4319c = false;
        C0565q1 c0565q1 = f4320d;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        f4320d = null;
        f4321e.clear();
        C1701c0 c1701c0 = f4317a;
        C1497zm c1497zm = new C1497zm();
        c1701c0.getClass();
        c1701c0.m2752j(null, c1497zm);
    }
}
