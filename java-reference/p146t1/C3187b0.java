package p146t1;

import java.util.Map;
import p150t5.InterfaceC3279c;
import p162v1.C3502g0;
import p162v1.C3534r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.b0 */
/* loaded from: classes.dex */
public final class C3187b0 implements InterfaceC3220m0 {

    /* renamed from: a */
    public final /* synthetic */ int f15917a;

    /* renamed from: b */
    public final /* synthetic */ int f15918b;

    /* renamed from: c */
    public final /* synthetic */ Map f15919c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC3279c f15920d;

    /* renamed from: e */
    public final /* synthetic */ C3190c0 f15921e;

    /* renamed from: f */
    public final /* synthetic */ C3205h0 f15922f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f15923g;

    public C3187b0(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c, C3190c0 c3190c0, C3205h0 c3205h0, InterfaceC3279c interfaceC3279c2) {
        this.f15917a = i7;
        this.f15918b = i8;
        this.f15919c = map;
        this.f15920d = interfaceC3279c;
        this.f15921e = c3190c0;
        this.f15922f = c3205h0;
        this.f15923g = interfaceC3279c2;
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: a */
    public final Map mo4882a() {
        return this.f15919c;
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: b */
    public final void mo4883b() {
        C3534r c3534r;
        C3502g0 c3502g0 = this.f15922f.f15958e;
        boolean mo4889s = this.f15921e.mo4889s();
        InterfaceC3279c interfaceC3279c = this.f15923g;
        if (mo4889s && (c3534r = c3502g0.f16872I.f16799c.f17012U) != null) {
            interfaceC3279c.mo23f(c3534r.f16979p);
        } else {
            interfaceC3279c.mo23f(c3502g0.f16872I.f16799c.f16979p);
        }
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: c */
    public final int mo4884c() {
        return this.f15918b;
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: d */
    public final InterfaceC3279c mo4885d() {
        return this.f15920d;
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: e */
    public final int mo4886e() {
        return this.f15917a;
    }
}
