package p107o;

import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.r0 */
/* loaded from: classes.dex */
public final class C2774r0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: g */
    public static final C2774r0 f14764g;

    /* renamed from: h */
    public static final C2774r0 f14765h;

    /* renamed from: f */
    public final /* synthetic */ int f14766f;

    static {
        int i7 = 0;
        f14764g = new C2774r0(i7, 0);
        f14765h = new C2774r0(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2774r0(int i7, int i8) {
        super(i7);
        this.f14766f = i8;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f14766f) {
            case 0:
                return C2789z.f14799a;
            case 1:
                return new C2733d1();
            default:
                return new C2769p1(0);
        }
    }
}
