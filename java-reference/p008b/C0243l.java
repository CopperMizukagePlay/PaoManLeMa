package p008b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.paoman.lema.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p006a7.C0129l;
import p041f.C1509a;
import p041f.C1510b;
import p041f.C1513e;
import p068i5.AbstractC2080d;
import p085l0.InterfaceC2425y0;
import p102n1.AbstractC2710c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.l */
/* loaded from: classes.dex */
public final class C0243l {

    /* renamed from: a */
    public final LinkedHashMap f939a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f940b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f941c = new LinkedHashMap();

    /* renamed from: d */
    public final ArrayList f942d = new ArrayList();

    /* renamed from: e */
    public final transient LinkedHashMap f943e = new LinkedHashMap();

    /* renamed from: f */
    public final LinkedHashMap f944f = new LinkedHashMap();

    /* renamed from: g */
    public final Bundle f945g = new Bundle();

    /* renamed from: h */
    public final /* synthetic */ MainActivity f946h;

    public C0243l(MainActivity mainActivity) {
        this.f946h = mainActivity;
    }

    /* renamed from: a */
    public final boolean m517a(int i7, int i8, Intent intent) {
        C0230e0 c0230e0;
        String str = (String) this.f939a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        C1510b c1510b = (C1510b) this.f943e.get(str);
        if (c1510b != null) {
            c0230e0 = c1510b.f9996a;
        } else {
            c0230e0 = null;
        }
        if (c0230e0 != null) {
            ArrayList arrayList = this.f942d;
            if (arrayList.contains(str)) {
                C0230e0 c0230e02 = c1510b.f9996a;
                ((InterfaceC3279c) ((InterfaceC2425y0) c0230e02.f913a).getValue()).mo23f(c1510b.f9997b.mo2520K(intent, i8));
                arrayList.remove(str);
                return true;
            }
        }
        this.f944f.remove(str);
        this.f945g.putParcelable(str, new C1509a(intent, i8));
        return true;
    }

    /* renamed from: b */
    public final void m518b(int i7, AbstractC2710c abstractC2710c, Object obj) {
        Bundle bundle;
        int i8;
        MainActivity mainActivity = this.f946h;
        C0129l mo2519A = abstractC2710c.mo2519A(mainActivity, obj);
        if (mo2519A != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0239j(this, i7, mo2519A));
            return;
        }
        Intent mo2521g = abstractC2710c.mo2521g(mainActivity, obj);
        if (mo2521g.getExtras() != null) {
            Bundle extras = mo2521g.getExtras();
            AbstractC3367j.m5097b(extras);
            if (extras.getClassLoader() == null) {
                mo2521g.setExtrasClassLoader(mainActivity.getClassLoader());
            }
        }
        if (mo2521g.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = mo2521g.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            mo2521g.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo2521g.getAction())) {
            String[] stringArrayExtra = mo2521g.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC2080d.m3379G(mainActivity, stringArrayExtra, i7);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo2521g.getAction())) {
            C1513e c1513e = (C1513e) mo2521g.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC3367j.m5097b(c1513e);
                i8 = i7;
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                i8 = i7;
            }
            try {
                mainActivity.startIntentSenderForResult(c1513e.f10001e, i8, c1513e.f10002f, c1513e.f10003g, c1513e.f10004h, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e8) {
                e = e8;
                new Handler(Looper.getMainLooper()).post(new RunnableC0241k(i8, 0, this, e));
                return;
            }
        }
        mainActivity.startActivityForResult(mo2521g, i7, bundle2);
    }
}
