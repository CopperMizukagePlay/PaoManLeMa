package androidx.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.paoman.lema.R;
import java.util.LinkedHashMap;
import java.util.Map;
import p006a7.C0129l;
import p008b.AbstractActivityC0245m;
import p050g2.C1609r;
import p060h5.C1814v;
import p066i3.AbstractC2067b;
import p067i4.AbstractC2072e;
import p068i5.C2084h;
import p133r3.AbstractC3047b;
import p133r3.C3046a;
import p141s3.C3108a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3380w;
import p158u5.AbstractC3382y;
import p158u5.C3362e;
import p172w3.C3781e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC0194j0 {

    /* renamed from: a */
    public static final C0129l f846a = new C0129l(1);

    /* renamed from: b */
    public static final C0129l f847b = new C0129l(2);

    /* renamed from: c */
    public static final C0129l f848c = new C0129l(3);

    /* renamed from: d */
    public static final C0129l f849d = new C0129l(6);

    /* renamed from: a */
    public static final void m456a(AbstractC0206p0 abstractC0206p0, C3781e c3781e, C0216v c0216v) {
        AutoCloseable autoCloseable;
        AbstractC3367j.m5100e(c3781e, "registry");
        AbstractC3367j.m5100e(c0216v, "lifecycle");
        C3108a c3108a = abstractC0206p0.f871a;
        if (c3108a != null) {
            synchronized (c3108a.f15712a) {
                autoCloseable = (AutoCloseable) c3108a.f15713b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C0190h0 c0190h0 = (C0190h0) autoCloseable;
        if (c0190h0 != null && !c0190h0.f845g) {
            c0190h0.m455h(c0216v, c3781e);
            EnumC0203o enumC0203o = c0216v.f881c;
            if (enumC0203o != EnumC0203o.f864f && enumC0203o.compareTo(EnumC0203o.f866h) < 0) {
                c0216v.m468a(new C0187g(c0216v, c3781e));
            } else {
                c3781e.m5788m();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, androidx.lifecycle.g0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, androidx.lifecycle.g0] */
    /* renamed from: b */
    public static C0188g0 m457b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            ?? obj = new Object();
            new LinkedHashMap();
            obj.f842a = new C1609r(C1814v.f10861e);
            return obj;
        }
        ClassLoader classLoader = C0188g0.class.getClassLoader();
        AbstractC3367j.m5097b(classLoader);
        bundle.setClassLoader(classLoader);
        C2084h c2084h = new C2084h(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC3367j.m5097b(str);
            c2084h.put(str, bundle.get(str));
        }
        C2084h m3419b = c2084h.m3419b();
        ?? obj2 = new Object();
        new LinkedHashMap();
        obj2.f842a = new C1609r(m3419b);
        return obj2;
    }

    /* renamed from: c */
    public static final InterfaceC0213t m458c(View view) {
        InterfaceC0213t interfaceC0213t;
        AbstractC3367j.m5100e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof InterfaceC0213t) {
                interfaceC0213t = (InterfaceC0213t) tag;
            } else {
                interfaceC0213t = null;
            }
            if (interfaceC0213t != null) {
                return interfaceC0213t;
            }
            Object m3335m = AbstractC2072e.m3335m(view);
            if (m3335m instanceof View) {
                view = (View) m3335m;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final InterfaceC0214t0 m459d(View view) {
        InterfaceC0214t0 interfaceC0214t0;
        AbstractC3367j.m5100e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof InterfaceC0214t0) {
                interfaceC0214t0 = (InterfaceC0214t0) tag;
            } else {
                interfaceC0214t0 = null;
            }
            if (interfaceC0214t0 != null) {
                return interfaceC0214t0;
            }
            Object m3335m = AbstractC2072e.m3335m(view);
            if (m3335m instanceof View) {
                view = (View) m3335m;
            } else {
                view = null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #1 {all -> 0x00b2, blocks: (B:14:0x0076, B:16:0x008f, B:18:0x00ac, B:23:0x00b4, B:25:0x00c8, B:27:0x00e1, B:29:0x00f0, B:31:0x00cf, B:34:0x00d8, B:35:0x0098, B:37:0x009e, B:38:0x00a6), top: B:13:0x0076, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.r0, java.lang.Object] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0200m0 m460e(InterfaceC0214t0 interfaceC0214t0) {
        AbstractC3047b abstractC3047b;
        AbstractC0206p0 abstractC0206p0;
        boolean isInstance;
        AbstractC0206p0 mo280a;
        AbstractC0206p0 abstractC0206p02;
        Bundle bundle;
        ?? obj = new Object();
        if (interfaceC0214t0 instanceof InterfaceC0193j) {
            AbstractActivityC0245m abstractActivityC0245m = (AbstractActivityC0245m) ((InterfaceC0193j) interfaceC0214t0);
            C3046a c3046a = C3046a.f15621b;
            AbstractC3367j.m5100e(c3046a, "initialExtras");
            LinkedHashMap linkedHashMap = c3046a.f15622a;
            AbstractC3367j.m5100e(linkedHashMap, "initialExtras");
            abstractC3047b = new AbstractC3047b();
            abstractC3047b.f15622a.putAll(linkedHashMap);
            if (abstractActivityC0245m.getApplication() != null) {
                abstractC3047b.f15622a.put(C0208q0.f874f, abstractActivityC0245m.getApplication());
            }
            abstractC3047b.f15622a.put(f846a, abstractActivityC0245m);
            abstractC3047b.f15622a.put(f847b, abstractActivityC0245m);
            Intent intent = abstractActivityC0245m.getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                abstractC3047b.f15622a.put(f848c, bundle);
            }
        } else {
            abstractC3047b = C3046a.f15621b;
        }
        AbstractC3367j.m5100e(abstractC3047b, "extras");
        C0212s0 m522e = ((AbstractActivityC0245m) interfaceC0214t0).m522e();
        C0129l c0129l = new C0129l(29);
        C3362e m5108a = AbstractC3380w.m5108a(C0200m0.class);
        synchronized (c0129l) {
            try {
                abstractC0206p0 = (AbstractC0206p0) m522e.f876a.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                Class cls = m5108a.f16439a;
                Map map = C3362e.f16437b;
                AbstractC3367j.m5098c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = AbstractC3382y.m5112c(num.intValue(), abstractC0206p0);
                } else {
                    if (cls.isPrimitive()) {
                        cls = AbstractC2067b.m3291p(AbstractC3380w.m5108a(cls));
                    }
                    isInstance = cls.isInstance(abstractC0206p0);
                }
                if (isInstance) {
                    AbstractC3367j.m5098c(abstractC0206p0, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    LinkedHashMap linkedHashMap2 = abstractC3047b.f15622a;
                    AbstractC3367j.m5100e(linkedHashMap2, "initialExtras");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.putAll(linkedHashMap2);
                    linkedHashMap3.put(f849d, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        try {
                            abstractC0206p0 = new C0200m0();
                        } catch (AbstractMethodError unused) {
                            mo280a = obj.mo280a(AbstractC2067b.m3290o(m5108a));
                            abstractC0206p0 = mo280a;
                            AbstractC3367j.m5100e(abstractC0206p0, "viewModel");
                            abstractC0206p02 = (AbstractC0206p0) m522e.f876a.put("androidx.lifecycle.internal.SavedStateHandlesVM", abstractC0206p0);
                            if (abstractC0206p02 != null) {
                            }
                            return (C0200m0) abstractC0206p0;
                        }
                    } catch (AbstractMethodError unused2) {
                        mo280a = obj.mo280a(AbstractC2067b.m3290o(m5108a));
                        abstractC0206p0 = mo280a;
                        AbstractC3367j.m5100e(abstractC0206p0, "viewModel");
                        abstractC0206p02 = (AbstractC0206p0) m522e.f876a.put("androidx.lifecycle.internal.SavedStateHandlesVM", abstractC0206p0);
                        if (abstractC0206p02 != null) {
                        }
                        return (C0200m0) abstractC0206p0;
                    }
                    AbstractC3367j.m5100e(abstractC0206p0, "viewModel");
                    abstractC0206p02 = (AbstractC0206p0) m522e.f876a.put("androidx.lifecycle.internal.SavedStateHandlesVM", abstractC0206p0);
                    if (abstractC0206p02 != null) {
                        abstractC0206p02.m466a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (C0200m0) abstractC0206p0;
    }

    /* renamed from: f */
    public static final void m461f(View view, InterfaceC0213t interfaceC0213t) {
        AbstractC3367j.m5100e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0213t);
    }
}
