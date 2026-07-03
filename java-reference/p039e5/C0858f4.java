package p039e5;

import java.util.List;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0858f4 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f3924e;

    /* renamed from: f */
    public final /* synthetic */ List f3925f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f3926g;

    /* renamed from: h */
    public final /* synthetic */ int f3927h;

    public /* synthetic */ C0858f4(List list, InterfaceC3277a interfaceC3277a, int i7, int i8) {
        this.f3924e = i8;
        this.f3925f = list;
        this.f3926g = interfaceC3277a;
        this.f3927h = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f3924e;
        C2395p c2395p = (C2395p) obj;
        ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                AbstractC1172p7.m2065l(this.f3925f, this.f3926g, c2395p, AbstractC2418w.m3957F(this.f3927h | 1));
                break;
            default:
                AbstractC0945hr.m1578d(this.f3925f, this.f3926g, c2395p, AbstractC2418w.m3957F(this.f3927h | 1));
                break;
        }
        return C1694m.f10482a;
    }
}
