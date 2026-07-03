package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC0150f;
import p028d2.C0474g;
import p043f2.EnumC1533a;
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
/* renamed from: androidx.compose.foundation.selection.c */
/* loaded from: classes.dex */
public final class C0162c extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2768p0 f714f;

    /* renamed from: g */
    public final /* synthetic */ EnumC1533a f715g;

    /* renamed from: h */
    public final /* synthetic */ boolean f716h;

    /* renamed from: i */
    public final /* synthetic */ C0474g f717i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3277a f718j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162c(C0474g c0474g, EnumC1533a enumC1533a, InterfaceC2768p0 interfaceC2768p0, InterfaceC3277a interfaceC3277a, boolean z7) {
        super(3);
        this.f714f = interfaceC2768p0;
        this.f715g = enumC1533a;
        this.f716h = z7;
        this.f717i = c0474g;
        this.f718j = interfaceC3277a;
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
        InterfaceC3810r mo5829e = AbstractC0150f.m326a(C3807o.f17991a, c3081j, this.f714f).mo5829e(new TriStateToggleableElement(this.f715g, c3081j, null, this.f716h, this.f717i, this.f718j));
        c2395p.m3888r(false);
        return mo5829e;
    }
}
