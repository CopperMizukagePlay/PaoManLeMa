package p146t1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.f1 */
/* loaded from: classes.dex */
public final class C3200f1 {

    /* renamed from: a */
    public final InterfaceC3206h1 f15948a;

    /* renamed from: b */
    public C3205h0 f15949b;

    /* renamed from: c */
    public final C3197e1 f15950c = new C3197e1(this, 2);

    /* renamed from: d */
    public final C3197e1 f15951d = new C3197e1(this, 0);

    /* renamed from: e */
    public final C3197e1 f15952e = new C3197e1(this, 1);

    public C3200f1(InterfaceC3206h1 interfaceC3206h1) {
        this.f15948a = interfaceC3206h1;
    }

    /* renamed from: a */
    public final C3205h0 m4905a() {
        C3205h0 c3205h0 = this.f15949b;
        if (c3205h0 != null) {
            return c3205h0;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
