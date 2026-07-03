package p039e5;

import androidx.compose.p007ui.input.pointer.PointerInputEventHandler;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p066i3.AbstractC2067b;
import p082k5.InterfaceC2313c;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p117p1.InterfaceC2872w;
import p122q.AbstractC2963z;
import p122q.C2957x;
import p150t5.InterfaceC3282f;
import p152u.C3330r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.oh */
/* loaded from: classes.dex */
public final class C1151oh implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ C3330r f6557a;

    /* renamed from: b */
    public final /* synthetic */ C1189po f6558b;

    /* renamed from: c */
    public final /* synthetic */ C2345c1 f6559c;

    /* renamed from: d */
    public final /* synthetic */ C2349d1 f6560d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2425y0 f6561e;

    /* renamed from: f */
    public final /* synthetic */ C2349d1 f6562f;

    /* renamed from: g */
    public final /* synthetic */ C2345c1 f6563g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3282f f6564h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC0516a0 f6565i;

    /* renamed from: j */
    public final /* synthetic */ float f6566j;

    public C1151oh(C3330r c3330r, C1189po c1189po, C2345c1 c2345c1, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d12, C2345c1 c2345c12, InterfaceC3282f interfaceC3282f, InterfaceC0516a0 interfaceC0516a0, float f7) {
        this.f6557a = c3330r;
        this.f6558b = c1189po;
        this.f6559c = c2345c1;
        this.f6560d = c2349d1;
        this.f6561e = interfaceC2425y0;
        this.f6562f = c2349d12;
        this.f6563g = c2345c12;
        this.f6564h = interfaceC3282f;
        this.f6565i = interfaceC0516a0;
        this.f6566j = f7;
    }

    @Override // androidx.compose.p007ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2872w interfaceC2872w, InterfaceC2313c interfaceC2313c) {
        C3330r c3330r = this.f6557a;
        C1189po c1189po = this.f6558b;
        C2345c1 c2345c1 = this.f6559c;
        C2349d1 c2349d1 = this.f6560d;
        InterfaceC2425y0 interfaceC2425y0 = this.f6561e;
        C2349d1 c2349d12 = this.f6562f;
        C2345c1 c2345c12 = this.f6563g;
        C0996jh c0996jh = new C0996jh(c3330r, c1189po, c2345c1, c2349d1, interfaceC2425y0, c2349d12, c2345c12);
        InterfaceC3282f interfaceC3282f = this.f6564h;
        C1027kh c1027kh = new C1027kh(interfaceC3282f, c2349d1, c2349d12, c2345c12);
        C1058lh c1058lh = new C1058lh(c2349d1, c2349d12, c2345c12, 0);
        C1120nh c1120nh = new C1120nh(c3330r, interfaceC3282f, this.f6565i, c2349d1, c2345c12, c2345c1, interfaceC2425y0, c2349d12, this.f6566j);
        float f7 = AbstractC2963z.f15361a;
        Object m3282g = AbstractC2067b.m3282g(interfaceC2872w, new C2957x(c0996jh, c1027kh, c1058lh, c1120nh, (InterfaceC2313c) null), interfaceC2313c);
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m3282g != enumC2465a) {
            m3282g = c1694m;
        }
        if (m3282g == enumC2465a) {
            return m3282g;
        }
        return c1694m;
    }
}
