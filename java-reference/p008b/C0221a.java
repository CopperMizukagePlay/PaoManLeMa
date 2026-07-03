package p008b;

import p148t3.C3253b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C0221a {

    /* renamed from: a */
    public final float f893a;

    /* renamed from: b */
    public final float f894b;

    /* renamed from: c */
    public final float f895c;

    /* renamed from: d */
    public final int f896d;

    /* renamed from: e */
    public final long f897e;

    public C0221a(C3253b c3253b) {
        AbstractC3367j.m5100e(c3253b, "navigationEvent");
        float f7 = c3253b.f16078c;
        float f8 = c3253b.f16079d;
        float f9 = c3253b.f16077b;
        int i7 = c3253b.f16076a;
        long j6 = c3253b.f16080e;
        this.f893a = f7;
        this.f894b = f8;
        this.f895c = f9;
        this.f896d = i7;
        this.f897e = j6;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f893a + ", touchY=" + this.f894b + ", progress=" + this.f895c + ", swipeEdge=" + this.f896d + ", frameTimeMillis=" + this.f897e + ')';
    }
}
