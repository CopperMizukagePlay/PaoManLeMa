package p039e5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.lifecycle.C0196k0;
import com.paoman.lema.MainActivity;
import p000a.AbstractC0000a;
import p017c.C0321f;
import p046f5.AbstractC1540e;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.le */
/* loaded from: classes.dex */
public final class C1055le implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5482e = 0;

    /* renamed from: f */
    public final /* synthetic */ C2345c1 f5483f;

    /* renamed from: g */
    public final /* synthetic */ Context f5484g;

    /* renamed from: h */
    public final /* synthetic */ MainActivity f5485h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC1540e f5486i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f5487j;

    /* renamed from: k */
    public final /* synthetic */ C2349d1 f5488k;

    /* renamed from: l */
    public final /* synthetic */ C2349d1 f5489l;

    public C1055le(Context context, MainActivity mainActivity, AbstractC1540e abstractC1540e, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1, C2349d1 c2349d12, C2345c1 c2345c1) {
        this.f5484g = context;
        this.f5485h = mainActivity;
        this.f5486i = abstractC1540e;
        this.f5487j = interfaceC2425y0;
        this.f5488k = c2349d1;
        this.f5489l = c2349d12;
        this.f5483f = c2345c1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        switch (this.f5482e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    c2395p.m3857Z(-1943980751);
                    Object m3847O = c2395p.m3847O();
                    Context context = this.f5484g;
                    C2413u0 c2413u0 = C2375k.f13421a;
                    if (m3847O == c2413u0) {
                        AbstractC3367j.m5100e(context, "context");
                        SharedPreferences sharedPreferences = context.getSharedPreferences("legal_consent", 0);
                        if (sharedPreferences.getBoolean("accepted", false) && sharedPreferences.getInt("accepted_version", 0) >= 2) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        m3847O = AbstractC2418w.m3980x(Boolean.valueOf(z7));
                        c2395p.m3877j0(m3847O);
                    }
                    InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
                    c2395p.m3888r(false);
                    boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                    MainActivity mainActivity = this.f5485h;
                    if (!booleanValue) {
                        c2395p.m3857Z(-133695781);
                        c2395p.m3857Z(-1943972823);
                        boolean m3874i = c2395p.m3874i(context);
                        Object m3847O2 = c2395p.m3847O();
                        if (m3874i || m3847O2 == c2413u0) {
                            m3847O2 = new C1045l4(context, interfaceC2425y0, 9);
                            c2395p.m3877j0(m3847O2);
                        }
                        InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O2;
                        c2395p.m3888r(false);
                        c2395p.m3857Z(-1943966258);
                        boolean m3870g = c2395p.m3870g(mainActivity);
                        Object m3847O3 = c2395p.m3847O();
                        if (m3870g || m3847O3 == c2413u0) {
                            m3847O3 = new C0196k0(mainActivity, 6);
                            c2395p.m3877j0(m3847O3);
                        }
                        c2395p.m3888r(false);
                        AbstractC1249rm.m2274n(interfaceC3277a, (InterfaceC3277a) m3847O3, c2395p, 0);
                        c2395p.m3888r(false);
                    } else {
                        c2395p.m3857Z(-133313489);
                        Intent intent = (Intent) mainActivity.f1566x.getValue();
                        c2395p.m3857Z(-1943958910);
                        boolean m3870g2 = c2395p.m3870g(mainActivity);
                        Object m3847O4 = c2395p.m3847O();
                        if (m3870g2 || m3847O4 == c2413u0) {
                            m3847O4 = new C0196k0(mainActivity, 7);
                            c2395p.m3877j0(m3847O4);
                        }
                        InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) m3847O4;
                        c2395p.m3888r(false);
                        c2395p.m3857Z(-1943954046);
                        InterfaceC2425y0 interfaceC2425y02 = this.f5487j;
                        boolean m3870g3 = c2395p.m3870g(interfaceC2425y02);
                        C2349d1 c2349d1 = this.f5488k;
                        boolean m3870g4 = m3870g3 | c2395p.m3870g(c2349d1);
                        C2349d1 c2349d12 = this.f5489l;
                        boolean m3870g5 = m3870g4 | c2395p.m3870g(c2349d12) | c2395p.m3874i(context);
                        Object m3847O5 = c2395p.m3847O();
                        if (m3870g5 || m3847O5 == c2413u0) {
                            m3847O5 = new C1268sa(context, interfaceC2425y02, c2349d1, c2349d12);
                            c2395p.m3877j0(m3847O5);
                        }
                        InterfaceC3279c interfaceC3279c = (InterfaceC3279c) m3847O5;
                        c2395p.m3888r(false);
                        C2345c1 c2345c1 = this.f5483f;
                        float m3729g = c2345c1.m3729g();
                        c2395p.m3857Z(-1943936938);
                        boolean m3870g6 = c2395p.m3870g(c2345c1) | c2395p.m3874i(context);
                        Object m3847O6 = c2395p.m3847O();
                        if (m3870g6 || m3847O6 == c2413u0) {
                            m3847O6 = new C0321f(6, context, c2345c1);
                            c2395p.m3877j0(m3847O6);
                        }
                        c2395p.m3888r(false);
                        AbstractC1092mk.m1694L(intent, interfaceC3277a2, this.f5486i, interfaceC3279c, m3729g, (InterfaceC3279c) m3847O6, c2395p, 0);
                        c2395p.m3888r(false);
                    }
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC0000a.m2c(this.f5483f.m3729g(), AbstractC3178i.m4873d(-554836003, new C1055le(this.f5484g, this.f5485h, this.f5486i, this.f5487j, this.f5488k, this.f5489l, this.f5483f), c2395p2), c2395p2, 48);
                }
                return C1694m.f10482a;
        }
    }

    public C1055le(C2345c1 c2345c1, Context context, MainActivity mainActivity, AbstractC1540e abstractC1540e, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1, C2349d1 c2349d12) {
        this.f5483f = c2345c1;
        this.f5484g = context;
        this.f5485h = mainActivity;
        this.f5486i = abstractC1540e;
        this.f5487j = interfaceC2425y0;
        this.f5488k = c2349d1;
        this.f5489l = c2349d12;
    }
}
