package p001a0;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.AbstractC0194j0;
import java.util.LinkedHashMap;
import p008b.C0243l;
import p017c.C0316a;
import p023c5.C0420l;
import p029d3.AbstractC0497d;
import p034e0.C0622o0;
import p041f.C1509a;
import p041f.C1511c;
import p063i0.ViewOnAttachStateChangeListenerC2044y1;
import p085l0.InterfaceC2360g0;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p160v.C3407e0;
import p160v.C3421l0;
import p160v.C3431q0;
import p170w1.C3686i1;
import p170w1.C3731t2;
import p171w2.C3766p;
import p171w2.C3771u;
import p171w2.DialogC3769s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.t */
/* loaded from: classes.dex */
public final class C0077t implements InterfaceC2360g0 {

    /* renamed from: a */
    public final /* synthetic */ int f376a;

    /* renamed from: b */
    public final /* synthetic */ Object f377b;

    public /* synthetic */ C0077t(int i7, Object obj) {
        this.f376a = i7;
        this.f377b = obj;
    }

    @Override // p085l0.InterfaceC2360g0
    /* renamed from: a */
    public final void mo26a() {
        Object parcelable;
        Integer num;
        switch (this.f376a) {
            case 0:
                ((C0622o0) this.f377b).m1288k();
                return;
            case 1:
                C1511c c1511c = ((C0316a) this.f377b).f1112a;
                if (c1511c != null) {
                    C0243l c0243l = c1511c.f9998u;
                    String str = c1511c.f9999v;
                    Bundle bundle = c0243l.f945g;
                    LinkedHashMap linkedHashMap = c0243l.f944f;
                    AbstractC3367j.m5100e(str, "key");
                    if (!c0243l.f942d.contains(str) && (num = (Integer) c0243l.f940b.remove(str)) != null) {
                        c0243l.f939a.remove(num);
                    }
                    c0243l.f943e.remove(str);
                    if (linkedHashMap.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
                        linkedHashMap.remove(str);
                    }
                    if (bundle.containsKey(str)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            parcelable = AbstractC0497d.m1079a(str, bundle);
                        } else {
                            parcelable = bundle.getParcelable(str);
                            if (!C1509a.class.isInstance(parcelable)) {
                                parcelable = null;
                            }
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C1509a) parcelable));
                        bundle.remove(str);
                    }
                    if (c0243l.f941c.get(str) == null) {
                        return;
                    } else {
                        throw new ClassCastException();
                    }
                }
                throw new IllegalStateException("Launcher has not been initialized");
            case 2:
                C0420l c0420l = (C0420l) ((InterfaceC2425y0) this.f377b).getValue();
                if (c0420l != null) {
                    c0420l.f1521e.m977g();
                    return;
                }
                return;
            case 3:
                ViewOnAttachStateChangeListenerC2044y1 viewOnAttachStateChangeListenerC2044y1 = (ViewOnAttachStateChangeListenerC2044y1) this.f377b;
                View view = viewOnAttachStateChangeListenerC2044y1.f12167f;
                if (viewOnAttachStateChangeListenerC2044y1.f12166e) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(viewOnAttachStateChangeListenerC2044y1);
                    viewOnAttachStateChangeListenerC2044y1.f12166e = false;
                }
                view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2044y1);
                return;
            case 4:
                ((C3407e0) this.f377b).f16537d = null;
                return;
            case AbstractC3122c.f15761f /* 5 */:
                ((C3431q0) this.f377b).f16608c = null;
                return;
            case AbstractC3122c.f15759d /* 6 */:
                C3421l0 c3421l0 = (C3421l0) this.f377b;
                int m3741g = c3421l0.f16590d.m3741g();
                for (int i7 = 0; i7 < m3741g; i7++) {
                    c3421l0.m5183b();
                }
                return;
            case 7:
                ((C3686i1) this.f377b).f17570f.mo52a();
                return;
            case 8:
                DialogC3769s dialogC3769s = (DialogC3769s) this.f377b;
                dialogC3769s.dismiss();
                C3766p c3766p = dialogC3769s.f17879l;
                C3731t2 c3731t2 = c3766p.f17431g;
                if (c3731t2 != null) {
                    c3731t2.m5752a();
                }
                c3766p.f17431g = null;
                c3766p.requestLayout();
                return;
            default:
                C3771u c3771u = (C3771u) this.f377b;
                C3731t2 c3731t22 = c3771u.f17431g;
                if (c3731t22 != null) {
                    c3731t22.m5752a();
                }
                c3771u.f17431g = null;
                c3771u.requestLayout();
                AbstractC0194j0.m461f(c3771u, null);
                c3771u.f17896r.removeViewImmediate(c3771u);
                return;
        }
    }
}
