package androidx.compose.p007ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.paoman.lema.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p001a0.C0024f2;
import p001a0.C0034i0;
import p001a0.C0046l0;
import p008b.C0231f;
import p011b2.C0271a;
import p011b2.C0272b;
import p053g5.C1694m;
import p063i0.C1879e0;
import p085l0.AbstractC2397p1;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2401q1;
import p085l0.C2405r1;
import p085l0.InterfaceC2425y0;
import p086l1.C2431b;
import p086l1.InterfaceC2430a;
import p100n.C2649h1;
import p118p3.AbstractC2879d;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.AbstractC3340g;
import p153u0.C3339f;
import p153u0.InterfaceC3338e;
import p158u5.AbstractC3367j;
import p160v.C3423m0;
import p170w1.AbstractC3674f1;
import p170w1.C3685i0;
import p170w1.C3686i1;
import p170w1.C3696l;
import p170w1.C3704n;
import p170w1.C3725s0;
import p170w1.C3728t;
import p170w1.ComponentCallbacks2C3689j0;
import p170w1.ComponentCallbacks2C3693k0;
import p172w3.C3781e;
import p172w3.InterfaceC3782f;
import p179x3.AbstractC3822a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a */
    public static final C2336a0 f785a = new C2336a0(C3685i0.f17548g);

    /* renamed from: b */
    public static final C2394o2 f786b = new AbstractC2397p1(C3685i0.f17549h);

    /* renamed from: c */
    public static final C2336a0 f787c = new C2336a0(C3704n.f17614j);

    /* renamed from: d */
    public static final C2394o2 f788d = new AbstractC2397p1(C3685i0.f17550i);

    /* renamed from: e */
    public static final C2394o2 f789e = new AbstractC2397p1(C3685i0.f17551j);

    /* renamed from: f */
    public static final C2394o2 f790f = new AbstractC2397p1(C3685i0.f17552k);

    /* renamed from: a */
    public static final void m398a(C3728t c3728t, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        int i8;
        int i9;
        boolean z7;
        InterfaceC2425y0 interfaceC2425y0;
        boolean areAllPrimitivesSupported;
        String str;
        LinkedHashMap linkedHashMap;
        boolean z8;
        c2395p.m3859a0(-520299287);
        if (c2395p.m3874i(c3728t)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i8 | i7;
        if (c2395p.m3874i(interfaceC3281e)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i11 = i10 | i9;
        if ((i11 & 19) != 18) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i11 & 1, z7)) {
            Context context = c3728t.getContext();
            Object m3847O = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (m3847O == obj) {
                m3847O = AbstractC2418w.m3980x(new Configuration(context.getResources().getConfiguration()));
                c2395p.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m3847O;
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj) {
                m3847O2 = new C0024f2(interfaceC2425y02, 2);
                c2395p.m3877j0(m3847O2);
            }
            c3728t.setConfigurationChangeObserver((InterfaceC3279c) m3847O2);
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == obj) {
                m3847O3 = new Object();
                c2395p.m3877j0(m3847O3);
            }
            C3725s0 c3725s0 = (C3725s0) m3847O3;
            C3696l viewTreeOwners = c3728t.getViewTreeOwners();
            if (viewTreeOwners != null) {
                InterfaceC3782f interfaceC3782f = viewTreeOwners.f17588b;
                Object m3847O4 = c2395p.m3847O();
                if (m3847O4 == obj) {
                    Object parent = c3728t.getParent();
                    AbstractC3367j.m5098c(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    String str2 = InterfaceC3338e.class.getSimpleName() + ':' + str;
                    C3781e mo520b = interfaceC3782f.mo520b();
                    Bundle m5777b = mo520b.m5777b(str2);
                    if (m5777b != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str3 : m5777b.keySet()) {
                            ArrayList parcelableArrayList = m5777b.getParcelableArrayList(str3);
                            AbstractC3367j.m5098c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                            linkedHashMap.put(str3, parcelableArrayList);
                            interfaceC2425y02 = interfaceC2425y02;
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    interfaceC2425y0 = interfaceC2425y02;
                    C3704n c3704n = C3704n.f17615k;
                    C2394o2 c2394o2 = AbstractC3340g.f16400a;
                    C3339f c3339f = new C3339f(linkedHashMap, c3704n);
                    try {
                        mo520b.m5787l(str2, new C0231f(2, c3339f));
                        z8 = true;
                    } catch (IllegalArgumentException unused) {
                        z8 = false;
                    }
                    Object c3686i1 = new C3686i1(c3339f, new C0034i0(z8, mo520b, str2, 3));
                    c2395p.m3877j0(c3686i1);
                    m3847O4 = c3686i1;
                } else {
                    interfaceC2425y0 = interfaceC2425y02;
                }
                Object obj2 = (C3686i1) m3847O4;
                boolean m3874i = c2395p.m3874i(obj2);
                Object m3847O5 = c2395p.m3847O();
                if (m3874i || m3847O5 == obj) {
                    m3847O5 = new C3423m0(8, obj2);
                    c2395p.m3877j0(m3847O5);
                }
                AbstractC2418w.m3962d(C1694m.f10482a, (InterfaceC3279c) m3847O5, c2395p);
                Object m3847O6 = c2395p.m3847O();
                if (m3847O6 == obj) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                        if (areAllPrimitivesSupported) {
                            m3847O6 = new C2431b(c3728t.getView(), 1);
                            c2395p.m3877j0(m3847O6);
                        }
                    }
                    m3847O6 = new Object();
                    c2395p.m3877j0(m3847O6);
                }
                InterfaceC2430a interfaceC2430a = (InterfaceC2430a) m3847O6;
                Configuration configuration = (Configuration) interfaceC2425y0.getValue();
                Object m3847O7 = c2395p.m3847O();
                if (m3847O7 == obj) {
                    m3847O7 = new C0271a();
                    c2395p.m3877j0(m3847O7);
                }
                C0271a c0271a = (C0271a) m3847O7;
                Object m3847O8 = c2395p.m3847O();
                Object obj3 = m3847O8;
                if (m3847O8 == obj) {
                    Configuration configuration2 = new Configuration();
                    if (configuration != null) {
                        configuration2.setTo(configuration);
                    }
                    c2395p.m3877j0(configuration2);
                    obj3 = configuration2;
                }
                Configuration configuration3 = (Configuration) obj3;
                Object m3847O9 = c2395p.m3847O();
                if (m3847O9 == obj) {
                    m3847O9 = new ComponentCallbacks2C3689j0(configuration3, c0271a);
                    c2395p.m3877j0(m3847O9);
                }
                ComponentCallbacks2C3689j0 componentCallbacks2C3689j0 = (ComponentCallbacks2C3689j0) m3847O9;
                boolean m3874i2 = c2395p.m3874i(context);
                Object m3847O10 = c2395p.m3847O();
                if (m3874i2 || m3847O10 == obj) {
                    m3847O10 = new C2649h1(17, context, componentCallbacks2C3689j0);
                    c2395p.m3877j0(m3847O10);
                }
                AbstractC2418w.m3962d(c0271a, (InterfaceC3279c) m3847O10, c2395p);
                Object m3847O11 = c2395p.m3847O();
                if (m3847O11 == obj) {
                    m3847O11 = new C0272b();
                    c2395p.m3877j0(m3847O11);
                }
                C0272b c0272b = (C0272b) m3847O11;
                Object m3847O12 = c2395p.m3847O();
                if (m3847O12 == obj) {
                    m3847O12 = new ComponentCallbacks2C3693k0(c0272b);
                    c2395p.m3877j0(m3847O12);
                }
                ComponentCallbacks2C3693k0 componentCallbacks2C3693k0 = (ComponentCallbacks2C3693k0) m3847O12;
                boolean m3874i3 = c2395p.m3874i(context);
                Object m3847O13 = c2395p.m3847O();
                if (m3874i3 || m3847O13 == obj) {
                    m3847O13 = new C2649h1(18, context, componentCallbacks2C3693k0);
                    c2395p.m3877j0(m3847O13);
                }
                AbstractC2418w.m3962d(c0272b, (InterfaceC3279c) m3847O13, c2395p);
                AbstractC2397p1 abstractC2397p1 = AbstractC3674f1.f17531v;
                AbstractC2418w.m3960b(new C2401q1[]{f785a.mo3716a((Configuration) interfaceC2425y0.getValue()), f786b.mo3716a(context), AbstractC2879d.f15050a.mo3716a(viewTreeOwners.f17587a), AbstractC3822a.f18029a.mo3716a(interfaceC3782f), AbstractC3340g.f16400a.mo3716a(obj2), f790f.mo3716a(c3728t.getView()), f788d.mo3716a(c0271a), f789e.mo3716a(c0272b), abstractC2397p1.mo3716a(Boolean.valueOf(((Boolean) c2395p.m3878k(abstractC2397p1)).booleanValue() | c3728t.getScrollCaptureInProgress$ui_release())), AbstractC3674f1.f17521l.mo3716a(interfaceC2430a)}, AbstractC3178i.m4873d(1059770793, new C0046l0(c3728t, c3725s0, interfaceC3281e, 6), c2395p), c2395p, 56);
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1879e0(i7, 14, c3728t, interfaceC3281e);
        }
    }

    /* renamed from: b */
    public static final void m399b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* renamed from: c */
    public static final C2336a0 m400c() {
        return f785a;
    }

    /* renamed from: d */
    public static final C2394o2 m401d() {
        return f790f;
    }

    public static final AbstractC2397p1 getLocalLifecycleOwner() {
        return AbstractC2879d.f15050a;
    }
}
