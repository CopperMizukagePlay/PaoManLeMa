package p001a0;

import android.content.Context;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.RunnableC0219y;
import com.paoman.lema.R;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001a0.C0019e1;
import p006a7.C0129l;
import p008b.RunnableC0225c;
import p023c5.C0410b;
import p023c5.C0419k;
import p023c5.C0425q;
import p023c5.InterfaceC0409a;
import p034e0.C0622o0;
import p034e0.C0625q;
import p035e1.AbstractC0643a0;
import p035e1.InterfaceC0674q;
import p039e5.C0800d9;
import p050g2.C1602n0;
import p052g4.C1676d;
import p053g5.C1694m;
import p054g6.C1696a;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p059h3.C1782h;
import p059h3.C1783i;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.InterfaceC1816x;
import p061h6.C1834p;
import p065i2.AbstractC2064e;
import p073j2.AbstractC2168e;
import p079k1.C2258a;
import p081k4.C2308a;
import p081k4.C2309b;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2406s;
import p085l0.AbstractC2418w;
import p087l2.C2459w;
import p090l5.EnumC2465a;
import p092m.AbstractC2486c0;
import p092m.C2510z;
import p096m3.InterfaceC2559i;
import p096m3.ThreadFactoryC2551a;
import p098m5.AbstractC2590j;
import p099m6.InterfaceC2611l;
import p106n6.AbstractC2721b;
import p121p6.C2884c;
import p121p6.C2886e;
import p128q6.C3009l;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.e1 */
/* loaded from: classes.dex */
public class C0019e1 implements InterfaceC0409a, InterfaceC2611l, InterfaceC1816x, InterfaceC1702d, InterfaceC2559i {

    /* renamed from: e */
    public Object f109e;

    public /* synthetic */ C0019e1(Object obj) {
        this.f109e = obj;
    }

    @Override // p060h5.InterfaceC1816x
    /* renamed from: a */
    public Object mo30a(Object obj) {
        return ((C0800d9) obj).f3351l;
    }

    @Override // p096m3.InterfaceC2559i
    /* renamed from: b */
    public void mo31b(final AbstractC2064e abstractC2064e) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2551a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: m3.l
            @Override // java.lang.Runnable
            public final void run() {
                C0019e1 c0019e1 = C0019e1.this;
                AbstractC2064e abstractC2064e2 = abstractC2064e;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    C2570t m3535v = AbstractC2168e.m3535v((Context) c0019e1.f109e);
                    if (m3535v != null) {
                        C2569s c2569s = (C2569s) m3535v.f13961a;
                        synchronized (c2569s.f13955h) {
                            c2569s.f13957j = threadPoolExecutor2;
                        }
                        m3535v.f13961a.mo31b(new C2563m(abstractC2064e2, threadPoolExecutor2));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    abstractC2064e2.mo3253A(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // p023c5.InterfaceC0409a
    /* renamed from: c */
    public void mo32c(C0410b c0410b) {
        ((C0419k) this.f109e).f1432b.f1521e.m977g();
        C1676d c1676d = ((C0419k) this.f109e).f1439i;
        synchronized (c1676d) {
            if (c1676d.f10453e) {
                c1676d.m2744a();
            }
        }
        ((C0419k) this.f109e).f1440j.post(new RunnableC0225c(1, this, c0410b));
    }

    @Override // p060h5.InterfaceC1816x
    /* renamed from: d */
    public Iterator mo33d() {
        return ((Iterable) this.f109e).iterator();
    }

    @Override // p099m6.InterfaceC2611l
    /* renamed from: e */
    public List mo34e(String str) {
        AbstractC3367j.m5100e(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            AbstractC3367j.m5099d(allByName, "getAllByName(hostname)");
            List m3031X = AbstractC1804l.m3031X(allByName);
            C0800d9 c0800d9 = (C0800d9) this.f109e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : m3031X) {
                InetAddress inetAddress = (InetAddress) obj;
                int ordinal = c0800d9.f3345f.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new RuntimeException();
                        }
                    } else if (inetAddress.getAddress().length == 16) {
                    }
                    arrayList.add(obj);
                } else if (inetAddress.getAddress().length == 4) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new UnknownHostException("所选网络栈没有可用地址");
        } catch (NullPointerException e7) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e7);
            throw unknownHostException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [m5.j, t5.e] */
    @Override // p054g6.InterfaceC1702d
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo35f(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        C1696a c1696a;
        int i7;
        Throwable th;
        C1834p c1834p;
        if (interfaceC2313c instanceof C1696a) {
            c1696a = (C1696a) interfaceC2313c;
            int i8 = c1696a.f10488k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1696a.f10488k = i8 - Integer.MIN_VALUE;
                Object obj = c1696a.f10486i;
                i7 = c1696a.f10488k;
                C1694m c1694m = C1694m.f10482a;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c1834p = c1696a.f10485h;
                        try {
                            AbstractC1793a0.m2972L(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            c1834p.mo4113o();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC2318h interfaceC2318h = c1696a.f13999f;
                    AbstractC3367j.m5097b(interfaceC2318h);
                    C1834p c1834p2 = new C1834p(interfaceC1704e, interfaceC2318h);
                    try {
                        c1696a.f10485h = c1834p2;
                        c1696a.f10488k = 1;
                        Object mo22d = ((AbstractC2590j) this.f109e).mo22d(c1834p2, c1696a);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (mo22d != enumC2465a) {
                            mo22d = c1694m;
                        }
                        if (mo22d == enumC2465a) {
                            return enumC2465a;
                        }
                        c1834p = c1834p2;
                    } catch (Throwable th3) {
                        th = th3;
                        c1834p = c1834p2;
                        c1834p.mo4113o();
                        throw th;
                    }
                }
                c1834p.mo4113o();
                return c1694m;
            }
        }
        c1696a = new C1696a(this, interfaceC2313c);
        Object obj2 = c1696a.f10486i;
        i7 = c1696a.f10488k;
        C1694m c1694m2 = C1694m.f10482a;
        if (i7 == 0) {
        }
        c1834p.mo4113o();
        return c1694m2;
    }

