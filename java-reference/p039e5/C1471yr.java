package p039e5;

import java.util.concurrent.atomic.AtomicLong;
import p060h5.C1803k;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yr */
/* loaded from: classes.dex */
public final class C1471yr {

    /* renamed from: a */
    public final String f9765a;

    /* renamed from: b */
    public final String f9766b;

    /* renamed from: c */
    public final int f9767c;

    /* renamed from: d */
    public final String f9768d;

    /* renamed from: e */
    public volatile String f9769e;

    /* renamed from: f */
    public volatile String f9770f;

    /* renamed from: g */
    public volatile int f9771g;

    /* renamed from: h */
    public volatile long f9772h;

    /* renamed from: i */
    public volatile String f9773i;

    /* renamed from: j */
    public volatile int f9774j;

    /* renamed from: k */
    public volatile double f9775k;

    /* renamed from: l */
    public final AtomicLong f9776l;

    /* renamed from: m */
    public final AtomicLong f9777m;

    /* renamed from: n */
    public final C1803k f9778n;

    /* renamed from: o */
    public final AtomicLong f9779o;

    /* renamed from: p */
    public volatile long f9780p;

    public C1471yr(int i7, String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "key");
        AbstractC3367j.m5100e(str3, "targetName");
        this.f9765a = str;
        this.f9766b = str2;
        this.f9767c = i7;
        this.f9768d = str3;
        this.f9769e = "";
        this.f9770f = "";
        this.f9772h = -1L;
        this.f9773i = "等待";
        this.f9776l = new AtomicLong(0L);
        this.f9777m = new AtomicLong(0L);
        this.f9778n = new C1803k();
        this.f9779o = new AtomicLong(0L);
    }
}
