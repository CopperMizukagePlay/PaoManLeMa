package p099m6;

import java.io.Closeable;
import p128q6.C3002e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.d0 */
/* loaded from: classes.dex */
public final class C2598d0 implements Closeable {

    /* renamed from: e */
    public final C2592a0 f14056e;

    /* renamed from: f */
    public final EnumC2624y f14057f;

    /* renamed from: g */
    public final String f14058g;

    /* renamed from: h */
    public final int f14059h;

    /* renamed from: i */
    public final C2616q f14060i;

    /* renamed from: j */
    public final C2617r f14061j;

    /* renamed from: k */
    public final AbstractC2602f0 f14062k;

    /* renamed from: l */
    public final C2598d0 f14063l;

    /* renamed from: m */
    public final C2598d0 f14064m;

    /* renamed from: n */
    public final C2598d0 f14065n;

    /* renamed from: o */
    public final long f14066o;

    /* renamed from: p */
    public final long f14067p;

    /* renamed from: q */
    public final C3002e f14068q;

    public C2598d0(C2592a0 c2592a0, EnumC2624y enumC2624y, String str, int i7, C2616q c2616q, C2617r c2617r, AbstractC2602f0 abstractC2602f0, C2598d0 c2598d0, C2598d0 c2598d02, C2598d0 c2598d03, long j6, long j7, C3002e c3002e) {
        AbstractC3367j.m5100e(c2592a0, "request");
        AbstractC3367j.m5100e(enumC2624y, "protocol");
        AbstractC3367j.m5100e(str, "message");
        this.f14056e = c2592a0;
        this.f14057f = enumC2624y;
        this.f14058g = str;
        this.f14059h = i7;
        this.f14060i = c2616q;
        this.f14061j = c2617r;
        this.f14062k = abstractC2602f0;
        this.f14063l = c2598d0;
        this.f14064m = c2598d02;
        this.f14065n = c2598d03;
        this.f14066o = j6;
        this.f14067p = j7;
        this.f14068q = c3002e;
    }

    /* renamed from: b */
    public static String m4141b(String str, C2598d0 c2598d0) {
        c2598d0.getClass();
        String m4164a = c2598d0.f14061j.m4164a(str);
        if (m4164a == null) {
            return null;
        }
        return m4164a;
    }

    /* renamed from: c */
    public final boolean m4142c() {
        int i7 = this.f14059h;
        if (200 > i7 || i7 >= 300) {
            return false;
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC2602f0 abstractC2602f0 = this.f14062k;
        if (abstractC2602f0 != null) {
            abstractC2602f0.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m6.c0] */
    /* renamed from: d */
    public final C2596c0 m4143d() {
        ?? obj = new Object();
        obj.f14029a = this.f14056e;
        obj.f14030b = this.f14057f;
        obj.f14031c = this.f14059h;
        obj.f14032d = this.f14058g;
        obj.f14033e = this.f14060i;
        obj.f14034f = this.f14061j.m4166c();
        obj.f14035g = this.f14062k;
        obj.f14036h = this.f14063l;
        obj.f14037i = this.f14064m;
        obj.f14038j = this.f14065n;
        obj.f14039k = this.f14066o;
        obj.f14040l = this.f14067p;
        obj.f14041m = this.f14068q;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f14057f + ", code=" + this.f14059h + ", message=" + this.f14058g + ", url=" + this.f14056e.f14018a + '}';
    }
}
