package p099m6;

import p039e5.C0811dk;
import p128q6.C3002e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.c0 */
/* loaded from: classes.dex */
public final class C2596c0 {

    /* renamed from: a */
    public C2592a0 f14029a;

    /* renamed from: b */
    public EnumC2624y f14030b;

    /* renamed from: d */
    public String f14032d;

    /* renamed from: e */
    public C2616q f14033e;

    /* renamed from: g */
    public AbstractC2602f0 f14035g;

    /* renamed from: h */
    public C2598d0 f14036h;

    /* renamed from: i */
    public C2598d0 f14037i;

    /* renamed from: j */
    public C2598d0 f14038j;

    /* renamed from: k */
    public long f14039k;

    /* renamed from: l */
    public long f14040l;

    /* renamed from: m */
    public C3002e f14041m;

    /* renamed from: c */
    public int f14031c = -1;

    /* renamed from: f */
    public C0811dk f14034f = new C0811dk(3);

    /* renamed from: b */
    public static void m4139b(String str, C2598d0 c2598d0) {
        if (c2598d0 != null) {
            if (c2598d0.f14062k == null) {
                if (c2598d0.f14063l == null) {
                    if (c2598d0.f14064m == null) {
                        if (c2598d0.f14065n != null) {
                            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        }
    }

    /* renamed from: a */
    public final C2598d0 m4140a() {
        int i7 = this.f14031c;
        if (i7 >= 0) {
            C2592a0 c2592a0 = this.f14029a;
            if (c2592a0 != null) {
                EnumC2624y enumC2624y = this.f14030b;
                if (enumC2624y != null) {
                    String str = this.f14032d;
                    if (str != null) {
                        return new C2598d0(c2592a0, enumC2624y, str, i7, this.f14033e, this.f14034f.m1504e(), this.f14035g, this.f14036h, this.f14037i, this.f14038j, this.f14039k, this.f14040l, this.f14041m);
                    }
                    throw new IllegalStateException("message == null");
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
        throw new IllegalStateException(("code < 0: " + this.f14031c).toString());
    }
}
