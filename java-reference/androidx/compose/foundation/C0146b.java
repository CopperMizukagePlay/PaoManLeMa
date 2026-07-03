package androidx.compose.foundation;

import p028d2.C0474g;
import p085l0.C2375k;
import p085l0.C2395p;
import p107o.InterfaceC2768p0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.b */
/* loaded from: classes.dex */
public final class C0146b extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2768p0 f603f;

    /* renamed from: g */
    public final /* synthetic */ boolean f604g;

    /* renamed from: h */
    public final /* synthetic */ String f605h;

    /* renamed from: i */
    public final /* synthetic */ C0474g f606i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3277a f607j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146b(InterfaceC2768p0 interfaceC2768p0, boolean z7, String str, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        super(3);
        this.f603f = interfaceC2768p0;
        this.f604g = z7;
        this.f605h = str;
        this.f606i = c0474g;
        this.f607j = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        c2395p.m3857Z(-1525724089);
        Object m3847O = c2395p.m3847O();
        if (m3847O == C2375k.f13421a) {
            m3847O = new C3081j();
            c2395p.m3877j0(m3847O);
        }
        C3081j c3081j = (C3081j) m3847O;
        InterfaceC3810r mo5829e = AbstractC0150f.m326a(C3807o.f17991a, c3081j, this.f603f).mo5829e(new ClickableElement(c3081j, null, this.f604g, this.f605h, this.f606i, this.f607j));
        c2395p.m3888r(false);
        return mo5829e;
    }
}
