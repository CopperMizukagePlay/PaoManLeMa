package p039e5;

import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.AbstractC0094y0;
import p001a0.C0073s;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hk */
/* loaded from: classes.dex */
public final class C0938hk extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public C1218qm f4600i;

    /* renamed from: j */
    public C1248rl f4601j;

    /* renamed from: k */
    public ArrayList f4602k;

    /* renamed from: l */
    public int f4603l;

    /* renamed from: m */
    public final /* synthetic */ C0813dm f4604m;

    /* renamed from: n */
    public final /* synthetic */ boolean f4605n;

    /* renamed from: o */
    public final /* synthetic */ C1370vj f4606o;

    /* renamed from: p */
    public final /* synthetic */ C1405wn f4607p;

    /* renamed from: q */
    public final /* synthetic */ EnumC1003jo f4608q;

    /* renamed from: r */
    public final /* synthetic */ Network f4609r;

    /* renamed from: s */
    public final /* synthetic */ EnumC1127no f4610s;

    /* renamed from: t */
    public final /* synthetic */ C1401wj f4611t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0938hk(C0813dm c0813dm, boolean z7, C1370vj c1370vj, C1405wn c1405wn, EnumC1003jo enumC1003jo, Network network, EnumC1127no enumC1127no, C1401wj c1401wj, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4604m = c0813dm;
        this.f4605n = z7;
        this.f4606o = c1370vj;
        this.f4607p = c1405wn;
        this.f4608q = enumC1003jo;
        this.f4609r = network;
        this.f4610s = enumC1127no;
        this.f4611t = c1401wj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C0938hk) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0938hk(this.f4604m, this.f4605n, this.f4606o, this.f4607p, this.f4608q, this.f4609r, this.f4610s, this.f4611t, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0076, code lost:
    
        if (r1 == r13) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0235, code lost:
    
        if (r0 == r13) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0260, code lost:
    
        if (r0 == r13) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020f  */
    /* JADX WARN: Type inference failed for: r0v23, types: [e5.rl, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28, types: [e5.rl, java.util.ArrayList] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object m1130h;
        C1248rl c1248rl;
        C1218qm c1218qm;
        Network network;
        List list;
        C1247rk c1247rk;
        EnumC1003jo enumC1003jo;
        C1405wn c1405wn;
        Throwable th;
        String m184k;
        C1248rl c1248rl2;
        C1218qm c1218qm2;
        ArrayList arrayList;
        int i7;
        Object m1122A;
        Object m2203w;
        List list2;
        C1247rk c1247rk2 = C1247rk.f7380g;
        int i8 = this.f4603l;
        C1405wn c1405wn2 = this.f4607p;
        EnumC1003jo enumC1003jo2 = this.f4608q;
        C0813dm c0813dm = this.f4604m;
        C1370vj c1370vj = this.f4606o;
        Throwable th2 = null;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5) {
                                C1218qm c1218qm3 = this.f4600i;
                                AbstractC1793a0.m2972L(obj);
                                c1218qm2 = c1218qm3;
                                m1122A = obj;
                                list2 = (List) m1122A;
                                return C1218qm.m2146a(c1218qm2, null, null, null, list2, 63);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1218qm c1218qm4 = this.f4600i;
                        AbstractC1793a0.m2972L(obj);
                        c1218qm2 = c1218qm4;
                        m2203w = obj;
                        list2 = (List) m2203w;
                        return C1218qm.m2146a(c1218qm2, null, null, null, list2, 63);
                    }
                    arrayList = this.f4602k;
                    C1248rl c1248rl3 = this.f4601j;
                    C1218qm c1218qm5 = this.f4600i;
                    AbstractC1793a0.m2972L(obj);
                    c1247rk = c1247rk2;
                    enumC1003jo = enumC1003jo2;
                    c1405wn = c1405wn2;
                    c1248rl2 = c1248rl3;
                    c1218qm2 = c1218qm5;
                    th = null;
                    i7 = AbstractC0906gk.f4304a[enumC1003jo.ordinal()];
                    C1401wj c1401wj = this.f4611t;
                    if (i7 != 1) {
                        this.f4600i = c1218qm2;
                        ?? r02 = th;
                        this.f4601j = r02;
                        this.f4602k = r02;
                        this.f4603l = 4;
                        m2203w = c1247rk.m2203w(arrayList, c1248rl2, c1405wn, this.f4610s, c1401wj, this);
                    } else {
                        ?? r03 = th;
                        this.f4600i = c1218qm2;
                        this.f4601j = r03;
                        this.f4602k = r03;
                        this.f4603l = 5;
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0073s(arrayList, c1248rl2, c1405wn, this.f4610s, c1401wj, null, 9), this);
                    }
                    return enumC2465a;
                }
                c1248rl = this.f4601j;
                c1218qm = this.f4600i;
                AbstractC1793a0.m2972L(obj);
                float f7 = AbstractC1092mk.f5952h;
                ArrayList arrayList2 = new ArrayList();
                list = c1218qm.f7130b;
                C1189po c1189po = c1218qm.f7129a;
                if (list.isEmpty()) {
                    list = AbstractC3784a.m5817z(new C1248rl("default|默认接口", "默认接口", (Network) null, (EnumC1070lt) null, (String) null, 60));
                }
                if (c1218qm.f7131c) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Throwable th3 = th2;
                        C1248rl c1248rl4 = (C1248rl) it.next();
                        List list3 = (List) c1218qm.f7133e.get(c1248rl4.f7390a);
                        if (list3 == null) {
                            list3 = c1189po.m2081b();
                        }
                        C1247rk c1247rk3 = c1247rk2;
                        int i9 = 0;
                        for (Object obj2 : list3) {
                            EnumC1003jo enumC1003jo3 = enumC1003jo2;
                            int i10 = i9 + 1;
                            if (i9 >= 0) {
                                C1405wn c1405wn3 = c1405wn2;
                                String str = (String) obj2;
                                Iterator it2 = it;
                                List list4 = list3;
                                C0973io m2196x = C1247rk.m2196x(AbstractC1249rm.m2226J0(i9, "download", c1248rl4.f7390a, str), str, AbstractC0094y0.m182i(i10, list4.size(), "下载", "/"));
                                if (m2196x != null) {
                                    arrayList2.add(m2196x);
                                }
                                it = it2;
                                i9 = i10;
                                list3 = list4;
                                enumC1003jo2 = enumC1003jo3;
                                c1405wn2 = c1405wn3;
                            } else {
                                AbstractC1806n.m3072T();
                                throw th3;
                            }
                        }
                        th2 = th3;
                        c1247rk2 = c1247rk3;
                    }
                }
                c1247rk = c1247rk2;
                enumC1003jo = enumC1003jo2;
                c1405wn = c1405wn2;
                th = th2;
                if (c1218qm.f7132d) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C1248rl c1248rl5 = (C1248rl) it3.next();
                        List list5 = (List) c1218qm.f7134f.get(c1248rl5.f7390a);
                        if (list5 == null) {
                            list5 = c1189po.m2083d();
                        }
                        int i11 = 0;
                        for (Object obj3 : list5) {
                            int i12 = i11 + 1;
                            if (i11 >= 0) {
                                String str2 = (String) obj3;
                                Iterator it4 = it3;
                                C0973io m2196x2 = C1247rk.m2196x(AbstractC1249rm.m2226J0(i11, "upload", c1248rl5.f7390a, str2), str2, AbstractC0094y0.m182i(i12, list5.size(), "上传", "/"));
                                if (m2196x2 != null) {
                                    arrayList2.add(m2196x2);
                                }
                                it3 = it4;
                                i11 = i12;
                            } else {
                                AbstractC1806n.m3072T();
                                throw th;
                            }
                        }
                    }
                }
                m184k = AbstractC0094y0.m184k(arrayList2.size(), "正在查询 DNS 候选（", " 个目标）");
                this.f4600i = c1218qm;
                this.f4601j = c1248rl;
                this.f4602k = arrayList2;
                this.f4603l = 3;
                if (c1370vj.mo22d(m184k, this) != enumC2465a) {
                    c1248rl2 = c1248rl;
                    c1218qm2 = c1218qm;
                    arrayList = arrayList2;
                    i7 = AbstractC0906gk.f4304a[enumC1003jo.ordinal()];
                    C1401wj c1401wj2 = this.f4611t;
                    if (i7 != 1) {
                    }
                    return enumC2465a;
                }
                return enumC2465a;
            }
            AbstractC1793a0.m2972L(obj);
            m1130h = obj;
        } else {
            AbstractC1793a0.m2972L(obj);
            this.f4603l = 1;
            float f8 = AbstractC1092mk.f5952h;
            m1130h = AbstractC0525d0.m1130h(new C1455yb(c0813dm, this.f4605n, c1370vj, null), this);
        }
        C1218qm c1218qm6 = (C1218qm) m1130h;
        boolean m2388b = c1405wn2.m2388b();
        if ((!c0813dm.f3519c && !c0813dm.f3520d) || (enumC1003jo2 == EnumC1003jo.f5116f && !m2388b)) {
            return C1218qm.m2146a(c1218qm6, null, null, null, C1813u.f10860e, 63);
        }
        C1248rl c1248rl6 = (C1248rl) AbstractC1805m.m3047k0(c0813dm.f3518b);
        if (c1248rl6 == null) {
            c1248rl6 = new C1248rl("default|默认接口", "默认接口", (Network) null, (EnumC1070lt) null, (String) null, 60);
        }
        if (c1248rl6.f7392c == null && (network = this.f4609r) != null) {
            c1248rl = C1248rl.m2204a(c1248rl6, null, null, network, null, 59);
        } else {
            c1248rl = c1248rl6;
        }
        this.f4600i = c1218qm6;
        this.f4601j = c1248rl;
        this.f4603l = 2;
        if (c1370vj.mo22d("正在整理 DNS 查询目标", this) != enumC2465a) {
            c1218qm = c1218qm6;
            float f72 = AbstractC1092mk.f5952h;
            ArrayList arrayList22 = new ArrayList();
            list = c1218qm.f7130b;
            C1189po c1189po2 = c1218qm.f7129a;
            if (list.isEmpty()) {
            }
            if (c1218qm.f7131c) {
            }
            c1247rk = c1247rk2;
            enumC1003jo = enumC1003jo2;
            c1405wn = c1405wn2;
            th = th2;
            if (c1218qm.f7132d) {
            }
            m184k = AbstractC0094y0.m184k(arrayList22.size(), "正在查询 DNS 候选（", " 个目标）");
            this.f4600i = c1218qm;
            this.f4601j = c1248rl;
            this.f4602k = arrayList22;
            this.f4603l = 3;
            if (c1370vj.mo22d(m184k, this) != enumC2465a) {
            }
        }
        return enumC2465a;
    }
}
