package p051g3;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p001a0.C0068q2;
import p012b3.C0274b;
import p039e5.AbstractC1413x0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.a0 */
/* loaded from: classes.dex */
public final class C1619a0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final AbstractC1661u f10356a;

    /* renamed from: b */
    public List f10357b;

    /* renamed from: c */
    public ArrayList f10358c;

    /* renamed from: d */
    public final HashMap f10359d;

    public C1619a0(AbstractC1661u abstractC1661u) {
        super(abstractC1661u.f10429f);
        this.f10359d = new HashMap();
        this.f10356a = abstractC1661u;
    }

    /* renamed from: a */
    public final C1628d0 m2623a(WindowInsetsAnimation windowInsetsAnimation) {
        C1628d0 c1628d0 = (C1628d0) this.f10359d.get(windowInsetsAnimation);
        if (c1628d0 == null) {
            C1628d0 c1628d02 = new C1628d0(0, null, 0L);
            c1628d02.f10375a = new C1622b0(windowInsetsAnimation);
            this.f10359d.put(windowInsetsAnimation, c1628d02);
            return c1628d02;
        }
        return c1628d0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f10356a.mo2710a(m2623a(windowInsetsAnimation));
        this.f10359d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f10356a.mo2711b(m2623a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f10358c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f10358c = arrayList2;
            this.f10357b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation m2406m = AbstractC1413x0.m2406m(list.get(size));
            C1628d0 m2623a = m2623a(m2406m);
            fraction = m2406m.getFraction();
            m2623a.f10375a.mo2637e(fraction);
            this.f10358c.add(m2623a);
        }
        return this.f10356a.mo2712d(C1672z0.m2741c(null, windowInsets), this.f10357b).m2742b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0068q2 mo2713e = this.f10356a.mo2713e(m2623a(windowInsetsAnimation), new C0068q2(bounds));
        mo2713e.getClass();
        AbstractC1413x0.m2408o();
        return AbstractC1413x0.m2404k(((C0274b) mo2713e.f344f).m583d(), ((C0274b) mo2713e.f345g).m583d());
    }
}
