package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes.dex */
public final class C0176a0 extends AbstractC0189h {
    final /* synthetic */ C0178b0 this$0;

    /* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
    /* renamed from: androidx.lifecycle.a0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC0189h {
        final /* synthetic */ C0178b0 this$0;

        public a(C0178b0 c0178b0) {
            this.this$0 = c0178b0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
            this.this$0.m414c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC3367j.m5100e(activity, "activity");
            C0178b0 c0178b0 = this.this$0;
            int i7 = c0178b0.f823e + 1;
            c0178b0.f823e = i7;
            if (i7 == 1 && c0178b0.f826h) {
                c0178b0.f828j.m471d(EnumC0201n.ON_START);
                c0178b0.f826h = false;
            }
        }
    }

    public C0176a0(C0178b0 c0178b0) {
        this.this$0 = c0178b0;
    }

    @Override // androidx.lifecycle.AbstractC0189h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3367j.m5100e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = FragmentC0186f0.f837f;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC3367j.m5098c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0186f0) findFragmentByTag).f838e = this.this$0.f830l;
        }
    }

    @Override // androidx.lifecycle.AbstractC0189h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3367j.m5100e(activity, "activity");
        C0178b0 c0178b0 = this.this$0;
        int i7 = c0178b0.f824f - 1;
        c0178b0.f824f = i7;
        if (i7 == 0) {
            Handler handler = c0178b0.f827i;
            AbstractC3367j.m5097b(handler);
            handler.postDelayed(c0178b0.f829k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC3367j.m5100e(activity, "activity");
        AbstractC0220z.m477a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0189h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC3367j.m5100e(activity, "activity");
        C0178b0 c0178b0 = this.this$0;
        int i7 = c0178b0.f823e - 1;
        c0178b0.f823e = i7;
        if (i7 == 0 && c0178b0.f825g) {
            c0178b0.f828j.m471d(EnumC0201n.ON_STOP);
            c0178b0.f826h = true;
        }
    }
}
