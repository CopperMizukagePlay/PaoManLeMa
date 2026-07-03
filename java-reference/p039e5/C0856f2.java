package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p068i5.C2079c;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.f2 */
/* loaded from: classes.dex */
public final class C0856f2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3908i;

    /* renamed from: j */
    public int f3909j;

    /* renamed from: k */
    public /* synthetic */ Object f3910k;

    /* renamed from: l */
    public final /* synthetic */ EnumC1127no f3911l;

    /* renamed from: m */
    public final /* synthetic */ String f3912m;

    /* renamed from: n */
    public final /* synthetic */ Network f3913n;

    /* renamed from: o */
    public final /* synthetic */ int f3914o;

    /* renamed from: p */
    public final /* synthetic */ int f3915p;

    /* renamed from: q */
    public final /* synthetic */ Object f3916q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0856f2(EnumC1127no enumC1127no, String str, Object obj, Network network, int i7, int i8, InterfaceC2313c interfaceC2313c, int i9) {
        super(2, interfaceC2313c);
        this.f3908i = i9;
        this.f3911l = enumC1127no;
        this.f3912m = str;
        this.f3916q = obj;
        this.f3913n = network;
        this.f3914o = i7;
        this.f3915p = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3908i) {
            case 0:
                return ((C0856f2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0856f2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3908i) {
            case 0:
                C0856f2 c0856f2 = new C0856f2(this.f3911l, this.f3912m, (C0729b2) this.f3916q, this.f3913n, this.f3914o, this.f3915p, interfaceC2313c, 0);
                c0856f2.f3910k = obj;
                return c0856f2;
            default:
                C0856f2 c0856f22 = new C0856f2(this.f3911l, this.f3912m, (String) this.f3916q, this.f3913n, this.f3914o, this.f3915p, interfaceC2313c, 1);
                c0856f22.f3910k = obj;
                return c0856f22;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r1 == r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
    
        if (r1 == r10) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [l5.a] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        int i7;
        Network network;
        int i8;
        Object m1126d;
        int i9;
        int i10;
        Network network2;
        Object m1126d2;
        int i11 = this.f3908i;
        EnumC1127no enumC1127no = EnumC1127no.f6362i;
        EnumC1127no enumC1127no2 = EnumC1127no.f6361h;
        EnumC1127no enumC1127no3 = EnumC1127no.f6360g;
        Object obj2 = this.f3916q;
        EnumC1127no enumC1127no4 = this.f3911l;
        Object obj3 = EnumC2465a.f13750e;
        switch (i11) {
            case 0:
                int i12 = this.f3909j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1126d = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f3910k;
                    C0729b2 c0729b2 = (C0729b2) obj2;
                    C2079c m5802f = AbstractC3784a.m5802f();
                    C1074m2 c1074m2 = C1074m2.f5786a;
                    String str = this.f3912m;
                    Network network3 = this.f3913n;
                    int i13 = this.f3914o;
                    int i14 = this.f3915p;
                    if (enumC1127no4 != enumC1127no3 && enumC1127no4 != enumC1127no2) {
                        network = network3;
                        i8 = i13;
                        i7 = i14;
                    } else {
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        i7 = i14;
                        network = network3;
                        i8 = i13;
                        m5802f.add(AbstractC0525d0.m1125c(interfaceC0516a0, ExecutorC2324d.f13302g, new C0824e2(str, c0729b2, network, i8, i7, null, 0), 2));
                    }
                    if (enumC1127no4 == enumC1127no3 || enumC1127no4 == enumC1127no) {
                        C2325e c2325e2 = AbstractC0549l0.f1898a;
                        m5802f.add(AbstractC0525d0.m1125c(interfaceC0516a0, ExecutorC2324d.f13302g, new C0824e2(str, c0729b2, network, i8, i7, null, 1), 2));
                    }
                    C2079c m5798b = AbstractC3784a.m5798b(m5802f);
                    this.f3909j = 1;
                    m1126d = AbstractC0525d0.m1126d(m5798b, this);
                    break;
                }
                ArrayList m3074V = AbstractC1807o.m3074V((Iterable) m1126d);
                HashSet hashSet = new HashSet();
                obj3 = new ArrayList();
                int size = m3074V.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj4 = m3074V.get(i15);
                    i15++;
                    String hostAddress = ((InetAddress) obj4).getHostAddress();
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    if (hashSet.add(hostAddress)) {
                        obj3.add(obj4);
                    }
                }
                return obj3;
            default:
                int i16 = this.f3909j;
                if (i16 != 0) {
                    if (i16 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1126d2 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f3910k;
                    String str2 = (String) obj2;
                    C2079c m5802f2 = AbstractC3784a.m5802f();
                    C1074m2 c1074m22 = C1074m2.f5786a;
                    String str3 = this.f3912m;
                    Network network4 = this.f3913n;
                    int i17 = this.f3914o;
                    int i18 = this.f3915p;
                    if (enumC1127no4 != enumC1127no3 && enumC1127no4 != enumC1127no2) {
                        i10 = i18;
                        network2 = network4;
                        i9 = i17;
                    } else {
                        C2325e c2325e3 = AbstractC0549l0.f1898a;
                        i9 = i17;
                        i10 = i18;
                        network2 = network4;
                        m5802f2.add(AbstractC0525d0.m1125c(interfaceC0516a02, ExecutorC2324d.f13302g, new C0981j2(str3, str2, network2, i9, i10, null, 0), 2));
                    }
                    if (enumC1127no4 == enumC1127no3 || enumC1127no4 == enumC1127no) {
                        C2325e c2325e4 = AbstractC0549l0.f1898a;
                        m5802f2.add(AbstractC0525d0.m1125c(interfaceC0516a02, ExecutorC2324d.f13302g, new C0981j2(str3, str2, network2, i9, i10, null, 1), 2));
                    }
                    C2079c m5798b2 = AbstractC3784a.m5798b(m5802f2);
                    this.f3909j = 1;
                    m1126d2 = AbstractC0525d0.m1126d(m5798b2, this);
                    break;
                }
                ArrayList m3074V2 = AbstractC1807o.m3074V((Iterable) m1126d2);
                HashSet hashSet2 = new HashSet();
                obj3 = new ArrayList();
                int size2 = m3074V2.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj5 = m3074V2.get(i19);
                    i19++;
                    String hostAddress2 = ((InetAddress) obj5).getHostAddress();
                    if (hostAddress2 == null) {
                        hostAddress2 = "";
                    }
                    if (hashSet2.add(hostAddress2)) {
                        obj3.add(obj5);
                    }
                }
                return obj3;
        }
    }
}
