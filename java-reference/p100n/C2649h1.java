package p100n;

import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.p007ui.layout.AbstractC0173b;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.EnumC0203o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p001a0.C0008b2;
import p018c0.C0354x;
import p018c0.InputConnectionC0356z;
import p019c1.C0367k;
import p027d1.C0464b;
import p035e1.AbstractC0670o;
import p035e1.C0649d0;
import p035e1.C0660j;
import p047f6.C1548c;
import p049g1.InterfaceC1570d;
import p051g3.AbstractC1643l;
import p051g3.AbstractC1653q;
import p053g5.C1694m;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p063i0.C2008t5;
import p063i0.C2016u5;
import p065i2.AbstractC2064e;
import p071j0.C2146q;
import p071j0.C2150s;
import p073j2.AbstractC2168e;
import p077k.C2184c0;
import p077k.C2194h0;
import p085l0.C2345c1;
import p085l0.C2369i1;
import p085l0.InterfaceC2425y0;
import p087l2.C2460x;
import p087l2.InputConnectionC2449m;
import p096m3.C2572v;
import p101n0.C2705e;
import p107o.InterfaceC2739f1;
import p117p1.C2868s;
import p117p1.C2874y;
import p117p1.C2875z;
import p117p1.EnumC2873x;
import p122q.AbstractC2907g0;
import p122q.AbstractC2913i0;
import p122q.C2890a2;
import p122q.C2891b;
import p122q.C2910h0;
import p122q.C2912i;
import p122q.C2919k0;
import p122q.C2923l1;
import p122q.C2929n1;
import p122q.C2933p;
import p122q.C2939r;
import p122q.EnumC2931o0;
import p124q1.C2982c;
import p124q1.C2983d;
import p137s.C3081j;
import p137s.InterfaceC3079h;
import p139s1.AbstractC3088a;
import p140s2.C3100j;
import p140s2.C3107q;
import p140s2.EnumC3103m;
import p144t.AbstractC3122c;
import p144t.C3161v0;
import p144t.RunnableC3168z;
import p145t0.C3173d;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.AbstractC3243x0;
import p146t1.C3218l1;
import p146t1.C3221m1;
import p146t1.C3224o;
import p146t1.C3241w0;
import p146t1.C3247z0;
import p146t1.InterfaceC3215k1;
import p146t1.InterfaceC3238v;
import p146t1.RunnableC3226p;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p160v.C3447y0;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3526o0;
import p162v1.C3491c2;
import p162v1.C3502g0;
import p162v1.C3508i0;
import p162v1.C3517l0;
import p168w.C3625h;
import p170w1.AbstractC3674f1;
import p170w1.AbstractC3681h0;
import p170w1.C3696l;
import p170w1.C3701m0;
import p170w1.C3705n0;
import p170w1.C3717q0;
import p170w1.C3718q1;
import p170w1.C3727s2;
import p170w1.C3731t2;
import p170w1.ChoreographerFrameCallbackC3721r0;
import p170w1.ComponentCallbacks2C3689j0;
import p170w1.ComponentCallbacks2C3693k0;
import p170w1.InterfaceC3679g2;
import p171w2.C3771u;
import p171w2.InterfaceC3774x;
import p177x0.C3813u;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.h1 */
/* loaded from: classes.dex */
public final class C2649h1 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f14323f;

    /* renamed from: g */
    public final /* synthetic */ Object f14324g;

    /* renamed from: h */
    public final /* synthetic */ Object f14325h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2649h1(int i7, Object obj, Object obj2) {
        super(1);
        this.f14323f = i7;
        this.f14324g = obj;
        this.f14325h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v40, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v54, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v55, types: [android.view.ViewParent] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        EnumC2873x enumC2873x;
        float m4801b;
        float m4802c;
        float f7;
        float m1008d;
        float m3729g;
        float f8;
        int i7;
        long m1005a;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        InputConnectionC0356z inputConnectionC0356z;
        ?? m5688o;
        Float f9 = null;
        long j6 = 4294967295L;
        char c7 = ' ';
        int i13 = 0;
        boolean z7 = false;
        int i14 = 1;
        switch (this.f14323f) {
            case 0:
                C2643f1 c2643f1 = (C2643f1) this.f14324g;
                C2643f1 c2643f12 = (C2643f1) this.f14325h;
                c2643f1.f14314j.add(c2643f12);
                return new C0008b2(6, c2643f1, c2643f12);
            case 1:
                return new C0008b2(7, (C2643f1) this.f14324g, (C2631b1) this.f14325h);
            case 2:
                C2643f1 c2643f13 = (C2643f1) this.f14324g;
                C2637d1 c2637d1 = (C2637d1) this.f14325h;
                c2643f13.f14313i.add(c2637d1);
                return new C0008b2(8, c2643f13, c2637d1);
            case 3:
                C3508i0 c3508i0 = (C3508i0) obj;
                c3508i0.m5460a();
                InterfaceC1570d.m2541T(c3508i0, ((C0649d0) this.f14324g).f2132a, (AbstractC0670o) this.f14325h, 0.0f, null, 60);
                return C1694m.f10482a;
            case 4:
                C3508i0 c3508i02 = (C3508i0) obj;
                c3508i02.m5460a();
                InterfaceC1570d.m2541T(c3508i02, (C0660j) this.f14324g, (AbstractC0670o) this.f14325h, 0.0f, null, 60);
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                ((C3081j) this.f14324g).m4748c((InterfaceC3079h) this.f14325h);
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                C2874y c2874y = (C2874y) this.f14325h;
                if (motionEvent.getActionMasked() == 0) {
                    C2572v c2572v = (C2572v) this.f14324g;
                    if (((Boolean) ((C2875z) c2874y.m4552h()).mo23f(motionEvent)).booleanValue()) {
                        enumC2873x = EnumC2873x.f15036f;
                    } else {
                        enumC2873x = EnumC2873x.f15037g;
                    }
                    c2572v.f13967f = enumC2873x;
                } else {
                    ((C2875z) c2874y.m4552h()).mo23f(motionEvent);
                }
                return C1694m.f10482a;
            case 7:
                ((C2891b) this.f14324g).f15099a.m4308j((C2912i) this.f14325h);
                return C1694m.f10482a;
            case 8:
                C2983d c2983d = (C2983d) this.f14324g;
                C2982c c2982c = c2983d.f15414b;
                C2982c c2982c2 = c2983d.f15413a;
                AbstractC2168e.m3523j(c2983d, (C2868s) obj);
                AbstractC2907g0 abstractC2907g0 = (AbstractC2907g0) this.f14325h;
                float mo5676a = ((InterfaceC3679g2) AbstractC3498f.m5369i(abstractC2907g0, AbstractC3674f1.f17528s)).mo5676a();
                long m3522i = AbstractC2168e.m3522i(mo5676a, mo5676a);
                if (C3107q.m4801b(m3522i) <= 0.0f || C3107q.m4802c(m3522i) <= 0.0f) {
                    AbstractC3088a.m4750b("maximumVelocity should be a positive value. You specified=" + ((Object) C3107q.m4806g(m3522i)));
                }
                long m3522i2 = AbstractC2168e.m3522i(c2982c2.m4640b(C3107q.m4801b(m3522i)), c2982c.m4640b(C3107q.m4802c(m3522i)));
                AbstractC1804l.m3023P(r9, 0, c2982c2.f15408c.length);
                c2982c2.f15409d = 0;
                AbstractC1804l.m3023P(r6, 0, c2982c.f15408c.length);
                c2982c.f15409d = 0;
                c2983d.f15415c = 0L;
                C1548c c1548c = abstractC2907g0.f15154y;
                if (c1548c != null) {
                    C2910h0 c2910h0 = AbstractC2913i0.f15176a;
                    if (Float.isNaN(C3107q.m4801b(m3522i2))) {
                        m4801b = 0.0f;
                    } else {
                        m4801b = C3107q.m4801b(m3522i2);
                    }
                    if (Float.isNaN(C3107q.m4802c(m3522i2))) {
                        m4802c = 0.0f;
                    } else {
                        m4802c = C3107q.m4802c(m3522i2);
                    }
                    c1548c.mo2505v(new C2939r(AbstractC2168e.m3522i(m4801b, m4802c)));
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                C2008t5 c2008t5 = (C2008t5) this.f14324g;
                C2919k0 c2919k0 = (C2919k0) this.f14325h;
                long j7 = ((C2933p) obj).f15248a;
                if (c2919k0.f15209H) {
                    f7 = -1.0f;
                } else {
                    f7 = 1.0f;
                }
                long m1012h = C0464b.m1012h(f7, j7);
                EnumC2931o0 enumC2931o0 = c2919k0.f15205D;
                C2910h0 c2910h02 = AbstractC2913i0.f15176a;
                if (enumC2931o0 == EnumC2931o0.f15240e) {
                    m1008d = C0464b.m1009e(m1012h);
                } else {
                    m1008d = C0464b.m1008d(m1012h);
                }
                switch (c2008t5.f11868a) {
                    case 0:
                        ((C2016u5) c2008t5.f11869b).m3185b(m1008d);
                        break;
                    default:
                        C2150s c2150s = (C2150s) c2008t5.f11869b;
                        C2146q c2146q = c2150s.f12519l;
                        C2345c1 c2345c1 = c2150s.f12515h;
                        if (Float.isNaN(c2345c1.m3729g())) {
                            m3729g = 0.0f;
                        } else {
                            m3729g = c2345c1.m3729g();
                        }
                        float f10 = m3729g + m1008d;
                        Collection values = c2150s.m3487d().f12415a.values();
                        AbstractC3367j.m5100e(values, "<this>");
                        Iterator it = values.iterator();
                        if (it.hasNext()) {
                            float floatValue = ((Number) it.next()).floatValue();
                            while (it.hasNext()) {
                                floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
                            }
                            f9 = Float.valueOf(floatValue);
                        }
                        float f11 = Float.NaN;
                        if (f9 != null) {
                            f8 = f9.floatValue();
                        } else {
                            f8 = Float.NaN;
                        }
                        Float m3055s0 = AbstractC1805m.m3055s0(c2150s.m3487d().f12415a.values());
                        if (m3055s0 != null) {
                            f11 = m3055s0.floatValue();
                        }
                        c2146q.m3483a(AbstractC2168e.m3529p(f10, f8, f11), 0.0f);
                        break;
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15760e /* 10 */:
                C2923l1 c2923l1 = (C2923l1) this.f14324g;
                C2929n1 c2929n1 = (C2929n1) this.f14325h;
                long j8 = ((C2933p) obj).f15248a;
                if (c2929n1.f15232d == EnumC2931o0.f15241f) {
                    i7 = 1;
                    m1005a = C0464b.m1005a(j8, 0.0f, 1);
                } else {
                    i7 = 1;
                    m1005a = C0464b.m1005a(j8, 0.0f, 2);
                }
                C2929n1 c2929n12 = c2923l1.f15214a;
                c2929n12.f15235g = i7;
                InterfaceC2739f1 interfaceC2739f1 = c2929n12.f15230b;
                if (interfaceC2739f1 != null && (c2929n12.f15229a.mo115d() || c2929n12.f15229a.mo113b())) {
                    interfaceC2739f1.mo4392c(m1005a, c2929n12.f15235g, c2929n12.f15238j);
                } else {
                    C2929n1.m4588a(c2929n12, c2929n12.f15236h, m1005a, 1);
                }
                return C1694m.f10482a;
            case 11:
                ((Number) obj).longValue();
                C2890a2 c2890a2 = (C2890a2) this.f14324g;
                float f12 = c2890a2.f15098e;
                c2890a2.f15098e = 0.0f;
                ((InterfaceC3279c) this.f14325h).mo23f(Float.valueOf(f12));
                return C1694m.f10482a;
            case 12:
                C3161v0 c3161v0 = (C3161v0) this.f14324g;
                ?? r22 = (View) this.f14325h;
                RunnableC3168z runnableC3168z = c3161v0.f15866t;
                if (c3161v0.f15865s == 0) {
                    int i15 = AbstractC1653q.f10423a;
                    AbstractC1643l.m2651b(r22, runnableC3168z);
                    if (r22.isAttachedToWindow()) {
                        r22.requestApplyInsets();
                    }
                    r22.addOnAttachStateChangeListener(runnableC3168z);
                    AbstractC1653q.m2699b(r22, runnableC3168z);
                }
                c3161v0.f15865s++;
                return new C0008b2(9, c3161v0, r22);
            case 13:
                C3517l0 c3517l0 = (C3517l0) obj;
                C3247z0 c3247z0 = (C3247z0) this.f14324g;
                if (c3247z0.f16068s.f16028k.m3741g() > 0) {
                    c3517l0.f16957e = true;
                    AbstractC3526o0 abstractC3526o0 = c3517l0.f16960h;
                    InterfaceC3238v mo5315A0 = abstractC3526o0.mo5315A0();
                    if (C3100j.m4783a(c3517l0.f16958f, 9223372034707292159L)) {
                        c3517l0.f16958f = AbstractC2064e.m3225F(mo5315A0.mo4931d(0L));
                        c3517l0.f16959g = mo5315A0.mo4926S();
                    }
                    abstractC3526o0.mo5317C0().f16873J.m5466b();
                    long mo4926S = mo5315A0.mo4926S();
                    C2194h0 c2194h0 = ((RunnableC3226p) this.f14325h).f16027j;
                    int i16 = (int) (mo4926S >> 32);
                    int i17 = (int) (mo4926S & 4294967295L);
                    for (InterfaceC3215k1 interfaceC3215k1 : AbstractC0173b.f782b) {
                        Object m3592g = c2194h0.m3592g(interfaceC3215k1);
                        AbstractC3367j.m5097b(m3592g);
                        C3221m1 c3221m1 = (C3221m1) m3592g;
                        C3218l1 c3218l1 = (C3218l1) interfaceC3215k1;
                        AbstractC0173b.m396a(c3517l0, c3218l1.f15998c, c3221m1.f16009h, i16, i17);
                        if (((Boolean) c3221m1.f16003b.getValue()).booleanValue()) {
                            AbstractC0173b.m396a(c3517l0, c3221m1.f16007f, c3221m1.f16011j, i16, i17);
                            AbstractC0173b.m396a(c3517l0, c3221m1.f16008g, c3221m1.f16012k, i16, i17);
                        }
                        AbstractC0173b.m396a(c3517l0, c3218l1.f15999d, c3221m1.f16010i, i16, i17);
                    }
                    if (c3247z0.f16068s.f16029l.m3563h()) {
                        C2184c0 c2184c0 = c3247z0.f16068s.f16029l;
                        Object[] objArr = c2184c0.f12628a;
                        int i18 = c2184c0.f12629b;
                        for (int i19 = 0; i19 < i18; i19++) {
                            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) objArr[i19];
                            C3224o c3224o = (C3224o) c3247z0.f16068s.f16030m.get(i19);
                            Rect rect = (Rect) interfaceC2425y0.getValue();
                            c3517l0.m5475a(c3224o.m4943b(), rect.left);
                            c3517l0.m5475a(c3224o.m4945d(), rect.top);
                            c3517l0.m5475a(c3224o.m4944c(), rect.right);
                            c3517l0.m5475a(c3224o.m4942a(), rect.bottom);
                        }
                    }
                }
                return C1694m.f10482a;
            case 14:
                C3447y0 c3447y0 = (C3447y0) this.f14324g;
                LinkedHashSet linkedHashSet = c3447y0.f16660g;
                Object obj2 = this.f14325h;
                linkedHashSet.remove(obj2);
                return new C0008b2(10, c3447y0, obj2);
            case AbstractC3122c.f15762g /* 15 */:
                ((C3502g0) this.f14324g).m5432g0(((InterfaceC3810r) obj).mo5829e((InterfaceC3810r) this.f14325h));
                return C1694m.f10482a;
            case 16:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                ArrayList arrayList2 = (ArrayList) this.f14324g;
                int size = arrayList2.size();
                int i20 = 0;
                while (i20 < size) {
                    C3625h c3625h = (C3625h) arrayList2.get(i20);
                    List list = c3625h.f17303b;
                    boolean z8 = c3625h.f17310i;
                    if (c3625h.f17314m != Integer.MIN_VALUE) {
                        int size2 = list.size();
                        int i21 = i13;
                        while (i21 < size2) {
                            long j9 = j6;
                            AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) list.get(i21);
                            int[] iArr = c3625h.f17312k;
                            int i22 = i21 * 2;
                            char c8 = c7;
                            long m3234d = AbstractC2064e.m3234d(iArr[i22], iArr[i22 + 1]);
                            if (c3625h.f17309h) {
                                if (z8) {
                                    i10 = (int) (m3234d >> c8);
                                } else {
                                    int i23 = c3625h.f17314m - ((int) (m3234d >> c8));
                                    if (z8) {
                                        i9 = abstractC3239v0.f16054f;
                                    } else {
                                        i9 = abstractC3239v0.f16053e;
                                    }
                                    i10 = i23 - i9;
                                }
                                if (z8) {
                                    int i24 = c3625h.f17314m - ((int) (m3234d & j9));
                                    if (z8) {
                                        i12 = abstractC3239v0.f16054f;
                                    } else {
                                        i12 = abstractC3239v0.f16053e;
                                    }
                                    i11 = i24 - i12;
                                } else {
                                    i11 = (int) (m3234d & j9);
                                }
                                m3234d = AbstractC2064e.m3234d(i10, i11);
                            }
                            long m4785c = C3100j.m4785c(m3234d, c3625h.f17304c);
                            if (z8) {
                                AbstractC3237u0.m4954p(abstractC3237u0, abstractC3239v0, m4785c);
                                arrayList = arrayList2;
                                i8 = size;
                            } else {
                                int i25 = AbstractC3243x0.f16063b;
                                C3241w0 c3241w0 = C3241w0.f16059g;
                                if (abstractC3237u0.mo4914e() == EnumC3103m.f15703e || abstractC3237u0.mo4915f() == 0) {
                                    arrayList = arrayList2;
                                    i8 = size;
                                    AbstractC3237u0.m4948a(abstractC3237u0, abstractC3239v0);
                                    abstractC3239v0.mo4940o0(C3100j.m4785c(m4785c, abstractC3239v0.f16057i), 0.0f, c3241w0);
                                } else {
                                    arrayList = arrayList2;
                                    i8 = size;
                                    int mo4915f = (abstractC3237u0.mo4915f() - abstractC3239v0.f16053e) - ((int) (m4785c >> c8));
                                    AbstractC3237u0.m4948a(abstractC3237u0, abstractC3239v0);
                                    abstractC3239v0.mo4940o0(C3100j.m4785c((((int) (m4785c & j9)) & j9) | (mo4915f << c8), abstractC3239v0.f16057i), 0.0f, c3241w0);
                                }
                            }
                            i21++;
                            arrayList2 = arrayList;
                            size = i8;
                            j6 = j9;
                            c7 = c8;
                        }
                        i20++;
                        i13 = 0;
                    } else {
                        throw new IllegalArgumentException("position() should be called first");
                    }
                }
                ((InterfaceC2425y0) this.f14325h).getValue();
                return C1694m.f10482a;
            case 17:
                Context context = (Context) this.f14324g;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C3689j0 componentCallbacks2C3689j0 = (ComponentCallbacks2C3689j0) this.f14325h;
                applicationContext.registerComponentCallbacks(componentCallbacks2C3689j0);
                return new C0008b2(11, context, componentCallbacks2C3689j0);
            case 18:
                Context context2 = (Context) this.f14324g;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C3693k0 componentCallbacks2C3693k0 = (ComponentCallbacks2C3693k0) this.f14325h;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C3693k0);
                return new C0008b2(12, context2, componentCallbacks2C3693k0);
            case 19:
                return new C3718q1((C0354x) this.f14324g, new C3701m0(0, (C3705n0) this.f14325h));
            case 20:
                C3718q1 c3718q1 = (C3718q1) this.f14324g;
                synchronized (c3718q1.f17677c) {
                    try {
                        c3718q1.f17679e = true;
                        C2705e c2705e = c3718q1.f17678d;
                        Object[] objArr2 = c2705e.f14517e;
                        int i26 = c2705e.f14519g;
                        for (int i27 = 0; i27 < i26; i27++) {
                            InputConnectionC2449m inputConnectionC2449m = (InputConnectionC2449m) ((C3491c2) objArr2[i27]).get();
                            if (inputConnectionC2449m != null && (inputConnectionC0356z = inputConnectionC2449m.f13707b) != null) {
                                inputConnectionC2449m.m4022a(inputConnectionC0356z);
                                inputConnectionC2449m.f13707b = null;
                            }
                        }
                        c3718q1.f17678d.m4305g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C2460x c2460x = ((C3705n0) this.f14325h).f17618f;
                c2460x.f13727b.set(null);
                c2460x.f13726a.mo688g();
                return C1694m.f10482a;
            case 21:
                C3717q0 c3717q0 = (C3717q0) this.f14324g;
                ChoreographerFrameCallbackC3721r0 choreographerFrameCallbackC3721r0 = (ChoreographerFrameCallbackC3721r0) this.f14325h;
                synchronized (c3717q0.f17667i) {
                    c3717q0.f17669k.remove(choreographerFrameCallbackC3721r0);
                }
                return C1694m.f10482a;
            case 22:
                ((Choreographer) ((C2369i1) this.f14324g).f13412f).removeFrameCallback((ChoreographerFrameCallbackC3721r0) this.f14325h);
                return C1694m.f10482a;
            case 23:
                View view = (View) obj;
                View view2 = (View) this.f14324g;
                C0367k c0367k = new C0367k(view.getNextFocusForwardId(), 3);
                View view3 = null;
                while (true) {
                    m5688o = AbstractC3681h0.m5688o(view, c0367k, view3);
                    if (m5688o == 0 && view != view2) {
                        ?? parent = view.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view4 = (View) parent;
                            view3 = view;
                            view = view4;
                        }
                    }
                }
                f9 = m5688o;
                if (f9 == ((View) this.f14325h)) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 24:
                C3696l c3696l = (C3696l) obj;
                InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f14325h;
                C3731t2 c3731t2 = (C3731t2) this.f14324g;
                if (!c3731t2.f17787g) {
                    C0216v mo415g = c3696l.f17587a.mo415g();
                    c3731t2.f17789i = interfaceC3281e;
                    if (c3731t2.f17788h == null) {
                        c3731t2.f17788h = mo415g;
                        mo415g.m468a(c3731t2);
                    } else if (mo415g.f881c.compareTo(EnumC0203o.f865g) >= 0) {
                        c3731t2.f17786f.m3926A(new C3173d(1330788943, new C3727s2(c3731t2, interfaceC3281e, i14), true));
                    }
                }
                return C1694m.f10482a;
            case 25:
                C3771u c3771u = (C3771u) this.f14324g;
                c3771u.setPositionProvider((InterfaceC3774x) this.f14325h);
                c3771u.m5774m();
                return new Object();
            default:
                AbstractC3237u0 abstractC3237u02 = (AbstractC3237u0) obj;
                AbstractC3239v0 abstractC3239v02 = (AbstractC3239v0) this.f14324g;
                float f13 = ((C3813u) this.f14325h).f18008s;
                abstractC3237u02.getClass();
                long j10 = 0;
                AbstractC3237u0.m4948a(abstractC3237u02, abstractC3239v02);
                abstractC3239v02.mo4940o0(C3100j.m4785c((4294967295L & j10) | (j10 << 32), abstractC3239v02.f16057i), f13, null);
                return C1694m.f10482a;
        }
    }
}
