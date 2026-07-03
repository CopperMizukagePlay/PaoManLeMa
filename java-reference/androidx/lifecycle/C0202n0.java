package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import com.paoman.lema.MainActivity;
import java.lang.reflect.Constructor;
import p006a7.C0129l;
import p065i2.AbstractC2064e;
import p141s3.C3108a;
import p158u5.AbstractC3367j;
import p172w3.C3781e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.n0 */
/* loaded from: classes.dex */
public final class C0202n0 implements InterfaceC0210r0 {

    /* renamed from: a */
    public final Application f858a;

    /* renamed from: b */
    public final C0208q0 f859b;

    /* renamed from: c */
    public final Bundle f860c;

    /* renamed from: d */
    public final C0216v f861d;

    /* renamed from: e */
    public final C3781e f862e;

    public C0202n0(Application application, MainActivity mainActivity, Bundle bundle) {
        C0208q0 c0208q0;
        this.f862e = (C3781e) mainActivity.f952h.f17918c;
        this.f861d = mainActivity.f18075e;
        this.f860c = bundle;
        this.f858a = application;
        if (application != null) {
            if (C0208q0.f873e == null) {
                C0208q0.f873e = new C0208q0(application);
            }
            c0208q0 = C0208q0.f873e;
            AbstractC3367j.m5097b(c0208q0);
        } else {
            c0208q0 = new C0208q0(null);
        }
        this.f859b = c0208q0;
    }

    @Override // androidx.lifecycle.InterfaceC0210r0
    /* renamed from: a */
    public final AbstractC0206p0 mo280a(Class cls) {
        Constructor m464a;
        AbstractC0206p0 m465b;
        AutoCloseable autoCloseable;
        Application application;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            C0216v c0216v = this.f861d;
            if (c0216v != null) {
                boolean isAssignableFrom = AbstractC0175a.class.isAssignableFrom(cls);
                if (isAssignableFrom && this.f858a != null) {
                    m464a = AbstractC0204o0.m464a(cls, AbstractC0204o0.f869a);
                } else {
                    m464a = AbstractC0204o0.m464a(cls, AbstractC0204o0.f870b);
                }
                if (m464a == null) {
                    if (this.f858a != null) {
                        return this.f859b.mo280a(cls);
                    }
                    if (C0129l.f525b == null) {
                        C0129l.f525b = new C0129l(5);
                    }
                    AbstractC3367j.m5097b(C0129l.f525b);
                    return AbstractC2064e.m3243q(cls);
                }
                C3781e c3781e = this.f862e;
                AbstractC3367j.m5097b(c3781e);
                C0188g0 m457b = AbstractC0194j0.m457b(c3781e.m5777b(canonicalName), this.f860c);
                C0190h0 c0190h0 = new C0190h0(canonicalName, m457b);
                c0190h0.m455h(c0216v, c3781e);
                EnumC0203o enumC0203o = c0216v.f881c;
                if (enumC0203o != EnumC0203o.f864f && enumC0203o.compareTo(EnumC0203o.f866h) < 0) {
                    c0216v.m468a(new C0187g(c0216v, c3781e));
                } else {
                    c3781e.m5788m();
                }
                if (isAssignableFrom && (application = this.f858a) != null) {
                    m465b = AbstractC0204o0.m465b(cls, m464a, application, m457b);
                } else {
                    m465b = AbstractC0204o0.m465b(cls, m464a, m457b);
                }
                m465b.getClass();
                C3108a c3108a = m465b.f871a;
                if (c3108a != null) {
                    if (c3108a.f15715d) {
                        C3108a.m4807a(c0190h0);
                        return m465b;
                    }
                    synchronized (c3108a.f15712a) {
                        autoCloseable = (AutoCloseable) c3108a.f15713b.put("androidx.lifecycle.savedstate.vm.tag", c0190h0);
                    }
                    C3108a.m4807a(autoCloseable);
                    return m465b;
                }
                return m465b;
            }
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
