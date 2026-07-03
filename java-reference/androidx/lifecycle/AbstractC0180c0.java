package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC0186f0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC0180c0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m416a(Activity activity, EnumC0201n enumC0201n) {
        AbstractC3367j.m5100e(enumC0201n, "event");
        if (activity instanceof InterfaceC0213t) {
            C0216v mo415g = ((InterfaceC0213t) activity).mo415g();
            if (mo415g instanceof C0216v) {
                mo415g.m471d(enumC0201n);
            }
        }
    }

    /* renamed from: b */
    public static void m417b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0186f0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0186f0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0186f0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
