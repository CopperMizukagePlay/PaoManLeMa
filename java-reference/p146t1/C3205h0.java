package p146t1;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.lifecycle.RunnableC0219y;
import java.util.List;
import p001a0.AbstractC0094y0;
import p001a0.C0031h1;
import p001a0.C0053n;
import p063i0.C1879e0;
import p077k.AbstractC2210p0;
import p077k.C2188e0;
import p077k.C2194h0;
import p077k.C2196i0;
import p077k.C2218t0;
import p085l0.AbstractC2406s;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.C2415v;
import p085l0.InterfaceC2367i;
import p101n0.C2702b;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.AbstractC3470q;
import p162v1.AbstractC3511j0;
import p162v1.C3502g0;
import p162v1.C3514k0;
import p162v1.C3541t0;
import p162v1.C3553x0;
import p162v1.EnumC3496e0;
import p162v1.InterfaceC3518l1;
import p170w1.AbstractC3735u2;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.h0 */
/* loaded from: classes.dex */
public final class C3205h0 implements InterfaceC2367i {

    /* renamed from: e */
    public final C3502g0 f15958e;

    /* renamed from: f */
    public AbstractC2406s f15959f;

    /* renamed from: g */
    public InterfaceC3206h1 f15960g;

    /* renamed from: h */
    public int f15961h;

    /* renamed from: i */
    public int f15962i;

    /* renamed from: j */
    public final C2194h0 f15963j;

    /* renamed from: k */
    public final C2194h0 f15964k;

    /* renamed from: l */
    public final C3190c0 f15965l;

    /* renamed from: m */
    public final C3246z f15966m;

    /* renamed from: n */
    public final C2194h0 f15967n;

    /* renamed from: o */
    public final C2218t0 f15968o;

    /* renamed from: p */
    public final C2194h0 f15969p;

    /* renamed from: q */
    public final C2705e f15970q;

    /* renamed from: r */
    public int f15971r;

    /* renamed from: s */
    public int f15972s;

    /* renamed from: t */
    public final String f15973t;

