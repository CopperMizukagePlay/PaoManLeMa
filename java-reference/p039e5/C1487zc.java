package p039e5;

import p053g5.C1694m;
import p079k1.C2266e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zc */
/* loaded from: classes.dex */
public final /* synthetic */ class C1487zc implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f9849e;

    /* renamed from: f */
    public final /* synthetic */ C2266e f9850f;

    /* renamed from: g */
    public final /* synthetic */ int f9851g;

    public /* synthetic */ C1487zc(C2266e c2266e, int i7, int i8) {
        this.f9849e = i8;
        this.f9850f = c2266e;
        this.f9851g = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f9849e;
        C2395p c2395p = (C2395p) obj;
        ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                AbstractC1302td.m2342i(this.f9850f, c2395p, AbstractC2418w.m3957F(this.f9851g | 1));
                break;
            default:
                AbstractC0945hr.m1562F(this.f9850f, c2395p, AbstractC2418w.m3957F(this.f9851g | 1));
                break;
        }
        return C1694m.f10482a;
    }
}
