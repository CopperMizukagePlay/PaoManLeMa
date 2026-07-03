package androidx.lifecycle;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.paoman.lema.MainActivity;
import p008b.C0227d;
import p008b.C0236h0;
import p008b.C0258z;
import p008b.RunnableC0225c;
import p053g5.C1694m;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.k0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0196k0 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f850e;

    /* renamed from: f */
    public final /* synthetic */ MainActivity f851f;

    public /* synthetic */ C0196k0(MainActivity mainActivity, int i7) {
        this.f850e = i7;
        this.f851f = mainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [t3.f, java.lang.Object] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f850e;
        int i8 = 1;
        Bundle bundle = null;
        C1694m c1694m = C1694m.f10482a;
        MainActivity mainActivity = this.f851f;
        switch (i7) {
            case 0:
                return AbstractC0194j0.m460e(mainActivity);
            case 1:
                mainActivity.reportFullyDrawn();
                return c1694m;
            case 2:
                return new C0258z(mainActivity.f954j, new C0196k0(mainActivity, i8));
            case 3:
                ?? obj = new Object();
                mainActivity.mo521c().m4096d(obj);
                return obj;
            case 4:
                Application application = mainActivity.getApplication();
                if (mainActivity.getIntent() != null) {
                    bundle = mainActivity.getIntent().getExtras();
                }
                return new C0202n0(application, mainActivity, bundle);
            case AbstractC3122c.f15761f /* 5 */:
                C0236h0 c0236h0 = new C0236h0(new RunnableC0219y(i8, mainActivity));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!AbstractC3367j.m5096a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0225c(0, mainActivity, c0236h0));
                    } else {
                        mainActivity.f18075e.m468a(new C0227d(c0236h0, mainActivity));
                    }
                }
                return c0236h0;
            case AbstractC3122c.f15759d /* 6 */:
                mainActivity.finish();
                return c1694m;
            default:
                int i9 = MainActivity.f1565y;
                mainActivity.f1566x.setValue(null);
                return c1694m;
        }
    }
}