    public C3205h0(C3502g0 c3502g0, InterfaceC3206h1 interfaceC3206h1) {
        this.f15958e = c3502g0;
        this.f15960g = interfaceC3206h1;
        long[] jArr = AbstractC2210p0.f12722a;
        this.f15963j = new C2194h0();
        this.f15964k = new C2194h0();
        this.f15965l = new C3190c0(this);
        this.f15966m = new C3246z(this);
        this.f15967n = new C2194h0();
        this.f15968o = new C2218t0();
        this.f15969p = new C2194h0();
        this.f15970q = new C2705e(new Object[16]);
        this.f15973t = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    @Override // p085l0.InterfaceC2367i
    /* renamed from: a */
    public final void mo3796a() {
        C2415v c2415v;
        C3502g0 c3502g0 = this.f15958e;
        c3502g0.f16899t = true;
        C2194h0 c2194h0 = this.f15963j;
        Object[] objArr = c2194h0.f12678c;
        long[] jArr = c2194h0.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128 && (c2415v = ((C3184a0) objArr[(i7 << 3) + i9]).f15910c) != null) {
                            c2415v.m3938l();
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        c3502g0.m5416S();
        c3502g0.f16899t = false;
        c2194h0.m3586a();
        this.f15964k.m3586a();
        this.f15972s = 0;
        this.f15971r = 0;
        this.f15967n.m3586a();
        m4907d();
    }

    @Override // p085l0.InterfaceC2367i
    /* renamed from: b */
    public final void mo3797b() {
        m4908e(true);
    }

    /* renamed from: c */
    public final void m4906c(int i7) {
        boolean z7;
        InterfaceC3279c interfaceC3279c;
        boolean z8 = false;
        this.f15971r = 0;
        List m5441o = this.f15958e.m5441o();
        C2702b c2702b = (C2702b) m5441o;
        int i8 = (c2702b.f14511e.f14519g - this.f15972s) - 1;
        if (i7 <= i8) {
            this.f15968o.clear();
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    Object m3592g = this.f15963j.m3592g((C3502g0) c2702b.get(i9));
                    AbstractC3367j.m5097b(m3592g);
                    ((C2188e0) this.f15968o.f12747f).m3574a(((C3184a0) m3592g).f15908a);
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f15960g.mo149o(this.f15968o);
            AbstractC3459f m5263d = AbstractC3470q.m5263d();
            if (m5263d != null) {
                interfaceC3279c = m5263d.mo5207e();
            } else {
                interfaceC3279c = null;
            }
            AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
            z7 = false;
            while (i8 >= i7) {
                try {
                    C3502g0 c3502g0 = (C3502g0) ((C2702b) m5441o).get(i8);
                    Object m3592g2 = this.f15963j.m3592g(c3502g0);
                    AbstractC3367j.m5097b(m3592g2);
                    C3184a0 c3184a0 = (C3184a0) m3592g2;
                    Object obj = c3184a0.f15908a;
                    if (((C2188e0) this.f15968o.f12747f).m3576c(obj)) {
                        this.f15971r++;
                        if (((Boolean) c3184a0.f15913f.getValue()).booleanValue()) {
                            C3514k0 c3514k0 = c3502g0.f16873J;
                            C3553x0 c3553x0 = c3514k0.f16953p;
                            EnumC3496e0 enumC3496e0 = EnumC3496e0.f16826g;
                            c3553x0.f17092p = enumC3496e0;
                            C3541t0 c3541t0 = c3514k0.f16954q;
                            if (c3541t0 != null) {
                                c3541t0.f17028n = enumC3496e0;
                            }
                            m4910g(c3184a0, false);
                            if (c3184a0.f15914g) {
                                z7 = true;
                            }
                        }
                    } else {
                        C3502g0 c3502g02 = this.f15958e;
                        c3502g02.f16899t = true;
                        this.f15963j.m3596k(c3502g0);
                        C2415v c2415v = c3184a0.f15910c;
                        if (c2415v != null) {
                            c2415v.m3938l();
                        }
                        this.f15958e.m5417T(i8, 1);
                        c3502g02.f16899t = false;
                    }
                    this.f15964k.m3596k(obj);
                    i8--;
                } catch (Throwable th) {
                    AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
                    throw th;
                }
            }
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
        } else {
            z7 = false;
        }
        if (z7) {
            synchronized (AbstractC3465l.f16721c) {
                C2196i0 c2196i0 = AbstractC3465l.f16728j.f16673h;
                if (c2196i0 != null) {
                    if (c2196i0.m3606h()) {
                        z8 = true;
                    }
                }
            }
            if (z8) {
                AbstractC3465l.m5234a();
            }
        }
        m4907d();
    }

    /* renamed from: d */
    public final void m4907d() {
        int i7 = ((C2702b) this.f15958e.m5441o()).f14511e.f14519g;
        C2194h0 c2194h0 = this.f15963j;
        if (c2194h0.f12680e != i7) {
            AbstractC3088a.m4749a("Inconsistency between the count of nodes tracked by the state (" + c2194h0.f12680e + ") and the children count on the SubcomposeLayout (" + i7 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i7 - this.f15971r) - this.f15972s < 0) {
            StringBuilder m188o = AbstractC0094y0.m188o(i7, "Incorrect state. Total children ", ". Reusable children ");
            m188o.append(this.f15971r);
            m188o.append(". Precomposed children ");
            m188o.append(this.f15972s);
            AbstractC3088a.m4749a(m188o.toString());
        }
        C2194h0 c2194h02 = this.f15967n;
        if (c2194h02.f12680e == this.f15972s) {
            return;
        }
        AbstractC3088a.m4749a("Incorrect state. Precomposed children " + this.f15972s + ". Map size " + c2194h02.f12680e);
    }

    /* renamed from: e */
    public final void m4908e(boolean z7) {
        InterfaceC3279c interfaceC3279c;
        this.f15972s = 0;
        this.f15967n.m3586a();
        List m5441o = this.f15958e.m5441o();
        int i7 = ((C2702b) m5441o).f14511e.f14519g;
        if (this.f15971r != i7) {
            this.f15971r = i7;
            AbstractC3459f m5263d = AbstractC3470q.m5263d();
            if (m5263d != null) {
                interfaceC3279c = m5263d.mo5207e();
            } else {
                interfaceC3279c = null;
            }
            AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
            for (int i8 = 0; i8 < i7; i8++) {
                try {
                    C3502g0 c3502g0 = (C3502g0) ((C2702b) m5441o).get(i8);
                    C3184a0 c3184a0 = (C3184a0) this.f15963j.m3592g(c3502g0);
                    if (c3184a0 != null && ((Boolean) c3184a0.f15913f.getValue()).booleanValue()) {
                        C3514k0 c3514k0 = c3502g0.f16873J;
                        C3553x0 c3553x0 = c3514k0.f16953p;
                        EnumC3496e0 enumC3496e0 = EnumC3496e0.f16826g;
                        c3553x0.f17092p = enumC3496e0;
                        C3541t0 c3541t0 = c3514k0.f16954q;
                        if (c3541t0 != null) {
                            c3541t0.f17028n = enumC3496e0;
                        }
                        m4910g(c3184a0, z7);
                        c3184a0.f15908a = AbstractC3191c1.f15934a;
                    }
                } catch (Throwable th) {
                    AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
                    throw th;
                }
            }
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
            this.f15964k.m3586a();
        }
        m4907d();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [t1.d1, java.lang.Object] */
    /* renamed from: f */
    public final InterfaceC3194d1 m4909f(Object obj, InterfaceC3281e interfaceC3281e) {
        C3502g0 c3502g0 = this.f15958e;
        if (c3502g0.m5407I()) {
            m4907d();
            if (!this.f15964k.m3588c(obj)) {
                this.f15969p.m3596k(obj);
                C2194h0 c2194h0 = this.f15967n;
                Object m3592g = c2194h0.m3592g(obj);
                if (m3592g == null) {
                    m3592g = m4912i(obj);
                    if (m3592g != null) {
                        int m4307i = ((C2702b) c3502g0.m5441o()).f14511e.m4307i(m3592g);
                        int i7 = ((C2702b) c3502g0.m5441o()).f14511e.f14519g;
                        c3502g0.f16899t = true;
                        c3502g0.m5411M(m4307i, i7, 1);
                        c3502g0.f16899t = false;
                        this.f15972s++;
                    } else {
                        int i8 = ((C2702b) c3502g0.m5441o()).f14511e.f14519g;
                        C3502g0 c3502g02 = new C3502g0(2);
                        c3502g0.f16899t = true;
                        c3502g0.m5400B(i8, c3502g02);
                        c3502g0.f16899t = false;
                        this.f15972s++;
                        m3592g = c3502g02;
                    }
                    c2194h0.m3598m(obj, m3592g);
                }
                m4911h((C3502g0) m3592g, obj, interfaceC3281e);
            }
        }
        if (!c3502g0.m5407I()) {
            return new Object();
        }
        return new C3202g0(this, obj);
    }

    /* renamed from: g */
    public final void m4910g(C3184a0 c3184a0, boolean z7) {
        C2415v c2415v;
        if (!z7 && c3184a0.f15914g) {
            c3184a0.f15913f.setValue(Boolean.FALSE);
        } else {
            c3184a0.f15913f = AbstractC2418w.m3980x(Boolean.FALSE);
        }
        c3184a0.getClass();
        if (z7) {
            C2415v c2415v2 = c3184a0.f15910c;
            if (c2415v2 != null) {
                c2415v2.m3937k();
                return;
            }
            return;
        }
        InterfaceC3518l1 outOfFrameExecutor = ((C3728t) AbstractC3511j0.m5464a(this.f15958e)).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            C0053n c0053n = new C0053n(24, c3184a0);
            Handler handler = ((C3728t) outOfFrameExecutor).getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new RunnableC0219y(14, c0053n));
                return;
            }
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        if (!c3184a0.f15914g && (c2415v = c3184a0.f15910c) != null) {
            c2415v.m3937k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00da), top: B:26:0x005c }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [t1.a0, java.lang.Object] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4911h(C3502g0 c3502g0, Object obj, InterfaceC3281e interfaceC3281e) {
        boolean z7;
        boolean z8;
        boolean z9;
        C2194h0 c2194h0 = this.f15963j;
        Object m3592g = c2194h0.m3592g(c3502g0);
        InterfaceC3279c interfaceC3279c = null;
        Object obj2 = m3592g;
        if (m3592g == null) {
            C3173d c3173d = AbstractC3204h.f15957a;
            ?? obj3 = new Object();
            obj3.f15908a = obj;
            obj3.f15909b = c3173d;
            obj3.f15910c = null;
            obj3.f15913f = AbstractC2418w.m3980x(Boolean.TRUE);
            c2194h0.m3598m(c3502g0, obj3);
            obj2 = obj3;
        }
        C3184a0 c3184a0 = (C3184a0) obj2;
        if (c3184a0.f15909b != interfaceC3281e) {
            z7 = true;
        } else {
            z7 = false;
        }
        C2415v c2415v = c3184a0.f15910c;
        if (c2415v != null) {
            synchronized (c2415v.f13605h) {
                if (c2415v.f13615r.f12680e > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
        } else {
            z8 = true;
        }
        if (!z7 && !z8 && !c3184a0.f15911d) {
            return;
        }
        c3184a0.f15909b = interfaceC3281e;
        AbstractC3459f m5263d = AbstractC3470q.m5263d();
        if (m5263d != null) {
            interfaceC3279c = m5263d.mo5207e();
        }
        AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
        try {
            C3502g0 c3502g02 = this.f15958e;
            c3502g02.f16899t = true;
            C2415v c2415v2 = c3184a0.f15910c;
            AbstractC2406s abstractC2406s = this.f15959f;
            if (abstractC2406s != null) {
                if (c2415v2 != null) {
                    if (c2415v2.f13622y == 3) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                    }
                    c3184a0.f15910c = c2415v2;
                    InterfaceC3281e interfaceC3281e2 = c3184a0.f15909b;
                    if (((C3728t) AbstractC3511j0.m5464a(this.f15958e)).getOutOfFrameExecutor() == null) {
                        c3184a0.f15914g = false;
                    } else {
                        c3184a0.f15914g = true;
                        interfaceC3281e2 = new C3173d(1524156494, new C1879e0(9, c3184a0, interfaceC3281e2), true);
                    }
                    if (!c3184a0.f15912e) {
                        c2415v2.m3935i();
                        c2415v2.m3942p();
                        C2395p c2395p = c2415v2.f13621x;
                        c2395p.f13513z = 100;
                        c2395p.f13512y = true;
                        c2415v2.f13602e.mo3803a(c2415v2, interfaceC3281e2);
                        c2395p.m3893w();
                    } else {
                        c2415v2.m3926A(interfaceC3281e2);
                    }
                    c3184a0.f15912e = false;
                    c3502g02.f16899t = false;
                    AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
                    c3184a0.f15911d = false;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = AbstractC3735u2.f17794a;
                c2415v2 = new C2415v(abstractC2406s, new C0031h1(c3502g0));
                c3184a0.f15910c = c2415v2;
                InterfaceC3281e interfaceC3281e22 = c3184a0.f15909b;
                if (((C3728t) AbstractC3511j0.m5464a(this.f15958e)).getOutOfFrameExecutor() == null) {
                }
                if (!c3184a0.f15912e) {
                }
                c3184a0.f15912e = false;
                c3502g02.f16899t = false;
                AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
                c3184a0.f15911d = false;
                return;
            }
            AbstractC3088a.m4751c("parent composition reference not set");
            throw new RuntimeException();
        } catch (Throwable th) {
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
            throw th;
        }
    }

    /* renamed from: i */
    public final C3502g0 m4912i(Object obj) {
        C2194h0 c2194h0;
        int i7;
        if (this.f15971r != 0) {
            C3502g0 c3502g0 = this.f15958e;
            C2702b c2702b = (C2702b) c3502g0.m5441o();
            int i8 = c2702b.f14511e.f14519g - this.f15972s;
            int i9 = i8 - this.f15971r;
            int i10 = i8 - 1;
            int i11 = i10;
            while (true) {
                c2194h0 = this.f15963j;
                if (i11 >= i9) {
                    Object m3592g = c2194h0.m3592g((C3502g0) c2702b.get(i11));
                    AbstractC3367j.m5097b(m3592g);
                    if (AbstractC3367j.m5096a(((C3184a0) m3592g).f15908a, obj)) {
                        i7 = i11;
                        break;
                    }
                    i11--;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 == -1) {
                while (i10 >= i9) {
                    Object m3592g2 = c2194h0.m3592g((C3502g0) c2702b.get(i10));
                    AbstractC3367j.m5097b(m3592g2);
                    C3184a0 c3184a0 = (C3184a0) m3592g2;
                    Object obj2 = c3184a0.f15908a;
                    if (obj2 != AbstractC3191c1.f15934a && !this.f15960g.mo150p(obj, obj2)) {
                        i10--;
                    } else {
                        c3184a0.f15908a = obj;
                        i11 = i10;
                        i7 = i11;
                        break;
                    }
                }
                i11 = i10;
            }
            if (i7 == -1) {
                return null;
            }
            if (i11 != i9) {
                c3502g0.f16899t = true;
                c3502g0.m5411M(i11, i9, 1);
                c3502g0.f16899t = false;
            }
            this.f15971r--;
            C3502g0 c3502g02 = (C3502g0) c2702b.get(i9);
            Object m3592g3 = c2194h0.m3592g(c3502g02);
            AbstractC3367j.m5097b(m3592g3);
            C3184a0 c3184a02 = (C3184a0) m3592g3;
            c3184a02.f15913f = AbstractC2418w.m3980x(Boolean.TRUE);
            c3184a02.f15912e = true;
            c3184a02.f15911d = true;
            return c3502g02;
        }
        return null;
    }
}
