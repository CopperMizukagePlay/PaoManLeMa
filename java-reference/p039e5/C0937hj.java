package p039e5;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p001a0.C0070r0;
import p001a0.C0073s;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.C1813u;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hj */
/* loaded from: classes.dex */
public final class C0937hj extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ InterfaceC2425y0 f4581A;

    /* renamed from: i */
    public int f4582i;

    /* renamed from: j */
    public /* synthetic */ Object f4583j;

    /* renamed from: k */
    public final /* synthetic */ C0910go f4584k;

    /* renamed from: l */
    public final /* synthetic */ C1248rl f4585l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f4586m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f4587n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f4588o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f4589p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f4590q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f4591r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2425y0 f4592s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f4593t;

    /* renamed from: u */
    public final /* synthetic */ AtomicLong f4594u;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2425y0 f4595v;

    /* renamed from: w */
    public final /* synthetic */ Context f4596w;

    /* renamed from: x */
    public final /* synthetic */ InterfaceC2425y0 f4597x;

    /* renamed from: y */
    public final /* synthetic */ InterfaceC2425y0 f4598y;

    /* renamed from: z */
    public final /* synthetic */ InterfaceC2425y0 f4599z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0937hj(C0910go c0910go, C1248rl c1248rl, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, InterfaceC2425y0 interfaceC2425y08, AtomicLong atomicLong, InterfaceC2425y0 interfaceC2425y09, Context context, InterfaceC2425y0 interfaceC2425y010, InterfaceC2425y0 interfaceC2425y011, InterfaceC2425y0 interfaceC2425y012, InterfaceC2425y0 interfaceC2425y013, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4584k = c0910go;
        this.f4585l = c1248rl;
        this.f4586m = interfaceC2425y0;
        this.f4587n = interfaceC2425y02;
        this.f4588o = interfaceC2425y03;
        this.f4589p = interfaceC2425y04;
        this.f4590q = interfaceC2425y05;
        this.f4591r = interfaceC2425y06;
        this.f4592s = interfaceC2425y07;
        this.f4593t = interfaceC2425y08;
        this.f4594u = atomicLong;
        this.f4595v = interfaceC2425y09;
        this.f4596w = context;
        this.f4597x = interfaceC2425y010;
        this.f4598y = interfaceC2425y011;
        this.f4599z = interfaceC2425y012;
        this.f4581A = interfaceC2425y013;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C0937hj) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C0937hj c0937hj = new C0937hj(this.f4584k, this.f4585l, this.f4586m, this.f4587n, this.f4588o, this.f4589p, this.f4590q, this.f4591r, this.f4592s, this.f4593t, this.f4594u, this.f4595v, this.f4596w, this.f4597x, this.f4598y, this.f4599z, this.f4581A, interfaceC2313c);
        c0937hj.f4583j = obj;
        return c0937hj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0187, code lost:
    
        if (r0 != r14) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5 A[Catch: all -> 0x00ee, TryCatch #7 {all -> 0x00ee, blocks: (B:18:0x00dd, B:20:0x00e5, B:23:0x00f1, B:24:0x00f9, B:27:0x00fe, B:30:0x0104, B:31:0x010c, B:33:0x0119, B:34:0x0128, B:36:0x012e, B:40:0x013f, B:43:0x0143, B:44:0x0156, B:57:0x00d8), top: B:56:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104 A[Catch: all -> 0x00ee, TRY_ENTER, TryCatch #7 {all -> 0x00ee, blocks: (B:18:0x00dd, B:20:0x00e5, B:23:0x00f1, B:24:0x00f9, B:27:0x00fe, B:30:0x0104, B:31:0x010c, B:33:0x0119, B:34:0x0128, B:36:0x012e, B:40:0x013f, B:43:0x0143, B:44:0x0156, B:57:0x00d8), top: B:56:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119 A[Catch: all -> 0x00ee, TryCatch #7 {all -> 0x00ee, blocks: (B:18:0x00dd, B:20:0x00e5, B:23:0x00f1, B:24:0x00f9, B:27:0x00fe, B:30:0x0104, B:31:0x010c, B:33:0x0119, B:34:0x0128, B:36:0x012e, B:40:0x013f, B:43:0x0143, B:44:0x0156, B:57:0x00d8), top: B:56:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object obj2;
        C1694m c1694m;
        EnumC2465a enumC2465a;
        List m5817z;
        C1405wn m1719Q;
        EnumC1127no enumC1127no;
        C0070r0 c0070r0;
        Object m1122A;
        Object m2985m;
        Object obj3;
        Throwable m2747a;
        C0910go c0910go;
        C1218qm c1218qm;
        Object m1130h;
        InterfaceC2425y0 interfaceC2425y0 = this.f4597x;
        int i7 = this.f4582i;
        C1694m c1694m2 = C1694m.f10482a;
        C1248rl c1248rl = this.f4585l;
        InterfaceC2425y0 interfaceC2425y02 = this.f4581A;
        InterfaceC2425y0 interfaceC2425y03 = this.f4595v;
        C0910go c0910go2 = this.f4584k;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        AbstractC1793a0.m2972L(obj);
                        c1694m = c1694m2;
                        obj2 = null;
                        float f7 = AbstractC1092mk.f5952h;
                        interfaceC2425y02.setValue(obj2);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC1793a0.m2972L(obj);
                    m1122A = obj;
                    c1694m = c1694m2;
                    enumC2465a = enumC2465a2;
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    c1694m = c1694m2;
                    enumC2465a = enumC2465a2;
                    obj2 = null;
                    try {
                        m2985m = AbstractC1793a0.m2985m(th);
                        obj3 = m2985m;
                        Context context = this.f4596w;
                        m2747a = C1690i.m2747a(obj3);
                        if (m2747a != null) {
                        }
                        if (obj3 instanceof C1689h) {
                        }
                        c0910go = (C0910go) obj3;
                        if (c0910go == null) {
                        }
                        float f8 = AbstractC1092mk.f5952h;
                        interfaceC2425y03.setValue("");
                        c1218qm = (C1218qm) interfaceC2425y0.getValue();
                        if (c1218qm != null) {
                        }
                        List m5817z2 = AbstractC3784a.m5817z(c0910go);
                        String str = (String) this.f4598y.getValue();
                        String str2 = (String) this.f4599z.getValue();
                        C1009k c1009k = new C1009k(c0910go, interfaceC2425y0, c0910go2, 8);
                        this.f4582i = 2;
                        m1130h = AbstractC0525d0.m1130h(new C1306th(m5817z2, c1248rl, c1009k, str, str2, (InterfaceC2313c) null, 3), this);
                        if (m1130h != enumC2465a) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        float f9 = AbstractC1092mk.f5952h;
                        interfaceC2425y02.setValue(obj2);
                        throw th;
                    }
                }
            } else {
                AbstractC1793a0.m2972L(obj);
                InterfaceC2425y0 interfaceC2425y04 = this.f4586m;
                InterfaceC2425y0 interfaceC2425y05 = this.f4587n;
                InterfaceC2425y0 interfaceC2425y06 = this.f4588o;
                InterfaceC2425y0 interfaceC2425y07 = this.f4589p;
                InterfaceC2425y0 interfaceC2425y08 = this.f4590q;
                InterfaceC2425y0 interfaceC2425y09 = this.f4591r;
                InterfaceC2425y0 interfaceC2425y010 = this.f4592s;
                InterfaceC2425y0 interfaceC2425y011 = this.f4593t;
                AtomicLong atomicLong = this.f4594u;
                c1694m = c1694m2;
                try {
                    try {
                        try {
                            m5817z = AbstractC3784a.m5817z(new C0973io(c0910go2.f4325d, c0910go2.f4322a, c0910go2.f4323b, c0910go2.f4324c));
                            m1719Q = AbstractC1092mk.m1719Q(interfaceC2425y04, interfaceC2425y05, interfaceC2425y06, interfaceC2425y07, interfaceC2425y08, interfaceC2425y09, interfaceC2425y010);
                            enumC1127no = (EnumC1127no) interfaceC2425y011.getValue();
                            try {
                                c0070r0 = new C0070r0(atomicLong, interfaceC2425y03, (InterfaceC2313c) null, 5);
                                this.f4582i = 1;
                                C2325e c2325e = AbstractC0549l0.f1898a;
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c1248rl = c1248rl;
                            enumC2465a = enumC2465a2;
                            obj2 = null;
                            m2985m = AbstractC1793a0.m2985m(th);
                            obj3 = m2985m;
                            Context context2 = this.f4596w;
                            m2747a = C1690i.m2747a(obj3);
                            if (m2747a != null) {
                            }
                            if (obj3 instanceof C1689h) {
                            }
                            c0910go = (C0910go) obj3;
                            if (c0910go == null) {
                            }
                            float f82 = AbstractC1092mk.f5952h;
                            interfaceC2425y03.setValue("");
                            c1218qm = (C1218qm) interfaceC2425y0.getValue();
                            if (c1218qm != null) {
                            }
                            List m5817z22 = AbstractC3784a.m5817z(c0910go);
                            String str3 = (String) this.f4598y.getValue();
                            String str22 = (String) this.f4599z.getValue();
                            C1009k c1009k2 = new C1009k(c0910go, interfaceC2425y0, c0910go2, 8);
                            this.f4582i = 2;
                            m1130h = AbstractC0525d0.m1130h(new C1306th(m5817z22, c1248rl, c1009k2, str3, str22, (InterfaceC2313c) null, 3), this);
                            if (m1130h != enumC2465a) {
                            }
                        }
                        try {
                            obj2 = null;
                            c1248rl = c1248rl;
                            enumC2465a = enumC2465a2;
                            try {
                                m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0073s(m5817z, c1248rl, m1719Q, enumC1127no, c0070r0, null, 9), this);
                            } catch (Throwable th5) {
                                th = th5;
                                m2985m = AbstractC1793a0.m2985m(th);
                                obj3 = m2985m;
                                Context context22 = this.f4596w;
                                m2747a = C1690i.m2747a(obj3);
                                if (m2747a != null) {
                                }
                                if (obj3 instanceof C1689h) {
                                }
                                c0910go = (C0910go) obj3;
                                if (c0910go == null) {
                                }
                                float f822 = AbstractC1092mk.f5952h;
                                interfaceC2425y03.setValue("");
                                c1218qm = (C1218qm) interfaceC2425y0.getValue();
                                if (c1218qm != null) {
                                }
                                List m5817z222 = AbstractC3784a.m5817z(c0910go);
                                String str32 = (String) this.f4598y.getValue();
                                String str222 = (String) this.f4599z.getValue();
                                C1009k c1009k22 = new C1009k(c0910go, interfaceC2425y0, c0910go2, 8);
                                this.f4582i = 2;
                                m1130h = AbstractC0525d0.m1130h(new C1306th(m5817z222, c1248rl, c1009k22, str32, str222, (InterfaceC2313c) null, 3), this);
                                if (m1130h != enumC2465a) {
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj2 = null;
                            c1248rl = c1248rl;
                            enumC2465a = enumC2465a2;
                            m2985m = AbstractC1793a0.m2985m(th);
                            obj3 = m2985m;
                            Context context222 = this.f4596w;
                            m2747a = C1690i.m2747a(obj3);
                            if (m2747a != null) {
                            }
                            if (obj3 instanceof C1689h) {
                            }
                            c0910go = (C0910go) obj3;
                            if (c0910go == null) {
                            }
                            float f8222 = AbstractC1092mk.f5952h;
                            interfaceC2425y03.setValue("");
                            c1218qm = (C1218qm) interfaceC2425y0.getValue();
                            if (c1218qm != null) {
                            }
                            List m5817z2222 = AbstractC3784a.m5817z(c0910go);
                            String str322 = (String) this.f4598y.getValue();
                            String str2222 = (String) this.f4599z.getValue();
                            C1009k c1009k222 = new C1009k(c0910go, interfaceC2425y0, c0910go2, 8);
                            this.f4582i = 2;
                            m1130h = AbstractC0525d0.m1130h(new C1306th(m5817z2222, c1248rl, c1009k222, str322, str2222, (InterfaceC2313c) null, 3), this);
                            if (m1130h != enumC2465a) {
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        enumC2465a = enumC2465a2;
                        c1248rl = c1248rl;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    enumC2465a = enumC2465a2;
                    obj2 = null;
                    m2985m = AbstractC1793a0.m2985m(th);
                    obj3 = m2985m;
                    Context context2222 = this.f4596w;
                    m2747a = C1690i.m2747a(obj3);
                    if (m2747a != null) {
                    }
                    if (obj3 instanceof C1689h) {
                    }
                    c0910go = (C0910go) obj3;
                    if (c0910go == null) {
                    }
                    float f82222 = AbstractC1092mk.f5952h;
                    interfaceC2425y03.setValue("");
                    c1218qm = (C1218qm) interfaceC2425y0.getValue();
                    if (c1218qm != null) {
                    }
                    List m5817z22222 = AbstractC3784a.m5817z(c0910go);
                    String str3222 = (String) this.f4598y.getValue();
                    String str22222 = (String) this.f4599z.getValue();
                    C1009k c1009k2222 = new C1009k(c0910go, interfaceC2425y0, c0910go2, 8);
                    this.f4582i = 2;
                    m1130h = AbstractC0525d0.m1130h(new C1306th(m5817z22222, c1248rl, c1009k2222, str3222, str22222, (InterfaceC2313c) null, 3), this);
                    if (m1130h != enumC2465a) {
                    }
                }
                if (m1122A == enumC2465a) {
                    return enumC2465a;
                }
            }
            m2985m = (C0910go) AbstractC1805m.m3047k0((List) m1122A);
            obj3 = m2985m;
            Context context22222 = this.f4596w;
            m2747a = C1690i.m2747a(obj3);
            if (m2747a != null) {
                String message = m2747a.getMessage();
                if (message == null) {
                    message = "DNS 候选重新解析失败";
                }
                Toast.makeText(context22222, message, 0).show();
            }
            if (obj3 instanceof C1689h) {
                obj3 = obj2;
            }
            c0910go = (C0910go) obj3;
            if (c0910go == null) {
                c0910go = C0910go.m1551a(c0910go2, C1813u.f10860e, "", 15);
            }
            float f822222 = AbstractC1092mk.f5952h;
            interfaceC2425y03.setValue("");
            c1218qm = (C1218qm) interfaceC2425y0.getValue();
            if (c1218qm != null) {
                List<C0910go> list = c1218qm.f7135g;
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
                for (C0910go c0910go3 : list) {
                    if (AbstractC3367j.m5096a(c0910go3.f4322a, c0910go2.f4322a)) {
                        c0910go3 = c0910go;
                    }
                    arrayList.add(c0910go3);
                }
                interfaceC2425y0.setValue(C1218qm.m2146a(c1218qm, null, null, null, arrayList, 63));
            }
            List m5817z222222 = AbstractC3784a.m5817z(c0910go);
            String str32222 = (String) this.f4598y.getValue();
            String str222222 = (String) this.f4599z.getValue();
            C1009k c1009k22222 = new C1009k(c0910go, interfaceC2425y0, c0910go2, 8);
            this.f4582i = 2;
            m1130h = AbstractC0525d0.m1130h(new C1306th(m5817z222222, c1248rl, c1009k22222, str32222, str222222, (InterfaceC2313c) null, 3), this);
            if (m1130h != enumC2465a) {
                m1130h = c1694m;
            }
        } catch (Throwable th9) {
            th = th9;
            obj2 = null;
        }
    }
}
