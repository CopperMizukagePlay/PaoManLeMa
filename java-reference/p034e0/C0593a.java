package p034e0;

import android.view.View;
import p000a.AbstractC0000a;
import p001a0.C0078t0;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p063i0.AbstractC2052z1;
import p065i2.AbstractC2064e;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p115p.AbstractC2831k;
import p115p.C2830j;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p145t0.C3173d;
import p146t1.AbstractC3191c1;
import p146t1.C3200f1;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p160v.C3447y0;
import p171w2.C3767q;
import p171w2.InterfaceC3774x;
import p177x0.C3807o;
import p177x0.InterfaceC3797e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.a */
/* loaded from: classes.dex */
public final class C0593a extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f1947f;

    /* renamed from: g */
    public final /* synthetic */ int f1948g;

    /* renamed from: h */
    public final /* synthetic */ Object f1949h;

    /* renamed from: i */
    public final /* synthetic */ Object f1950i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC1684c f1951j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0593a(Object obj, Object obj2, InterfaceC1684c interfaceC1684c, int i7, int i8) {
        super(2);
        this.f1947f = i8;
        this.f1949h = obj;
        this.f1950i = obj2;
        this.f1951j = interfaceC1684c;
        this.f1948g = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f1947f) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0000a.m1b((InterfaceC0617m) this.f1949h, (InterfaceC3797e) this.f1950i, (C3173d) this.f1951j, (C2395p) obj, AbstractC2418w.m3957F(this.f1948g | 1));
                return C1694m.f10482a;
            case 1:
                ((Number) obj2).intValue();
                AbstractC2052z1.m3219b((View) this.f1949h, (InterfaceC3093c) this.f1950i, (InterfaceC3277a) this.f1951j, (C2395p) obj, AbstractC2418w.m3957F(this.f1948g | 1));
                return C1694m.f10482a;
            case 2:
                ((Number) obj2).intValue();
                C2830j c2830j = (C2830j) this.f1949h;
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f1950i;
                C0078t0 c0078t0 = (C0078t0) this.f1951j;
                AbstractC2168e.m3514a(c2830j, interfaceC3277a, C3807o.f17991a, c0078t0, (C2395p) obj, AbstractC2418w.m3957F(this.f1948g | 1));
                return C1694m.f10482a;
            case 3:
                ((Number) obj2).intValue();
                AbstractC2831k.m4453c((InterfaceC3774x) this.f1949h, (InterfaceC3277a) this.f1950i, (C0078t0) this.f1951j, (C2395p) obj, AbstractC2418w.m3957F(this.f1948g | 1));
                return C1694m.f10482a;
            case 4:
                ((Number) obj2).intValue();
                AbstractC3191c1.m4890a((C3200f1) this.f1949h, (InterfaceC3810r) this.f1950i, (InterfaceC3281e) this.f1951j, (C2395p) obj, AbstractC2418w.m3957F(this.f1948g | 1));
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                ((Number) obj2).intValue();
                C3447y0 c3447y0 = (C3447y0) this.f1949h;
                C3173d c3173d = (C3173d) this.f1951j;
                int m3957F = AbstractC2418w.m3957F(this.f1948g | 1);
                c3447y0.mo5073b(this.f1950i, c3173d, (C2395p) obj, m3957F);
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                AbstractC2064e.m3231a((InterfaceC3277a) this.f1949h, (C3767q) this.f1950i, (C3173d) this.f1951j, (C2395p) obj, AbstractC2418w.m3957F(this.f1948g | 1));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0593a(C2830j c2830j, InterfaceC3277a interfaceC3277a, C0078t0 c0078t0, int i7) {
        super(2);
        this.f1947f = 2;
        this.f1949h = c2830j;
        this.f1950i = interfaceC3277a;
        this.f1951j = c0078t0;
        this.f1948g = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0593a(InterfaceC3774x interfaceC3774x, InterfaceC3277a interfaceC3277a, C0078t0 c0078t0, int i7) {
        super(2);
        this.f1947f = 3;
        this.f1949h = interfaceC3774x;
        this.f1950i = interfaceC3277a;
        this.f1951j = c0078t0;
        this.f1948g = i7;
    }
}
