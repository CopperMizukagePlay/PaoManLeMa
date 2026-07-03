package p039e5;

import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wd */
/* loaded from: classes.dex */
public final /* synthetic */ class C1395wd implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f8346e;

    /* renamed from: f */
    public final /* synthetic */ int f8347f;

    /* renamed from: g */
    public final /* synthetic */ Object f8348g;

    public /* synthetic */ C1395wd(int i7, InterfaceC1684c interfaceC1684c, int i8, int i9) {
        this.f8346e = i9;
        this.f8347f = i7;
        this.f8348g = interfaceC1684c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f8346e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(49);
                AbstractC1249rm.m2280q(this.f8347f, (InterfaceC3277a) this.f8348g, (C2395p) obj, m3957F);
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC1092mk.m1669G((C0976ir) this.f8348g, (C2395p) obj, AbstractC2418w.m3957F(this.f8347f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int m3957F2 = AbstractC2418w.m3957F(1);
                AbstractC0945hr.m1561E(this.f8347f, (InterfaceC3279c) this.f8348g, (C2395p) obj, m3957F2);
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1395wd(C0976ir c0976ir, int i7) {
        this.f8346e = 1;
        this.f8348g = c0976ir;
        this.f8347f = i7;
    }
}
