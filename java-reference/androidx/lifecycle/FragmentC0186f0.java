package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p001a0.C0019e1;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.f0 */
/* loaded from: classes.dex */
public class FragmentC0186f0 extends Fragment {

    /* renamed from: f */
    public static final /* synthetic */ int f837f = 0;

    /* renamed from: e */
    public C0019e1 f838e;

    /* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
    /* renamed from: androidx.lifecycle.f0$a */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0184e0 Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC3367j.m5100e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC3367j.m5100e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC3367j.m5100e(activity, "activity");
            int i7 = FragmentC0186f0.f837f;
            AbstractC0180c0.m416a(activity, EnumC0201n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
            int i7 = FragmentC0186f0.f837f;
            AbstractC0180c0.m416a(activity, EnumC0201n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
            int i7 = FragmentC0186f0.f837f;
            AbstractC0180c0.m416a(activity, EnumC0201n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
            int i7 = FragmentC0186f0.f837f;
            AbstractC0180c0.m416a(activity, EnumC0201n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
            int i7 = FragmentC0186f0.f837f;
            AbstractC0180c0.m416a(activity, EnumC0201n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
            int i7 = FragmentC0186f0.f837f;
            AbstractC0180c0.m416a(activity, EnumC0201n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC3367j.m5100e(activity, "activity");
            AbstractC3367j.m5100e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m453a(EnumC0201n enumC0201n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC3367j.m5099d(activity, "getActivity(...)");
            AbstractC0180c0.m416a(activity, enumC0201n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m453a(EnumC0201n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m453a(EnumC0201n.ON_DESTROY);
        this.f838e = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m453a(EnumC0201n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0019e1 c0019e1 = this.f838e;
        if (c0019e1 != null) {
            ((C0178b0) c0019e1.f109e).m414c();
        }
        m453a(EnumC0201n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0019e1 c0019e1 = this.f838e;
        if (c0019e1 != null) {
            C0178b0 c0178b0 = (C0178b0) c0019e1.f109e;
            int i7 = c0178b0.f823e + 1;
            c0178b0.f823e = i7;
            if (i7 == 1 && c0178b0.f826h) {
                c0178b0.f828j.m471d(EnumC0201n.ON_START);
                c0178b0.f826h = false;
            }
        }
        m453a(EnumC0201n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m453a(EnumC0201n.ON_STOP);
    }
}
