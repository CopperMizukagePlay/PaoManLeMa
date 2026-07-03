package p039e5;

import androidx.lifecycle.InterfaceC0213t;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p079k1.C2266e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p118p3.C2878c;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.C3336c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ip */
/* loaded from: classes.dex */
public final /* synthetic */ class C0974ip implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f4939e;

    /* renamed from: f */
    public final /* synthetic */ int f4940f;

    /* renamed from: g */
    public final /* synthetic */ Object f4941g;

    /* renamed from: h */
    public final /* synthetic */ Object f4942h;

    /* renamed from: i */
    public final /* synthetic */ Object f4943i;

    public /* synthetic */ C0974ip(Object obj, Object obj2, Object obj3, int i7, int i8) {
        this.f4939e = i8;
        this.f4941g = obj;
        this.f4942h = obj2;
        this.f4943i = obj3;
        this.f4940f = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f4939e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0945hr.m1596v((InterfaceC3277a) this.f4941g, (C2266e) this.f4942h, (String) this.f4943i, (C2395p) obj, AbstractC2418w.m3957F(this.f4940f | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC2168e.m3519f((InterfaceC0213t) this.f4941g, (C2878c) this.f4942h, (InterfaceC3279c) this.f4943i, (C2395p) obj, AbstractC2418w.m3957F(this.f4940f | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int m3957F = AbstractC2418w.m3957F(this.f4940f) | 1;
                ((C3173d) this.f4941g).m4865g(this.f4942h, this.f4943i, (C2395p) obj, m3957F);
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(this.f4940f | 1);
                ((C3336c) this.f4941g).mo5073b(this.f4942h, (C3173d) this.f4943i, (C2395p) obj, m3957F2);
                break;
        }
        return C1694m.f10482a;
    }
}
