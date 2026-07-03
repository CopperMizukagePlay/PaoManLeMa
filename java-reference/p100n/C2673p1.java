package p100n;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001a0.C0068q2;
import p034e0.C0614k0;
import p039e5.C0811dk;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p077k.AbstractC2211q;
import p077k.C2209p;
import p077k.C2223y;
import p084l.AbstractC2334a;
import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;
import p096m3.C2560j;
import p096m3.C2572v;
import p096m3.RunnableC2558h;
import p106n6.ThreadFactoryC2720a;
import p110o2.C2811h;
import p110o2.C2815l;
import p117p1.C2868s;
import p117p1.C2869t;
import p117p1.C2870u;
import p128q6.C3002e;
import p139s1.AbstractC3088a;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p160v.C3419k0;
import p160v.InterfaceC3422m;
import p162v1.AbstractC3498f;
import p162v1.C3502g0;
import p162v1.C3554x1;
import p164v3.InterfaceC3580d;
import p168w.AbstractC3642y;
import p168w.C3625h;
import p168w.C3637t;
import p170w1.C3728t;
import p173w4.C3783a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.p1 */
/* loaded from: classes.dex */
public final class C2673p1 implements InterfaceC2677r, InterfaceC2679r1, InterfaceC3580d, InterfaceC3422m {

    /* renamed from: e */
    public final /* synthetic */ int f14389e;

    /* renamed from: f */
    public Object f14390f;

