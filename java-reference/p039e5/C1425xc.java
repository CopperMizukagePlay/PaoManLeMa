package p039e5;

import p035e1.AbstractC0663k0;
import p053g5.C1694m;
import p079k1.C2266e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xc */
/* loaded from: classes.dex */
public final /* synthetic */ class C1425xc implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f8647e = 2;

    /* renamed from: f */
    public final /* synthetic */ String f8648f;

    /* renamed from: g */
    public final /* synthetic */ boolean f8649g;

    /* renamed from: h */
    public final /* synthetic */ Object f8650h;

    /* renamed from: i */
    public final /* synthetic */ boolean f8651i;

    /* renamed from: j */
    public final /* synthetic */ int f8652j;

    /* renamed from: k */
    public final /* synthetic */ Object f8653k;

    /* renamed from: l */
    public final /* synthetic */ Object f8654l;

    public /* synthetic */ C1425xc(String str, String str2, C2266e c2266e, boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, int i7) {
        this.f8648f = str;
        this.f8653k = str2;
        this.f8650h = c2266e;
        this.f8649g = z7;
        this.f8651i = z8;
        this.f8654l = interfaceC3279c;
        this.f8652j = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f8647e) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC1302td.m2346m(this.f8649g, this.f8648f, (String) this.f8653k, this.f8651i, (InterfaceC3277a) this.f8650h, (InterfaceC3277a) this.f8654l, (C2395p) obj, AbstractC2418w.m3957F(this.f8652j | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0945hr.m1566J(this.f8648f, this.f8649g, (AbstractC0663k0) this.f8653k, (InterfaceC3277a) this.f8650h, this.f8651i, (InterfaceC3810r) this.f8654l, (C2395p) obj, AbstractC2418w.m3957F(this.f8652j | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC0945hr.m1558B(this.f8648f, (String) this.f8653k, (C2266e) this.f8650h, this.f8649g, this.f8651i, (InterfaceC3279c) this.f8654l, (C2395p) obj, AbstractC2418w.m3957F(this.f8652j | 1));
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1425xc(String str, boolean z7, AbstractC0663k0 abstractC0663k0, InterfaceC3277a interfaceC3277a, boolean z8, InterfaceC3810r interfaceC3810r, int i7) {
        this.f8648f = str;
        this.f8649g = z7;
        this.f8653k = abstractC0663k0;
        this.f8650h = interfaceC3277a;
        this.f8651i = z8;
        this.f8654l = interfaceC3810r;
        this.f8652j = i7;
    }

    public /* synthetic */ C1425xc(boolean z7, String str, String str2, boolean z8, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, int i7) {
        this.f8649g = z7;
        this.f8648f = str;
        this.f8653k = str2;
        this.f8651i = z8;
        this.f8650h = interfaceC3277a;
        this.f8654l = interfaceC3277a2;
        this.f8652j = i7;
    }
}
