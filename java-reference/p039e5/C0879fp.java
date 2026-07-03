package p039e5;

import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p079k1.C2266e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fp */
/* loaded from: classes.dex */
public final /* synthetic */ class C0879fp implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f4049e = 1;

    /* renamed from: f */
    public final /* synthetic */ boolean f4050f;

    /* renamed from: g */
    public final /* synthetic */ boolean f4051g;

    /* renamed from: h */
    public final /* synthetic */ boolean f4052h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f4053i;

    /* renamed from: j */
    public final /* synthetic */ int f4054j;

    /* renamed from: k */
    public final /* synthetic */ Object f4055k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC1684c f4056l;

    public /* synthetic */ C0879fp(C2266e c2266e, boolean z7, boolean z8, boolean z9, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, int i7) {
        this.f4055k = c2266e;
        this.f4050f = z7;
        this.f4051g = z8;
        this.f4052h = z9;
        this.f4053i = interfaceC3279c;
        this.f4056l = interfaceC3279c2;
        this.f4054j = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f4049e) {
            case 0:
                ((Integer) obj2).getClass();
                int m3957F = AbstractC2418w.m3957F(7);
                AbstractC0945hr.m1582h((InterfaceC3810r) this.f4055k, this.f4050f, this.f4051g, this.f4054j, (InterfaceC3277a) this.f4056l, this.f4052h, this.f4053i, (C2395p) obj, m3957F);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0945hr.m1560D((C2266e) this.f4055k, this.f4050f, this.f4051g, this.f4052h, this.f4053i, (InterfaceC3279c) this.f4056l, (C2395p) obj, AbstractC2418w.m3957F(this.f4054j | 1));
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C0879fp(InterfaceC3810r interfaceC3810r, boolean z7, boolean z8, int i7, InterfaceC3277a interfaceC3277a, boolean z9, InterfaceC3279c interfaceC3279c, int i8) {
        this.f4055k = interfaceC3810r;
        this.f4050f = z7;
        this.f4051g = z8;
        this.f4054j = i7;
        this.f4056l = interfaceC3277a;
        this.f4052h = z9;
        this.f4053i = interfaceC3279c;
    }
}
