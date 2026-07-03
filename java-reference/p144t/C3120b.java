package p144t;

import android.view.View;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p100n.C2649h1;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.b */
/* loaded from: classes.dex */
public final class C3120b implements InterfaceC3128f {

    /* renamed from: a */
    public final /* synthetic */ int f15753a;

    public /* synthetic */ C3120b(int i7) {
        this.f15753a = i7;
    }

    /* renamed from: b */
    public static final C3117a m4820b(String str, int i7) {
        WeakHashMap weakHashMap = C3161v0.f15846u;
        return new C3117a(str, i7);
    }

    /* renamed from: d */
    public static final C3157t0 m4821d(String str, int i7) {
        WeakHashMap weakHashMap = C3161v0.f15846u;
        return new C3157t0(new C3123c0(0, 0, 0, 0), str);
    }

    /* renamed from: e */
    public static C3161v0 m4822e(C2395p c2395p) {
        C3161v0 c3161v0;
        View view = (View) c2395p.m3878k(AndroidCompositionLocals_androidKt.f790f);
        WeakHashMap weakHashMap = C3161v0.f15846u;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new C3161v0(view);
                    weakHashMap.put(view, obj);
                }
                c3161v0 = (C3161v0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean m3874i = c2395p.m3874i(c3161v0) | c2395p.m3874i(view);
        Object m3847O = c2395p.m3847O();
        if (m3874i || m3847O == C2375k.f13421a) {
            m3847O = new C2649h1(12, c3161v0, view);
            c2395p.m3877j0(m3847O);
        }
        AbstractC2418w.m3962d(c3161v0, (InterfaceC3279c) m3847O, c2395p);
        return c3161v0;
    }

    @Override // p144t.InterfaceC3128f
    /* renamed from: c */
    public void mo4823c(InterfaceC3093c interfaceC3093c, int i7, int[] iArr, EnumC3103m enumC3103m, int[] iArr2) {
        switch (this.f15753a) {
            case 0:
                AbstractC3136j.m4838b(iArr, iArr2, false);
                return;
            case 1:
                AbstractC3136j.m4839c(i7, iArr, iArr2, false);
                return;
            case 2:
                if (enumC3103m == EnumC3103m.f15703e) {
                    AbstractC3136j.m4839c(i7, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC3136j.m4838b(iArr, iArr2, true);
                    return;
                }
            default:
                if (enumC3103m == EnumC3103m.f15703e) {
                    AbstractC3136j.m4838b(iArr, iArr2, false);
                    return;
                } else {
                    AbstractC3136j.m4839c(i7, iArr, iArr2, true);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f15753a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
