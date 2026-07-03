package p001a0;

import androidx.compose.p007ui.input.key.AbstractC0169a;
import p034e0.C0622o0;
import p034e0.C0634u0;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.a2 */
/* loaded from: classes.dex */
public final class C0004a2 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ C0043k1 f44f;

    /* renamed from: g */
    public final /* synthetic */ C0622o0 f45g;

    /* renamed from: h */
    public final /* synthetic */ C2459w f46h;

    /* renamed from: i */
    public final /* synthetic */ boolean f47i;

    /* renamed from: j */
    public final /* synthetic */ boolean f48j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2453q f49k;

    /* renamed from: l */
    public final /* synthetic */ C0072r2 f50l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3279c f51m;

    /* renamed from: n */
    public final /* synthetic */ int f52n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004a2(C0043k1 c0043k1, C0622o0 c0622o0, C2459w c2459w, boolean z7, boolean z8, InterfaceC2453q interfaceC2453q, C0072r2 c0072r2, InterfaceC3279c interfaceC3279c, int i7) {
        super(3);
        this.f44f = c0043k1;
        this.f45g = c0622o0;
        this.f46h = c2459w;
        this.f47i = z7;
        this.f48j = z8;
        this.f49k = interfaceC2453q;
        this.f50l = c0072r2;
        this.f51m = interfaceC3279c;
        this.f52n = i7;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        c2395p.m3857Z(851809892);
        Object m3847O = c2395p.m3847O();
        C2413u0 c2413u0 = C2375k.f13421a;
        if (m3847O == c2413u0) {
            m3847O = new Object();
            c2395p.m3877j0(m3847O);
        }
        C0634u0 c0634u0 = (C0634u0) m3847O;
        Object m3847O2 = c2395p.m3847O();
        if (m3847O2 == c2413u0) {
            m3847O2 = new Object();
            c2395p.m3877j0(m3847O2);
        }
        InterfaceC3279c interfaceC3279c = this.f51m;
        int i7 = this.f52n;
        C0095y1 c0095y1 = new C0095y1(this.f44f, this.f45g, this.f46h, this.f47i, this.f48j, c0634u0, this.f49k, this.f50l, (C0082u0) m3847O2, interfaceC3279c, i7);
        boolean m3874i = c2395p.m3874i(c0095y1);
        Object m3847O3 = c2395p.m3847O();
        if (m3874i || m3847O3 == c2413u0) {
            C0098z1 c0098z1 = new C0098z1(1, c0095y1, C0095y1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 0);
            c2395p.m3877j0(c0098z1);
            m3847O3 = c0098z1;
        }
        InterfaceC3810r m387a = AbstractC0169a.m387a((InterfaceC3279c) ((AbstractC3365h) m3847O3));
        c2395p.m3888r(false);
        return m387a;
    }
}
