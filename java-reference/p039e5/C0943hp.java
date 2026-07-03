package p039e5;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hp */
/* loaded from: classes.dex */
public final /* synthetic */ class C0943hp implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f4629e;

    /* renamed from: f */
    public final /* synthetic */ String f4630f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f4631g;

    /* renamed from: h */
    public final /* synthetic */ boolean f4632h;

    public /* synthetic */ C0943hp(String str, InterfaceC3279c interfaceC3279c, boolean z7, int i7, int i8) {
        this.f4629e = i8;
        this.f4630f = str;
        this.f4631g = interfaceC3279c;
        this.f4632h = z7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f4629e;
        C2395p c2395p = (C2395p) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                AbstractC0945hr.m1600z(this.f4630f, this.f4631g, this.f4632h, c2395p, AbstractC2418w.m3957F(1));
                break;
            default:
                AbstractC0945hr.m1575a(this.f4630f, this.f4631g, this.f4632h, c2395p, AbstractC2418w.m3957F(1));
                break;
        }
        return C1694m.f10482a;
    }
}