    public /* synthetic */ C2673p1(int i7, Object obj) {
        this.f14389e = i7;
        this.f14390f = obj;
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: a */
    public int mo4276a() {
        return ((AbstractC3642y) this.f14390f).mo5600k();
    }

    @Override // p100n.InterfaceC2679r1, p100n.InterfaceC2670o1
    /* renamed from: b */
    public boolean mo4274b() {
        ((C2572v) this.f14390f).getClass();
        return false;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: c */
    public long mo4095c(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return ((C2572v) this.f14390f).mo4095c(abstractC2674q, abstractC2674q2, abstractC2674q3);
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: d */
    public int mo4277d() {
        return ((AbstractC3642y) this.f14390f).f17398e;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    @Override // p160v.InterfaceC3422m
    /* renamed from: e */
    public int mo4278e() {
        return ((C3625h) AbstractC1805m.m3052p0(((AbstractC3642y) this.f14390f).m5609j().f17357a)).f17302a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // p160v.InterfaceC3422m
    /* renamed from: f */
    public float mo4279f(int i7) {
        Object obj;
        AbstractC3642y abstractC3642y = (AbstractC3642y) this.f14390f;
        ?? r12 = abstractC3642y.m5609j().f17357a;
        int size = r12.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                obj = r12.get(i8);
                if (((C3625h) obj).f17302a == i7) {
                    break;
                }
                i8++;
            } else {
                obj = null;
                break;
            }
        }
        if (((C3625h) obj) == null) {
            return ((i7 - abstractC3642y.m5608i()) * (((C3637t) abstractC3642y.f17408o.getValue()).f17359c + abstractC3642y.m5610l())) - (((C2345c1) abstractC3642y.f17396c.f15486d).m3729g() * abstractC3642y.m5611m());
        }
        return r4.f17313l;
    }

    @Override // p164v3.InterfaceC3580d
    /* renamed from: g */
    public void mo4280g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p100n.InterfaceC2677r
    public InterfaceC2630b0 get(int i7) {
        switch (this.f14389e) {
            case 0:
                return (C2633c0) this.f14390f;
            default:
                return (InterfaceC2630b0) this.f14390f;
        }
    }

    @Override // p164v3.InterfaceC3580d
    /* renamed from: h */
    public void mo4281h(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case AbstractC3122c.f15761f /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case AbstractC3122c.f15759d /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case AbstractC3122c.f15758c /* 9 */:
            default:
                str = "";
                break;
            case AbstractC3122c.f15760e /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f14390f).setResultCode(i7);
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: i */
    public int mo4282i() {
        return ((AbstractC3642y) this.f14390f).f17397d;
    }

    @Override // p160v.InterfaceC3422m
    /* renamed from: j */
    public void mo4283j(int i7) {
        AbstractC3642y abstractC3642y = (AbstractC3642y) this.f14390f;
        C3002e c3002e = abstractC3642y.f17396c;
        ((C2349d1) c3002e.f15485c).m3742h(i7);
        ((C3419k0) c3002e.f15488f).m5180a(i7);
        ((C2345c1) c3002e.f15486d).m3730h(0 / abstractC3642y.m5611m());
        c3002e.f15487e = null;
        C3502g0 c3502g0 = (C3502g0) abstractC3642y.f17416w.getValue();
        if (c3502g0 != null) {
            c3502g0.m5437k();
        }
    }

    /* renamed from: l */
    public void m4284l(C3502g0 c3502g0) {
        if (!c3502g0.m5407I()) {
            AbstractC3088a.m4750b("DepthSortedSet.add called on an unattached node");
        }
        ((C3554x1) this.f14390f).add(c3502g0);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: m */
    public AbstractC2674q mo4103m(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return ((C2572v) this.f14390f).mo4103m(abstractC2674q, abstractC2674q2, abstractC2674q3);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: n */
    public AbstractC2674q mo630n(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return ((C2572v) this.f14390f).mo630n(j6, abstractC2674q, abstractC2674q2, abstractC2674q3);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: o */
    public AbstractC2674q mo631o(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return ((C2572v) this.f14390f).mo631o(j6, abstractC2674q, abstractC2674q2, abstractC2674q3);
    }

    /* renamed from: q */
    public InterfaceC2390n2 m4285q() {
        C2560j m4081a = C2560j.m4081a();
        if (m4081a.m4084c() == 1) {
            return new C2815l(true);
        }
        C2361g1 m3980x = AbstractC2418w.m3980x(Boolean.FALSE);
        C2811h c2811h = new C2811h(m3980x, this);
        m4081a.f13928a.writeLock().lock();
        try {
            if (m4081a.f13930c != 1 && m4081a.f13930c != 2) {
                m4081a.f13929b.add(c2811h);
                m4081a.f13928a.writeLock().unlock();
                return m3980x;
            }
            m4081a.f13931d.post(new RunnableC2558h(Arrays.asList(c2811h), m4081a.f13930c, null));
            m4081a.f13928a.writeLock().unlock();
            return m3980x;
        } catch (Throwable th) {
            m4081a.f13928a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: r */
    public void m4286r(View view, int i7, boolean z7) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f14390f).notifyViewVisibilityChanged(view, i7, z7);
        }
    }

    /* renamed from: s */
    public C0614k0 m4287s(C0068q2 c0068q2, C3728t c3728t) {
        Object obj;
        int i7;
        long m5733H;
        long j6;
        boolean z7;
        Object obj2 = AbstractC2211q.f12723a;
        C2209p c2209p = (C2209p) this.f14390f;
        List list = (List) c0068q2.f344f;
        C2209p c2209p2 = new C2209p(list.size());
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            C2870u c2870u = (C2870u) list.get(i8);
            long j7 = c2870u.f15024a;
            int m3711b = AbstractC2334a.m3711b(c2209p.f12719f, c2209p.f12721h, j7);
            if (m3711b < 0 || (obj = c2209p.f12720g[m3711b]) == obj2) {
                obj = null;
            }
            C2869t c2869t = (C2869t) obj;
            if (c2869t == null) {
                i7 = i8;
                j6 = c2870u.f15025b;
                m5733H = c2870u.f15027d;
                z7 = false;
            } else {
                long j8 = c2869t.f15021a;
                boolean z8 = c2869t.f15023c;
                i7 = i8;
                m5733H = c3728t.m5733H(c2869t.f15022b);
                j6 = j8;
                z7 = z8;
            }
            long j9 = c2870u.f15024a;
            List list2 = list;
            int i9 = size;
            c2209p2.m3615b(j9, new C2868s(j9, c2870u.f15025b, c2870u.f15027d, c2870u.f15028e, c2870u.f15029f, j6, m5733H, z7, c2870u.f15030g, c2870u.f15032i, c2870u.f15033j, c2870u.f15034k));
            boolean z9 = c2870u.f15028e;
            if (z9) {
                c2209p.m3615b(j7, new C2869t(c2870u.f15025b, c2870u.f15026c, z9));
            } else {
                int m3711b2 = AbstractC2334a.m3711b(c2209p.f12719f, c2209p.f12721h, j7);
                if (m3711b2 >= 0) {
                    Object[] objArr = c2209p.f12720g;
                    if (objArr[m3711b2] != obj2) {
                        objArr[m3711b2] = obj2;
                        c2209p.f12718e = true;
                    }
                }
            }
            i8 = i7 + 1;
            list = list2;
            size = i9;
        }
        return new C0614k0(c2209p2, c0068q2);
    }

    /* renamed from: t */
    public boolean m4288t(C3502g0 c3502g0) {
        if (!c3502g0.m5407I()) {
            AbstractC3088a.m4750b("DepthSortedSet.remove called on an unattached node");
        }
        return ((C3554x1) this.f14390f).remove(c3502g0);
    }

    public String toString() {
        switch (this.f14389e) {
            case AbstractC3122c.f15760e /* 10 */:
                return ((C3554x1) this.f14390f).toString();
            default:
                return super.toString();
        }
    }

    public C2673p1(int i7) {
        this.f14389e = i7;
        switch (i7) {
            case 4:
                this.f14390f = new C2209p(10);
                return;
            case AbstractC3122c.f15759d /* 6 */:
                this.f14390f = new LinkedHashSet();
                return;
            case AbstractC3122c.f15760e /* 10 */:
                this.f14390f = new TreeSet(AbstractC3498f.f16856b);
                return;
            case 13:
                this.f14390f = C3783a.f17919e;
                return;
            default:
                return;
        }
    }

    public C2673p1(long[] jArr) {
        C2223y c2223y;
        this.f14389e = 9;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            c2223y = new C2223y(copyOf.length);
            int i7 = c2223y.f12763b;
            if (i7 >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i7;
                    long[] jArr2 = c2223y.f12762a;
                    if (jArr2.length < length) {
                        long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                        c2223y.f12762a = copyOf2;
                    }
                    long[] jArr3 = c2223y.f12762a;
                    int i8 = c2223y.f12763b;
                    if (i7 != i8) {
                        AbstractC1804l.m3016I(jArr3, jArr3, copyOf.length + i7, i7, i8);
                    }
                    AbstractC1804l.m3016I(copyOf, jArr3, i7, 0, copyOf.length);
                    c2223y.f12763b += copyOf.length;
                }
            } else {
                AbstractC2334a.m3713d("");
                throw null;
            }
        } else {
            c2223y = new C2223y(16);
        }
        this.f14390f = c2223y;
    }

    public C2673p1(ThreadFactoryC2720a threadFactoryC2720a) {
        this.f14389e = 5;
        this.f14390f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC2720a);
    }

    public C2673p1(float f7, float f8, AbstractC2674q abstractC2674q) {
        Object c2673p1;
        this.f14389e = 2;
        if (abstractC2674q != null) {
            c2673p1 = new C0811dk(f7, f8, abstractC2674q);
        } else {
            c2673p1 = new C2673p1(f7, f8);
        }
        this.f14390f = new C2572v(c2673p1);
    }

    public C2673p1(float f7, float f8) {
        this.f14389e = 0;
        this.f14390f = new C2633c0(f7, f8, 0.01f);
    }
}
