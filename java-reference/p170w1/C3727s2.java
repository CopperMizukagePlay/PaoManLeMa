package p170w1;

import android.view.View;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import com.paoman.lema.R;
import java.util.Set;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2338a2;
import p085l0.C2350d2;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2412u;
import p085l0.C2413u0;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3598e;
import p169w0.AbstractC3648e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.s2 */
/* loaded from: classes.dex */
public final class C3727s2 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f17693f;

    /* renamed from: g */
    public final /* synthetic */ C3731t2 f17694g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3281e f17695h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3727s2(C3731t2 c3731t2, InterfaceC3281e interfaceC3281e, int i7) {
        super(2);
        this.f17693f = i7;
        this.f17694g = c3731t2;
        this.f17695h = interfaceC3281e;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        boolean z8;
        Set set;
        View view;
        Object obj3;
        switch (this.f17693f) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (c2395p.m3849R(intValue & 1, z7)) {
                    AndroidCompositionLocals_androidKt.m398a(this.f17694g.f17785e, this.f17695h, c2395p, 0);
                } else {
                    c2395p.m3852U();
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (c2395p2.m3849R(intValue2 & 1, z8)) {
                    C3731t2 c3731t2 = this.f17694g;
                    C3728t c3728t = c3731t2.f17785e;
                    Object tag = c3728t.getTag(R.id.inspection_slot_table_set);
                    InterfaceC2313c interfaceC2313c = null;
                    if ((tag instanceof Set) && (!(tag instanceof InterfaceC3594a) || (tag instanceof InterfaceC3598e))) {
                        set = (Set) tag;
                    } else {
                        set = null;
                    }
                    if (set == null) {
                        Object parent = c3728t.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            obj3 = view.getTag(R.id.inspection_slot_table_set);
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof Set) && (!(obj3 instanceof InterfaceC3594a) || (obj3 instanceof InterfaceC3598e))) {
                            set = (Set) obj3;
                        } else {
                            set = null;
                        }
                    }
                    if (set != null) {
                        C2412u c2412u = c2395p2.f13487U;
                        if (c2412u == null) {
                            c2412u = new C2412u(c2395p2.f13495h);
                            c2395p2.f13487U = c2412u;
                        }
                        set.add(c2412u);
                        c2395p2.f13504q = true;
                        c2395p2.f13469C = true;
                        c2395p2.f13490c.m3719b();
                        c2395p2.f13474H.m3719b();
                        C2350d2 c2350d2 = c2395p2.f13475I;
                        C2338a2 c2338a2 = c2350d2.f13359a;
                        c2350d2.f13363e = c2338a2.f13338n;
                        c2350d2.f13364f = c2338a2.f13339o;
                    }
                    boolean m3874i = c2395p2.m3874i(c3731t2);
                    Object m3847O = c2395p2.m3847O();
                    C2413u0 c2413u0 = C2375k.f13421a;
                    if (m3874i || m3847O == c2413u0) {
                        m3847O = new C3723r2(c3731t2, interfaceC2313c, 0);
                        c2395p2.m3877j0(m3847O);
                    }
                    AbstractC2418w.m3965g(c3728t, c2395p2, (InterfaceC3281e) m3847O);
                    boolean m3874i2 = c2395p2.m3874i(c3731t2);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3874i2 || m3847O2 == c2413u0) {
                        m3847O2 = new C3723r2(c3731t2, interfaceC2313c, 1);
                        c2395p2.m3877j0(m3847O2);
                    }
                    AbstractC2418w.m3965g(c3728t, c2395p2, (InterfaceC3281e) m3847O2);
                    AbstractC2418w.m3959a(AbstractC3648e.f17425a.mo3716a(set), AbstractC3178i.m4873d(-280240369, new C3727s2(c3731t2, this.f17695h, 0), c2395p2), c2395p2, 56);
                } else {
                    c2395p2.m3852U();
                }
                return C1694m.f10482a;
        }
    }
}
