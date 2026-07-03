package p039e5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1806n;
import p068i5.C2079c;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.lc */
/* loaded from: classes.dex */
public final class C1053lc extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5472i = 1;

    /* renamed from: j */
    public int f5473j;

    /* renamed from: k */
    public final /* synthetic */ int f5474k;

    /* renamed from: l */
    public final /* synthetic */ int f5475l;

    /* renamed from: m */
    public /* synthetic */ Object f5476m;

    /* renamed from: n */
    public final /* synthetic */ Object f5477n;

    /* renamed from: o */
    public final /* synthetic */ Serializable f5478o;

    /* renamed from: p */
    public final /* synthetic */ Serializable f5479p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053lc(C1270sc c1270sc, C2079c c2079c, C2079c c2079c2, int i7, int i8, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5477n = c1270sc;
        this.f5478o = c2079c;
        this.f5479p = c2079c2;
        this.f5474k = i7;
        this.f5475l = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5472i) {
            case 0:
                return ((C1053lc) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1053lc) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5472i) {
            case 0:
                C1053lc c1053lc = new C1053lc((C1270sc) this.f5477n, (C2079c) this.f5478o, (C2079c) this.f5479p, this.f5474k, this.f5475l, interfaceC2313c);
                c1053lc.f5476m = obj;
                return c1053lc;
            default:
                return new C1053lc((C1100ms) this.f5476m, (C1248rl) this.f5477n, (String) this.f5478o, this.f5474k, (C0977is) this.f5479p, this.f5475l, interfaceC2313c);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        boolean z7;
        Object m1126d;
        int i7 = this.f5472i;
        int i8 = this.f5475l;
        Serializable serializable = this.f5479p;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        int i9 = this.f5474k;
        Object obj2 = this.f5477n;
        C1694m c1694m = C1694m.f10482a;
        Serializable serializable2 = this.f5478o;
        switch (i7) {
            case 0:
                C2079c c2079c = (C2079c) serializable;
                C2079c c2079c2 = (C2079c) serializable2;
                C1270sc c1270sc = (C1270sc) obj2;
                AtomicReference atomicReference = c1270sc.f7558h;
                AtomicReference atomicReference2 = c1270sc.f7557g;
                int i10 = this.f5473j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1126d = obj;
                        z7 = false;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f5476m;
                    atomicReference2.set(null);
                    atomicReference.set(null);
                    c1270sc.f7561k = 0;
                    c1270sc.f7562l.clear();
                    z7 = false;
                    List m3067O = AbstractC1806n.m3067O(AbstractC0525d0.m1125c(interfaceC0516a0, null, new C1022kc(c1270sc, c2079c2, null, 0), 3), AbstractC0525d0.m1125c(interfaceC0516a0, null, new C1022kc(c1270sc, c2079c, null, 1), 3));
                    this.f5473j = 1;
                    m1126d = AbstractC0525d0.m1126d(m3067O, this);
                    if (m1126d == enumC2465a) {
                        return enumC2465a;
                    }
                }
                List list = (List) m1126d;
                if (!c1270sc.f7553c.get()) {
                    boolean z8 = z7;
                    c1270sc.f7552b.set(z8);
                    C0962ic c0962ic = (C0962ic) list.get(z8 ? 1 : 0);
                    C0962ic c0962ic2 = (C0962ic) list.get(1);
                    int i11 = c0962ic.f4808a;
                    if (i11 != 0 && !c0962ic.f4809b) {
                        c1270sc.m2328p(C1270sc.m2312b(c1270sc, i11, C1270sc.m2314d(c1270sc, c2079c2), c0962ic.f4810c));
                    } else if (c0962ic2.f4808a != 0 && !c0962ic2.f4809b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("双向下载通道连接失败（端口 " + i9 + "）\n");
                        sb.append("请确认服务端已监听 " + i8 + "（上传）和 " + i9 + "（下载）。\n");
                        StringBuilder sb2 = new StringBuilder("App 服务端会自动双端口；PC 端请另开：iperf3 -s -p ");
                        sb2.append(i9);
                        sb2.append("\n");
                        sb.append(sb2.toString());
                        sb.append(C1270sc.m2312b(c1270sc, c0962ic2.f4808a, C1270sc.m2314d(c1270sc, c2079c), c0962ic2.f4810c));
                        c1270sc.m2328p(sb.toString());
                    } else {
                        C0930hc m2325r = C1270sc.m2325r((C0930hc) atomicReference2.get(), (C0930hc) atomicReference.get(), EnumC1363vc.f8155g);
                        String str = "用时 " + String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{new Double(m2325r.f4493c)}, 1)) + " s · 上传均速 " + AbstractC1249rm.m2243V(m2325r.f4491a) + " · 下载均速 " + AbstractC1249rm.m2243V(m2325r.f4492b);
                        C1701c0 c1701c0 = c1270sc.f7559i;
                        C1394wc m2374a = C1394wc.m2374a((C1394wc) c1701c0.getValue(), "测试完成", null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, m2325r.f4493c, m2325r.f4494d, m2325r.f4495e, null, str, null, 1314809);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m2374a);
                    }
                }
                return c1694m;
            default:
                C1248rl c1248rl = (C1248rl) obj2;
                int i12 = this.f5473j;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f5473j = 1;
                    if (C1100ms.m1916i((C1100ms) this.f5476m, c1248rl.f7390a, (String) serializable2, i9, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                C0977is c0977is = (C0977is) serializable;
                Integer num = new Integer(i8);
                Integer num2 = new Integer(i9);
                this.f5473j = 2;
                c0977is.getClass();
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                C0977is c0977is2 = new C0977is(c0977is.f4999n, this);
                c0977is2.f4995j = c1248rl;
                c0977is2.f4996k = (String) serializable2;
                c0977is2.f4997l = intValue;
                c0977is2.f4998m = intValue2;
                if (c0977is2.mo29m(c1694m) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053lc(C1100ms c1100ms, C1248rl c1248rl, String str, int i7, C0977is c0977is, int i8, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5476m = c1100ms;
        this.f5477n = c1248rl;
        this.f5478o = str;
        this.f5474k = i7;
        this.f5479p = c0977is;
        this.f5475l = i8;
    }
}