    /* renamed from: h */
    public C1782h mo37h(int i7) {
        return null;
    }

    /* renamed from: i */
    public void m38i() {
        ((AbstractC2406s) this.f109e).getClass();
    }

    /* renamed from: j */
    public int m39j(int[] iArr, int i7) {
        int[] iArr2;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        C2308a c2308a = (C2308a) this.f109e;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i11 = 1;
                while (i11 < length && iArr[i11] == 0) {
                    i11++;
                }
                if (i11 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i12 = length - i11;
                    int[] iArr4 = new int[i12];
                    System.arraycopy(iArr, i11, iArr4, 0, i12);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i7];
            boolean z7 = true;
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = c2308a.f13260a[c2308a.f13266g + i13];
                if (i14 == 0) {
                    i10 = iArr2[iArr2.length - 1];
                } else {
                    if (i14 == 1) {
                        i9 = 0;
                        for (int i15 : iArr2) {
                            C2308a c2308a2 = C2308a.f13252h;
                            i9 ^= i15;
                        }
                    } else {
                        i9 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i16 = 1; i16 < length2; i16++) {
                            i9 = c2308a.m3682c(i14, i9) ^ iArr2[i16];
                        }
                    }
                    i10 = i9;
                }
                iArr5[(i7 - 1) - i13] = i10;
                if (i10 != 0) {
                    z7 = false;
                }
            }
            if (z7) {
                return 0;
            }
            C2309b c2309b = new C2309b(c2308a, iArr5);
            C2309b m3680a = c2308a.m3680a(i7, 1);
            C2309b c2309b2 = c2308a.f13262c;
            if (m3680a.m3686d() >= c2309b.m3686d()) {
                m3680a = c2309b;
                c2309b = m3680a;
            }
            C2309b c2309b3 = c2308a.f13263d;
            C2309b c2309b4 = m3680a;
            C2309b c2309b5 = c2309b;
            C2309b c2309b6 = c2309b4;
            C2309b c2309b7 = c2309b2;
            while (c2309b6.m3686d() * 2 >= i7) {
                if (!c2309b6.m3687e()) {
                    int m3681b = c2308a.m3681b(c2309b6.m3685c(c2309b6.m3686d()));
                    C2309b c2309b8 = c2309b2;
                    while (c2309b5.m3686d() >= c2309b6.m3686d() && !c2309b5.m3687e()) {
                        int m3686d = c2309b5.m3686d() - c2309b6.m3686d();
                        int m3682c = c2308a.m3682c(c2309b5.m3685c(c2309b5.m3686d()), m3681b);
                        c2309b8 = c2309b8.m3683a(c2308a.m3680a(m3686d, m3682c));
                        c2309b5 = c2309b5.m3683a(c2309b6.m3690h(m3686d, m3682c));
                    }
                    C2309b m3683a = c2309b8.m3689g(c2309b3).m3683a(c2309b7);
                    if (c2309b5.m3686d() < c2309b6.m3686d()) {
                        C2309b c2309b9 = c2309b5;
                        c2309b5 = c2309b6;
                        c2309b6 = c2309b9;
                        c2309b7 = c2309b3;
                        c2309b3 = m3683a;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + c2309b5 + ", rLast: " + c2309b6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int m3685c = c2309b3.m3685c(0);
            if (m3685c != 0) {
                int m3681b2 = c2308a.m3681b(m3685c);
                C2309b[] c2309bArr = {c2309b3.m3688f(m3681b2), c2309b6.m3688f(m3681b2)};
                C2309b c2309b10 = c2309bArr[0];
                C2309b c2309b11 = c2309bArr[1];
                int m3686d2 = c2309b10.m3686d();
                if (m3686d2 == 1) {
                    iArr3 = new int[]{c2309b10.m3685c(1)};
                } else {
                    int[] iArr6 = new int[m3686d2];
                    int i17 = 0;
                    for (int i18 = 1; i18 < c2308a.f13264e && i17 < m3686d2; i18++) {
                        if (c2309b10.m3684b(i18) == 0) {
                            iArr6[i17] = c2308a.m3681b(i18);
                            i17++;
                        }
                    }
                    if (i17 == m3686d2) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i19 = 0; i19 < length3; i19++) {
                    int m3681b3 = c2308a.m3681b(iArr3[i19]);
                    int i20 = 1;
                    for (int i21 = 0; i21 < length3; i21++) {
                        if (i19 != i21) {
                            int m3682c2 = c2308a.m3682c(iArr3[i21], m3681b3);
                            if ((m3682c2 & 1) == 0) {
                                i8 = m3682c2 | 1;
                            } else {
                                i8 = m3682c2 & (-2);
                            }
                            i20 = c2308a.m3682c(i20, i8);
                        }
                    }
                    int m3682c3 = c2308a.m3682c(c2309b11.m3684b(m3681b3), c2308a.m3681b(i20));
                    iArr7[i19] = m3682c3;
                    if (c2308a.f13266g != 0) {
                        iArr7[i19] = c2308a.m3682c(m3682c3, m3681b3);
                    }
                }
                for (int i22 = 0; i22 < iArr3.length; i22++) {
                    int length4 = iArr.length - 1;
                    int i23 = iArr3[i22];
                    if (i23 != 0) {
                        int i24 = length4 - c2308a.f13261b[i23];
                        if (i24 >= 0) {
                            iArr[i24] = iArr[i24] ^ iArr7[i22];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public void m40k() {
        Socket socket;
        C2258a c2258a = (C2258a) this.f109e;
        Iterator it = ((ConcurrentLinkedQueue) c2258a.f13097e).iterator();
        AbstractC3367j.m5099d(it, "connections.iterator()");
        while (it.hasNext()) {
            C3009l c3009l = (C3009l) it.next();
            AbstractC3367j.m5099d(c3009l, "connection");
            synchronized (c3009l) {
                if (c3009l.f15530p.isEmpty()) {
                    it.remove();
                    c3009l.f15524j = true;
                    socket = c3009l.f15518d;
                    AbstractC3367j.m5097b(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                AbstractC2721b.m4359e(socket);
            }
        }
        if (((ConcurrentLinkedQueue) c2258a.f13097e).isEmpty()) {
            ((C2884c) c2258a.f13095c).m4556a();
        }
    }

    /* renamed from: l */
    public C1782h mo41l(int i7) {
        return null;
    }

    /* renamed from: o */
    public void mo43o() {
        View view = (View) this.f109e;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: p */
    public void m44p(float f7, float f8, float f9, float f10) {
        boolean z7;
        C0031h1 c0031h1 = (C0031h1) this.f109e;
        InterfaceC0674q m106u = c0031h1.m106u();
        float intBitsToFloat = Float.intBitsToFloat((int) (c0031h1.m109x() >> 32)) - (f9 + f7);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c0031h1.m109x() & 4294967295L)) - (f10 + f8);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC0643a0.m1328a("Width and height must be greater than or equal to zero");
        }
        c0031h1.m86J(floatToRawIntBits);
        m106u.mo1336h(f7, f8);
    }

    /* renamed from: r */
    public void m46r() {
        synchronized (((C0425q) this.f109e).f1456h) {
            try {
                C0425q c0425q = (C0425q) this.f109e;
                if (c0425q.f1455g) {
                    c0425q.f1451c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: s */
    public boolean mo47s(int i7, int i8, Bundle bundle) {
        return false;
    }

    /* renamed from: t */
    public void m48t(float f7, float f8, long j6) {
        InterfaceC0674q m106u = ((C0031h1) this.f109e).m106u();
        int i7 = (int) (j6 >> 32);
        int i8 = (int) (j6 & 4294967295L);
        m106u.mo1336h(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
        m106u.mo1330b(f7, f8);
        m106u.mo1336h(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i8));
    }

    /* renamed from: u */
    public void mo49u() {
        View view;
        View view2 = (View) this.f109e;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(android.R.id.content);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new RunnableC0219y(9, view));
            }
        }
    }

    /* renamed from: v */
    public void m50v(float f7, float f8) {
        ((C0031h1) this.f109e).m106u().mo1336h(f7, f8);
    }

    /* renamed from: w */
    public void m51w(C2459w c2459w, long j6, boolean z7, C0625q c0625q) {
        EnumC0091x0 enumC0091x0;
        C0622o0 c0622o0 = (C0622o0) this.f109e;
        if (C1602n0.m2586b(C0622o0.m1278a(c0622o0, c2459w, j6, z7, false, c0625q, false))) {
            enumC0091x0 = EnumC0091x0.f418g;
        } else {
            enumC0091x0 = EnumC0091x0.f417f;
        }
        c0622o0.m1291n(enumC0091x0);
    }

    public C0019e1(InterfaceC3093c interfaceC3093c) {
        this.f109e = new C2510z(AbstractC2486c0.f13786a, interfaceC3093c);
    }

    public C0019e1(int i7) {
        AbstractC3367j.m5100e(TimeUnit.MINUTES, "timeUnit");
        this.f109e = new C2258a(C2886e.f15074i, i7);
    }

    public C0019e1(int i7, boolean z7) {
        C0129l c0129l;
        switch (i7) {
            case AbstractC3122c.f15758c /* 9 */:
                this.f109e = new Region();
                return;
            case AbstractC3122c.f15762g /* 15 */:
                this.f109e = new CopyOnWriteArrayList();
                new HashMap();
                return;
            case 20:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f109e = new C1783i(this);
                    return;
                } else {
                    this.f109e = new C1783i(this);
                    return;
                }
            case 21:
                if (Build.VERSION.SDK_INT >= 28) {
                    c0129l = new C0129l(18);
                } else {
                    c0129l = new C0129l(19);
                }
                this.f109e = c0129l;
                return;
            default:
                this.f109e = AbstractC2418w.m3980x(Boolean.FALSE);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a0.e1, g3.j, java.lang.Object] */
    public C0019e1(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            ?? c0019e1 = new C0019e1((Object) view);
            c0019e1.f10391f = view;
            this.f109e = c0019e1;
            return;
        }
        this.f109e = new C0019e1((Object) view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0019e1(InterfaceC3281e interfaceC3281e) {
        this.f109e = (AbstractC2590j) interfaceC3281e;
    }

    /* renamed from: q */
    public void m45q() {
    }

    @Override // p023c5.InterfaceC0409a
    /* renamed from: n */
    public void mo42n(List list) {
    }

    /* renamed from: g */
    public void mo36g(int i7, C1782h c1782h, String str, Bundle bundle) {
    }
}
